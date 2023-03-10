
package QLKHModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NhaCungCapModel extends BaseModel{
    private String MaNCC;
    private String TenNCC;
    private String DiaChiNCC;
    private String SdtNCC;
    private int SoPhieuDaNhap;
    private int SoPhieuChuaNhap;
    private long TongGiaTriNhap;
    
    public NhaCungCapModel() {
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChiNCC() {
        return DiaChiNCC;
    }

    public void setDiaChiNCC(String DiaChiNCC) {
        this.DiaChiNCC = DiaChiNCC;
    }

    public String getSdtNCC() {
        return SdtNCC;
    }

    public void setSdtNCC(String SdtNCC) {
        this.SdtNCC = SdtNCC;
    }

    public int getSoPhieuDaNhap() {
        return SoPhieuDaNhap;
    }

    public void setSoPhieuDaNhap(int SoPhieuDaNhap) {
        this.SoPhieuDaNhap = SoPhieuDaNhap;
    }

    public int getSoPhieuChuaNhap() {
        return SoPhieuChuaNhap;
    }

    public void setSoPhieuChuaNhap(int SoPhieuChuaNhap) {
        this.SoPhieuChuaNhap = SoPhieuChuaNhap;
    }

    public long getTongGiaTriNhap() {
        return TongGiaTriNhap;
    }

    public void setTongGiaTriNhap(long TongGiaTriNhap) {
        this.TongGiaTriNhap = TongGiaTriNhap;
    }
    
    
    
    public ArrayList<NhaCungCapModel> getDanhSachNhaCungCap(String key) {
        String query;
        if ("".equals(key)){
            query = "select * from viewNhaCungCap";
        } else {
            query = "select * from viewNhaCungCap " + key;
        }
        ArrayList<NhaCungCapModel> listNCC = new ArrayList<>(); 
        try(Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                NhaCungCapModel ncc = new NhaCungCapModel();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setSdtNCC(rs.getString(3));
                ncc.setDiaChiNCC(rs.getString(4));
                ncc.setSoPhieuDaNhap(rs.getInt(5));
                ncc.setSoPhieuChuaNhap(rs.getInt(6));
                ncc.setTongGiaTriNhap(rs.getLong(7));
                listNCC.add(ncc); 
            }
            return listNCC;
        } catch (SQLException e) {
        }
        return listNCC;  
    }
    
    public boolean addNhaCungCap(NhaCungCapModel ncc) {
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO NhaCungCap(ma_ncc, ten_ncc, sdt, dia_chi) VALUES(DEFAULT,'" + ncc.getTenNCC() + "','" + ncc.getSdtNCC() + "','" + ncc.getDiaChiNCC() + "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateNhaCungCap(NhaCungCapModel ncc){
        try(Connection conn = this.getConnection()) {
            String query = "update NhaCungCap set ten_ncc = '" + ncc.getTenNCC() +"', dia_chi = '" + ncc.getDiaChiNCC()+ "', sdt = '" + ncc.getSdtNCC() + "' where ma_ncc = '" + ncc.getMaNCC() + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteNhaCungCap(String MaNCC){
        try(Connection conn = this.getConnection()) {
            String query = "delete from NhaCungCap where ma_ncc = '" + MaNCC + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public ArrayList<NhaCungCapModel> getTienNhapNhaCungCap(String key){
        String query;
        query = "select viewNhaCungCap.ma_ncc,viewNhaCungCap.ten_ncc, sdt,sum(gia_tri_nhap) from viewNhaCungCap JOIN viewPhieuNhap on viewPhieuNhap.ma_ncc = viewNhaCungCap.ma_ncc " + key + " group by viewNhaCungCap.ma_ncc,viewNhaCungCap.ten_ncc,sdt";
        ArrayList<NhaCungCapModel> listNCC = new ArrayList<>();
        try (Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                NhaCungCapModel ncc = new NhaCungCapModel();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChiNCC(rs.getString(3));
                ncc.setTongGiaTriNhap(rs.getLong(4));
                listNCC.add(ncc);
            }
            return listNCC;
        } catch (SQLException e) {
        }
        return listNCC;
    }
    public NhaCungCapModel getNhaCungCap(String MaPhieuNhap){
        String query = "select NhaCungCap.ma_ncc, ten_ncc, dia_chi, sdt from NhaCungCap join PhieuNhap on NhaCungCap.ma_ncc = PhieuNhap.ma_ncc where ma_phieu_nhap = '" + MaPhieuNhap + "'";
        NhaCungCapModel ncc = new NhaCungCapModel();
        try (Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChiNCC(rs.getString(3));
                ncc.setSdtNCC(rs.getString(4));
            }
            return ncc;
        } catch (SQLException e) {
        }
        return ncc;
    }
    
}
