
package QLKHView;

import QLKHController.NhaCungCapController;
import QLKHModel.NhaCungCapModel;
import QLKHModel.PhieuNhapModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NhaCungCapView extends javax.swing.JPanel {

    public boolean check;
    private static NhaCungCapController nccctl;
    final String headerNCC[] ={"Mã nhà cung cấp","Tên nhà cung cấp","Số điện thoại","Địa chỉ","Số phiếu đã nhập","Số phiếu chưa nhập","Tổng giá trị nhập"};
    final DefaultTableModel tbNCC = new DefaultTableModel(headerNCC, 0);
    final String headerNCCPN[] = {"Mã phiếu","Ngày lập","Ngày xuất","Người lập","Giá trị","Trạng thái"};
    final DefaultTableModel tbNCCPN = new DefaultTableModel(headerNCCPN, 0);
    private static final long serialVersionUID = 1L;
    public NhaCungCapView() {
        initComponents();
        nccctl = new NhaCungCapController(this);
        nccctl.NhaCungCapPage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPhieuXuat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMaNhaCungCap = new javax.swing.JLabel();
        txtTenNhaCungCap = new javax.swing.JTextField();
        lblTenNhaCungCap = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSoPhieuChuaNhap = new javax.swing.JLabel();
        txtSoPhieuDaNhap = new javax.swing.JLabel();
        txtTongGiaTriNhap = new javax.swing.JLabel();
        txtMaNhaCungCap = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboThongTinNCC = new javax.swing.JComboBox<>();
        txtTimKiemNCC = new javax.swing.JTextField();
        cboTongGiaTriNhap = new javax.swing.JComboBox<>();
        cboSoPhieuDaNhap = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboSoPhieuChuaNhap = new javax.swing.JComboBox<>();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNhaCungCap = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhaCungCapPN = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhieuXuat.setText("Quản lý nhà cung cấp");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaNhaCungCap.setText("Mã nhà cung cấp:");

        txtTenNhaCungCap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTenNhaCungCap.setText("Tên nhà cung cấp:");

        lblSoDienThoai.setText("Số điện thoại:");

        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDiaChi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDiaChi.setText("Địa chỉ:");

        jLabel1.setText("Phiếu đã nhập:");

        jLabel2.setText("Tổng giá trị nhập:");

        jLabel3.setText("Phiếu chưa nhập:");

        txtSoPhieuChuaNhap.setText(" ");
        txtSoPhieuChuaNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSoPhieuDaNhap.setText(" ");
        txtSoPhieuDaNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTongGiaTriNhap.setText(" ");
        txtTongGiaTriNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaNhaCungCap.setText(" ");
        txtMaNhaCungCap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTenNhaCungCap)
                                .addComponent(lblMaNhaCungCap))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblSoDienThoai)
                            .addGap(43, 43, 43)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDiaChi)
                        .addGap(76, 76, 76)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(492, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(txtDiaChi))
                            .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTongGiaTriNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSoPhieuChuaNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoPhieuDaNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblMaNhaCungCap))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMaNhaCungCap)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhaCungCap)
                    .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDienThoai)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoPhieuChuaNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoPhieuDaNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTongGiaTriNhap))
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setBackground(new java.awt.Color(51, 102, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 102, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 102, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Số phiếu đã nhập:");

        jLabel5.setText("Tổng giá trị nhập:");

        jLabel6.setText("Thông tin khác:");

        cboThongTinNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ma nha cung cap", "Ten nha cung cap", "SDT", "Dia chi" }));
        cboThongTinNCC.setBorder(null);
        cboThongTinNCC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongTinNCCItemStateChanged(evt);
            }
        });

        txtTimKiemNCC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimKiemNCC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemNCCFocusGained(evt);
            }
        });

        cboTongGiaTriNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboTongGiaTriNhap.setBorder(null);
        cboTongGiaTriNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTongGiaTriNhapItemStateChanged(evt);
            }
        });

        cboSoPhieuDaNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboSoPhieuDaNhap.setBorder(null);
        cboSoPhieuDaNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoPhieuDaNhapItemStateChanged(evt);
            }
        });

        jLabel8.setText("Số phiếu chưa nhập:");

        cboSoPhieuChuaNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboSoPhieuChuaNhap.setBorder(null);
        cboSoPhieuChuaNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoPhieuChuaNhapItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKiemNCC)
                            .addComponent(cboTongGiaTriNhap, 0, 165, Short.MAX_VALUE)
                            .addComponent(cboSoPhieuChuaNhap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboSoPhieuDaNhap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnTim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cboThongTinNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSoPhieuDaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSoPhieuChuaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTongGiaTriNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThongTinNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnTim)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhieuXuat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhieuXuat)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tbNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ", "Số phiếu đã nhập", "Số phiếu chưa nhập", "Tổng giá trị nhập"
            }
        ));
        tbNhaCungCap.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbNhaCungCapMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbNhaCungCap);

        tbNhaCungCapPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Ngày tạo", "Ngày nhập", "Người lập", "Giá trị", "Trạng thái"
            }
        ));
        tbNhaCungCapPN.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tbNhaCungCapPN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void loadTableNhaCungCap(ArrayList<NhaCungCapModel> lncc){
        tbNCC.getDataVector().removeAllElements();
        for(int i=0; i < lncc.size(); i++){
            String[] ncc = {lncc.get(i).getMaNCC(), lncc.get(i).getTenNCC(), lncc.get(i).getSdtNCC(), lncc.get(i).getDiaChiNCC(), String.valueOf(lncc.get(i).getSoPhieuDaNhap()), String.valueOf(lncc.get(i).getSoPhieuChuaNhap()), String.valueOf(lncc.get(i).getTongGiaTriNhap())};
            tbNCC.addRow(ncc);
            tbNhaCungCap.setModel(tbNCC);
        }
    }
        
    public void loadTableNCCPN(ArrayList<PhieuNhapModel> lpn){
        tbNCCPN.getDataVector().removeAllElements();
        for(int i=0; i < lpn.size(); i++){
            String[] chpx = {lpn.get(i).getMaPhieuNhap(), lpn.get(i).getNgayTao(), lpn.get(i).getNgayNhap(), lpn.get(i).getMaND(), String.valueOf(lpn.get(i).getGiaTriNhap()), lpn.get(i).getTrangThai()};
            tbNCCPN.addRow(chpx);
            tbNhaCungCapPN.setModel(tbNCCPN);
        }
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        nccctl.doAddNhaCungCap();
    }//GEN-LAST:event_btnThemActionPerformed
    
    public NhaCungCapModel getNhaCungCapInput(){
       NhaCungCapModel ncc = new NhaCungCapModel();
       ncc.setMaNCC(txtMaNhaCungCap.getText().trim());
       ncc.setTenNCC(txtTenNhaCungCap.getText().trim());
       ncc.setDiaChiNCC(txtDiaChi.getText().trim());
       ncc.setSdtNCC(txtSoDienThoai.getText().trim());
       return ncc;
    }
    
    public void showMessage(String msg, boolean checkMsg){
        if(checkMsg){
            JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.ERROR_MESSAGE);
    }
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        resetInput();
        if(cboSoPhieuDaNhap.getSelectedIndex() == 0 && cboTongGiaTriNhap.getSelectedIndex() == 0 && cboSoPhieuChuaNhap.getSelectedIndex() == 0 && cboThongTinNCC.getSelectedIndex() == 0){
            nccctl.doSearchNhaCungCap("","");
        } else {
            if(cboSoPhieuDaNhap.getSelectedIndex() != 0){
                nccctl.doSearchNhaCungCap("so_phieu_da_nhap",cboSoPhieuDaNhap.getSelectedItem().toString().trim());
            }
            if(cboSoPhieuChuaNhap.getSelectedIndex() != 0){
                nccctl.doSearchNhaCungCap("so_phieu_chua_nhap",cboSoPhieuChuaNhap.getSelectedItem().toString().trim());
            }
            if(cboTongGiaTriNhap.getSelectedIndex() != 0){
                nccctl.doSearchNhaCungCap("tong_gia_tri_nhap",cboTongGiaTriNhap.getSelectedItem().toString().trim());
            }
            if(cboThongTinNCC.getSelectedIndex() != 0){
                if(null != cboThongTinNCC.getSelectedItem().toString().trim())switch (cboThongTinNCC.getSelectedItem().toString().trim()) {
                    case "Ma nha cung cap" -> nccctl.doSearchNhaCungCap("ma_ncc",txtTimKiemNCC.getText().trim());
                    case "Ten nha cung cap" -> nccctl.doSearchNhaCungCap("ten_ncc",txtTimKiemNCC.getText().trim());
                    case "SDT" -> nccctl.doSearchNhaCungCap("sdt",txtTimKiemNCC.getText().trim());
                    case "Dia chi" -> nccctl.doSearchNhaCungCap("dia_chi",txtTimKiemNCC.getText().trim());
                    default -> {
                    }
                }
            }
        }
        tbNCCPN.setRowCount(0);
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        nccctl.doUpdateNhaCungCap();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        nccctl.doDeleteNhaCungCap();
        btnLamMoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed
    
    public boolean xacNhanXoa(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }
    
    public void resetInput(){
        check = false;
        txtDiaChi.setText("");
        txtMaNhaCungCap.setText(" ");
        txtSoDienThoai.setText("");
        txtTenNhaCungCap.setText("");
        txtSoPhieuChuaNhap.setText(" ");
        txtSoPhieuDaNhap.setText(" ");
        txtTongGiaTriNhap.setText(" ");
    }
    
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        resetInput();
        tbNCC.setRowCount(0);
        tbNCCPN.setRowCount(0);
        nccctl.NhaCungCapPage();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void cboThongTinNCCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongTinNCCItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaNhap.setSelectedIndex(0);
        cboSoPhieuChuaNhap.setSelectedIndex(0);
        cboTongGiaTriNhap.setSelectedIndex(0);
    }//GEN-LAST:event_cboThongTinNCCItemStateChanged

    private void txtTimKiemNCCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemNCCFocusGained
        // TODO add your handling code here:
        cboSoPhieuDaNhap.setSelectedIndex(0);
        cboSoPhieuChuaNhap.setSelectedIndex(0);
        cboTongGiaTriNhap.setSelectedIndex(0);
    }//GEN-LAST:event_txtTimKiemNCCFocusGained

    private void cboTongGiaTriNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTongGiaTriNhapItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaNhap.setSelectedIndex(0);
        cboSoPhieuChuaNhap.setSelectedIndex(0);
        cboThongTinNCC.setSelectedIndex(0);
        //txtTimKiemCH.setText("");
    }//GEN-LAST:event_cboTongGiaTriNhapItemStateChanged

    private void cboSoPhieuDaNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoPhieuDaNhapItemStateChanged
        // TODO add your handling code here:
        cboTongGiaTriNhap.setSelectedIndex(0);
        cboSoPhieuChuaNhap.setSelectedIndex(0);
        cboThongTinNCC.setSelectedIndex(0);
        //txtTimKiemCH.setText("");
    }//GEN-LAST:event_cboSoPhieuDaNhapItemStateChanged

    private void cboSoPhieuChuaNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoPhieuChuaNhapItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaNhap.setSelectedIndex(0);
        cboThongTinNCC.setSelectedIndex(0);
        cboTongGiaTriNhap.setSelectedIndex(0);
    }//GEN-LAST:event_cboSoPhieuChuaNhapItemStateChanged

    private void tbNhaCungCapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhaCungCapMouseReleased
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        int col = 0;
        txtMaNhaCungCap.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col));
        txtTenNhaCungCap.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+1));
        txtSoDienThoai.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+2));
        txtDiaChi.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+3));
        txtSoPhieuDaNhap.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+4));
        txtSoPhieuChuaNhap.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+5));
        txtTongGiaTriNhap.setText(" "+(String)tbNhaCungCap.getValueAt(rowIndex,col+6));
        tbNCCPN.setRowCount(0);
        nccctl.NhaCungCapPNPage((String)tbNhaCungCap.getValueAt(rowIndex,col));
        check = true;
    }//GEN-LAST:event_tbNhaCungCapMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSoPhieuChuaNhap;
    private javax.swing.JComboBox<String> cboSoPhieuDaNhap;
    private javax.swing.JComboBox<String> cboThongTinNCC;
    private javax.swing.JComboBox<String> cboTongGiaTriNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaNhaCungCap;
    private javax.swing.JLabel lblPhieuXuat;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNhaCungCap;
    private javax.swing.JTable tbNhaCungCap;
    private javax.swing.JTable tbNhaCungCapPN;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JLabel txtMaNhaCungCap;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JLabel txtSoPhieuChuaNhap;
    private javax.swing.JLabel txtSoPhieuDaNhap;
    private javax.swing.JTextField txtTenNhaCungCap;
    private javax.swing.JTextField txtTimKiemNCC;
    private javax.swing.JLabel txtTongGiaTriNhap;
    // End of variables declaration//GEN-END:variables
}
