
package QLKHModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class PhieuNhapModel extends BaseModel{
    private String MaPhieuNhap;
    private String MaNCC;
    private String MaND;
    private String NgayTao;
    private String TrangThai;
    private String NgayNhap;
    private long GiaTriNhap;
    private String GhiChu;
    ArrayList<SanPhamModel> DanhSachSP = new ArrayList<>();
    
    public PhieuNhapModel() {
        DanhSachSP = new ArrayList<>();
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
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

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public ArrayList<SanPhamModel> getDanhSachSP() {
        return DanhSachSP;
    }

    public void setDanhSachSP(ArrayList<SanPhamModel> DanhSachSP) {
        this.DanhSachSP = DanhSachSP;
    }

    public long getGiaTriNhap() {
        return GiaTriNhap;
    }

    public void setGiaTriNhap(long GiaTriNhap) {
        this.GiaTriNhap = GiaTriNhap;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
    public ArrayList<PhieuNhapModel> getDanhSachPhieuNhap(String key) {
        String query;
        if ("".equals(key)){
            query = " select * from viewPhieuNhap";
        } else {
            query = " select * from viewPhieuNhap " + key;
        }
        //System.err.println(key);
        ArrayList<PhieuNhapModel> listPN = new ArrayList<>(); 
        try(Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                PhieuNhapModel pn = new PhieuNhapModel();
                
                pn.setMaPhieuNhap(rs.getString(1));
                pn.setNgayTao(rs.getDate(2).toString());
                pn.setMaNCC(rs.getString(3));
                pn.setMaND(rs.getString(4));
                if(rs.getBoolean(5)) {
                    pn.setTrangThai("Da nhap");
                }
                else pn.setTrangThai("Chua nhap");
                if(rs.getDate(6) == null) {
                    pn.setNgayNhap("");
                } else pn.setNgayNhap(rs.getDate(6).toString());
                pn.setGiaTriNhap(rs.getLong(7));
                pn.setGhiChu(rs.getString(8));
                listPN.add(pn); 
            }
            return listPN; 
        } catch (SQLException e) {
        }
        return listPN; 
    }
    
    public PhieuNhapModel getChiTietPhieuNhap(String MaPhieuNhap, String MaSP){
        PhieuNhapModel pn = new PhieuNhapModel();
        String query;
        if(MaSP.isBlank()){
                query = "select ma_sp, so_luong from ChiTietPhieuNhap where ma_phieu_nhap = '" + MaPhieuNhap + "'"; 
        } else query = "select ma_sp, so_luong from ChiTietPhieuNhap where ma_phieu_nhap = '" + MaPhieuNhap + "' and ma_sp = '" + MaSP + "'"; 
        try(Connection conn = this.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();                
                sp.setMaSP(rs.getString(1));
                sp.setSoLuong(rs.getInt(2));
                pn.DanhSachSP.add(sp);
            }
            return pn;
        } catch (SQLException e) {
        }
        return null;
    }
    
    public ArrayList<SanPhamModel> getChiTietSP(String MaPhieuNhap){
        ArrayList<SanPhamModel> lsp = new ArrayList<>();
        try(Connection conn = this.getConnection()){
            String query = "select SanPham.ma_sp, ten_sp, so_luong, gia_nhap from ChiTietPhieuNhap join SanPham on ChiTietPhieuNhap.ma_sp = SanPham.ma_sp where ma_phieu_nhap = '" + MaPhieuNhap + "'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setGiaNhap(rs.getInt(4));
                lsp.add(sp);
            }
            return lsp;
        } catch (SQLException e) {
        }
        return lsp;
    }
    
    public boolean addPhieuNhap(PhieuNhapModel pn) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO PhieuNhap(ma_phieu_nhap, ma_ncc, ma_nd, ngay_tao) VALUES(DEFAULT,'" + pn.getMaNCC()+ "','" + pn.getMaND()+"',default)";
            //System.err.println(query);
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updatePhieuNhap(PhieuNhapModel pn){
        int tt;
        if(null == pn.getTrangThai())return false; else switch (pn.getTrangThai()) {
                case "Da nhap" -> tt = 1;
                case "Chua nhap" -> tt = 0;
                default -> {
                    return false;
                }
            }
        try(Connection conn = this.getConnection()) {
            String query;
            if(tt == 0) {
                query = "update PhieuNhap set ma_ncc = '" + pn.getMaNCC()+"', ma_nd = '" + pn.getMaND()+"', trang_thai = '" + tt + "', ghi_chu = '"+ pn.getGhiChu() + "' where ma_phieu_nhap = '" + pn.getMaPhieuNhap()+ "'";
            } else {
                query = "update PhieuNhap set ma_ncc = '" + pn.getMaNCC()+"', ma_nd = '" + pn.getMaND()+"', trang_thai = '" + tt +"', ngay_nhap = '"+ LocalDate.now() + "', ghi_chu = '"+ pn.getGhiChu() + "'  where ma_phieu_nhap = '" + pn.getMaPhieuNhap()+ "'";
            }
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deletePhieuNhap(String MaPhieuNhap){
        try(Connection conn = this.getConnection()) {
            String query = "delete from PhieuNhap where ma_phieu_nhap = '" + MaPhieuNhap + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean addChiTietPhieuNhap(SanPhamModel sp, String MaPhieuNhap) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO ChiTietPhieuNhap VALUES('" + MaPhieuNhap + "','" + sp.getMaSP() + "','" + sp.getSoLuong() +  "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateChiTietPhieuNhap(SanPhamModel sp, String MaPhieuNhap){
        try(Connection conn = this.getConnection()) {
            String query = "update ChiTietPhieuNhap set so_luong = " + sp.getSoLuong() + " where ma_phieu_nhap = '" + MaPhieuNhap + "' and ma_sp = '" + sp.getMaSP()+ "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteChiTietPhieuNhap(String MaSP, String MaPhieuNhap){
        try(Connection conn = this.getConnection()) {
            String query = "delete from ChiTietPhieuNhap where ma_phieu_nhap = '" + MaPhieuNhap + "' and ma_sp = '" + MaSP + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public int getSoPhieuDaNhap(){
        try(Connection conn = this.getConnection()){
            String query = "select count(ma_phieu_nhap) from viewPhieuNhap where trang_thai = 1 and ma_ncc <> 'NCC00'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriDaNhap(){
        try(Connection conn = this.getConnection()){  
            String query = "select sum(gia_tri_nhap) from viewPhieuNhap where trang_thai = 1 and ma_ncc <> 'NCC00'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public int getSoPhieuChuaNhap(){
        try(Connection conn = this.getConnection()){
            String query = "select count(ma_phieu_nhap) from viewPhieuNhap where trang_thai = 0"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriChuaNhap(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(gia_tri_nhap) from viewPhieuNhap where trang_thai = 0"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public int getSoPhieuHoan(){
        try(Connection conn = this.getConnection()){
            String query = "select count(ma_phieu_nhap) from viewPhieuNhap where trang_thai = 1 and ma_ncc = 'NCC00'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public long getGiaTriHoan(){
        try(Connection conn = this.getConnection()){
            String query = "select sum(gia_tri_nhap) from viewPhieuNhap where trang_thai = 1 and ma_ncc = 'NCC00'"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                return rs.getLong(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    
    public ArrayList<SanPhamModel> getSanPhamNhap(String key,String order){
        try(Connection conn = this.getConnection()){
            String query = "select viewSanPham.ma_sp,viewSanPham.ten_sp,sum(so_luong),gia_nhap,don_vi from viewSanPham join ChiTietPhieuNhap on viewSanPham.ma_sp = ChiTietPhieuNhap.ma_sp join PhieuNhap on ChiTietPhieuNhap.ma_phieu_nhap = PhieuNhap.ma_phieu_nhap "+ key +" group by viewSanPham.ma_sp,viewSanPham.ten_sp,gia_nhap,don_vi " + order; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            ArrayList<SanPhamModel> lsp = new ArrayList<>();
            while (rs.next()){
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setGiaNhap(rs.getInt(4));
                sp.setDonVi(rs.getString(5));
                lsp.add(sp);
            }
            return lsp;
        } catch (SQLException e) {
        }
        return null;
    }
    
    public ArrayList<Tien> getTienNhapTong(String key){
        try(Connection conn = this.getConnection()){
            String query = "select month(ngay_nhap),YEAR(ngay_nhap), sum(gia_tri_nhap) from viewPhieuNhap where trang_thai = 1 "+ key +" group by month(ngay_nhap),YEAR(ngay_nhap)"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            ArrayList<Tien> tn = new ArrayList<>();
            while (rs.next()){
                Tien t = new Tien();
                t.setThang(rs.getInt(1));
                t.setNam(rs.getInt(2));
                t.setTien(rs.getLong(3));
                tn.add(t);
            }
            return tn;
        } catch (SQLException e) {
        }
        return null;
    }
}


