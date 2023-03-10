
package QLKHModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SanPhamModel extends BaseModel{
    private String MaSP;
    private String TenSP;
    private String Loai;
    private String Hang;
    private String KieuDang;
    private String MauSac;
    private int GiaXuat;
    private int GiaNhap;
    private String DonVi;
    private String ChatLieu;
    private int SoLuong;
    private String GhiChu;
    
    public SanPhamModel() {
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getKieuDang() {
        return KieuDang;
    }

    public void setKieuDang(String KieuDang) {
        this.KieuDang = KieuDang;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public int getGiaXuat() {
        return GiaXuat;
    }

    public void setGiaXuat(int GiaXuat) {
        this.GiaXuat = GiaXuat;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }
    
    
    public ArrayList<SanPhamModel> getDanhSachSanPham(String key) {
        String query;
        if ("".equals(key)){
            query = "SELECT * FROM viewSanPham";
        } else {
            query = "SELECT * FROM viewSanPham " + key;
        }
        ArrayList<SanPhamModel> listSP = new ArrayList<>(); 
        try(Connection conn = this.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setLoai(rs.getString(3));
                sp.setHang(rs.getString(4));
                sp.setMauSac(rs.getString(5));
                sp.setKieuDang(rs.getString(6));
                sp.setChatLieu(rs.getString(7));
                sp.setGiaNhap(rs.getInt(8));
                sp.setGiaXuat(rs.getInt(9));
                sp.setDonVi(rs.getString(10));
                sp.setSoLuong(rs.getInt(11));
                listSP.add(sp); 
            }
            return listSP;  
        } catch (SQLException e) {
        }
        return listSP;  
    }
    
    public int getSoLuongTon(String MaSanPham){
        try(Connection conn = this.getConnection()){
            int sl = 0;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select so_luong_ton from viewSanPham where ma_sp = '" + MaSanPham + "'");
            while (rs.next()) {
                sl = rs.getInt(1);
            }
            return sl;
        } catch (SQLException e) {
        }
        return 0; 
    }
    
    public boolean addSanPham(SanPhamModel sp) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO SanPham(ma_sp, ten_sp, loai_sp, hang, mau_sac, kieu_dang, chat_lieu, gia_nhap, gia_xuat, don_vi) VALUES(DEFAULT,'" + sp.getTenSP()+ "','" + sp.getLoai()+ "','" + sp.getHang()+ "','" + sp.getMauSac()+ "','" + sp.getKieuDang()+ "','" + sp.getChatLieu() + "','" + sp.getGiaNhap() + "','" + sp.getGiaXuat() + "','" + sp.getDonVi()+ "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteSanPham(String MaSP){
        try(Connection conn = this.getConnection()) {
            String query = "delete from SanPham where ma_sp = '" + MaSP + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateSanPham(SanPhamModel sp){
        try(Connection conn = this.getConnection()) {
            String query = "update SanPham set ten_sp = '" + sp.getTenSP() +"', loai_sp = '" + sp.getLoai() + "', hang = '" + sp.getHang() + "', don_vi = '" + sp.getDonVi() + "', gia_nhap = '" + sp.getGiaNhap() + "', gia_xuat = '" + sp.getGiaXuat() + "', chat_lieu = '" + sp.getChatLieu() + "', kieu_dang = '" + sp.getKieuDang() + "', mau_sac = '" + sp.getMauSac() + "' where ma_sp = '" + sp.getMaSP() + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public int getSoLuongXeTon(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(so_luong_ton) from viewSanPham where loai_sp = 'Xe dap'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriXeTon(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(so_luong_ton*gia_nhap) from viewSanPham where loai_sp = 'Xe dap'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public int getSoLuongPhuTungTon(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(so_luong_ton) from viewSanPham where loai_sp = 'Phu tung'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriPhuTungTon(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(so_luong_ton*gia_nhap) from viewSanPham where loai_sp = 'Phu tung'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public ArrayList<Integer> getThongKeDungTich(){
        try(Connection conn = this.getConnection()){
            ArrayList<Integer> tkd = new ArrayList<>();
            String query = "select khu,sum(suc_chua),sum(trong) from viewDay group by khu"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                int x = rs.getInt(2);
                int y = rs.getInt(3);
                tkd.add(x);
                tkd.add(y);
            }
            return  tkd;
        } catch (SQLException e) {
        }
        return null;
    }

}
