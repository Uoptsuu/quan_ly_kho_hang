
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.util.ArrayList;

public class NhaCungCapController {
    private static NhaCungCapView nccview;
    
    public NhaCungCapController(NhaCungCapView nccview) {
        NhaCungCapController.nccview = nccview;
    }
    
    public void NhaCungCapPage(){
        nccview.loadTableNhaCungCap(new NhaCungCapModel().getDanhSachNhaCungCap(""));
    }
    
    public void NhaCungCapPNPage(String MaNCC){
        nccview.loadTableNCCPN(new PhieuNhapModel().getDanhSachPhieuNhap(" where ma_ncc = '" + MaNCC + "'"));
    } 
    
    public void doAddNhaCungCap(){
        if(nccview.check){
            nccview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            NhaCungCapModel ncc = nccview.getNhaCungCapInput();
            if(ncc.getDiaChiNCC().equals("")|| ncc.getSdtNCC().equals("") || ncc.getTenNCC().equals("")){
                nccview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ  \n", false);
            }
            else {
                if(new NhaCungCapModel().addNhaCungCap(ncc)){
                    NhaCungCapPage();
                    nccview.showMessage("Thêm thành công \n", true);
                    nccview.resetInput();
                } else {
                    nccview.showMessage("Thêm thất bại \n", false);
                }
            } 
        }
    }
    
    public void doSearchNhaCungCap(String ThuocTinh,String GiaTri){
        String key = "";    
        if(!"".equals(ThuocTinh) && !"".equals(GiaTri)){
            if ("so_phieu_da_nhap".equals(ThuocTinh) || "so_phieu_chua_nhap".equals(ThuocTinh) || "tong_gia_tri_nhap".equals(ThuocTinh)){
                if(null != GiaTri)switch (GiaTri) {
                    case "Tang dan" -> key = " order by " + ThuocTinh + " ASC";
                    case "Giam dan" -> key = " order by " + ThuocTinh + " DESC";
                    case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewNhaCungCap)";
                    case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewNhaCungCap)";
                    default -> {
                    }
                }
            } else{
                key = " where " + ThuocTinh + " like '%" + GiaTri + "%'";
            }
        }
        if ("".equals(key)){
            nccview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            NhaCungCapPage();
        } else {
            ArrayList<NhaCungCapModel> nccs = new NhaCungCapModel().getDanhSachNhaCungCap(key);
            if(nccs.isEmpty()){
                nccview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                NhaCungCapPage();
            } else nccview.loadTableNhaCungCap(nccs);
        }  
    }  
    
    public void doUpdateNhaCungCap(){
        NhaCungCapModel ncc = nccview.getNhaCungCapInput();
        if(!nccview.check){
            nccview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(ncc.getDiaChiNCC().equals("") || ncc.getSdtNCC().equals("") || ncc.getTenNCC().equals("")){
                nccview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                String key = "where sdt = '" + ncc.getSdtNCC() + "' and ma_ncc <> '" + ncc.getMaNCC()+ "'";
                if(new NhaCungCapModel().getDanhSachNhaCungCap(key) == null || new NhaCungCapModel().getDanhSachNhaCungCap(key).isEmpty()){
                        if(new NhaCungCapModel().updateNhaCungCap(ncc)){
                            NhaCungCapPage();
                            nccview.showMessage("Sửa thành công \n",true );
                        } else {
                            nccview.showMessage("Sửa thất bại \n", false);
                        }
                } else {
                    nccview.showMessage("Số điện thoại nhà cung cấp đã tồn tại \n", false);
                }
            } 
        }
        
    }
    
    public void doDeleteNhaCungCap(){
        if (nccview.check){
            if (nccview.xacNhanXoa()){
                if(new NhaCungCapModel().deleteNhaCungCap(nccview.getNhaCungCapInput().getMaNCC())){
                    NhaCungCapPage();
                    nccview.showMessage("Xóa thành công \n", true);               
                } else {
                    nccview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else nccview.showMessage("Vui lòng chọn thông tin cần xóa \n", false);
    }
}
