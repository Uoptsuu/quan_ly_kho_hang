
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.util.ArrayList;

public class DayController {
    private DayView dview;
    
    public DayController(DayView dview) {
        this.dview = dview;
    }
    
    public void DayPage(){
        dview.loadTableDay(new DayModel().getDanhSachDay(""));
    }
    
    public void DayCTPage(String MaDay, String MaSP){
        dview.loadTableChiTietDay(new DayModel().getChiTietDay(MaDay,MaSP).getDanhSachSP());
    }
    
    
    public void doAddDay(){
        if(dview.checkD){
            dview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            DayModel d = dview.getDayInput();
            if(d.getKhu().equals("") || d.getSucChua() <= 0 ){
                dview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ  \n", false);
            } else {
                if(new DayModel().addDay(d)){
                    DayPage();
                    dview.showMessage("Thêm thành công \n", true);
                    dview.resetInput();
                } else {
                    dview.showMessage("Thêm thất bại \n", false);
                }
            }
        }
    }
    
    public void doSearchDay(String ThuocTinh, String GiaTri){
        String key = "";
        if("khu".equals(ThuocTinh)){
            key = "where khu = " + "'" + GiaTri + "'";
        } else {
            if(null != GiaTri)switch (GiaTri) {
                case "Tang dan" -> key = " order by trong ASC";
                case "Giam dan" -> key = " order by trong DESC";
                case "Nhieu nhat" -> key = " where trong = (select max(trong) from viewDay)";
                case "It nhat" -> key = " where trong = (select min(trong) from viewDay)";
                default -> {
                }
            }
        }
        if ("".equals(key)){
            dview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            DayPage();
        } else {
            ArrayList<DayModel> ds = new DayModel().getDanhSachDay(key);
            if(ds.isEmpty()){
                dview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                DayPage();
            } else dview.loadTableDay(ds);
        }  
    }    
    
    public void doUpdateDay(){
        DayModel d = dview.getDayInput();
        if(!dview.checkD){
            dview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(d.getKhu().equals("*") || d.getSucChua() <= 0){
                dview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                if(new DayModel().updateDay(d)){
                    DayPage();
                    dview.showMessage("Sửa thành công \n",true );
                } else {
                    dview.showMessage("Sửa thất bại \n", false);
                }  
            } 
        } 
    }
    
    public void doDeleteDay(){
        if (dview.checkD){
            if (dview.xacNhanXoa()){
                if(new DayModel().deleteDay(dview.getDayInput().getMaDay())){
                    DayPage();
                    dview.showMessage("Xóa thành công \n", true);               
                } else {
                    dview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else dview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
    
    public void doAddChiTietDay(String MaDay){
        if(dview.checkCTD){
            dview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else if (MaDay == null || MaDay.isBlank()){
            dview.showMessage("Vui lòng chọn dãy \n", false);
        } else {
            SanPhamModel sp = dview.getChiTietDayInput();
            if(!new SanPhamModel().getDanhSachSanPham(" where ma_sp = '"+ sp.getMaSP() +"'").isEmpty()){
                int trong = new DayModel().getDanhSachDay(" where ma_day = '" + MaDay + "'").get(0).getTrong();
                if(sp.getMaSP().equals("") || sp.getSoLuong() <= 0 ){
                    dview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ  \n", false);
                } else if(trong < sp.getSoLuong()){
                    dview.showMessage("Sức chứa dãy không đủ \n", false);
                } else {
                    if(new DayModel().getChiTietDay(MaDay,sp.getMaSP()).getMaDay() != null){
                        dview.showMessage("Sản phẩm đã tồn tại trong dãy \n", false); 
                    } else {
                        if(new DayModel().addChiTietDay(sp, MaDay)){
                            DayPage();
                            DayCTPage(MaDay, "");
                            dview.showMessage("Thêm thành công \n", true);
                        } else {
                            dview.showMessage("Thêm thất bại \n", false);
                        }
                    }
                }
            } else dview.showMessage("Sản phẩm không tồn tại \n", false);
        }
    }
    
    public void doUpdateChiTietDay(String MaDay){
        if(dview.checkCTD){
            SanPhamModel sp = dview.getChiTietDayInput();
            if(sp.getSoLuong() < 0){
                dview.showMessage("Vui lòng điền số lượng hợp lệ \n", false);
            } else {
                int trong = new DayModel().getDanhSachDay(" where ma_day = '" + MaDay + "'").get(0).getTrong();
                if(sp.getSoLuong() - dview.soLuongCu() <= trong){
                    if (sp.getGhiChu().isBlank()) sp.setGhiChu("");
                    if(new DayModel().updateChiTietDay(sp, MaDay)){
                        DayPage();
                        DayCTPage(MaDay, "");
                        dview.showMessage("Sửa thành công \n",true );
                    } else {
                        dview.showMessage("Sửa thất bại \n", false);
                    }
                } else{
                    dview.showMessage("Sức chứa dãy không đủ \n", false);
                }
            } 
        } else if (MaDay == null || MaDay.isBlank()){
            dview.showMessage("Vui lòng chọn dãy \n", false);
        } else {
            dview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        }  
    }
    
    
    public void doDeleteChiTietDay(String MaDay, String MaSP){
        if (dview.checkCTD){
            if (dview.xacNhanXoa()){
                if(new DayModel().deleteChiTietDay(MaSP, MaDay)){
                    DayPage();
                    dview.showMessage("Xóa thành công \n", true);               
                } else {
                    dview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else if (MaDay == null || MaDay.isBlank()){
            dview.showMessage("Vui lòng chọn dãy \n", false);
        } else dview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
    
}
