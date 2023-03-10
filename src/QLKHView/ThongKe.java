
package QLKHView;

import QLKHController.ThongKeController;
import QLKHModel.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class ThongKe extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private static ThongKeController tkctl;
    private final DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
    final String headerSP[] = {"Mã sản phẩm","Tên sản phẩm","Số lượng","Đơn vị"};
    final DefaultTableModel tbSP = new DefaultTableModel(headerSP, 0);
    final String headerPN[] = {"Mã phiếu","Nhà cung cấp","Ngày tạo","Ngày nhập","Giá trị"};
    final DefaultTableModel tbPN = new DefaultTableModel(headerPN, 0);
    final String headerPX[] = {"Mã phiếu","Cửa hàng","Ngày tạo","Ngày xuất","Giá trị"};
    final DefaultTableModel tbPX = new DefaultTableModel(headerPX, 0);
    final String headerDTT[] = {"Tháng","Năm","Doanh thu"};
    final DefaultTableModel tbDTT = new DefaultTableModel(headerDTT, 0);
    final String headerDTCH[] = {"Mã cửa hàng","Tên cửa hàng","Địa chỉ","Doanh thu"};
    final DefaultTableModel tbDTCH = new DefaultTableModel(headerDTCH, 0);
    final String headerDTSP[] = {"Mã sản phẩm","Tên sản phẩm","Số lượng","Giá xuất","Doanh thu"};
    final DefaultTableModel tbDTSP = new DefaultTableModel(headerDTSP, 0);
    final String headerTNT[] = {"Tháng","Năm","Tiền nhập"};
    final DefaultTableModel tbTNT = new DefaultTableModel(headerTNT, 0);
    final String headerTNNCC[] = {"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Tiền nhập"};
    final DefaultTableModel tbTNNCC = new DefaultTableModel(headerTNNCC, 0);
    final String headerTNSP[] = {"Mã sản phẩm","Tên sản phẩm","Số lượng","Giá nhập","Tiền nhập"};
    final DefaultTableModel tbTNSP = new DefaultTableModel(headerTNSP, 0);
    
    public ThongKe() {
        initComponents();
        tkctl = new ThongKeController(this);
    }
    
    public void loadThongKeXeTon(int SoLuongTon, long GiaTri){
        txtSoXeTon.setText(" " + decimalFormat.format(SoLuongTon) + " xe");
        txtGiaTriXeTon.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKePhuTungTon(int SoLuongTon, long GiaTri){
        txtSoPhuTungTon.setText(" " + decimalFormat.format(SoLuongTon) + " thùng");
        txtGiaTriPhuTungTon.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKePhieuDaXuat(int SoPhieuDaXuat, long GiaTri){
        txtSoPhieuDaXuat.setText(" " + decimalFormat.format(SoPhieuDaXuat));
        txtGiaTriDaXuat.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKePhieuChuaXuat(int SoPhieuDaXuat, long GiaTri){
        txtSoPhieuChuaXuat.setText(" " + decimalFormat.format(SoPhieuDaXuat));
        txtGiaTriChuaXuat.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKePhieuDaNhap(int SoPhieuDaXuat, long GiaTri){
        txtSoPhieuDaNhap.setText(" " + decimalFormat.format(SoPhieuDaXuat));
        txtGiaTriDaNhap.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKePhieuChuaNhap(int SoPhieuDaXuat, long GiaTri){
        txtSoPhieuChuaNhap.setText(" " + decimalFormat.format(SoPhieuDaXuat));
        txtGiaTriChuaNhap.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadThongKeDungTich(int DungTichXe, int DungTichXeTrong, int DungTichPT, int DungTichPTTrong){
        txtDungTichChuaXe.setText(" " + DungTichXe + " ");
        txtDungTichTrongXe.setText(" " + DungTichXeTrong + " ");
        txtDungTichChuaPT.setText(" " + DungTichPT + " ");
        txtDungTichTrongPT.setText(" " + DungTichPTTrong + " ");
    }
    
    public void loadThongKePhieuHoan(int SoPhieuHoan, long GiaTri){
        txtSoPhieuHoan.setText(" " + decimalFormat.format(SoPhieuHoan));
        txtGiaTriHoan.setText(" " + decimalFormat.format(GiaTri) + " VNĐ");
    }
    
    public void loadTableThongKeSanPham(ArrayList<SanPhamModel> lsp){
        tbSP.getDataVector().removeAllElements();
        for(int i = 0; i < lsp.size(); i++){
            String[] sp = {lsp.get(i ).getMaSP(), lsp.get(i ).getTenSP(), Integer.toString(lsp.get(i ).getSoLuong()), lsp.get(i ).getDonVi()};
            tbSP.addRow(sp);
            tbThongKeSanPham.setModel(tbSP);
        }
    }
    
    public void loadTableThongKePhieuNhap(ArrayList<PhieuNhapModel> lpn){
        tbPN.getDataVector().removeAllElements();
        for(int i = 0; i < lpn.size(); i++){
            String[] pn = {lpn.get(i ).getMaPhieuNhap(), lpn.get(i ).getMaNCC(), lpn.get(i ).getNgayTao(), lpn.get(i ).getNgayNhap(), String.valueOf(lpn.get(i ).getGiaTriNhap())};
            tbPN.addRow(pn);
            tbThongKePhieuNhap.setModel(tbPN);
        }
    }
    
    public void loadTableThongKePhieuXuat(ArrayList<PhieuXuatModel> lpx){
        tbPX.getDataVector().removeAllElements();
        for(int i = 0; i < lpx.size(); i++){
            String[] px = {lpx.get(i ).getMaPhieuXuat(), lpx.get(i ).getMaCH(), lpx.get(i ).getNgayTao(), lpx.get(i ).getNgayXuat(), String.valueOf(lpx.get(i ).getGiaTriXuat())};
            tbPX.addRow(px);
            tbThongKePhieuXuat.setModel(tbPX);
        }
    }
    
    public void loadTableThongKeDoanhThuTong(ArrayList<Tien> dt){
        tbDTT.getDataVector().removeAllElements();
        for (int i = 0; i < dt.size(); i++) {
            String[] dtt = {String.valueOf(dt.get(i).getThang()),String.valueOf(dt.get(i).getNam()),String.valueOf(dt.get(i).getTien())};
            //System.err.println(String.valueOf(i) + " " + String.valueOf(tn.get(i)) + " " + String.valueOf(dt.get(tn)));
            //System.out.println(dt);
            tbDTT.addRow(dtt);
            tbDoanhThuTong.setModel(tbDTT);
        }
    }
    
    public void loadTableThongKeDoanhThuCuaHang(ArrayList<CuaHangModel> lch){
        tbDTCH.getDataVector().removeAllElements();
        for(int i = 0; i < lch.size(); i++){
            String[] dtch = {lch.get(i ).getMaCH(), lch.get(i ).getTenCH(), lch.get(i ).getDiaChiCH(),String.valueOf(lch.get(i ).getTongGiaTriXuat())};
            tbDTCH.addRow(dtch);
            tbDoanhThuCuaHang.setModel(tbDTCH);
        }
    }
    
    public void loadTableThongKeDoanhThuSanPham(ArrayList<SanPhamModel> lsp){
        tbDTSP.getDataVector().removeAllElements();
        for(int i = 0; i < lsp.size(); i++){
            long DoanhThu = Long.valueOf(lsp.get(i ).getGiaXuat())*Long.valueOf(lsp.get(i ).getSoLuong());
            String[] dtsp = {lsp.get(i ).getMaSP(),lsp.get(i ).getTenSP(),String.valueOf(lsp.get(i ).getSoLuong()),String.valueOf(lsp.get(i ).getGiaXuat()),String.valueOf(DoanhThu)};
            tbDTSP.addRow(dtsp);
            tbDoanhThuSanPham.setModel(tbDTSP);
        }
    }
    
    public void loadTableThongKeTienNhapTong(ArrayList<Tien> tn){
        tbTNT.getDataVector().removeAllElements();
        for (int i = 0; i < tn.size(); i++) {
            String[] tnt = {String.valueOf(tn.get(i).getThang()),String.valueOf(tn.get(i).getNam()),String.valueOf(tn.get(i).getTien())};
            //System.err.println(String.valueOf(i) + " " + String.valueOf(tn.get(i)) + " " + String.valueOf(dt.get(tn)));
            //System.out.println(dt);
            tbTNT.addRow(tnt);
            tbTienNhapTong.setModel(tbTNT);
        }
    }
    
    public void loadTableThongKeTienNhapNhaCungCap(ArrayList<NhaCungCapModel> lncc){
        tbTNNCC.getDataVector().removeAllElements();
        for(int i = 0; i < lncc.size(); i ++){
            String[] tnncc = {lncc.get(i ).getMaNCC(), lncc.get(i ).getTenNCC(), lncc.get(i ).getDiaChiNCC(),String.valueOf(lncc.get(i ).getTongGiaTriNhap())};
            tbTNNCC.addRow(tnncc);
            tbTienNhapNhaCungCap.setModel(tbTNNCC);
        }
    }
    
    public void loadTableThongKeTienNhapSanPham(ArrayList<SanPhamModel> lsp){
        tbDTSP.getDataVector().removeAllElements();
        for(int i = 0; i < lsp.size(); i ++){
            long TienNhap = Long.valueOf(lsp.get(i ).getGiaNhap())*Long.valueOf(lsp.get(i ).getSoLuong());
            String[] dtsp = {lsp.get(i ).getMaSP(),lsp.get(i ).getTenSP(),String.valueOf(lsp.get(i ).getSoLuong()),String.valueOf(lsp.get(i ).getGiaNhap()),String.valueOf(TienNhap)};
            tbTNSP.addRow(dtsp);
            tbTienNhapSanPham.setModel(tbTNSP);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSoPhieuDaXuat = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGiaTriDaXuat = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSoPhieuChuaXuat = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGiaTriChuaXuat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSoPhieuDaNhap = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGiaTriDaNhap = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtSoPhieuChuaNhap = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtGiaTriChuaNhap = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtSoXeTon = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtGiaTriXeTon = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtSoPhuTungTon = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtGiaTriPhuTungTon = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        cboThongKeSanPham = new javax.swing.JComboBox<>();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        cboThongKePhieuNhap = new javax.swing.JComboBox<>();
        cboTrangThaiPN = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        cboThongKeDoanhThu = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        cboThongKePhieuXuat = new javax.swing.JComboBox<>();
        cboTrangThaiPX = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        cboNam = new javax.swing.JComboBox<>();
        jPanel24 = new javax.swing.JPanel();
        cboThongKeTienNhap = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtDungTichChuaXe = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDungTichChuaPT = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtDungTichTrongXe = new javax.swing.JLabel();
        txtDungTichTrongPT = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtSoPhieuHoan = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtGiaTriHoan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tbpnTong = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbThongKeSanPham = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel17 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongKePhieuNhap = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbThongKePhieuXuat = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel15 = new javax.swing.JPanel();
        tbpnDoanhThu = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDoanhThuTong = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDoanhThuCuaHang = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel25 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbDoanhThuSanPham = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel21 = new javax.swing.JPanel();
        tbpnTienNhap = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTienNhapTong = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel23 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbTienNhapNhaCungCap = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel26 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbTienNhapSanPham = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Số phiếu đã xuất:");

        txtSoPhieuDaXuat.setText(" ");
        txtSoPhieuDaXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Giá trị:");

        txtGiaTriDaXuat.setText(" ");
        txtGiaTriDaXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhieuDaXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriDaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoPhieuDaXuat))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtGiaTriDaXuat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số phiếu chưa xuất:");

        txtSoPhieuChuaXuat.setText(" ");
        txtSoPhieuChuaXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Giá trị:");

        txtGiaTriChuaXuat.setText(" ");
        txtGiaTriChuaXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhieuChuaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriChuaXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoPhieuChuaXuat))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGiaTriChuaXuat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Số phiếu đã nhập:");

        txtSoPhieuDaNhap.setText(" ");
        txtSoPhieuDaNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Giá trị:");

        txtGiaTriDaNhap.setText(" ");
        txtGiaTriDaNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhieuDaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriDaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSoPhieuDaNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtGiaTriDaNhap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Số phiếu chưa nhập:");

        txtSoPhieuChuaNhap.setText(" ");
        txtSoPhieuChuaNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Giá trị:");

        txtGiaTriChuaNhap.setText(" ");
        txtGiaTriChuaNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhieuChuaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriChuaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSoPhieuChuaNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtGiaTriChuaNhap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Số  xe đạp tồn:");

        txtSoXeTon.setText(" ");
        txtSoXeTon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Giá trị:");

        txtGiaTriXeTon.setText(" ");
        txtGiaTriXeTon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoXeTon, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriXeTon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtSoXeTon))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtGiaTriXeTon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Số  phụ tùng tồn:");

        txtSoPhuTungTon.setText(" ");
        txtSoPhuTungTon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Giá trị:");

        txtGiaTriPhuTungTon.setText(" ");
        txtGiaTriPhuTungTon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhuTungTon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(26, 26, 26)
                        .addComponent(txtGiaTriPhuTungTon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtSoPhuTungTon))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtGiaTriPhuTungTon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Sản phẩm");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Phiếu nhập");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Phiếu xuất");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Doanh thu");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboThongKeSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ton kho nhieu", "Ton kho it", "Xuat nhieu", "Nhap nhieu", "Xuat it", "Nhap it" }));
        cboThongKeSanPham.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKeSanPhamItemStateChanged(evt);
            }
        });

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xe dap", "Phu tung" }));
        cboLoaiSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiSPItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboThongKeSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboThongKeSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboThongKePhieuNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tong", "Gia tri tang dan", "Gia tri giam dan" }));
        cboThongKePhieuNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKePhieuNhapItemStateChanged(evt);
            }
        });

        cboTrangThaiPN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Da nhap", "Chua nhap" }));
        cboTrangThaiPN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiPNItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboThongKePhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThaiPN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboTrangThaiPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboThongKePhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboThongKeDoanhThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tong", "Cua hang", "San Pham" }));
        cboThongKeDoanhThu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKeDoanhThuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboThongKeDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cboThongKeDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboThongKePhieuXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tong", "Gia tri tang dan", "Gia tri giam dan" }));
        cboThongKePhieuXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKePhieuXuatItemStateChanged(evt);
            }
        });

        cboTrangThaiPX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Da xuat", "Chua xuat" }));
        cboTrangThaiPX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiPXItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboThongKePhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThaiPX, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboTrangThaiPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cboThongKePhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tháng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Năm");

        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThangItemStateChanged(evt);
            }
        });

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "2021", "2022", "2023" }));
        cboNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNamItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboThongKeTienNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tong", "Nha cung cap", "San pham" }));
        cboThongKeTienNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKeTienNhapItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboThongKeTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cboThongKeTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tiền nhập");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Dung tích chứa xe:");

        txtDungTichChuaXe.setText(" ");
        txtDungTichChuaXe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Dung tích chứa ptung:");

        txtDungTichChuaPT.setText(" ");
        txtDungTichChuaPT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Trống:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Trống:");

        txtDungTichTrongXe.setText(" ");
        txtDungTichTrongXe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDungTichTrongPT.setText(" ");
        txtDungTichTrongPT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDungTichChuaXe, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(txtDungTichChuaPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDungTichTrongXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDungTichTrongPT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(txtDungTichTrongXe)
                        .addGap(18, 18, 18)
                        .addComponent(txtDungTichTrongPT))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtDungTichChuaXe)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtDungTichChuaPT)
                            .addComponent(jLabel33))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thống kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Số phiếu hoàn:");

        txtSoPhieuHoan.setText(" ");
        txtSoPhieuHoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Giá trị:");

        txtGiaTriHoan.setText(" ");
        txtGiaTriHoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoPhieuHoan, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGiaTriHoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSoPhieuHoan))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtGiaTriHoan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1697, 1697, 1697))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbpnTong.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        tbThongKeSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn vị"
            }
        ));
        tbThongKeSanPham.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane2.setViewportView(tbThongKeSanPham);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1763, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpnTong.addTab("Sản phẩm", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        tbThongKePhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Nhà cung cấp", "Ngày tạo", "Ngày nhập", "Giá trị"
            }
        ));
        tbThongKePhieuNhap.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tbThongKePhieuNhap);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1763, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        tbpnTong.addTab("Phiếu nhập", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        tbThongKePhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Cửa hàng", "Ngày tạo", "Ngày xuất", "Giá trị"
            }
        ));
        tbThongKePhieuXuat.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane3.setViewportView(tbThongKePhieuXuat);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1763, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        tbpnTong.addTab("Phiếu xuất", jPanel18);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        tbpnDoanhThu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        tbDoanhThuTong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tháng", "Năm", "Doanh thu"
            }
        ));
        tbDoanhThuTong.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane4.setViewportView(tbDoanhThuTong);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpnDoanhThu.addTab("Tổng", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        tbDoanhThuCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã cửa hàng", "Tên cửa hàng", "Doanh thu"
            }
        ));
        tbDoanhThuCuaHang.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane5.setViewportView(tbDoanhThuCuaHang);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpnDoanhThu.addTab("Cửa hàng", jPanel20);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        tbDoanhThuSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phầm", "Tên sản phẩm", "Số lượng", "Giá xuất", "Doanh thu"
            }
        ));
        tbDoanhThuSanPham.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane6.setViewportView(tbDoanhThuSanPham);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpnDoanhThu.addTab("Sản phẩm", jPanel25);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpnDoanhThu))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpnDoanhThu)
                .addContainerGap())
        );

        tbpnTong.addTab("Doanh thu", jPanel15);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        tbpnTienNhap.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        tbTienNhapTong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tháng", "Năm", "Tiền nhập"
            }
        ));
        tbTienNhapTong.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane7.setViewportView(tbTienNhapTong);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpnTienNhap.addTab("Tổng", jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        tbTienNhapNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Tiền nhập"
            }
        ));
        tbTienNhapNhaCungCap.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane8.setViewportView(tbTienNhapNhaCungCap);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpnTienNhap.addTab("Nhà cung cấp", jPanel23);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        tbTienNhapSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá nhập", "Tiền nhập"
            }
        ));
        tbTienNhapSanPham.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane9.setViewportView(tbTienNhapSanPham);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1757, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpnTienNhap.addTab("Sản phẩm", jPanel26);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpnTienNhap))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpnTienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpnTong.addTab("Tiền nhập", jPanel21);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpnTong)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbpnTong, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 901, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 901, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 328, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThongKeSanPhamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKeSanPhamItemStateChanged
        // TODO add your handling code here:
        cboThongKeDoanhThu.setSelectedIndex(0);
        cboThongKePhieuNhap.setSelectedIndex(0);
        cboThongKePhieuXuat.setSelectedIndex(0);
        cboThongKeTienNhap.setSelectedIndex(0);
        if(cboThongKeSanPham.getSelectedIndex() == 1 || cboThongKeSanPham.getSelectedIndex() == 2){
            cboThang.setEnabled(false);
            cboThang.setSelectedIndex(0);
            cboNam.setEnabled(false);
            cboNam.setSelectedIndex(0);
        } else {
            cboThang.setEnabled(true);
            cboNam.setEnabled(true);
        }
        if(cboThongKeSanPham.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(0);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbSP.setRowCount(0);
            tkctl.ThongKeSanPham(cboThongKeSanPham.getSelectedItem().toString().trim(),thang,nam,cboLoaiSP.getSelectedItem().toString());
        } else tbSP.setRowCount(0);
    }//GEN-LAST:event_cboThongKeSanPhamItemStateChanged

    private void cboThongKePhieuNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKePhieuNhapItemStateChanged
        // TODO add your handling code here:
        cboThongKeDoanhThu.setSelectedIndex(0);
        cboThongKeSanPham.setSelectedIndex(0);
        cboThongKePhieuXuat.setSelectedIndex(0);
        cboThongKeTienNhap.setSelectedIndex(0);
        if(cboThongKePhieuNhap.getSelectedIndex() == 1){
            cboThang.setEnabled(false);
            cboThang.setSelectedIndex(0);
            cboNam.setEnabled(false);
            cboNam.setSelectedIndex(0);
        } else {
            cboThang.setEnabled(true);
            cboNam.setEnabled(true);
        }
        if(cboThongKePhieuNhap.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPN.setRowCount(0);
            tkctl.ThongKePhieuNhap(cboThongKePhieuNhap.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPN.getSelectedItem().toString());
        } else tbPN.setRowCount(0);
    }//GEN-LAST:event_cboThongKePhieuNhapItemStateChanged

    private void cboThongKePhieuXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKePhieuXuatItemStateChanged
        // TODO add your handling code here:
        cboThongKeDoanhThu.setSelectedIndex(0);
        cboThongKeSanPham.setSelectedIndex(0);
        cboThongKePhieuNhap.setSelectedIndex(0);
        cboThongKeTienNhap.setSelectedIndex(0);
        if(cboThongKePhieuXuat.getSelectedIndex() == 1){
            cboThang.setEnabled(false);
            cboThang.setSelectedIndex(0);
            cboNam.setEnabled(false);
            cboNam.setSelectedIndex(0);
        } else {
            cboThang.setEnabled(true);
            cboNam.setEnabled(true);
        }
        if(cboThongKePhieuXuat.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(2);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPX.setRowCount(0);
            tkctl.ThongKePhieuXuat(cboThongKePhieuXuat.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPX.getSelectedItem().toString());
        } else tbPX.setRowCount(0);
    }//GEN-LAST:event_cboThongKePhieuXuatItemStateChanged

    private void cboThongKeDoanhThuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKeDoanhThuItemStateChanged
        // TODO add your handling code here:
        cboThongKePhieuXuat.setSelectedIndex(0);
        cboThongKeSanPham.setSelectedIndex(0);
        cboThongKePhieuNhap.setSelectedIndex(0);
        cboThongKeTienNhap.setSelectedIndex(0);
        int index = cboThongKeDoanhThu.getSelectedIndex();
        if(index > 0){
            tbpnTong.setSelectedIndex(3);
            tbpnDoanhThu.setSelectedIndex(index - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
            tkctl.ThongKeDoanhThu(cboThongKeDoanhThu.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
        }
    }//GEN-LAST:event_cboThongKeDoanhThuItemStateChanged

    private void cboThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThangItemStateChanged
        // TODO add your handling code here:
        if(cboThongKeSanPham.getSelectedIndex() != 0){
            tbSP.setRowCount(0);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tkctl.ThongKeSanPham(cboThongKeSanPham.getSelectedItem().toString().trim(),thang,nam,cboLoaiSP.getSelectedItem().toString());
        }
        if(cboThongKePhieuNhap.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPN.setRowCount(0);
            tkctl.ThongKePhieuNhap(cboThongKePhieuNhap.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPN.getSelectedItem().toString());
        } else tbPN.setRowCount(0);
        if(cboThongKePhieuXuat.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(2);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPX.setRowCount(0);
            tkctl.ThongKePhieuXuat(cboThongKePhieuXuat.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPX.getSelectedItem().toString());
        } else tbPX.setRowCount(0);
        if(cboThongKeDoanhThu.getSelectedIndex() > 0){
            tbpnTong.setSelectedIndex(3);
            tbpnDoanhThu.setSelectedIndex(cboThongKeDoanhThu.getSelectedIndex() - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
            tkctl.ThongKeDoanhThu(cboThongKeDoanhThu.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
        }
        if(cboThongKeTienNhap.getSelectedIndex() > 0){
            tbpnTong.setSelectedIndex(4);
            tbpnTienNhap.setSelectedIndex(cboThongKeTienNhap.getSelectedIndex() - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
            tkctl.ThongKeTienNhap(cboThongKeTienNhap.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
        }
    }//GEN-LAST:event_cboThangItemStateChanged

    private void cboNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNamItemStateChanged
        // TODO add your handling code here:
        if(cboThongKeSanPham.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(0);
            tbSP.setRowCount(0);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tkctl.ThongKeSanPham(cboThongKeSanPham.getSelectedItem().toString().trim(),thang,nam,cboLoaiSP.getSelectedItem().toString());
        }
        if(cboThongKePhieuNhap.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPN.setRowCount(0);
            tkctl.ThongKePhieuNhap(cboThongKePhieuNhap.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPN.getSelectedItem().toString());
        } else tbPN.setRowCount(0);
        
        if(cboThongKePhieuXuat.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(2);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPX.setRowCount(0);
            tkctl.ThongKePhieuXuat(cboThongKePhieuXuat.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPX.getSelectedItem().toString());
        } else tbPX.setRowCount(0);
        if(cboThongKeDoanhThu.getSelectedIndex() > 0){
            tbpnTong.setSelectedIndex(3);
            tbpnDoanhThu.setSelectedIndex(cboThongKeDoanhThu.getSelectedIndex() - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
            tkctl.ThongKeDoanhThu(cboThongKeDoanhThu.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbDTT.setRowCount(0);
            tbDTSP.setRowCount(0);
            tbDTCH.setRowCount(0);
        }
        if(cboThongKeTienNhap.getSelectedIndex() > 0){
            tbpnTong.setSelectedIndex(4);
            tbpnTienNhap.setSelectedIndex(cboThongKeTienNhap.getSelectedIndex() - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
            tkctl.ThongKeTienNhap(cboThongKeTienNhap.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
        }
    }//GEN-LAST:event_cboNamItemStateChanged

    private void cboLoaiSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiSPItemStateChanged
        // TODO add your handling code here:
        if(cboThongKeSanPham.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(0);
            tbSP.setRowCount(0);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tkctl.ThongKeSanPham(cboThongKeSanPham.getSelectedItem().toString().trim(),thang,nam,cboLoaiSP.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cboLoaiSPItemStateChanged

    private void cboTrangThaiPNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiPNItemStateChanged
        // TODO add your handling code here:
        if(cboThongKePhieuNhap.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPN.setRowCount(0);
            tkctl.ThongKePhieuNhap(cboThongKePhieuNhap.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPN.getSelectedItem().toString());
        } else tbPN.setRowCount(0);
    }//GEN-LAST:event_cboTrangThaiPNItemStateChanged

    private void cboTrangThaiPXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiPXItemStateChanged
        // TODO add your handling code here:
        if(cboThongKePhieuXuat.getSelectedIndex() != 0){
            tbpnTong.setSelectedIndex(2);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbPX.setRowCount(0);
            tkctl.ThongKePhieuXuat(cboThongKePhieuXuat.getSelectedItem().toString().trim(),thang,nam,cboTrangThaiPX.getSelectedItem().toString());
        } else tbPX.setRowCount(0);
    }//GEN-LAST:event_cboTrangThaiPXItemStateChanged

    private void cboThongKeTienNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKeTienNhapItemStateChanged
        // TODO add your handling code here:
        cboThongKePhieuXuat.setSelectedIndex(0);
        cboThongKeSanPham.setSelectedIndex(0);
        cboThongKePhieuNhap.setSelectedIndex(0);
        cboThongKeDoanhThu.setSelectedIndex(0);
        int index = cboThongKeTienNhap.getSelectedIndex();
        if(index > 0){
            tbpnTong.setSelectedIndex(4);
            tbpnTienNhap.setSelectedIndex(index - 1);
            int thang = 0;
            int nam = 0;
            if (cboThang.getSelectedIndex() > 0) thang = Integer.parseInt((String)cboThang.getSelectedItem());
            if (cboNam.getSelectedIndex() > 0) nam = Integer.parseInt((String)cboNam.getSelectedItem());
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
            tkctl.ThongKeTienNhap(cboThongKeTienNhap.getSelectedItem().toString().trim(),thang,nam);
        } else {
            tbTNT.setRowCount(0);
            tbTNSP.setRowCount(0);
            tbTNNCC.setRowCount(0);
        }
    }//GEN-LAST:event_cboThongKeTienNhapItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tkctl.ThongKePage();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboThongKeDoanhThu;
    private javax.swing.JComboBox<String> cboThongKePhieuNhap;
    private javax.swing.JComboBox<String> cboThongKePhieuXuat;
    private javax.swing.JComboBox<String> cboThongKeSanPham;
    private javax.swing.JComboBox<String> cboThongKeTienNhap;
    private javax.swing.JComboBox<String> cboTrangThaiPN;
    private javax.swing.JComboBox<String> cboTrangThaiPX;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tbDoanhThuCuaHang;
    private javax.swing.JTable tbDoanhThuSanPham;
    private javax.swing.JTable tbDoanhThuTong;
    private javax.swing.JTable tbThongKePhieuNhap;
    private javax.swing.JTable tbThongKePhieuXuat;
    private javax.swing.JTable tbThongKeSanPham;
    private javax.swing.JTable tbTienNhapNhaCungCap;
    private javax.swing.JTable tbTienNhapSanPham;
    private javax.swing.JTable tbTienNhapTong;
    private javax.swing.JTabbedPane tbpnDoanhThu;
    private javax.swing.JTabbedPane tbpnTienNhap;
    private javax.swing.JTabbedPane tbpnTong;
    private javax.swing.JLabel txtDungTichChuaPT;
    private javax.swing.JLabel txtDungTichChuaXe;
    private javax.swing.JLabel txtDungTichTrongPT;
    private javax.swing.JLabel txtDungTichTrongXe;
    private javax.swing.JLabel txtGiaTriChuaNhap;
    private javax.swing.JLabel txtGiaTriChuaXuat;
    private javax.swing.JLabel txtGiaTriDaNhap;
    private javax.swing.JLabel txtGiaTriDaXuat;
    private javax.swing.JLabel txtGiaTriHoan;
    private javax.swing.JLabel txtGiaTriPhuTungTon;
    private javax.swing.JLabel txtGiaTriXeTon;
    private javax.swing.JLabel txtSoPhieuChuaNhap;
    private javax.swing.JLabel txtSoPhieuChuaXuat;
    private javax.swing.JLabel txtSoPhieuDaNhap;
    private javax.swing.JLabel txtSoPhieuDaXuat;
    private javax.swing.JLabel txtSoPhieuHoan;
    private javax.swing.JLabel txtSoPhuTungTon;
    private javax.swing.JLabel txtSoXeTon;
    // End of variables declaration//GEN-END:variables
}
