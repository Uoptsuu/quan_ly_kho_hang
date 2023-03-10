
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.ZoneId;

public class NguoiDungController {
    private static DangNhapForm dnview;
    public static NguoiDungModel ndOn;
    private static NguoiDungView ndview;
    
    public NguoiDungController(DangNhapForm view) {
        NguoiDungController.dnview = view;
    }
    
    public NguoiDungController(NguoiDungView view) {
        NguoiDungController.ndview = view;
    }
    
    public static void loginPage(){
        DangNhapForm.runLogin();
    }
    
    public void NguoiDungPage(){
        ndview.loadTableNguoiDung(new NguoiDungModel().getDanhSachNguoiDung(""));
    }
    
    public void doLogin(){  
        NguoiDungModel nd = dnview.getUserLogin();
        if (nd.getMaND().equals("") || nd.getMatKhau().equals("")){
            dnview.showMessageLogin("Vui lòng điền đầy đủ thông tin \n");
        } else {
            NguoiDungModel ndc = new NguoiDungModel().checkLogin(nd.getMaND(),nd.getMatKhau());
            if(ndc.getChucVu() != null){
                switch (ndc.getChucVu()) {
                    case "Quan ly" -> indexQLView.runIndexQL();
                    case "Nhan vien tiep nhan" -> indexNVTNView.runIndexNVTN();
                    case "Nhan vien kiem ke" -> indexNVKKView.runIndexNVKK();
                    case "Nghi viec" -> dnview.showMessageLogin("Nhân viên nghỉ việc không thể đăng nhập vào hệ thống \n");
                    default -> { DangNhapForm.runLogin();
                    }
                }
                ndOn = ndc;
                dnview.dispose();
            } else dnview.showMessageLogin("Sai thông tin đăng nhập \n");   
        }
    }
    
    
    public void doAddNguoiDung(){
        if(ndview.checkND){
            ndview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            NguoiDungModel nd = ndview.getNguoiDungInput();
            if( nd.getDiaChiND().equals("") || nd.getChucVu().equals("*") || nd.getGioiTinh().equals("*") || nd.getMatKhau().equals("") || nd.getNgaySinh() == null || nd.getSdtND().equals("") || nd.getTenND().equals("") || nd.getCanCuoc().equals("")){
                ndview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                String key = "where sdt = '" + nd.getSdtND()+ "' or can_cuoc = '" + nd.getCanCuoc()+"'";
                if(new NguoiDungModel().getDanhSachNguoiDung(key) == null || new NguoiDungModel().getDanhSachNguoiDung(key).isEmpty()){
                    LocalDate ns = nd.getNgaySinh().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int diffYear = LocalDate.now().getYear() - ns.getYear();
                    boolean check = false;
                    if (diffYear > 18){
                        check = true;
                    } else if (diffYear == 18){
                        if (LocalDate.now().getMonthValue() > ns.getMonthValue()){
                            check = true;
                        }
                    }
                    if(check){
                        if(new NguoiDungModel().addNguoiDung(nd)){
                            NguoiDungPage();
                            ndview.showMessage("Thêm thành công \n", true);
                            ndview.resetInput();
                        } else {
                            ndview.showMessage("Thêm thất bại \n", false);
                        }
                    } else {
                        ndview.showMessage("Quản lý, Nhân viên phải trên 18 tuổi \n", false);
                    }   
                } else {
                    ndview.showMessage("Số điện thoại hoặc căn cước đã tồn tại \n", false);
                }
            } 
        }
    }
    
    public void doSearchNguoiDung(String ThuocTinh,String GiaTri){
        String key = "";    
        if(!"".equals(ThuocTinh) && !"".equals(GiaTri)){
            if ("gioi_tinh".equals(ThuocTinh)){
                int gt;
                if("Nam".equals(GiaTri)){
                    gt = 1;
                } else gt = 0;
                key = " where " + ThuocTinh + " = " + gt;
            } else {
                key = " where " + ThuocTinh + " like '%" + GiaTri + "%'";
            }
        }
        if ("".equals(key)){
            ndview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            NguoiDungPage();
        } else {
            ArrayList<NguoiDungModel> nds = new NguoiDungModel().getDanhSachNguoiDung(key);
            if(nds.isEmpty()){
                ndview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                NguoiDungPage();
            } else ndview.loadTableNguoiDung(nds);
        }  
    }  
    
    public void doUpdateNguoiDung(){
        NguoiDungModel nd = ndview.getNguoiDungInput();
        if(!ndview.checkND){
            ndview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(nd.getDiaChiND().equals("") || nd.getChucVu().equals("*") || nd.getGioiTinh().equals("*") || nd.getMatKhau().equals("") || nd.getNgaySinh() == null || nd.getSdtND().equals("") || nd.getTenND().equals("") || nd.getCanCuoc().equals("")){
                ndview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                String key = "where (sdt = '" + nd.getSdtND() + "' or can_cuoc = '" + nd.getCanCuoc() + "') and ma_nd <> '" + nd.getMaND()+ "'";
                if(new NguoiDungModel().getDanhSachNguoiDung(key) == null || new NguoiDungModel().getDanhSachNguoiDung(key).isEmpty()){
                    boolean check = false;
                    LocalDate ns = nd.getNgaySinh().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int diffYear = LocalDate.now().getYear() - ns.getYear();
                    if (diffYear > 18){
                        check = true;
                    } else if (diffYear == 18){
                        if (LocalDate.now().getMonthValue() > ns.getMonthValue()){
                            check = true;
                        }
                    }
                    if(check){
                        if(new NguoiDungModel().updateNguoiDung(nd)){
                            NguoiDungPage();
                            ndview.showMessage("Sửa thành công \n",true );
                        } else {
                            ndview.showMessage("Sửa thất bại \n", false);
                        }
                    } else {
                        ndview.showMessage("Quản lý, Nhân viên phải trên 18 tuổi \n", false);
                    }   
                } else {
                    ndview.showMessage("Số điện thoại hoặc căn cước người dùng đã tồn tại \n", false);
                }
            } 
        }
        
    }
    
    public void doDeleteNguoiDung(String MaNguoiDung){
        if (ndview.checkND){
            if (ndview.xacNhanXoa()){
                if(new NguoiDungModel().deleteNguoiDung(MaNguoiDung)){
                    NguoiDungPage();
                    ndview.showMessage("Xóa thành công \n", true);               
                } else {
                    ndview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else ndview.showMessage("Vui lòng chọn thông tin cần xóa \n", false);
    }
}
