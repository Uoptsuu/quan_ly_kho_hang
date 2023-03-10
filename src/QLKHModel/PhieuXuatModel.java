
package QLKHModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class PhieuXuatModel extends BaseModel{
    private String MaPhieuXuat;
    private String MaCH;
    private String MaND;
    private String NgayTao;
    private String TrangThai;
    private String NgayXuat;
    private long GiaTriXuat;
    ArrayList<SanPhamModel> DanhSachSP = new ArrayList<>();
    
    public PhieuXuatModel() {
        DanhSachSP = new ArrayList<>();
    }

    public String getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(String MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public ArrayList<SanPhamModel> getDanhSachSP() {
        return DanhSachSP;
    }

    public void setDanhSachSP(ArrayList<SanPhamModel> DanhSachSP) {
        this.DanhSachSP = DanhSachSP;
    }

    public long getGiaTriXuat() {
        return GiaTriXuat;
    }

    public void setGiaTriXuat(long GiaTriXuat) {
        this.GiaTriXuat = GiaTriXuat;
    }

    
    public ArrayList<PhieuXuatModel> getDanhSachPhieuXuat(String key) {
        String query;
        if ("".equals(key)){
            query = "select * from viewPhieuXuat ";
        } else {
            query = "select * from viewPhieuXuat " + key;
        }
        ArrayList<PhieuXuatModel> listPX = new ArrayList<>(); 
        try(Connection conn = this.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                PhieuXuatModel px = new PhieuXuatModel();
                
                px.setMaPhieuXuat(rs.getString(1));
                px.setNgayTao(rs.getDate(2).toString());
                px.setMaCH(rs.getString(3));
                px.setMaND(rs.getString(4));
                if(rs.getBoolean(5)) {
                    px.setTrangThai("Da xuat");
                }
                else px.setTrangThai("Chua xuat");
                if(rs.getDate(6) == null) {
                    px.setNgayXuat("");
                } else px.setNgayXuat(rs.getDate(6).toString());
                px.setGiaTriXuat(rs.getLong(7));
                listPX.add(px); 
            }
            return listPX; 
        } catch (SQLException e) {
        }
        return listPX; 
    }
    
    public PhieuXuatModel getChiTietPhieuXuat(String MaPhieuXuat,String MaSP){
        PhieuXuatModel px = new PhieuXuatModel();
        String query;
        if(MaSP.isBlank()){
            query = "select ma_sp, so_luong from ChiTietPhieuXuat where ma_phieu_xuat = '" + MaPhieuXuat + "'"; 
        } else query = "select ma_sp, so_luong from ChiTietPhieuXuat where ma_phieu_xuat = '" + MaPhieuXuat + "' and ma_sp = '" + MaSP + "'";  
        try(Connection conn = this.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();                
                sp.setMaSP(rs.getString(1));
                sp.setSoLuong(rs.getInt(2));
                px.DanhSachSP.add(sp);
            }
            return px;
        } catch (SQLException e) {
        }
        return null;
    }
    
    public ArrayList<SanPhamModel> getChiTietSP(String MaPhieuXuat){
        ArrayList<SanPhamModel> lsp = new ArrayList<>();
        try(Connection conn = this.getConnection()){
            String query = "select SanPham.ma_sp, ten_sp, so_luong, gia_xuat from ChiTietPhieuXuat join SanPham on ChiTietPhieuXuat.ma_sp = SanPham.ma_sp where ma_phieu_xuat = '" + MaPhieuXuat + "'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setGiaXuat(rs.getInt(4));
                lsp.add(sp);
            }
            return lsp;
        } catch (SQLException e) {
        }
        return lsp;
    }
       
    public boolean addPhieuXuat(PhieuXuatModel px) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO PhieuXuat(ma_phieu_xuat, ma_ch, ma_nd,ngay_tao) VALUES(DEFAULT,'" + px.getMaCH()+ "','" + px.getMaND()+"',default)";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updatePhieuXuat(PhieuXuatModel px){
        int tt;
        if(null == px.getTrangThai())return false; else switch (px.getTrangThai()) {
                case "Da xuat" -> tt = 1;
                case "Chua xuat" -> tt = 0;
                default -> {
                    return false;
                }
            }
        try(Connection conn = this.getConnection()){
            String query;
            if(tt == 0) {
               query = "update PhieuXuat set ma_ch = '" + px.getMaCH()+"', ma_nd = '" + px.getMaND()+"', trang_thai = '" + tt + "' where ma_phieu_xuat = '" + px.getMaPhieuXuat()+ "'";
            } else {
                 query = "update PhieuXuat set ma_ch = '" + px.getMaCH()+"', ma_nd = '" + px.getMaND()+"', trang_thai = '" + tt +"', ngay_xuat = '"+ LocalDate.now() +"'  where ma_phieu_xuat = '" + px.getMaPhieuXuat()+ "'";
            }
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deletePhieuXuat(String MaPhieuXuat){
        try(Connection conn = this.getConnection()) {
            String query = "delete from PhieuXuat where ma_phieu_xuat = '" + MaPhieuXuat + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean addChiTietPhieuXuat(SanPhamModel sp, String MaPhieuXuat) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO ChiTietPhieuXuat VALUES('" + MaPhieuXuat + "','" + sp.getMaSP() + "','" + sp.getSoLuong() +  "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateChiTietPhieuXuat(SanPhamModel sp, String MaPhieuXuat){
        try(Connection conn = this.getConnection()) {
            String query = "update ChiTietPhieuXuat set so_luong = " + sp.getSoLuong() + " where ma_phieu_xuat = '" + MaPhieuXuat + "' and ma_sp = '" + sp.getMaSP()+ "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteChiTietPhieuXuat(String MaSP, String MaPhieuXuat){
        try(Connection conn = this.getConnection()) {
            String query = "delete from ChiTietPhieuXuat where ma_phieu_xuat = '" + MaPhieuXuat + "' and ma_sp = '" + MaSP + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public int getSoPhieuDaXuat(){
        try(Connection conn = this.getConnection()){
            String query = "select count(ma_phieu_xuat) from viewPhieuXuat where trang_thai = 1"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriDaXuat(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(gia_tri_xuat) from viewPhieuXuat where trang_thai = 1"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public int getSoPhieuChuaXuat(){
        try(Connection conn = this.getConnection()){
            String query = "select count(ma_phieu_xuat) from viewPhieuXuat where trang_thai = 0"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriChuaXuat(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(gia_tri_xuat) from viewPhieuXuat where trang_thai = 0"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public ArrayList<SanPhamModel> getSanPhamXuat(String key, String order){
        try(Connection conn = this.getConnection()){
            String query = "select viewSanPham.ma_sp,viewSanPham.ten_sp,sum(so_luong),gia_xuat,don_vi from viewSanPham join ChiTietPhieuXuat on viewSanPham.ma_sp = ChiTietPhieuXuat.ma_sp join PhieuXuat on ChiTietPhieuXuat.ma_phieu_xuat = PhieuXuat.ma_phieu_xuat " + key + " group by viewSanPham.ma_sp,viewSanPham.ten_sp,gia_xuat,don_vi " + order; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            ArrayList<SanPhamModel> lsp = new ArrayList<>();
            while (rs.next()){
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setGiaXuat(rs.getInt(4));
                sp.setDonVi(rs.getString(5));
                lsp.add(sp);
            }
            return lsp;
        } catch (SQLException e) {
        }
        return null;
    }
    
    public ArrayList<Tien> getDoanhThuTong(String key){
        try(Connection conn = this.getConnection()){
            String query = "select month(ngay_xuat),YEAR(ngay_xuat), sum(gia_tri_xuat) from viewPhieuXuat where trang_thai = 1 "+ key +" group by month(ngay_xuat),YEAR(ngay_xuat)"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            ArrayList<Tien> dt = new ArrayList<>();
            while (rs.next()){
                Tien t = new Tien();
                t.setThang(rs.getInt(1));
                t.setNam(rs.getInt(2));
                t.setTien(rs.getLong(3));
                dt.add(t);
            }
            return dt;
        } catch (SQLException e) {
        }
        return null;
    }
    
    
}
