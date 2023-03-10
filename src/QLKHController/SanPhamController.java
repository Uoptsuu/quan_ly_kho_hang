
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.util.ArrayList;

public class SanPhamController {
    private static SanPhamView spview;
    private static TimSanPhamView tspview;

    public SanPhamController(SanPhamView spview) {
        SanPhamController.spview = spview;
    }
    
    public SanPhamController(TimSanPhamView tspview) {
        SanPhamController.tspview = tspview;
    }
    
    public void SanPhamPage(){
        spview.loadTableSanPham(new SanPhamModel().getDanhSachSanPham(""));
    }
    
    public void SanPhamCTPage(String MaSP){
        spview.loadTableChiTietSP(new DayModel().getChiTietSP(MaSP));
    }
    
    public void doSearchSanPham2(String key){
        if ("".equals(key)){
            tspview.showMessage("Vui lòng nhập thông tin tìm kiếm \n",false);
        } else {
            key = "where ten_sp like '%" + key + "%' or ma_sp like '%" + key + "%' or loai_sp like '%" + key + "%'";
            ArrayList<SanPhamModel> sptk= new SanPhamModel().getDanhSachSanPham(key);
            if(sptk == null || sptk.isEmpty()){
                tspview.showMessage("Không tìm thấy sản phẩm \n",false);
            } else tspview.loadTableTimKiemSanPham(sptk);
        }      
    }
    
    public void doAddSanPham(){
        if(spview.check){
            spview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            SanPhamModel sp = spview.getSanPhamInput();
            if(sp.getTenSP().equals("") || sp.getLoai().equals("*") || sp.getHang().equals("") || sp.getGiaNhap()<= 0 || sp.getDonVi().equals("*")){
                spview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
            } else {
                if(sp.getGiaXuat() == 0) sp.setGiaXuat(sp.getGiaNhap()*120/100);
                if(new SanPhamModel().addSanPham(sp)){
                    SanPhamPage();
                    spview.showMessage("Thêm thành công \n", true);
                    spview.resetInput();
                } else {
                    spview.showMessage("Thêm thất bại \n", false);
                } 
            } 
        }
    }
    
    public void doDeleteSanPham(){
        if (spview.check){
            if (spview.xacNhanXoa()){
                if(new SanPhamModel().deleteSanPham(spview.getSanPhamInput().getMaSP())){
                    SanPhamPage();
                    spview.showMessage("Xóa thành công \n", true);               
                } else {
                    spview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else spview.showMessage("Vui lòng chọn thông tin cần xóa \n", false);
    }
    
    public void doUpdateSanPham(){
        SanPhamModel sp = spview.getSanPhamInput();
        if(!spview.check){
            spview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(sp.getTenSP().equals("") || sp.getLoai().equals("*") || sp.getHang().equals("") || sp.getDonVi().equals("*") || sp.getGiaNhap() <= 0 || sp.getGiaXuat() <= 0){
                spview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                if(new SanPhamModel().updateSanPham(sp)){
                    SanPhamPage();
                    spview.showMessage("Sửa thành công \n",true );
                } else {
                    spview.showMessage("Sửa thất bại \n", false);
                }  
            } 
        } 
    }

    
    public void doSearchSanPham(String ThuocTinh, String GiaTri){
        String key = "";    
        if(!"".equals(ThuocTinh) && !"".equals(GiaTri)){
            if ("so_luong_ton".equals(ThuocTinh)){
                if(null != GiaTri)switch (GiaTri) {
                    case "Tang dan" -> key = "order by " + ThuocTinh + " ASC";
                    case "Giam dan" -> key = "order by " + ThuocTinh + " DESC";
                    case "Nhieu nhat" -> key = "where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewSanPham)";
                    case "It nhat" -> key = "where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewSanPham)";
                    default -> {
                    }
                }
            } else if("gia_nhap".equals(ThuocTinh)){
                if(null != GiaTri)switch (GiaTri) {
                    case "< 1.000.000" -> key = " where " + ThuocTinh + " < 1000000";
                    case "1.000.000 - 2.999.999" -> key = " where " + ThuocTinh + " >= 1000000 and " + ThuocTinh + " < 2999999 ";
                    case "3.000.000 - 6.999.999" -> key = " where " + ThuocTinh + " >= 3000000 and " + ThuocTinh + " < 6999999 ";
                    case "7.000.000 - 9.999.999" -> key = " where " + ThuocTinh + " >= 7000000 and " + ThuocTinh + " < 9999999 ";
                    case "10.000.000 - 14.999.999" -> key = " where " + ThuocTinh + " >= 10000000 and " + ThuocTinh + " < 14999999 ";
                    case "> 15.000.000" -> key = " where " + ThuocTinh + " >= 15000000";
                    default -> {
                    }
                }
            } else if("gia_xuat".equals(ThuocTinh)){
                if(null != GiaTri)switch (GiaTri) {
                    case "< 1.000.000" -> key = " where " + ThuocTinh + " < 1000000";
                    case "1.000.000 - 2.999.999" -> key = " where " + ThuocTinh + " >= 1000000 and " + ThuocTinh + " < 2999999 ";
                    case "3.000.000 - 6.999.999" -> key = " where " + ThuocTinh + " >= 3000000 and " + ThuocTinh + " < 6999999 ";
                    case "7.000.000 - 9.999.999" -> key = " where " + ThuocTinh + " >= 7000000 and " + ThuocTinh + " < 9999999 ";
                    case "10.000.000 - 14.999.999" -> key = " where " + ThuocTinh + " >= 10000000 and " + ThuocTinh + " < 14999999 ";
                    case "> 15.000.000" -> key = " where " + ThuocTinh + " >= 15000000";
                    default -> {
                    }
                }
            } else {
                key = " where " + ThuocTinh + " like '%" + GiaTri + "%'";
            }
        }
        if ("".equals(key)){
            spview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            SanPhamPage();
        } else {
            ArrayList<SanPhamModel> sps = new SanPhamModel().getDanhSachSanPham(key);
            if(sps.isEmpty()){
                spview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                SanPhamPage();
            } else spview.loadTableSanPham(sps);
        }  
    }
}
