
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.util.ArrayList;

public class CuaHangController {
    private CuaHangView chview;
    
    public CuaHangController(CuaHangView chview) {
        this.chview = chview;
    }
    
    public void CuaHangPage(){
       chview.loadTableCuaHang(new CuaHangModel().getDanhSachCuaHang(""));
    }   
    
    public void CuaHangPXPage(String MaCH){
       chview.loadTableCHPX(new PhieuXuatModel().getDanhSachPhieuXuat(" where ma_ch = '" + MaCH + "'"));
    } 
    
    public void doAddCuaHang(){
        if(chview.checkCH){
            chview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            CuaHangModel ch = chview.getCuaHangInput();
            if(ch.getDiaChiCH().equals("")|| ch.getSdtCH().equals("") || ch.getTenCH().equals("")){
                chview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                if(new CuaHangModel().addCuaHang(ch)){
                    CuaHangPage();
                    chview.showMessage("Thêm thành công \n", true);
                    chview.resetInput();
                } else {
                    chview.showMessage("Thêm thất bại \n", false);
                }
            } 
        }
    }
    
    public void doSearchCuaHang(String ThuocTinh,String GiaTri){
        String key = "";    
        if(!"".equals(ThuocTinh) && !"".equals(GiaTri)){
            if ("so_phieu_da_xuat".equals(ThuocTinh) || "so_phieu_chua_xuat".equals(ThuocTinh) || "tong_gia_tri_xuat".equals(ThuocTinh)){
                if(null != GiaTri)switch (GiaTri) {
                    case "Tang dan" -> key = " order by " + ThuocTinh + " ASC";
                    case "Giam dan" -> key = " order by " + ThuocTinh + " DESC";
                    case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewCuaHang)";
                    case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewCuaHang)";
                    default -> {
                    }
                }
            } else{
                key = " where " + ThuocTinh + " like '%" + GiaTri + "%'";
            }
        }
        if ("".equals(key)){
            chview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            CuaHangPage();
        } else {
            ArrayList<CuaHangModel> chs = new CuaHangModel().getDanhSachCuaHang(key);
            if(chs.isEmpty()){
                chview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                CuaHangPage();
            } else chview.loadTableCuaHang(chs);
        }  
    }  
    
    public void doUpdateCuaHang(){
        CuaHangModel ch = chview.getCuaHangInput();
        if(!chview.checkCH){
            chview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(ch.getDiaChiCH().equals("") || ch.getSdtCH().equals("") || ch.getTenCH().equals("")){
                chview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                String key = "where sdt = '" + ch.getSdtCH() + "' and ma_ch <> '" + ch.getMaCH()+ "'";
                if(new CuaHangModel().getDanhSachCuaHang(key) == null || new CuaHangModel().getDanhSachCuaHang(key).isEmpty()){
                        if(new CuaHangModel().updateCuaHang(ch)){
                            CuaHangPage();
                            chview.showMessage("Sửa thành công \n",true );
                        } else {
                            chview.showMessage("Sửa thất bại \n", false);
                        }
                } else {
                    chview.showMessage("Số điện thoại cửa hàng đã tồn tại \n", false);
                }
            } 
        }
        
    }
    
    public void doDeleteCuaHang(){
        if (chview.checkCH){
            if (chview.xacNhanXoa()){
                if(new CuaHangModel().deleteCuaHang(chview.getCuaHangInput().getMaCH())){
                    CuaHangPage();
                    chview.showMessage("Xóa thành công \n", true);               
                } else {
                    chview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else chview.showMessage("Vui lòng chọn thông tin cần xóa \n", false);
    }
}
