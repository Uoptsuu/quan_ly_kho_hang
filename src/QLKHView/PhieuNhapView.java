
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

public class PhieuNhapView extends javax.swing.JPanel {

    public boolean checkPN;
    private static PhieuNhapController pnctl;
    final String headerPN[] = {"Mã phiếu nhập", "Ngày tạo", "Mã nhà cung cấp", "Người tạo", "Trạng thái", "Ngày nhập", "Giá trị nhập", "Ghi chú"};
    final DefaultTableModel tbPN = new DefaultTableModel(headerPN, 0);
    public  boolean checkCTPN;
    final String headerCTPN[] = {"Mã sản phẩm", "Số lượng"};
    final DefaultTableModel tbCTPN = new DefaultTableModel(headerCTPN, 0);
    private static final long serialVersionUID = 1L;
    private final DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
    private static ArrayList<PhieuNhapModel> tpn = new ArrayList<>();
            
    public PhieuNhapView() {
        initComponents();
        pnctl = new PhieuNhapController(this);
        cboTrangThai.setEnabled(false);
        txtNgayTao.setText(" " + LocalDate.now().toString());
        txtMaNguoiDung.setText(" " + NguoiDungController.ndOn.getMaND());
        pnctl.PhieuNhapPage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPhieuNhap = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblMaPhieuNhap = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        lblNgayNhap = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMaNhaCungCap = new javax.swing.JLabel();
        cboMaNCC = new javax.swing.JComboBox<>();
        lblMaNguoiLapPhieu = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        txtMaNguoiDung = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JLabel();
        txtGiaTriNhap = new javax.swing.JLabel();
        txtMaPhieuNhap = new javax.swing.JLabel();
        lblTrangThai1 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnThemPN = new javax.swing.JButton();
        btnSuaPN = new javax.swing.JButton();
        btnXoaPN = new javax.swing.JButton();
        btnLamMoiPN = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboGiaTriNhap = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboTrangThaiTK = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboNhaCungCap = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboThoiGian = new javax.swing.JComboBox<>();
        cboNguoiLap = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMaPhieuTK = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnInPhieu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel2 = new javax.swing.JPanel();
        lblChiTietPhieuNhap = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnSoLuong = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        btnThemCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        btnLamMoiCT = new javax.swing.JButton();
        txtMaPhieuNhapCT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietPhieuNhap = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(null);

        jPanel1.setBackground(null);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhieuNhap.setText("Quản lý phiếu nhập");

        jPanel5.setBackground(null);
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaPhieuNhap.setText("Mã phiếu nhập:");

        lblNgayTao.setText("Ngày tạo:");

        lblNgayNhap.setText("Ngày nhập:");

        jLabel1.setText("Giá trị nhập:");

        lblMaNhaCungCap.setText("Mã nhà cung cấp:");

        cboMaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboMaNCC.setBorder(null);

        lblMaNguoiLapPhieu.setText("Mã người lập phiếu:");

        lblTrangThai.setText("Trạng thái:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chua nhap", "Da nhap" }));
        cboTrangThai.setBorder(null);

        txtMaNguoiDung.setText(" ");
        txtMaNguoiDung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNgayNhap.setText(" ");
        txtNgayNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNgayTao.setText(" ");
        txtNgayTao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGiaTriNhap.setText(" ");
        txtGiaTriNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaPhieuNhap.setText(" ");
        txtMaPhieuNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTrangThai1.setText("Ghi chú:");

        txtGhiChu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGhiChu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGhiChuKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaPhieuNhap)
                    .addComponent(lblNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGiaTriNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(lblMaNhaCungCap)
                            .addGap(29, 29, 29))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(lblMaNguoiLapPhieu)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblTrangThai)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTrangThai1)
                        .addGap(80, 80, 80)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboMaNCC, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTrangThai, 0, 115, Short.MAX_VALUE)
                    .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtGhiChu))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhieuNhap)
                    .addComponent(txtMaPhieuNhap)
                    .addComponent(lblMaNhaCungCap)
                    .addComponent(cboMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTao)
                    .addComponent(txtNgayTao)
                    .addComponent(lblMaNguoiLapPhieu)
                    .addComponent(txtMaNguoiDung))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayNhap)
                    .addComponent(lblNgayNhap)
                    .addComponent(lblTrangThai)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGiaTriNhap)
                    .addComponent(lblTrangThai1)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(null);
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemPN.setBackground(new java.awt.Color(51, 102, 255));
        btnThemPN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPN.setForeground(new java.awt.Color(255, 255, 255));
        btnThemPN.setText("Thêm");
        btnThemPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPNActionPerformed(evt);
            }
        });

        btnSuaPN.setBackground(new java.awt.Color(51, 102, 255));
        btnSuaPN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPN.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaPN.setText("Sửa");
        btnSuaPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPNActionPerformed(evt);
            }
        });

        btnXoaPN.setBackground(new java.awt.Color(51, 102, 255));
        btnXoaPN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaPN.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPN.setText("Xóa");
        btnXoaPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPNActionPerformed(evt);
            }
        });

        btnLamMoiPN.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoiPN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiPN.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoiPN.setText("Làm mới");
        btnLamMoiPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLamMoiPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnThemPN)
                .addGap(18, 18, 18)
                .addComponent(btnSuaPN)
                .addGap(18, 18, 18)
                .addComponent(btnXoaPN)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoiPN)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBackground(null);
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setFocusTraversalPolicyProvider(true);

        jLabel8.setText("Giá trị nhập:");

        cboGiaTriNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboGiaTriNhap.setBorder(null);
        cboGiaTriNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGiaTriNhapItemStateChanged(evt);
            }
        });

        jLabel7.setText("Trạng thái:");

        cboTrangThaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Da nhap", "Chua nhap" }));
        cboTrangThaiTK.setBorder(null);
        cboTrangThaiTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiTKItemStateChanged(evt);
            }
        });

        jLabel6.setText("Nhà cung cấp:");

        cboNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboNhaCungCap.setBorder(null);
        cboNhaCungCap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNhaCungCapItemStateChanged(evt);
            }
        });

        jLabel4.setText("Thời gian:");

        cboThoiGian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ngay tao", "Ngay nhap" }));
        cboThoiGian.setBorder(null);
        cboThoiGian.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThoiGianItemStateChanged(evt);
            }
        });

        cboNguoiLap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*" }));
        cboNguoiLap.setBorder(null);
        cboNguoiLap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguoiLapItemStateChanged(evt);
            }
        });

        jLabel5.setText("Mã phiếu:");

        txtMaPhieuTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaPhieuTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaPhieuTKKeyReleased(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(51, 102, 255));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel9.setText("Người lập:");

        txtNgayKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        txtNgayKetThuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNgayKetThuc.setDateFormatString("yyyy-MM-dd");

        txtNgayBatDau.setBackground(new java.awt.Color(255, 255, 255));
        txtNgayBatDau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNgayBatDau.setDateFormatString("yyyy-MM-dd");

        jLabel11.setText("đến");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboGiaTriNhap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboTrangThaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel5)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMaPhieuTK, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(14, 14, 14))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboGiaTriNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTrangThaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaPhieuTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTim)
                .addGap(14, 14, 14))
        );

        btnInPhieu.setText("In phiếu");
        btnInPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhieuNhap))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInPhieu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhieuNhap)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInPhieu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jScrollPane2.setBackground(null);

        tbPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Ngày tạo", "Mã nhà cung cấp", "Người tạo", "Trạng thái", "Ngày nhập", "Giá trị nhập", "Ghi chú"
            }
        ));
        tbPhieuNhap.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbPhieuNhapMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbPhieuNhap);

        jPanel2.setBackground(null);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblChiTietPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChiTietPhieuNhap.setText("Chi tiết phiếu nhập");

        jPanel3.setBackground(null);
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMaSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setText("Số lượng:");

        spnSoLuong.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtMaSanPham))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(null);
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemCT.setBackground(new java.awt.Color(51, 102, 255));
        btnThemCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemCT.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCT.setText("Thêm");
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaCT, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnThemCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuaCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoiCT, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCT)
                    .addComponent(btnSuaCT))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaCT)
                    .addComponent(btnLamMoiCT))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtMaPhieuNhapCT.setText(" ");
        txtMaPhieuNhapCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChiTietPhieuNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChiTietPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tbChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
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
        tbChiTietPhieuNhap.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbChiTietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuNhapMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbChiTietPhieuNhap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadComboBoxMaNCC(ArrayList<NhaCungCapModel> lncc) {
        if(cboMaNCC.getItemCount() <= 1 && cboNhaCungCap.getItemCount() <= 1){
            for (int i = 0; i < lncc.size(); i++) {
                cboMaNCC.addItem(lncc.get(i).getMaNCC());
                cboNhaCungCap.addItem(lncc.get(i).getMaNCC());
            }
        }
    }
    private void btnThemPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPNActionPerformed
        // TODO add your handling code here:
        pnctl.doAddPhieuNhap();
    }//GEN-LAST:event_btnThemPNActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        resetInput();
        if(txtMaPhieuTK.getText().isBlank() && cboNhaCungCap.getSelectedIndex() == 0 && cboGiaTriNhap.getSelectedIndex() == 0 && cboNguoiLap.getSelectedIndex() == 0 && cboTrangThaiTK.getSelectedIndex() == 0 && cboThoiGian.getSelectedIndex() == 0){
            pnctl.doSearchPhieuNhap("","","","","",false);
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
                } else tg = "ngay_nhap";
                if(cboNhaCungCap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("ma_ncc",tg,cboNhaCungCap.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboGiaTriNhap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("gia_tri_nhap",tg,cboGiaTriNhap.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboNguoiLap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("ma_nd",tg,cboNguoiLap.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else if(cboTrangThaiTK.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("trang_thai",tg,cboTrangThaiTK.getSelectedItem().toString().trim(),NgayBatDau,NgayKetThuc, checkThoiGian);
                } else pnctl.doSearchPhieuNhap("",tg,"",NgayBatDau,NgayKetThuc, checkThoiGian);
            } else {
                if(!txtMaPhieuTK.getText().isBlank()){
                    pnctl.doSearchPhieuNhap("ma_phieu_nhap","",txtMaPhieuTK.getText().trim(),"","", checkThoiGian);
                } else if(cboNhaCungCap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("ma_ncc","",cboNhaCungCap.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboGiaTriNhap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("gia_tri_nhap","",cboGiaTriNhap.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboNguoiLap.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("ma_nd","",cboNguoiLap.getSelectedItem().toString().trim(),"","", checkThoiGian);
                } else if(cboTrangThaiTK.getSelectedIndex() != 0){
                    pnctl.doSearchPhieuNhap("trang_thai","",cboTrangThaiTK.getSelectedItem().toString().trim(),"","", checkThoiGian);
                }
            }  
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnSuaPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPNActionPerformed
        // TODO add your handling code here:
        pnctl.doUpdatePhieuNhap();
        loadTablePhieuNhap(tpn);
    }//GEN-LAST:event_btnSuaPNActionPerformed

    private void btnXoaPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPNActionPerformed
        // TODO add your handling code here:
        pnctl.doDeletePhieuNhap();
        btnLamMoiCTActionPerformed(evt);
    }//GEN-LAST:event_btnXoaPNActionPerformed

    public void resetInput(){
        btnThemPN.setEnabled(true);
        btnSuaPN.setEnabled(true);
        btnXoaPN.setEnabled(true);
        btnThemCT.setEnabled(true);
        btnSuaCT.setEnabled(true);
        btnXoaCT.setEnabled(true);
        cboMaNCC.setEnabled(true);
        checkPN = false;
        txtMaPhieuNhap.setText(" ");
        txtMaNguoiDung.setText(" " + NguoiDungController.ndOn.getMaND());
        cboMaNCC.setSelectedIndex(0);
        txtNgayTao.setText(" " + LocalDate.now().toString());
        txtNgayNhap.setText(" ");
        txtGiaTriNhap.setText(" ");
        cboTrangThai.setSelectedIndex(0);
        cboTrangThai.setEnabled(false);
        txtMaPhieuNhapCT.setText(" ");
        txtGhiChu.setText("");
    }
    
    private void btnLamMoiPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiPNActionPerformed
        // TODO add your handling code here:
        resetInput();
        tbPN.setRowCount(0);
        tbCTPN.setRowCount(0);
        pnctl.PhieuNhapPage();
        btnLamMoiCTActionPerformed(evt);
    }//GEN-LAST:event_btnLamMoiPNActionPerformed

    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
        // TODO add your handling code here:
        pnctl.doAddChiTietPhieuNhap(txtMaPhieuNhap.getText().trim());
    }//GEN-LAST:event_btnThemCTActionPerformed

    private void btnSuaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTActionPerformed
        // TODO add your handling code here:
        pnctl.doUpdateChiTietPhieuNhap(txtMaPhieuNhap.getText().trim(),getChiTietPhieuNhapInput());
    }//GEN-LAST:event_btnSuaCTActionPerformed

    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
        // TODO add your handling code here:
        pnctl.doDeleteChiTietPhieuNhap(txtMaPhieuNhap.getText().trim());
        btnLamMoiCTActionPerformed(evt);
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void btnLamMoiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiCTActionPerformed
        // TODO add your handling code here:
        txtMaSanPham.setEnabled(true);
        checkCTPN = false;
        tbCTPN.setRowCount(0);
        pnctl.PhieuNhapCTPage(txtMaPhieuNhap.getText().trim());
        txtMaSanPham.setText("");
        spnSoLuong.setValue(0);
    }//GEN-LAST:event_btnLamMoiCTActionPerformed

    private void cboGiaTriNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGiaTriNhapItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboNhaCungCap.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboGiaTriNhapItemStateChanged

    private void cboTrangThaiTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiTKItemStateChanged
        // TODO add your handling code here:
        cboGiaTriNhap.setSelectedIndex(0);
        cboNhaCungCap.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboTrangThaiTKItemStateChanged

    private void cboNhaCungCapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNhaCungCapItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriNhap.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboNhaCungCapItemStateChanged

    private void cboThoiGianItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThoiGianItemStateChanged
        // TODO add your handling code here:
        txtMaPhieuTK.setText("");
    }//GEN-LAST:event_cboThoiGianItemStateChanged

    private void cboNguoiLapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguoiLapItemStateChanged
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriNhap.setSelectedIndex(0);
        txtMaPhieuTK.setText("");
        cboNhaCungCap.setSelectedIndex(0);
    }//GEN-LAST:event_cboNguoiLapItemStateChanged

    private void txtMaPhieuTKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaPhieuTKKeyReleased
        // TODO add your handling code here:
        cboTrangThaiTK.setSelectedIndex(0);
        cboGiaTriNhap.setSelectedIndex(0);
        cboNguoiLap.setSelectedIndex(0);
        cboThoiGian.setSelectedIndex(0);
        cboNhaCungCap.setSelectedIndex(0);
    }//GEN-LAST:event_txtMaPhieuTKKeyReleased

    private void tbPhieuNhapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhapMouseReleased
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        if ("Da nhap".equals((String) tbPhieuNhap.getValueAt(rowIndex, 4))) {
            cboMaNCC.setEnabled(false);
            cboTrangThai.setEnabled(false);
            btnThemCT.setEnabled(false);
            btnSuaCT.setEnabled(false);
            btnXoaCT.setEnabled(false);
            txtGhiChu.setEnabled(false);
        } else {
            cboTrangThai.setEnabled(true);
            cboMaNCC.setEnabled(true);
            btnThemCT.setEnabled(true);
            btnSuaCT.setEnabled(true);
            btnXoaCT.setEnabled(true);
            txtGhiChu.setEnabled(true);
        }
        checkPN = true;
        checkCTPN = false;
        txtMaSanPham.setText("");
        txtMaSanPham.setEnabled(true);
        spnSoLuong.setValue(0);
        txtMaPhieuNhap.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 0));
        txtNgayTao.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 1));
        cboMaNCC.setSelectedItem((String) tbPhieuNhap.getValueAt(rowIndex, 2));
        txtMaNguoiDung.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 3));
        cboTrangThai.setSelectedItem((String) tbPhieuNhap.getValueAt(rowIndex, 4));
        txtNgayNhap.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 5));
        txtGiaTriNhap.setText(" " + decimalFormat.format(Integer.valueOf((String)tbPhieuNhap.getValueAt(rowIndex, 6))));
        txtGhiChu.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 7));
        tbCTPN.setRowCount(0);
        txtMaPhieuNhapCT.setText(" " + (String) tbPhieuNhap.getValueAt(rowIndex, 0));
        pnctl.PhieuNhapCTPage(txtMaPhieuNhap.getText().trim());     
    }//GEN-LAST:event_tbPhieuNhapMouseReleased

    private void tbChiTietPhieuNhapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuNhapMouseReleased
        // TODO add your handling code here:
        if (checkPN == true) {
            JTable target = (JTable) evt.getSource();
            int rowIndex = target.getSelectedRow();
            txtMaSanPham.setText(" " + (String) tbChiTietPhieuNhap.getValueAt(rowIndex, 0));
            spnSoLuong.setValue(Integer.valueOf((String) tbChiTietPhieuNhap.getValueAt(rowIndex, 1)));
            txtMaSanPham.setEnabled(false);
            checkCTPN = true;
        }  

        
    }//GEN-LAST:event_tbChiTietPhieuNhapMouseReleased

    private void btnInPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPhieuActionPerformed
        // TODO add your handling code here:
        pnctl.doPrintBill(txtMaPhieuNhap.getText().trim());
    }//GEN-LAST:event_btnInPhieuActionPerformed

    private void txtGhiChuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGhiChuKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChuKeyReleased
    
    public void printBill(NhaCungCapModel ncc, ArrayList<SanPhamModel> sp){
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
            CreationHelper ch = wb.getCreationHelper();
            cs3.setDataFormat(ch.createDataFormat().getFormat("#,##0.00;\\-#,##0.00"));

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
            cell.setCellValue("Phiếu nhập kho");
            cell.setCellStyle(largeHeader);
            sheet.addMergedRegion(PNK);

            //row1
            row =sheet.createRow(1);
            CellRangeAddress MaPN = CellRangeAddress.valueOf("A2:F2");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Ky);
            cell.setCellValue("Mã phiếu nhập: "+txtMaPhieuNhap.getText());
            sheet.addMergedRegion(MaPN);

            //row3
            row =sheet.createRow(3);
            CellRangeAddress titleNCC = CellRangeAddress.valueOf("A4:C4");
            cell=row.createCell(0, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Thông tin nhà cung cấp: ");
            sheet.addMergedRegion(titleNCC);

            cell=row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày tạo: "+ txtNgayTao.getText());
            cell.setCellStyle(Tt);



            //row4
            row =sheet.createRow(4);
            CellRangeAddress titleMa = CellRangeAddress.valueOf("B5:C5");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Mã: "+cboMaNCC.getSelectedItem());
            sheet.addMergedRegion(titleMa);

            //row5
            row =sheet.createRow(5);
            CellRangeAddress titleTen = CellRangeAddress.valueOf("B6:C6");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Tên: "+ncc.getTenNCC());
            sheet.addMergedRegion(titleTen);

            cell=row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày nhập: "+txtNgayNhap.getText());
            cell.setCellStyle(Tt);

            //row6 
            row =sheet.createRow(6);
            CellRangeAddress titleDC = CellRangeAddress.valueOf("B7:C7");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Địa chỉ: "+ncc.getDiaChiNCC());
            sheet.addMergedRegion(titleDC);

            //row7
            row =sheet.createRow(7);
            CellRangeAddress titleSDT = CellRangeAddress.valueOf("B8:C8");
            cell=row.createCell(1, CellType.STRING);
            cell.setCellStyle(Tt);
            cell.setCellValue("Số điện thoại: "+ncc.getSdtNCC());
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
            for(int i=0; i<tbChiTietPhieuNhap.getRowCount(); i++){  
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
                cell.setCellValue(sp.get(i).getGiaNhap());//don gia
                cell.setCellStyle(cs3);

                cell=row.createCell(5, CellType.STRING);
                cell.setCellValue(sp.get(i).getSoLuong()*sp.get(i).getGiaNhap());//thanh tien
                cell.setCellStyle(cs3);        

                if(i>=tbChiTietPhieuNhap.getRowCount()-1){
                    row = sheet.createRow(i+13); 
                    cell=row.createCell(0, CellType.STRING);
                    cell.setCellValue("Tổng");
                    cell.setCellStyle(headerStyle);

                    //sheet.addMergedRegion(new CellRangeAddress(start-row, end-row, start-col, end-col));
                    cell=row.createCell(1, CellType.STRING);
                    cell.setCellValue(txtGiaTriNhap.getText());
                    cell.setCellStyle(Ky);
                    sheet.addMergedRegion(new CellRangeAddress(i+13, i+13, 1, 5));
                }
            }

            try {
                FileOutputStream fis = new FileOutputStream("src/App/Bill/PN/" + txtMaPhieuNhap.getText().trim() + ".xlsx");
                wb.write(fis);
                fis.close();   
            } catch (FileNotFoundException ex) {}
            JOptionPane.showMessageDialog(this, "In thành công"); 
        }catch(HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(this, "Lỗi mở file");
        }
    }

    
    public void loadTablePhieuNhap(ArrayList<PhieuNhapModel> lpn) {
        tpn = lpn;
        tbPN.getDataVector().removeAllElements();
        for (int i = 0; i < lpn.size(); i++) {
            if(lpn.get(i).getGhiChu() == null){
                lpn.get(i).setGhiChu(" ");
            }
            String[] pn = {lpn.get(i).getMaPhieuNhap(), lpn.get(i).getNgayTao(), lpn.get(i).getMaNCC(), lpn.get(i).getMaND(), lpn.get(i).getTrangThai(), lpn.get(i).getNgayNhap(), String.valueOf(lpn.get(i).getGiaTriNhap()), lpn.get(i).getGhiChu()};
            tbPN.addRow(pn);
            tbPhieuNhap.setModel(tbPN);
        }
    }

    public void loadTableChiTietPhieuNhap(ArrayList<SanPhamModel> ctpn) {
        tbCTPN.getDataVector().removeAllElements();
        for (int i = 0; i < ctpn.size(); i++) {
            String[] pn = {ctpn.get(i).getMaSP(), Integer.toString(ctpn.get(i).getSoLuong())};
            tbCTPN.addRow(pn);
            tbChiTietPhieuNhap.setModel(tbCTPN);
        }
    }

    public void loadComboBoxNguoiLap(ArrayList<NguoiDungModel> lnl){
        if(cboNguoiLap.getItemCount() <= 1){
            for(int i=0; i < lnl.size(); i++){
                cboNguoiLap.addItem(lnl.get(i).getMaND());
            }
        }
    }
    
    public PhieuNhapModel getPhieuNhapInput() {
        PhieuNhapModel pn = new PhieuNhapModel();
        pn.setMaPhieuNhap(txtMaPhieuNhap.getText().trim());
        pn.setMaNCC(cboMaNCC.getSelectedItem().toString().trim());
        pn.setMaND(txtMaNguoiDung.getText().trim());
        pn.setNgayTao(txtNgayTao.getText().trim());
        pn.setTrangThai(cboTrangThai.getSelectedItem().toString().trim());
        pn.setNgayNhap(txtNgayNhap.getText().trim());
        pn.setGhiChu(txtGhiChu.getText().trim());
        return pn;
    }

    public SanPhamModel getChiTietPhieuNhapInput() {
        SanPhamModel sp = new SanPhamModel();
        sp.setMaSP(txtMaSanPham.getText().trim());
        sp.setSoLuong((int) spnSoLuong.getValue());
        return sp;
    }

    public boolean xacNhanXoa() {
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }

    public void showMessage(String msg, boolean checkMsg) {
        if (checkMsg) {
            JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInPhieu;
    private javax.swing.JButton btnLamMoiCT;
    private javax.swing.JButton btnLamMoiPN;
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnSuaPN;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnThemPN;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaCT;
    private javax.swing.JButton btnXoaPN;
    private javax.swing.JComboBox<String> cboGiaTriNhap;
    private javax.swing.JComboBox<String> cboMaNCC;
    private javax.swing.JComboBox<String> cboNguoiLap;
    private javax.swing.JComboBox<String> cboNhaCungCap;
    private javax.swing.JComboBox<String> cboThoiGian;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cboTrangThaiTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiTietPhieuNhap;
    private javax.swing.JLabel lblMaNguoiLapPhieu;
    private javax.swing.JLabel lblMaNhaCungCap;
    private javax.swing.JLabel lblMaPhieuNhap;
    private javax.swing.JLabel lblNgayNhap;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblPhieuNhap;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrangThai1;
    private javax.swing.JSpinner spnSoLuong;
    private javax.swing.JTable tbChiTietPhieuNhap;
    private javax.swing.JTable tbPhieuNhap;
    private javax.swing.JTextField txtGhiChu;
    public javax.swing.JLabel txtGiaTriNhap;
    private javax.swing.JLabel txtMaNguoiDung;
    private javax.swing.JLabel txtMaPhieuNhap;
    private javax.swing.JLabel txtMaPhieuNhapCT;
    private javax.swing.JTextField txtMaPhieuTK;
    private javax.swing.JTextField txtMaSanPham;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JLabel txtNgayNhap;
    private javax.swing.JLabel txtNgayTao;
    // End of variables declaration//GEN-END:variables
}
