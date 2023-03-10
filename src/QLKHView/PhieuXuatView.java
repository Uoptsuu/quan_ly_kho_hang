
package QLKHView;

import QLKHController.*;
import QLKHModel.*;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PhieuXuatView extends javax.swing.JPanel {

    private static PhieuXuatController pxctl;
    public boolean checkPX;
    final String headerPX[] = {"Mã phiếu xuất","Ngày tạo","Mã cửa hàng","Người tạo","Trạng thái","Ngày xuất","Giá trị xuất"};
    final DefaultTableModel tbPX = new DefaultTableModel(headerPX, 0);   
    public boolean checkCTPX;
    final String headerCTPX[] = {"Mã sản phẩm","Số lượng"};
    final DefaultTableModel tbCTPX = new DefaultTableModel(headerCTPX, 0);
    private static final long serialVersionUID = 1L;
    private final DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
    
    public PhieuXuatView() {
        initComponents();
        cboTrangThai.setEnabled(false);
        pxctl = new PhieuXuatController(this);
        txtNgayTao.setText(" " + LocalDate.now().toString());
        txtMaNguoiDung.setText(" "+ NguoiDungController.ndOn.getMaND());
        pxctl.PhieuXuatPage();
    }

    public void loadTablePhieuXuat(ArrayList<PhieuXuatModel> lpx){
        tbPX.getDataVector().removeAllElements();
        for(int i=0; i<lpx.size(); i++){
            String[] px = {lpx.get(i).getMaPhieuXuat(), lpx.get(i).getNgayTao(), lpx.get(i).getMaCH(), lpx.get(i).getMaND(), lpx.get(i).getTrangThai(), lpx.get(i).getNgayXuat(), String.valueOf(lpx.get(i).getGiaTriXuat())};
            tbPX.addRow(px);
            tbPhieuXuat.setModel(tbPX);
        }
    }
    public void loadTableChiTietPhieuXuat(ArrayList<SanPhamModel> ctpx){
        tbCTPX.getDataVector().removeAllElements();
        for(int i=0; i < ctpx.size(); i++){
            String[] px = {ctpx.get(i).getMaSP(), Integer.toString(ctpx.get(i).getSoLuong())};
            tbCTPX.addRow(px);
            tbChiTietPhieuXuat.setModel(tbCTPX);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblPhieuXuat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNgayTao = new javax.swing.JLabel();
        lblMaPhieuXuat = new javax.swing.JLabel();
        lblNgayXuat = new javax.swing.JLabel();
        lblMaCuaHang = new javax.swing.JLabel();
        lblMaNguoiLapPhieu = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        cboMaCuaHang = new javax.swing.JComboBox<>();
        lblNgayXuat1 = new javax.swing.JLabel();
        txtGiaTriXuat = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JLabel();
        txtNgayXuat = new javax.swing.JLabel();
        txtMaPhieuXuat = new javax.swing.JLabel();
        txtMaNguoiDung = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnThemPX = new javax.swing.JButton();
        btnSuaPX = new javax.swing.JButton();
        btnXoaPX = new javax.swing.JButton();
        btnLamMoiPX = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnTimPX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaPhieuTK = new javax.swing.JTextField();
        cboThoiGian = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboGiaTriXuat = new javax.swing.JComboBox<>();
        cboTrangThaiTK = new javax.swing.JComboBox<>();
        cboCuaHang = new javax.swing.JComboBox<>();
        cboNguoiLap = new javax.swing.JComboBox<>();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btnInPhieu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieuXuat = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel3 = new javax.swing.JPanel();
        lblChiTietPhieuXuat = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnSoLuong = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        btnThemCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        btnLamMoiCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        txtMaPhieuXuatCT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietPhieuXuat = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhieuXuat.setText("Quản lý phiếu xuất");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNgayTao.setText("Ngày tạo:");

        lblMaPhieuXuat.setText("Mã phiếu xuất:");

        lblNgayXuat.setText("Ngày xuất:");

        lblMaCuaHang.setText("Mã cửa hàng:");

        lblMaNguoiLapPhieu.setText("Mã người lập phiếu:");

        lblTrangThai.setText("Trạng thái:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chua xuat", "Da xuat" }));
        cboTrangThai.setBorder(null);

        cboMaCuaHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboMaCuaHang.setBorder(null);

        lblNgayXuat1.setText("Giá trị xuất:");

        txtGiaTriXuat.setText(" ");
        txtGiaTriXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNgayTao.setText(" ");
        txtNgayTao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNgayXuat.setText(" ");
        txtNgayXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaPhieuXuat.setText(" ");
        txtMaPhieuXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaNguoiDung.setText(" ");
        txtMaNguoiDung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayXuat1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtGiaTriXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaPhieuXuat)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrangThai)
                    .addComponent(lblMaNguoiLapPhieu)
                    .addComponent(lblMaCuaHang))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboMaCuaHang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTrangThai, 0, 95, Short.MAX_VALUE)
                    .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhieuXuat)
                    .addComponent(lblMaCuaHang)
                    .addComponent(cboMaCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuXuat))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTao)
                    .addComponent(lblMaNguoiLapPhieu)
                    .addComponent(txtNgayTao)
                    .addComponent(txtMaNguoiDung))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayXuat)
                    .addComponent(lblTrangThai)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayXuat))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayXuat1)
                    .addComponent(txtGiaTriXuat))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemPX.setBackground(new java.awt.Color(51, 102, 255));
        btnThemPX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPX.setForeground(new java.awt.Color(255, 255, 255));
        btnThemPX.setText("Thêm");
        btnThemPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPXActionPerformed(evt);
            }
        });

        btnSuaPX.setBackground(new java.awt.Color(51, 102, 255));
        btnSuaPX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPX.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaPX.setText("Sửa");
        btnSuaPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPXActionPerformed(evt);
            }
        });

        btnXoaPX.setBackground(new java.awt.Color(51, 102, 255));
        btnXoaPX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaPX.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPX.setText("Xóa");
        btnXoaPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPXActionPerformed(evt);
            }
        });

        btnLamMoiPX.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoiPX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiPX.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoiPX.setText("Làm mới");
        btnLamMoiPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiPXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemPX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaPX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaPX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoiPX, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnThemPX)
                .addGap(15, 15, 15)
                .addComponent(btnSuaPX)
                .addGap(15, 15, 15)
                .addComponent(btnXoaPX)
                .addGap(15, 15, 15)
                .addComponent(btnLamMoiPX)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimPX.setBackground(new java.awt.Color(51, 102, 255));
        btnTimPX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimPX.setForeground(new java.awt.Color(255, 255, 255));
        btnTimPX.setText("Tìm");
        btnTimPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimPXActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã phiếu:");

        txtMaPhieuTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaPhieuTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaPhieuTKKeyReleased(evt);
            }
        });

        cboThoiGian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ngay tao", "Ngay xuat" }));
        cboThoiGian.setBorder(null);
        cboThoiGian.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThoiGianItemStateChanged(evt);
            }
        });

        jLabel4.setText("Thời gian:");

        jLabel5.setText("Người lập:");

        jLabel6.setText("Cửa hàng xuất:");

        jLabel7.setText("Trạng thái:");

        jLabel8.setText("Giá trị xuất:");

        cboGiaTriXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboGiaTriXuat.setBorder(null);
        cboGiaTriXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGiaTriXuatItemStateChanged(evt);
            }
        });

        cboTrangThaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Da xuat", "Chua xuat" }));
        cboTrangThaiTK.setBorder(null);
        cboTrangThaiTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiTKItemStateChanged(evt);
            }
        });

        cboCuaHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboCuaHang.setBorder(null);
        cboCuaHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCuaHangItemStateChanged(evt);
            }
        });

        cboNguoiLap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboNguoiLap.setBorder(null);
        cboNguoiLap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguoiLapItemStateChanged(evt);
            }
        });

        txtNgayBatDau.setBackground(new java.awt.Color(255, 255, 255));
        txtNgayBatDau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNgayBatDau.setDateFormatString("yyyy-MM-dd");

        txtNgayKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        txtNgayKetThuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNgayKetThuc.setDateFormatString("yyyy-MM-dd");

        jLabel9.setText("đến");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(txtMaPhieuTK, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboGiaTriXuat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTrangThaiTK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTimPX, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboGiaTriXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTrangThaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaPhieuTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimPX)
                .addGap(16, 16, 16))
        );

        btnInPhieu.setText("In phiếu");
        btnInPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhieuXuat))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInPhieu)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhieuXuat)
                        .addGap(40, 40, 40)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInPhieu)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tbPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu xuất", "Ngày tạo", "Mã cửa hàng", "Người tạo", "Trạng thái", "Ngày xuất", "Giá trị xuất"
            }
        ));
        tbPhieuXuat.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbPhieuXuatMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbPhieuXuat);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(254, 305));

        lblChiTietPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChiTietPhieuXuat.setText("Chi tiết phiếu xuất");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(217, 121));

        jLabel2.setText("Mã sản phẩm:");

        txtMaSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Số lượng:");

        spnSoLuong.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(spnSoLuong))
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemCT.setBackground(new java.awt.Color(51, 102, 255));
        btnThemCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemCT.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCT.setText("Thêm");
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
            }
        });

        btnXoaCT.setBackground(new java.awt.Color(51, 102, 255));
        btnXoaCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaCT.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCT.setText("Xóa");
        btnXoaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTActionPerformed(evt);
            }
        });

        btnLamMoiCT.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoiCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiCT.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoiCT.setText("Làm mới");
        btnLamMoiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiCTActionPerformed(evt);
            }
        });

        btnSuaCT.setBackground(new java.awt.Color(51, 102, 255));
        btnSuaCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaCT.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCT.setText("Sửa");
        btnSuaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuaCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCT)
                    .addComponent(btnSuaCT))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaCT)
                    .addComponent(btnLamMoiCT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMaPhieuXuatCT.setText(" ");
        txtMaPhieuXuatCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblChiTietPhieuXuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaPhieuXuatCT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblChiTietPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaPhieuXuatCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbChiTietPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sản phẩm", "Số lượng"
            }
        ));
        tbChiTietPhieuXuat.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbChiTietPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuXuatMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbChiTietPhieuXuat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPXActionPerformed
        // TODO add your handling code here:
        pxctl.doAddPhieuXuat();
    }//GEN-LAST:event_btnThemPXActionPerformed

    private void btnTimPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimPXActionPerformed
        // TODO add your handling code here:
        resetInput();
        if(txtMaPhieuTK.getText().isBlank() && cboCuaHang.getSelectedIndex() == 0 && cboGiaTriXuat.getSelectedIndex() == 0 && cboNguoiLap.getSelectedIndex() == 0 && cboTrangThaiTK.getSelectedIndex() == 0 && cboThoiGian.getSelectedIndex() == 0){
            pxctl.doSearchPhieuXuat("","","","","",false);
        }
        else {
            String NgayBatDau = null;
            String NgayKetThuc = null;
            boolean checkThoiGian = false;
            if(cboThoiGian.getSelectedIndex() != 0){
                if(txtNgayBatDau.getDate() != null){
                    NgayBatDau = new SimpleDateFormat("yyyy-MM-dd").format(txtNgayBatDau.getDate());
                } else NgayBatDau = "1990-01-01";
                if(txtNgayKetThuc.getDate() != null){
                    NgayKetThuc = new SimpleDateFormat("yyyy-MM-dd").format(txtNgayKetThuc.getDate());
                } else NgayKetThuc = LocalDate.now().toString();
                checkThoiGian = true;
            }
            if(checkThoiGian){
                String tg;
                if(cboThoiGian.getSelectedIndex() == 1){
                    tg = "ngay_tao";
                } else tg = "ngay_xuat";
                if(cboCuaHang.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("ma_ch",tg,cboCuaHang.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboGiaTriXuat.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("gia_tri_xuat",tg,cboGiaTriXuat.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboNguoiLap.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("ma_nd",tg,cboNguoiLap.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboTrangThaiTK.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("trang_thai",tg,cboTrangThaiTK.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else pxctl.doSearchPhieuXuat("",tg,"",NgayBatDau,NgayKetThuc, checkThoiGian);
            } else {
                if(!txtMaPhieuTK.getText().isBlank()){
                    pxctl.doSearchPhieuXuat("ma_phieu_xuat","",txtMaPhieuTK.getText().trim(),"","", checkThoiGian);
                } else if(cboCuaHang.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("ma_ch","",cboCuaHang.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboGiaTriXuat.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("gia_tri_xuat","",cboGiaTriXuat.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboNguoiLap.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("ma_nd","",cboNguoiLap.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboTrangThaiTK.getSelectedIndex() != 0){
                    pxctl.doSearchPhieuXuat("trang_thai","",cboTrangThaiTK.getSelectedItem().toString().trim(),"","", checkThoiGian);
                }
            }  
        }
    }//GEN-LAST:event_btnTimPXActionPerformed

    private void btnSuaPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPXActionPerformed
        // TODO add your handling code here:
        pxctl.doUpdatePhieuXuat();
        btnLamMoiPXActionPerformed(evt);
    }//GEN-LAST:event_btnSuaPXActionPerformed

    private void btnXoaPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPXActionPerformed
        // TODO add your handling code here:
        pxctl.doDeletePhieuXuat(txtMaPhieuXuat.getText().trim());
        btnLamMoiPXActionPerformed(evt);
    }//GEN-LAST:event_btnXoaPXActionPerformed

    public void resetInput(){
        btnThemPX.setEnabled(true);
        btnSuaPX.setEnabled(true);
        btnXoaPX.setEnabled(true);
        btnThemCT.setEnabled(true);
        btnSuaCT.setEnabled(true);
        btnXoaCT.setEnabled(true);
        cboMaCuaHang.setEnabled(true);
        cboTrangThai.setEnabled(false);
        checkPX = false;
        txtMaPhieuXuat.setText(" ");
        txtMaNguoiDung.setText(" " + NguoiDungController.ndOn.getMaND());
        cboMaCuaHang.setSelectedIndex(0);
        txtNgayTao.setText(" " + LocalDate.now().toString());
        txtNgayXuat.setText(" ");
        txtGiaTriXuat.setText(" ");
        cboTrangThai.setSelectedIndex(0);
        txtMaPhieuXuatCT.setText(" ");
    }
    
    private void btnLamMoiPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiPXActionPerformed
        // TODO add your handling code here:
        resetInput();
        txtMaPhieuTK.setText(" ");
        tbCTPX.setRowCount(0);
        tbPX.setRowCount(0);    
        pxctl.PhieuXuatPage();
        btnLamMoiCTActionPerformed(evt);
    }//GEN-LAST:event_btnLamMoiPXActionPerformed

    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
        // TODO add your handling code here:
        pxctl.doAddChiTietPhieuXuat(txtMaPhieuXuat.getText().trim());
    }//GEN-LAST:event_btnThemCTActionPerformed

    private void btnSuaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTActionPerformed
        // TODO add your handling code here:
        pxctl.doUpdateChiTietPhieuXuat(txtMaPhieuXuat.getText().trim());
    }//GEN-LAST:event_btnSuaCTActionPerformed

    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
        // TODO add your handling code here:
        pxctl.doDeleteChiTietPhieuXuat(txtMaPhieuXuat.getText().trim());
        btnLamMoiCTActionPerformed(evt);
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void btnLamMoiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiCTActionPerformed
        // TODO add your handling code here:
        txtMaSanPham.setEnabled(true);
        checkCTPX = false;
        tbCTPX.setRowCount(0);
        pxctl.PhieuXuatCTPage(txtMaPhieuXuatCT.getText().trim());
        txtMaSanPham.setText("");
        spnSoLuong.setValue(0);
    }//GEN-LAST:event_btnLamMoiCTActionPerformed

    private void tbPhieuXuatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuXuatMouseReleased
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        if("Da xuat".equals((String)tbPhieuXuat.getValueAt(rowIndex,4))) {
            cboMaCuaHang.setEnabled(false);
            cboTrangThai.setEnabled(false);
            btnThemCT.setEnabled(false);
            btnSuaCT.setEnabled(false);
            btnXoaCT.setEnabled(false);
        } else {
            cboTrangThai.setEnabled(true);
            cboMaCuaHang.setEnabled(true);
            btnThemCT.setEnabled(true);
            btnSuaCT.setEnabled(true);
            btnXoaCT.setEnabled(true);
        }
        checkPX = true;
        txtMaSanPham.setText("");
        txtMaSanPham.setEnabled(true);
        spnSoLuong.setValue(0);
        txtMaPhieuXuat.setText(" " + (String)tbPhieuXuat.getValueAt(rowIndex,0));
        txtNgayTao.setText(" " + (String)tbPhieuXuat.getValueAt(rowIndex,1));
        cboMaCuaHang.setSelectedItem((String)tbPhieuXuat.getValueAt(rowIndex,2));
        txtMaNguoiDung.setText(" " + (String)tbPhieuXuat.getValueAt(rowIndex,3));
        cboTrangThai.setSelectedItem((String)tbPhieuXuat.getValueAt(rowIndex,4));
        txtNgayXuat.setText(" " + (String)tbPhieuXuat.getValueAt(rowIndex,5));
        txtGiaTriXuat.setText(" " + decimalFormat.format(Integer.valueOf((String)tbPhieuXuat.getValueAt(rowIndex,6))));
        txtMaPhieuXuatCT.setText(" " + (String)tbPhieuXuat.getValueAt(rowIndex,0));
        tbCTPX.setRowCount(0);
        pxctl.PhieuXuatCTPage(txtMaPhieuXuat.getText().trim());
    }//GEN-LAST:event_tbPhieuXuatMouseReleased

    private void tbChiTietPhieuXuatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuXuatMouseReleased
        // TODO add your handling code here:
        if (checkPX == true){
            JTable target = (JTable) evt.getSource();
            int rowIndex = target.getSelectedRow();
            txtMaSanPham.setText(" " + (String)tbChiTietPhieuXuat.getValueAt(rowIndex,0));
            spnSoLuong.setValue(Integer.valueOf((String)tbChiTietPhieuXuat.getValueAt(rowIndex,1)));
            txtMaSanPham.setEnabled(false);
            checkCTPX = true;
        }
    }//GEN-LAST:event_tbChiTietPhieuXuatMouseReleased

    private void cboGiaTriXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGiaTriXuatItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboCuaHang.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboGiaTriXuatItemStateChanged

    private void cboTrangThaiTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiTKItemStateChanged
        // TODO add your handling code here:
        cboGiaTriXuat.setSelectedIndex(0);
        cboCuaHang.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboTrangThaiTKItemStateChanged

    private void cboCuaHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCuaHangItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriXuat.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboCuaHangItemStateChanged

    private void cboThoiGianItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThoiGianItemStateChanged
        // TODO add your handling code here:
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboThoiGianItemStateChanged

    private void txtMaPhieuTKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaPhieuTKKeyReleased
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriXuat.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        cboCuaHang.setSelectedIndex(0);
        cboThoiGian.setSelectedIndex(0);
    }//GEN-LAST:event_txtMaPhieuTKKeyReleased

    private void cboNguoiLapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguoiLapItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriXuat.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
        cboCuaHang.setSelectedIndex(0);
    }//GEN-LAST:event_cboNguoiLapItemStateChanged

    private void btnInPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPhieuActionPerformed
        // TODO add your handling code here:
        pxctl.doPrintBill(txtMaPhieuXuat.getText().trim());
    }//GEN-LAST:event_btnInPhieuActionPerformed
  
    
    public void printBill(CuaHangModel ch, ArrayList<SanPhamModel> sp){  
        try{              
            XSSFWorkbook wb =  new XSSFWorkbook();
            XSSFSheet sheet =  wb.createSheet("DSPN");
            XSSFRow row = null;
            Cell cell= null;

            sheet.setColumnWidth(0, 30*256);
            sheet.setColumnWidth(1, 30*256);
            sheet.setColumnWidth(2, 30*256);
            sheet.setColumnWidth(3, 30*256);
            sheet.setColumnWidth(4, 30*256);
            sheet.setColumnWidth(5, 30*256);
            sheet.setColumnWidth(6, 30*256);
            sheet.setColumnWidth(7, 30*256);
            sheet.setColumnWidth(8, 30*256);
            sheet.setColumnWidth(9, 30*256);
            sheet.setColumnWidth(10, 30*256);

            CellStyle headerStyle = wb.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);    
            headerStyle.setBorderBottom(BorderStyle.THICK);
            headerStyle.setBorderTop(BorderStyle.THICK);
            headerStyle.setBorderLeft(BorderStyle.THICK);
            headerStyle.setBorderRight(BorderStyle.THICK);     
            headerStyle.setAlignment(HorizontalAlignment.CENTER);
            headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            XSSFFont fontHeader = wb.createFont();
            fontHeader.setFontHeightInPoints((short)20);     
            fontHeader.setColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());
            headerStyle.setFont(fontHeader);


            CellStyle largeHeader = wb.createCellStyle();
            largeHeader.setAlignment(HorizontalAlignment.CENTER);
            largeHeader.setVerticalAlignment(VerticalAlignment.CENTER);
            XSSFFont fontHeaderBig = wb.createFont();
            fontHeaderBig.setFontHeightInPoints((short)32);     
            largeHeader.setFont(fontHeaderBig);

            CellStyle cs2 = wb.createCellStyle();
            cs2.setBorderBottom(BorderStyle.THICK);
            cs2.setBorderTop(BorderStyle.THICK);
            cs2.setBorderLeft(BorderStyle.THICK);
            cs2.setBorderRight(BorderStyle.THICK);     
            cs2.setAlignment(HorizontalAlignment.CENTER);
            cs2.setVerticalAlignment(VerticalAlignment.CENTER);
             XSSFFont fontCs2 = wb.createFont();
            fontCs2.setFontHeightInPoints((short)20); 
            cs2.setFont(fontCs2);
            cs2.setWrapText(true);

            CellStyle cs3 = wb.createCellStyle();
            cs3.setBorderBottom(BorderStyle.THICK);
            cs3.setBorderTop(BorderStyle.THICK);
            cs3.setBorderLeft(BorderStyle.THICK);
            cs3.setBorderRight(BorderStyle.THICK);     
            cs3.setAlignment(HorizontalAlignment.CENTER);
            cs3.setVerticalAlignment(VerticalAlignment.CENTER);
            fontCs2.setFontHeightInPoints((short)20); 
            cs3.setFont(fontCs2);
            cs3.setWrapText(true);     
            CreationHelper ch1 = wb.getCreationHelper();
            cs3.setDataFormat(ch1.createDataFormat().getFormat("#,##0.00;\\-#,##0.00"));

            CellStyle Ky = wb.createCellStyle();
            Ky.setAlignment(HorizontalAlignment.CENTER);
            Ky.setVerticalAlignment(VerticalAlignment.CENTER);
            XSSFFont fontKy = wb.createFont();
            fontKy.setFontHeightInPoints((short)20);
            fontKy.setItalic(true);
            fontKy.setBold(true);
            Ky.setFont(fontKy);

            CellStyle Tt = wb.createCellStyle();
            XSSFFont fontTt = wb.createFont();
            fontTt.setFontHeightInPoints((short)20);
            fontTt.setItalic(true);
            fontTt.setBold(true);
            Tt.setFont(fontTt);


            CellStyle MPN = wb.createCellStyle();
            MPN.setAlignment(HorizontalAlignment.CENTER);
            MPN.setVerticalAlignment(VerticalAlignment.CENTER);
            XSSFFont fontMPN = wb.createFont();
            fontMPN.setFontHeightInPoints((short)20);
            fontMPN.setBold(true);
            MPN.setFont(fontMPN);

            //sheet.addMergedRegion(new CellRangeAddress(start-row, end-row, start-col, end-col));
            // my_sheet.addMergedRegion(CellRangeAddress.valueOf("B2:D5"));

             /*cell=row.createCell(1, CellType.STRING);
            cell.setCellValue("Cửa hàng cung cấp");
            cell.setCellStyle(headerStyle);

            cell=row.createCell(7, CellType.STRING);
            cell.setCellValue("Quản lý kho");
            cell.setCellStyle(headerStyle);*/  

            //row0
            row =sheet.createRow(0);
            CellRangeAddress PNK = CellRangeAddress.valueOf("A1:F1");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellValue("Phiếu xuất kho");
            cell.setCellStyle(largeHeader);
            sheet.addMergedRegion(PNK);

            //row1
            row =sheet.createRow(1);
            CellRangeAddress MaPN = CellRangeAddress.valueOf("A2:F2");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("Mã phiếu xuất: " + txtMaPhieuXuat.getText());
            sheet.addMergedRegion(MaPN);

            //row3
            row =sheet.createRow(3);
            CellRangeAddress titleNCC = CellRangeAddress.valueOf("A4:C4");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Thông tin cửa hàng: ");
            sheet.addMergedRegion(titleNCC);

            cell=row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày tạo: "+ txtNgayTao.getText());
            cell.setCellStyle(Tt);



            //row4
            row =sheet.createRow(4);
            CellRangeAddress titleMa = CellRangeAddress.valueOf("B5:C5");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Mã: "+cboMaCuaHang.getSelectedItem());
            sheet.addMergedRegion(titleMa);

            //row5
            row =sheet.createRow(5);
            CellRangeAddress titleTen = CellRangeAddress.valueOf("B6:C6");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Tên: "+ ch.getTenCH());
            sheet.addMergedRegion(titleTen);

            cell=row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày xuất: "+txtNgayXuat.getText());
            cell.setCellStyle(Tt);

            //row6 
            row =sheet.createRow(6);
            CellRangeAddress titleDC = CellRangeAddress.valueOf("B7:C7");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Địa chỉ: "+ch.getDiaChiCH());
            sheet.addMergedRegion(titleDC);

            //row7
            row =sheet.createRow(7);
            CellRangeAddress titleSDT = CellRangeAddress.valueOf("B8:C8");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Số điện thoại: "+ch.getSdtCH());
            sheet.addMergedRegion(titleSDT);

            //row22
            row =sheet.createRow(22);
            CellRangeAddress time = CellRangeAddress.valueOf("E23:F23");
            cell=row.createCell(4, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("Hà Nội, ngày    tháng    năm    ");
            sheet.addMergedRegion(time);

            //row23
            row =sheet.createRow(23);
            CellRangeAddress KyNCC1 = CellRangeAddress.valueOf("A24:B24");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("Người lập phiếu");
            sheet.addMergedRegion(KyNCC1);

            CellRangeAddress KyQLK1 = CellRangeAddress.valueOf("E24:F24");
            cell=row.createCell(4, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("Quản lý kho");
            sheet.addMergedRegion(KyQLK1);

            //row24
            row =sheet.createRow(24);
            CellRangeAddress KyNCC2 = CellRangeAddress.valueOf("A25:B25");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("(Ký, ghi rõ họ tên)");
            sheet.addMergedRegion(KyNCC2);

            CellRangeAddress KyQLK2 = CellRangeAddress.valueOf("E25:F25");
            cell=row.createCell(4, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("(Ký, ghi rõ họ tên)");
            sheet.addMergedRegion(KyQLK2);



            //row10
             row =sheet.createRow(10);
            CellRangeAddress titleSP = CellRangeAddress.valueOf("A11:C11");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Thông tin sản phẩm: ");
            sheet.addMergedRegion(titleSP);

            //row11
            row = sheet.createRow(11); 
            cell=row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell.setCellStyle(headerStyle);

            cell=row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã sản phẩm");
            cell.setCellStyle(headerStyle);  

            cell=row.createCell(2,  CellType.STRING);
            cell.setCellValue("Tên sản phẩm");
            cell.setCellStyle(headerStyle);

            cell=row.createCell(3, CellType.STRING);
            cell.setCellValue("Số lượng");
            cell.setCellStyle(headerStyle);

            cell=row.createCell(4, CellType.STRING);
            cell.setCellValue("Đơn giá");
            cell.setCellStyle(headerStyle);

            cell=row.createCell(5, CellType.STRING);
            cell.setCellValue("Thành tiền");
            cell.setCellStyle(headerStyle);

            //row17
            for(int i=0; i<tbChiTietPhieuXuat.getRowCount(); i++){  
                row = sheet.createRow(i+12); 

                cell=row.createCell(0, CellType.STRING);
                cell.setCellValue(i+1);
                cell.setCellStyle(cs2);

                cell=row.createCell(1, CellType.STRING);
                cell.setCellValue(sp.get(i).getMaSP());//ma san pham
                cell.setCellStyle(cs2);


                cell=row.createCell(2, CellType.STRING);
                cell.setCellValue(sp.get(i).getTenSP());//ten san pham
                cell.setCellStyle(cs2);


                cell=row.createCell(3, CellType.STRING);
                cell.setCellValue(sp.get(i).getSoLuong());//so luong
                cell.setCellStyle(cs2);  

                cell=row.createCell(4, CellType.STRING);
                cell.setCellValue(sp.get(i).getGiaXuat());//don gia
                cell.setCellStyle(cs3);

                cell=row.createCell(5, CellType.STRING);
                cell.setCellValue(sp.get(i).getSoLuong()*sp.get(i).getGiaXuat());//thanh tien
                cell.setCellStyle(cs3);        

                if(i>=tbChiTietPhieuXuat.getRowCount()-1){
                    row = sheet.createRow(i+13); 
                    cell=row.createCell(0, CellType.STRING);
                    cell.setCellValue("Tổng");
                    cell.setCellStyle(headerStyle);

                    //sheet.addMergedRegion(new CellRangeAddress(start-row, end-row, start-col, end-col));
                    cell=row.createCell(1, CellType.STRING);
                    cell.setCellValue(txtGiaTriXuat.getText());
                    cell.setCellStyle(Ky);
                    sheet.addMergedRegion(new CellRangeAddress(i+13, i+13, 1, 5));
                }
            }

            try {
                FileOutputStream fis = new FileOutputStream("src/App/Bill/PX/"+ txtMaPhieuXuat.getText().trim() +".xlsx");
                wb.write(fis);
                fis.close();    
            } catch (FileNotFoundException ex) {}
            JOptionPane.showMessageDialog(this, "In thành công");
        }catch(HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(this, "Lỗi mở file");
        }
    }

    
    public void loadComboBoxMaCH(ArrayList<CuaHangModel> lch){
        if(cboCuaHang.getItemCount() <= 1 && cboMaCuaHang.getItemCount() <= 1){
            for(int i=0; i<lch.size(); i++){
                cboMaCuaHang.addItem(lch.get(i).getMaCH());
                cboCuaHang.addItem(lch.get(i).getMaCH());
            }
        }
    }
    
    public void loadComboBoxNguoiLap(ArrayList<NguoiDungModel> lnl){
        if(cboNguoiLap.getItemCount() <= 1){
            for(int i=0; i<lnl.size(); i++){
                cboNguoiLap.addItem(lnl.get(i).getMaND());
            }
        }
    }
    
    public SanPhamModel getChiTietPhieuXuatInput(){
       SanPhamModel sp = new SanPhamModel();
       sp.setMaSP(txtMaSanPham.getText().trim());
       sp.setSoLuong((int)spnSoLuong.getValue());
       return sp;
    }
    
    public PhieuXuatModel getPhieuXuatInput(){
       PhieuXuatModel px = new PhieuXuatModel();
       px.setMaPhieuXuat(txtMaPhieuXuat.getText().trim());
       px.setMaCH(cboMaCuaHang.getSelectedItem().toString().trim());
       px.setMaND(txtMaNguoiDung.getText().trim());
       px.setNgayTao(txtNgayTao.getText().trim());
       px.setTrangThai(cboTrangThai.getSelectedItem().toString().trim());
       px.setNgayXuat(txtNgayXuat.getText().trim());
       return px;
    }  
    
    public boolean xacNhanXoa(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }
    
    public void showMessage(String msg, boolean checkMsg){
        if(checkMsg){
            JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInPhieu;
    private javax.swing.JButton btnLamMoiCT;
    private javax.swing.JButton btnLamMoiPX;
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnSuaPX;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnThemPX;
    private javax.swing.JButton btnTimPX;
    private javax.swing.JButton btnXoaCT;
    private javax.swing.JButton btnXoaPX;
    private javax.swing.JComboBox<String> cboCuaHang;
    private javax.swing.JComboBox<String> cboGiaTriXuat;
    private javax.swing.JComboBox<String> cboMaCuaHang;
    private javax.swing.JComboBox<String> cboNguoiLap;
    private javax.swing.JComboBox<String> cboThoiGian;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cboTrangThaiTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiTietPhieuXuat;
    private javax.swing.JLabel lblMaCuaHang;
    private javax.swing.JLabel lblMaNguoiLapPhieu;
    private javax.swing.JLabel lblMaPhieuXuat;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblNgayXuat;
    private javax.swing.JLabel lblNgayXuat1;
    private javax.swing.JLabel lblPhieuXuat;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JSpinner spnSoLuong;
    private javax.swing.JTable tbChiTietPhieuXuat;
    private javax.swing.JTable tbPhieuXuat;
    public javax.swing.JLabel txtGiaTriXuat;
    private javax.swing.JLabel txtMaNguoiDung;
    private javax.swing.JTextField txtMaPhieuTK;
    private javax.swing.JLabel txtMaPhieuXuat;
    private javax.swing.JLabel txtMaPhieuXuatCT;
    private javax.swing.JTextField txtMaSanPham;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JLabel txtNgayTao;
    private javax.swing.JLabel txtNgayXuat;
    // End of variables declaration//GEN-END:variables
}
