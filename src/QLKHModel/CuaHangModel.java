
package QLKHModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CuaHangModel extends BaseModel{
    private String MaCH;
    private String TenCH;
    private String DiaChiCH;
    private String SdtCH;
    private int SoPhieuDaXuat;
    private int SoPhieuChuaXuat;
    private long TongGiaTriXuat;

    public CuaHangModel() {
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getTenCH() {
        return TenCH;
    }

    public void setTenCH(String TenCH) {
        this.TenCH = TenCH;
    }

    public String getDiaChiCH() {
        return DiaChiCH;
    }

    public void setDiaChiCH(String DiaChiCH) {
        this.DiaChiCH = DiaChiCH;
    }

    public String getSdtCH() {
        return SdtCH;
    }

    public void setSdtCH(String SdtCH) {
        this.SdtCH = SdtCH;
    }

    public int getSoPhieuDaXuat() {
        return SoPhieuDaXuat;
    }

    public void setSoPhieuDaXuat(int SoPhieuDaXuat) {
        this.SoPhieuDaXuat = SoPhieuDaXuat;
    }

    public long getTongGiaTriXuat() {
        return TongGiaTriXuat;
    }

    public void setTongGiaTriXuat(long TongGiaTriXuat) {
        this.TongGiaTriXuat = TongGiaTriXuat;
    }

    public int getSoPhieuChuaXuat() {
        return SoPhieuChuaXuat;
    }

    public void setSoPhieuChuaXuat(int SoPhieuChuaXuat) {
        this.SoPhieuChuaXuat = SoPhieuChuaXuat;
    }
    
    public  ArrayList<CuaHangModel> getDanhSachCuaHang(String key) {
        String query;
        if ("".equals(key)){
            query = "select * from viewCuaHang";
        } else {
            query = "select * from viewCuaHang " + key;
        }
        ArrayList<CuaHangModel> listCH = new ArrayList<>();
        try (Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                CuaHangModel ch = new CuaHangModel();
                ch.setMaCH(rs.getString(1));
                ch.setTenCH(rs.getString(2));
                ch.setSdtCH(rs.getString(3));
                ch.setDiaChiCH(rs.getString(4));
                ch.setSoPhieuDaXuat(rs.getInt(5));
                ch.setSoPhieuChuaXuat(rs.getInt(6));
                ch.setTongGiaTriXuat(rs.getLong(7));
                listCH.add(ch);
            }
            return listCH;
        } catch (SQLException e) {
        }
        return listCH;
    }

  
    public boolean addCuaHang(CuaHangModel ch) {
        try(Connection conn = this.getConnection()){
            String query = "INSERT INTO CuaHang(ma_ch, ten_ch, sdt, dia_chi) VALUES(DEFAULT,'" + ch.getTenCH() + "','" + ch.getSdtCH() + "','" + ch.getDiaChiCH() + "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateCuaHang(CuaHangModel ch){
        try(Connection conn = this.getConnection()) {
            String query = "update CuaHang set ten_ch = '" + ch.getTenCH() +"', dia_chi = '" + ch.getDiaChiCH()+ "', sdt = '" + ch.getSdtCH() + "' where ma_ch = '" + ch.getMaCH() + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteCuaHang(String MaCH){
        try(Connection conn = this.getConnection()){
            String query = "delete from CuaHang where ma_ch = '" + MaCH + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public ArrayList<CuaHangModel> getDoanhThuCuaHang(String key){
        String query;
        query = "select viewCuaHang.ma_ch,viewCuaHang.ten_ch, sdt,sum(gia_tri_xuat) from viewCuaHang JOIN viewPhieuXuat on viewPhieuXuat.ma_ch = viewCuaHang.ma_ch " + key + " group by viewCuaHang.ma_ch,viewCuaHang.ten_ch,sdt";
        ArrayList<CuaHangModel> listCH = new ArrayList<>();
        try (Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                CuaHangModel ch = new CuaHangModel();
                ch.setMaCH(rs.getString(1));
                ch.setTenCH(rs.getString(2));
                ch.setDiaChiCH(rs.getString(3));
                ch.setTongGiaTriXuat(rs.getLong(4));
                listCH.add(ch);
            }
            return listCH;
        } catch (SQLException e) {
        }
        return listCH;
    }
    
    public CuaHangModel getCuaHang(String MaPhieuXuat){
        String query = "select CuaHang.ma_ch, ten_ch, dia_chi, sdt from CuaHang join PhieuXuat on CuaHang.ma_ch = PhieuXuat.ma_ch where ma_phieu_xuat = '" + MaPhieuXuat + "'";
        CuaHangModel ch = new CuaHangModel();
        try (Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ch.setMaCH(rs.getString(1));
                ch.setTenCH(rs.getString(2));
                ch.setDiaChiCH(rs.getString(3));
                ch.setSdtCH(rs.getString(4));
            }
            return ch;
        } catch (SQLException e) {
        }
        return ch;
    }
}
