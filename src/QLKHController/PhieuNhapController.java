
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PhieuNhapController {
    private static PhieuNhapView pnview;
 
    public PhieuNhapController(PhieuNhapView pnview) {
        PhieuNhapController.pnview = pnview;
    }
    
    public void PhieuNhapPage(){
        pnview.loadTablePhieuNhap(new PhieuNhapModel().getDanhSachPhieuNhap("order by ngay_tao DESC"));
        pnview.loadComboBoxMaNCC(new NhaCungCapModel().getDanhSachNhaCungCap(""));
        pnview.loadComboBoxNguoiLap(new NguoiDungModel().getDanhSachNguoiDung("where chuc_vu in ('Quan ly','Nhan vien tiep nhan')" ));
    }
    
    public void PhieuNhapCTPage(String MaPhieuNhap){
        pnview.loadTableChiTietPhieuNhap(new PhieuNhapModel().getChiTietPhieuNhap(MaPhieuNhap,"").getDanhSachSP());
    }
    
    
    public void doAddPhieuNhap(){
        if(pnview.checkPN){
            pnview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            PhieuNhapModel pn = pnview.getPhieuNhapInput();
            if(pn.getMaNCC().equals("*")){
                pnview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
            } else {
                if(new PhieuNhapModel().addPhieuNhap(pn)){
                    PhieuNhapPage();
                    pnview.showMessage("Thêm thành công \n", true);
                    pnview.resetInput();
                } else {
                    pnview.showMessage("Thêm thất bại \n", false);
                }
            }
        }
    }
    
    public void doSearchPhieuNhap(String ThuocTinh, String ThoiGian, String GiaTriThuocTinh, String NgayBatDau, String NgayKetThuc, boolean checkThoiGian){
        String key = "";    
        if (checkThoiGian){
            if ("ma_ncc".equals(ThuocTinh) || "ma_nd".equals(ThuocTinh)){
                key = " where " + ThuocTinh + " like '%" + GiaTriThuocTinh + "%' and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
            } else {
                if("".equals(ThuocTinh) && !"".equals(ThoiGian)){
                    key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                } else if ("trang_thai".equals(ThuocTinh)){
                    int tt;
                    if ("Da nhap".equals(GiaTriThuocTinh)){
                        tt = 1;
                    } else tt = 0;
                    key = " where " + ThuocTinh + " = " + tt + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                } else {
                    if(null != GiaTriThuocTinh)switch (GiaTriThuocTinh) {
                        case "Tang dan" -> key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "' order by " + ThuocTinh + " ASC";
                        case "Giam dan" -> key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "' order by " + ThuocTinh + " DESC";
                        case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewPhieuNhap)" + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                        case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewPhieuNhap)" + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                        default -> {
                        }
                    }
                }
            } 
        } else {
            if ("ma_ncc".equals(ThuocTinh) || "ma_nd".equals(ThuocTinh) || "ma_phieu_nhap".equals(ThuocTinh)){
                key = " where " + ThuocTinh + " like '%" + GiaTriThuocTinh + "%'";
            } else {
                if ("trang_thai".equals(ThuocTinh)){
                    int tt;
                    if ("Da nhap".equals(GiaTriThuocTinh)){
                        tt = 1;
                    } else tt = 0;
                    key = " where " + ThuocTinh + " = " + tt;
                } else {
                    if(null != GiaTriThuocTinh)switch (GiaTriThuocTinh) {
                        case "Tang dan" -> key = " order by " + ThuocTinh + " ASC";
                        case "Giam dan" -> key = " order by " + ThuocTinh + " DESC";
                        case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewPhieuNhap)";
                        case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewPhieuNhap)";
                        default -> {
                        }
                    }
                }
            }
        }
        if ("".equals(key)){
            pnview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            PhieuNhapPage();
        } else {
            ArrayList<PhieuNhapModel> pns = new PhieuNhapModel().getDanhSachPhieuNhap(key);
            if(pns.isEmpty()){
                pnview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                PhieuNhapPage();
            } else pnview.loadTablePhieuNhap(pns);
        }  
    }    
    
    public void doUpdatePhieuNhap(){
        PhieuNhapModel pn = pnview.getPhieuNhapInput();
        if(!pnview.checkPN){
            pnview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(pn.getMaPhieuNhap().equals("") || pn.getMaNCC().equals("") || pn.getMaND().equals("")){
                pnview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                if(new PhieuNhapModel().updatePhieuNhap(pn)){
                    PhieuNhapPage();
                    pnview.showMessage("Sửa thành công \n",true );
                } else {
                    pnview.showMessage("Sửa thất bại \n", false);
                }  
            } 
        } 
    }
    
    public void doDeletePhieuNhap(){
        if (pnview.checkPN){
            if (pnview.xacNhanXoa()){
                if(new PhieuNhapModel().deletePhieuNhap(pnview.getPhieuNhapInput().getMaPhieuNhap())){
                    PhieuNhapPage();
                    pnview.showMessage("Xóa thành công \n", true);               
                } else {
                    pnview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else pnview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
    
    public void doPrintBill(String MaPhieuNhap){
        if (pnview.checkPN) {
            NhaCungCapModel ncc = new NhaCungCapModel().getNhaCungCap(MaPhieuNhap);
            ArrayList<SanPhamModel> lsp = new PhieuNhapModel().getChiTietSP(MaPhieuNhap);
            pnview.printBill(ncc, lsp);
        } else pnview.showMessage("Vui lòng chọn thông tin cần in \n", false); 
    }
    
    public void doAddChiTietPhieuNhap(String MaPhieuNhap){
        if(pnview.checkCTPN){
            pnview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else if(MaPhieuNhap == null || MaPhieuNhap.isBlank()) {
            pnview.showMessage("Vui lòng chọn phiếu \n", false);
        } else {
            SanPhamModel sp = pnview.getChiTietPhieuNhapInput();
            if(!new SanPhamModel().getDanhSachSanPham(" where ma_sp = '"+ sp.getMaSP() +"'").isEmpty()){
                if(sp.getMaSP().equals("") || sp.getSoLuong() <= 0 ){
                    pnview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
                } else {
                    if(null == new PhieuNhapModel().getChiTietPhieuNhap(MaPhieuNhap,sp.getMaSP()).getMaPhieuNhap()){
                        if(new PhieuNhapModel().addChiTietPhieuNhap(sp, MaPhieuNhap)){
                            PhieuNhapCTPage(MaPhieuNhap);
                            PhieuNhapPage();
                            DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                            pnview.txtGiaTriNhap.setText(" " + decimalFormat.format(new PhieuNhapModel().getDanhSachPhieuNhap(" where ma_phieu_nhap = '" + MaPhieuNhap + "'").get(0).getGiaTriNhap()));                            
                            pnview.showMessage("Thêm thành công \n", true);
                        } else {
                            pnview.showMessage("Thêm thất bại \n", false);
                        }
                    } else pnview.showMessage("Sản phẩm đã tồn tại trong phiếu, vui lòng chọn chức năng sửa \n", false);
                }
            } else pnview.showMessage("Sản phẩm không tồn tại \n", false);
        }
    }
    
    public void doUpdateChiTietPhieuNhap(String MaPhieuNhap,SanPhamModel sp){
        if(MaPhieuNhap == null || MaPhieuNhap.isBlank()) {
            pnview.showMessage("Vui lòng chọn phiếu \n", false);
        } else if(!pnview.checkCTPN){
            pnview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(sp.getSoLuong() <= 0){
                pnview.showMessage("Số lượng không hợp lệ \n", false);
            } else if (sp.getSoLuong() == 0){
                doDeleteChiTietPhieuNhap(MaPhieuNhap);
            } else {
                if(new PhieuNhapModel().updateChiTietPhieuNhap(sp, MaPhieuNhap)){
                    PhieuNhapCTPage(MaPhieuNhap);
                    PhieuNhapPage();
                    DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                    pnview.txtGiaTriNhap.setText(" " + decimalFormat.format(new PhieuNhapModel().getDanhSachPhieuNhap(" where ma_phieu_nhap = '" + MaPhieuNhap + "'").get(0).getGiaTriNhap()));
                    pnview.showMessage("Sửa thành công \n",true );
                } else {
                    pnview.showMessage("Sửa thất bại \n", false);
                }  
            } 
        }  
    }
    
    
    public void doDeleteChiTietPhieuNhap(String MaPhieuNhap){
        if (pnview.checkCTPN){
            if (pnview.xacNhanXoa()){
                if(new PhieuNhapModel().deleteChiTietPhieuNhap(pnview.getChiTietPhieuNhapInput().getMaSP(), MaPhieuNhap)){
                    PhieuNhapPage();
                    DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                    pnview.txtGiaTriNhap.setText(" " + decimalFormat.format(new PhieuNhapModel().getDanhSachPhieuNhap(" where ma_phieu_nhap = '" + MaPhieuNhap + "'").get(0).getGiaTriNhap()));
                    pnview.showMessage("Xóa thành công \n", true);               
                } else {
                    pnview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else if(MaPhieuNhap == null || MaPhieuNhap.isBlank()) {
            pnview.showMessage("Vui lòng chọn phiếu \n", false);
        } else pnview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
}
