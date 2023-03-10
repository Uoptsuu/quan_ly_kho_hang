
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PhieuXuatController {
    private static PhieuXuatView pxview;
 
    public PhieuXuatController(PhieuXuatView pxview) {
        PhieuXuatController.pxview = pxview;
    }
    
    public void PhieuXuatPage(){
        pxview.loadTablePhieuXuat(new PhieuXuatModel().getDanhSachPhieuXuat("order by ngay_tao DESC"));
        pxview.loadComboBoxMaCH(new CuaHangModel().getDanhSachCuaHang(""));
        pxview.loadComboBoxNguoiLap(new NguoiDungModel().getDanhSachNguoiDung("where chuc_vu in ('Quan ly','Nhan vien tiep nhan')" ));
    }
    
    public void PhieuXuatCTPage(String MaPhieuXuat){
        pxview.loadTableChiTietPhieuXuat(new PhieuXuatModel().getChiTietPhieuXuat(MaPhieuXuat,"").getDanhSachSP());
    }
    
    
    public void doAddPhieuXuat(){
        if(pxview.checkPX){
            pxview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else {
            PhieuXuatModel px = pxview.getPhieuXuatInput();
            if(px.getMaCH().equals("*")){
                pxview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
            } else {
                if(new PhieuXuatModel().addPhieuXuat(px)){
                    PhieuXuatPage();
                    pxview.showMessage("Thêm thành công \n", true);
                    pxview.resetInput();
                } else {
                    pxview.showMessage("Thêm thất bại \n", false);
                }
            }
        }
    }
    
    public void doSearchPhieuXuat(String ThuocTinh, String ThoiGian, String GiaTriThuocTinh, String NgayBatDau, String NgayKetThuc, boolean checkThoiGian){
        String key = "";
        if (checkThoiGian){
            if ("ma_ch".equals(ThuocTinh) || "ma_nd".equals(ThuocTinh)){
                key = " where " + ThuocTinh + " like '%" + GiaTriThuocTinh + "%' and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
            } else {
                if("".equals(ThuocTinh) && !"".equals(ThoiGian)){
                    key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                } else if ("trang_thai".equals(ThuocTinh)){
                    int tt;
                    if ("Da xuat".equals(GiaTriThuocTinh)){
                        tt = 1;
                    } else tt = 0;
                    key = " where " + ThuocTinh + " = " + tt + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                } else {
                    if(null != GiaTriThuocTinh)switch (GiaTriThuocTinh) {
                        case "Tang dan" -> key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "' order by " + ThuocTinh + " ASC";
                        case "Giam dan" -> key = " where " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "' order by " + ThuocTinh + " DESC";
                        case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewPhieuXuat)" + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                        case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewPhieuXuat)" + " and " + ThoiGian + " >= '" + NgayBatDau + "' and " + ThoiGian + " <= '" + NgayKetThuc + "'";
                        default -> {
                        }
                    }
                }
            }
        } else {
            if ("ma_ch".equals(ThuocTinh) || "ma_nd".equals(ThuocTinh) || "ma_phieu_xuat".equals(ThuocTinh)){
                key = " where " + ThuocTinh + " like '%" + GiaTriThuocTinh + "%'";
            } else {
                if ("trang_thai".equals(ThuocTinh)){
                    int tt;
                    if ("Da xuat".equals(GiaTriThuocTinh)){
                        tt = 1;
                    } else tt = 0;
                    key = " where " + ThuocTinh + " = " + tt;
                } else {
                    if(null != GiaTriThuocTinh)switch (GiaTriThuocTinh) {
                        case "Tang dan" -> key = " order by " + ThuocTinh + " ASC";
                        case "Giam dan" -> key = " order by " + ThuocTinh + " DESC";
                        case "Nhieu nhat" -> key = " where " + ThuocTinh + " = (select max(" + ThuocTinh + ") from viewPhieuXuat)";
                        case "It nhat" -> key = " where " + ThuocTinh + " = (select min(" + ThuocTinh + ") from viewPhieuXuat)";
                        default -> {
                        }
                    }
                }
            }
        }
        if ("".equals(key)){
            pxview.showMessage("Thông tin tìm kiếm thiếu hoặc chưa hợp lệ \n", false);
            PhieuXuatPage();
        } else {
            ArrayList<PhieuXuatModel> pxs = new PhieuXuatModel().getDanhSachPhieuXuat(key);
            if(pxs.isEmpty()){
                pxview.showMessage("Không tìm thấy thông tin phù hợp \n", false);
                PhieuXuatPage();
            } else pxview.loadTablePhieuXuat(pxs);
        }  
    }    
    
    public void doUpdatePhieuXuat(){
        PhieuXuatModel px = pxview.getPhieuXuatInput();
        if(!pxview.checkPX){
            pxview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(px.getMaPhieuXuat().equals("") || px.getMaCH().equals("") || px.getMaND().equals("")){
                pxview.showMessage("Thông tin chỉnh sửa thiếu hoặc chưa hợp lệ \n", false);
            }
            else {
                if(new PhieuXuatModel().updatePhieuXuat(px)){
                    PhieuXuatPage();
                    pxview.showMessage("Sửa thành công \n",true );
                } else {
                    pxview.showMessage("Sửa thất bại \n", false);
                }  
            } 
        } 
    }
    
    public void doDeletePhieuXuat(String MaPhieuXuat){
        if (pxview.checkPX){
            if (pxview.xacNhanXoa()){
                if(new PhieuXuatModel().deletePhieuXuat(MaPhieuXuat)){
                    PhieuXuatPage();
                    pxview.showMessage("Xóa thành công \n", true);               
                } else {
                    pxview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else pxview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
    
    public void doPrintBill(String MaPhieuXuat){
        if(pxview.checkPX){
            CuaHangModel ch = new CuaHangModel().getCuaHang(MaPhieuXuat);
            ArrayList<SanPhamModel> lsp = new PhieuXuatModel().getChiTietSP(MaPhieuXuat);
            pxview.printBill(ch, lsp);
        } else pxview.showMessage("Vui lòng chọn thông tin cần in \n", false); 
    }
    
    public void doAddChiTietPhieuXuat(String MaPhieuXuat){
        if(pxview.checkCTPX){
            pxview.showMessage("Vui lòng \"Làm mới\" và nhập thông tin \n", false);
        } else if(MaPhieuXuat == null || MaPhieuXuat.isBlank()) {
            pxview.showMessage("Vui lòng chọn phiếu \n", false);
        } else {
            SanPhamModel sp = pxview.getChiTietPhieuXuatInput();
            if(!new SanPhamModel().getDanhSachSanPham(" where ma_sp = '"+ sp.getMaSP() +"'").isEmpty()){
                if(sp.getMaSP().equals("") || sp.getSoLuong() <= 0 ){
                    pxview.showMessage("Thông tin còn thiếu hoặc chưa hợp lệ \n", false);
                } else {
                    if(new SanPhamModel().getSoLuongTon(sp.getMaSP()) >= sp.getSoLuong()){
                        if(null == new PhieuXuatModel().getChiTietPhieuXuat(MaPhieuXuat,sp.getMaSP()).getMaPhieuXuat()){
                            if(new PhieuXuatModel().addChiTietPhieuXuat(sp, MaPhieuXuat)){
                                PhieuXuatCTPage(MaPhieuXuat);
                                PhieuXuatPage();
                                DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                                pxview.txtGiaTriXuat.setText(" " + decimalFormat.format(new PhieuXuatModel().getDanhSachPhieuXuat(" where ma_phieu_xuat = '" + MaPhieuXuat + "'").get(0).getGiaTriXuat()));
                                pxview.showMessage("Thêm thành công \n", true);
                            } else {
                                pxview.showMessage("Thêm thất bại \n", false);
                            }
                        } else pxview.showMessage("Sản phẩm đã tồn tại trong phiếu, vui lòng chọn chức năng sửa \n", false);
                    } else pxview.showMessage("Số lượng tồn kho không đủ \n", false);
                }
            } else pxview.showMessage("Sản phẩm không tồn tại \n", false);
        }
    }
    
    public void doUpdateChiTietPhieuXuat(String MaPhieuXuat){
        SanPhamModel sp = pxview.getChiTietPhieuXuatInput();
        if(MaPhieuXuat == null || MaPhieuXuat.isBlank()) {
            pxview.showMessage("Vui lòng chọn phiếu \n", false);
        } else if(!pxview.checkCTPX){
            pxview.showMessage("Vui lòng chọn thông tin cần sửa \n", false);
        } else {
            if(sp.getSoLuong() <= 0){
                pxview.showMessage("Số lượng không hợp lệ \n", false);
            } else if (sp.getSoLuong() == 0){
                doDeleteChiTietPhieuXuat(MaPhieuXuat);
            } else {
                if(new SanPhamModel().getSoLuongTon(sp.getMaSP()) >= sp.getSoLuong()){
                    if(new PhieuXuatModel().updateChiTietPhieuXuat(sp, MaPhieuXuat)){
                        PhieuXuatCTPage(MaPhieuXuat);
                        PhieuXuatPage();
                        DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                        pxview.txtGiaTriXuat.setText(" " + decimalFormat.format(new PhieuXuatModel().getDanhSachPhieuXuat(" where ma_phieu_xuat = '" + MaPhieuXuat + "'").get(0).getGiaTriXuat()));
                        pxview.showMessage("Sửa thành công \n",true );
                    } else {
                        pxview.showMessage("Sửa thất bại \n", false);
                    }
                } else pxview.showMessage("Số lượng tồn kho không đủ \n", false);
            } 
        }  
    }
    
    
    public void doDeleteChiTietPhieuXuat(String MaPhieuXuat){
        if (pxview.checkCTPX){
            if (pxview.xacNhanXoa()){
                if(new PhieuXuatModel().deleteChiTietPhieuXuat(pxview.getChiTietPhieuXuatInput().getMaSP(), MaPhieuXuat)){
                    PhieuXuatPage();
                    DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
                    pxview.txtGiaTriXuat.setText(" " + decimalFormat.format(new PhieuXuatModel().getDanhSachPhieuXuat(" where ma_phieu_xuat = '" + MaPhieuXuat + "'").get(0).getGiaTriXuat()));
                    pxview.showMessage("Xóa thành công \n", true);               
                } else {
                    pxview.showMessage("Xóa thất bại \n", false);
                }
            }
        } else if(MaPhieuXuat == null || MaPhieuXuat.isBlank()) {
            pxview.showMessage("Vui lòng chọn phiếu \n", false);
        } else pxview.showMessage("Vui lòng chọn thông tin cần xóa \n", false); 
    }
}
