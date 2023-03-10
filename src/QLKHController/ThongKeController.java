
package QLKHController;

import QLKHModel.*;
import QLKHView.ThongKe;
import java.util.ArrayList;

public class ThongKeController {
    private static ThongKe bctkview;
    
    public ThongKeController(ThongKe bctkview) {
        ThongKeController.bctkview = bctkview;
    }
    
    public void ThongKePage(){
        SanPhamModel spmodel = new SanPhamModel();
        bctkview.loadThongKeXeTon(spmodel.getSoLuongXeTon(), spmodel.getGiaTriXeTon());
        bctkview.loadThongKePhuTungTon(spmodel.getSoLuongPhuTungTon(), spmodel.getGiaTriPhuTungTon());
        PhieuXuatModel pxmodel = new PhieuXuatModel();
        bctkview.loadThongKePhieuDaXuat(pxmodel.getSoPhieuDaXuat(), pxmodel.getGiaTriDaXuat());
        bctkview.loadThongKePhieuChuaXuat(pxmodel.getSoPhieuChuaXuat(), pxmodel.getGiaTriChuaXuat());
        PhieuNhapModel pnmodel = new PhieuNhapModel();
        bctkview.loadThongKePhieuHoan(pnmodel.getSoPhieuHoan(), pnmodel.getGiaTriHoan());
        bctkview.loadThongKePhieuDaNhap(pnmodel.getSoPhieuDaNhap(), pnmodel.getGiaTriDaNhap());
        bctkview.loadThongKePhieuChuaNhap(pnmodel.getSoPhieuChuaNhap(), pnmodel.getGiaTriChuaNhap());
        bctkview.loadThongKeDungTich(spmodel.getThongKeDungTich().get(2), spmodel.getThongKeDungTich().get(3), spmodel.getThongKeDungTich().get(0), spmodel.getThongKeDungTich().get(1));
    }
    
    public void ThongKeSanPham(String key,int Thang, int Nam, String LoaiSP){
        if("Ton kho nhieu".equals(key) || "Ton kho it".equals(key)){
            String order =" ";
            if ("Ton kho nhieu".equals(key)){
                order =  " DESC";
            }
            String key1 = " where so_luong_ton > 0 and loai_sp = '"+ LoaiSP +"' order by so_luong_ton" + order;
            ArrayList<SanPhamModel> lsp = new SanPhamModel().getDanhSachSanPham(key1);
            bctkview.loadTableThongKeSanPham(lsp);
        } else if("Xuat nhieu".equals(key) || "Xuat it".equals(key)) {
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0) t = " = " + Integer.toString(Thang);
            if(Nam > 0) n = " = " + Integer.toString(Nam);
            String order;
            if ("Xuat nhieu".equals(key)){
                order = "order by sum(so_luong) DESC";
            } else order = "order by sum(so_luong)";
            String key1 = "where month(ngay_xuat) "+ t + " and year(ngay_xuat) "+ n + " and loai_sp = '" + LoaiSP + "'";
            ArrayList<SanPhamModel> lsp = new PhieuXuatModel().getSanPhamXuat(key1,order);
            bctkview.loadTableThongKeSanPham(lsp);
        } else {
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0) t = " = " + Integer.toString(Thang);
            if(Nam > 0) n = " = " + Integer.toString(Nam);
            String order;
            if ("Nhap nhieu".equals(key)){
                order = "order by sum(so_luong) DESC";
            } else order = "order by sum(so_luong)";
            String key1 = "where month(ngay_nhap) "+ t + " and year(ngay_nhap) "+ n + " and loai_sp = '" + LoaiSP + "'";
            ArrayList<SanPhamModel> lsp = new PhieuNhapModel().getSanPhamNhap(key1,order);
            bctkview.loadTableThongKeSanPham(lsp);
        }
    }
    
    public void ThongKePhieuNhap(String key,int Thang, int Nam, String TrangThai){
        int tt;
        if("Da nhap".equals(TrangThai)){
            tt = 1;
        } else tt = 0;
        
        if("Tong".equals(key)){
            String key1 = " where trang_thai = " + tt;
            ArrayList<PhieuNhapModel> lpn = new PhieuNhapModel().getDanhSachPhieuNhap(key1);
            bctkview.loadTableThongKePhieuNhap(lpn);
        } else {
            String t = "is not null";
            String n = "is not null";
            String order;
            if("Gia tri tang dan".equals(key)){
                order = " order by gia_tri_nhap ASC";
            } else order = " order by gia_tri_nhap DESC";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            String key1;
            if(tt == 1){
                key1 = " where trang_thai = " + tt + " and month(ngay_nhap) " + t + " and year(ngay_nhap) " + n + order;
            } else key1 = " where trang_thai = " + tt + " and month(ngay_tao) " + t + " and year(ngay_tao) " + n + order;
            ArrayList<PhieuNhapModel> lpn = new PhieuNhapModel().getDanhSachPhieuNhap(key1);
            bctkview.loadTableThongKePhieuNhap(lpn);
        }
    }
    
    public void ThongKePhieuXuat(String key,int Thang, int Nam, String TrangThai){
        int tt;
        if("Da xuat".equals(TrangThai)){
            tt = 1;
        } else tt = 0;
        if("Tong".equals(key)){
            String key1 = " where trang_thai = " + tt;
            ArrayList<PhieuXuatModel> lpx = new PhieuXuatModel().getDanhSachPhieuXuat(key1);
            bctkview.loadTableThongKePhieuXuat(lpx);
        } else {
            String t = "is not null";
            String n = "is not null";
            String order;
            if("Gia tri tang dan".equals(key)){
                order = " order by gia_tri_xuat ASC";
            } else order = " order by gia_tri_xuat DESC";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            String key1;
            if(tt == 1){
                key1 = " where trang_thai = " + tt + " and month(ngay_xuat) " + t + " and year(ngay_xuat) " + n + order;
            } else key1 = " where trang_thai = " + tt + " and month(ngay_tao) " + t + " and year(ngay_tao) " + n + order;
            ArrayList<PhieuXuatModel> lpx = new PhieuXuatModel().getDanhSachPhieuXuat(key1);
            bctkview.loadTableThongKePhieuXuat(lpx);
        }
    }
    
    public void ThongKeDoanhThu(String key,int Thang, int Nam){
        if("Tong".equals(key)){
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            String key1 = "and month(ngay_xuat) " + t + " and year(ngay_xuat) " + n;
            bctkview.loadTableThongKeDoanhThuTong(new PhieuXuatModel().getDoanhThuTong(key1));
        } else {
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            if ("Cua hang".equals(key)){
                String key1 = "and month(ngay_xuat) " + t + " and year(ngay_xuat) " + n;
                ArrayList<CuaHangModel> lch = new CuaHangModel().getDoanhThuCuaHang(key1);
                bctkview.loadTableThongKeDoanhThuCuaHang(lch);
            } else {
                String key1 = "where month(ngay_xuat) "+ t + " and year(ngay_xuat) "+ n;
                ArrayList<SanPhamModel> lsp = new PhieuXuatModel().getSanPhamXuat(key1," order by sum(so_luong)*gia_xuat DESC");
                bctkview.loadTableThongKeDoanhThuSanPham(lsp);
            } 
        }
    }
    
    public void ThongKeTienNhap(String key,int Thang, int Nam){
        if("Tong".equals(key)){
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            String key1 = "and month(ngay_nhap) " + t + " and year(ngay_nhap) " + n;
            bctkview.loadTableThongKeTienNhapTong(new PhieuNhapModel().getTienNhapTong(key1));
        } else {
            String t = "is not null";
            String n = "is not null";
            if(Thang > 0){
                t = " = " + Thang;
            }
            if(Nam > 0){
                n = " = " + Nam;
            }
            if ("Nha cung cap".equals(key)){
                String key1 = "and month(ngay_nhap) " + t + " and year(ngay_nhap) " + n;
                ArrayList<NhaCungCapModel> lncc = new NhaCungCapModel().getTienNhapNhaCungCap(key1);
                bctkview.loadTableThongKeTienNhapNhaCungCap(lncc);
            } else {
                String key1 = "where month(ngay_nhap) "+ t + " and year(ngay_nhap) "+ n;
                ArrayList<SanPhamModel> lsp = new PhieuNhapModel().getSanPhamNhap(key1," order by sum(so_luong)*gia_nhap DESC");
                bctkview.loadTableThongKeTienNhapSanPham(lsp);
            } 
        }
    }
    
    
}

