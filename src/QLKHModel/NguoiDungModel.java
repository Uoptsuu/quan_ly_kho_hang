
package QLKHModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NguoiDungModel extends BaseModel{
    private String MaND;
    private String TenND;
    private String ChucVu;
    private String MatKhau;
    private String SdtND;
    private String DiaChiND;
    private Date NgaySinh;
    private String GioiTinh;
    private String CanCuoc;

    public NguoiDungModel() {
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getTenND() {
        return TenND;
    }

    public void setTenND(String TenND) {
        this.TenND = TenND;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getSdtND() {
        return SdtND;
    }

    public void setSdtND(String SdtND) {
        this.SdtND = SdtND;
    }

    public String getDiaChiND() {
        return DiaChiND;
    }

    public void setDiaChiND(String DiaChiND) {
        this.DiaChiND = DiaChiND;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCanCuoc() {
        return CanCuoc;
    }

    public void setCanCuoc(String CanCuoc) {
        this.CanCuoc = CanCuoc;
    }
    

    public NguoiDungModel checkLogin(String maNd, String matKhau) {
        NguoiDungModel nd = new NguoiDungModel();
        try(Connection conn = this.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT ma_nd, chuc_vu from NguoiDung where ma_nd COLLATE SQL_Latin1_General_Cp850_CS_AS = '" + maNd + "' and mat_khau='" + matKhau + "'");
            if (!result.next()) {
            } else {
                nd.setMaND(result.getString(1));
                nd.setChucVu(result.getString(2));
                return nd;
            }
            return nd;
        } catch (SQLException e) {
        }
        return nd;
    }

    public ArrayList<NguoiDungModel> getDanhSachNguoiDung(String key) {
        String query;
        if ("".equals(key)){
            query = "select * from NguoiDung";
        } else {
            query = "select * from NguoiDung " + key;
        }
        ArrayList<NguoiDungModel> listND = new ArrayList<>();
        try(Connection conn = this.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                NguoiDungModel nd = new NguoiDungModel();
                nd.setMaND(rs.getString(1));
                nd.setChucVu(rs.getString(2));
                nd.setMatKhau(rs.getString(3));
                nd.setTenND(rs.getString(4));
                nd.setSdtND(rs.getString(5));
                nd.setDiaChiND(rs.getString(6));
                nd.setNgaySinh(rs.getDate(7));
                if (rs.getBoolean(8)){
                    nd.setGioiTinh("Nam");
                } else nd.setGioiTinh("Nu");
                nd.setCanCuoc(rs.getString(9));
                listND.add(nd);
            }
            return listND;
        } catch (SQLException e) {
        }
        return listND;
    }

  
    public boolean addNguoiDung(NguoiDungModel nd) {
        int gt;
        if("Nam".equals(nd.getGioiTinh())){
            gt = 1;
        } else gt = 0;
        String ns = new SimpleDateFormat("yyyy-MM-dd").format(nd.getNgaySinh());
        try(Connection conn = this.getConnection()) {
            String query = "INSERT INTO NguoiDung(ma_nd, chuc_vu, mat_khau, ten_nd, sdt, dia_chi, ngay_sinh, gioi_tinh, can_cuoc) VALUES(DEFAULT,'" + nd.getChucVu() + "','" + nd.getMatKhau() + "','" + nd.getTenND() + "','" + nd.getSdtND() + "','" + nd.getDiaChiND() + "','" + ns + "','" + gt + "','" + nd.getCanCuoc()+ "')";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean updateNguoiDung(NguoiDungModel nd){
        int gt;
        if("Nam".equals(nd.getGioiTinh())){
            gt = 1;
        } else gt = 0;
        String ns = new SimpleDateFormat("yyyy-MM-dd").format(nd.getNgaySinh());
        try(Connection conn = this.getConnection()) { 
            String query = "update NguoiDung set ten_nd = '" + nd.getTenND() +"', chuc_vu = '" + nd.getChucVu() + "', mat_khau = '" + nd.getMatKhau() + "', dia_chi = '" + nd.getDiaChiND()+ "', ngay_sinh = '" + ns + "', sdt = '" + nd.getSdtND() + "', can_cuoc = '" + nd.getCanCuoc() + "', gioi_tinh = '" + gt + "' where ma_nd = '" + nd.getMaND() + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean deleteNguoiDung(String MaND){
        try(Connection conn = this.getConnection()) {
            String query = "delete from NguoiDung where ma_nd = '" + MaND + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

}
