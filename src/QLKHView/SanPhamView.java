
package QLKHView;

import QLKHController.*;
import QLKHModel.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SanPhamView extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    public boolean check;
    private static SanPhamController spctl;
    final String headerSP[] = {"Mã","Tên","Loại","Hãng","Màu","Kiểu dáng","Chất liệu","Giá nhập","Giá xuất","Đơn vị","Số lượng tồn"};
    final DefaultTableModel tbSP = new DefaultTableModel(headerSP, 0);
    final String headerCTSP[] = {"Mã dãy","Số lượng","Ghi chú"};
    final DefaultTableModel tbCTSP = new DefaultTableModel(headerCTSP, 0);
    public SanPhamView() {
        initComponents();
        spctl = new  SanPhamController(this);
        spctl.SanPhamPage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTenSanPham = new javax.swing.JLabel();
        lblHang = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        lblMaSanPham = new javax.swing.JLabel();
        cboLoai = new javax.swing.JComboBox<>();
        spnGiaXuat = new javax.swing.JSpinner();
        lblDonGia = new javax.swing.JLabel();
        lblMaLoai = new javax.swing.JLabel();
        txtHang = new javax.swing.JTextField();
        txtMaSanPham = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnGiaNhap = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        lblDonVi = new javax.swing.JLabel();
        cboDonVi = new javax.swing.JComboBox<>();
        txtMauSac = new javax.swing.JTextField();
        lblMauSac = new javax.swing.JLabel();
        txtKieuDang = new javax.swing.JTextField();
        txtChatLieu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblChatLieu = new javax.swing.JLabel();
        lblKieuDang = new javax.swing.JLabel();
        txtSoLuongTon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietSP = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel2 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblMaLoai3 = new javax.swing.JLabel();
        cboKhoangGia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboSoLuongTon = new javax.swing.JComboBox<>();
        lblMaLoai1 = new javax.swing.JLabel();
        cboLoaiTK = new javax.swing.JComboBox<>();
        lblMaLoai2 = new javax.swing.JLabel();
        txtTimKiemSP = new javax.swing.JTextField();
        cboThongTinSP = new javax.swing.JComboBox<>();
        cboGia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMaSanPhamCT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSanPham.setText("Quản lý sản phẩm");

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

        btnXoa2.setBackground(new java.awt.Color(51, 102, 255));
        btnXoa2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa2.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa2.setText("Xóa");
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2btnXoaActionPerformed(evt);
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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addComponent(btnXoa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnThem)
                .addGap(25, 25, 25)
                .addComponent(btnSua)
                .addGap(25, 25, 25)
                .addComponent(btnXoa2)
                .addGap(25, 25, 25)
                .addComponent(btnLamMoi)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTenSanPham.setBackground(new java.awt.Color(255, 255, 255));
        lblTenSanPham.setText("Tên sản phẩm:");

        lblHang.setText("Hãng:");

        txtTenSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaSanPham.setText("Mã sản phẩm:");

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Xe dap", "Phu tung" }));
        cboLoai.setBorder(null);

        spnGiaXuat.setBorder(null);

        lblDonGia.setText("Giá xuất:");

        lblMaLoai.setText("Loại:");

        txtHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHangActionPerformed(evt);
            }
        });

        txtMaSanPham.setText(" ");
        txtMaSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Giá nhập:");

        spnGiaNhap.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaSanPham)
                    .addComponent(lblMaLoai)
                    .addComponent(lblTenSanPham)
                    .addComponent(lblHang)
                    .addComponent(jLabel4)
                    .addComponent(lblDonGia))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHang, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnGiaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaSanPham)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSanPham)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLoai)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHang)
                    .addComponent(txtHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonGia)
                    .addComponent(spnGiaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDonVi.setText("Đơn vị:");

        cboDonVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Chiec", "Thung" }));
        cboDonVi.setBorder(null);

        txtMauSac.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMauSac.setText("Màu sắc:");

        txtKieuDang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtChatLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Số lượng tồn:");

        lblChatLieu.setText("Chất liệu:");

        lblKieuDang.setText("Kiểu dáng:");

        txtSoLuongTon.setText(" ");
        txtSoLuongTon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMauSac)
                    .addComponent(lblKieuDang)
                    .addComponent(lblChatLieu)
                    .addComponent(jLabel2)
                    .addComponent(lblDonVi))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKieuDang, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtChatLieu))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonVi)
                    .addComponent(cboDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMauSac)
                    .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKieuDang)
                    .addComponent(txtKieuDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChatLieu)
                    .addComponent(txtChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoLuongTon))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSanPham))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Loại", "Hãng", "Màu", "Kiểu dáng", "Chất liệu", "Giá nhập", "Giá xuất", "Đơn vị", "Số lượng tồn"
            }
        ));
        tbSanPham.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbSanPham);

        tbChiTietSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã dãy", "Số lượng", "Ghi chú"
            }
        ));
        tbChiTietSP.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tbChiTietSP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTim.setBackground(new java.awt.Color(51, 102, 255));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaLoai3.setText("Khoảng giá:");

        cboKhoangGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "< 1.000.000", "1.000.000 - 2.999.999", "3.000.000 - 6.999.999", "7.000.000 - 9.999.999", "10.000.000 - 14.999.999", "> 15.000.000" }));
        cboKhoangGia.setBorder(null);
        cboKhoangGia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKhoangGiaItemStateChanged(evt);
            }
        });

        jLabel3.setText("Số lượng tồn:");

        cboSoLuongTon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboSoLuongTon.setBorder(null);
        cboSoLuongTon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoLuongTonItemStateChanged(evt);
            }
        });

        lblMaLoai1.setText("Loại:");

        cboLoaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Xe dap", "Phu tung" }));
        cboLoaiTK.setBorder(null);
        cboLoaiTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiTKItemStateChanged(evt);
            }
        });

        lblMaLoai2.setText("Thông tin khác:");

        txtTimKiemSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimKiemSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemSPFocusGained(evt);
            }
        });

        cboThongTinSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ma san pham", "Ten san pham", "Hang", "Mau sac", "Kieu dang", "Chat lieu" }));
        cboThongTinSP.setBorder(null);
        cboThongTinSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongTinSPItemStateChanged(evt);
            }
        });

        cboGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gia nhap", "Gia xuat" }));
        cboGia.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaLoai2)
                    .addComponent(lblMaLoai1)
                    .addComponent(lblMaLoai3)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboLoaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboThongTinSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboSoLuongTon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboKhoangGia, javax.swing.GroupLayout.Alignment.LEADING, 0, 181, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(cboGia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboKhoangGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaLoai3)
                    .addComponent(cboGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaLoai1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThongTinSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaLoai2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CHI TIẾT SẢN PHẨM");

        txtMaSanPhamCT.setText(" ");
        txtMaSanPhamCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSanPhamCT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSanPhamCT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadTableSanPham(ArrayList<SanPhamModel> lsp){
        tbSP.getDataVector().removeAllElements();
        for(int i=0; i<lsp.size(); i++){
            String[] sp = {lsp.get(i).getMaSP(), lsp.get(i).getTenSP(), lsp.get(i).getLoai(), lsp.get(i).getHang(), lsp.get(i).getMauSac(), lsp.get(i).getKieuDang(), lsp.get(i).getChatLieu(), Integer.toString(lsp.get(i).getGiaNhap()), Integer.toString(lsp.get(i).getGiaXuat()), lsp.get(i).getDonVi(), Integer.toString(lsp.get(i).getSoLuong())};
            tbSP.addRow(sp);
            tbSanPham.setModel(tbSP);
        }
    }
    public void loadTableChiTietSP(ArrayList<DayModel> ctsp){
        for(int i=0; i < ctsp.size(); i++){
            String[] dt = {ctsp.get(i).getMaDay(), Integer.toString(ctsp.get(i).getDanhSachSP().get(0).getSoLuong()), ctsp.get(i).getDanhSachSP().get(0).getGhiChu()};
            tbCTSP.addRow(dt);
            tbChiTietSP.setModel(tbCTSP);
        }
    }
    private void txtHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHangActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        spctl.doAddSanPham();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        resetInput();
        if(cboKhoangGia.getSelectedIndex() == 0 && cboLoaiTK.getSelectedIndex() == 0 && cboSoLuongTon.getSelectedIndex() == 0 && cboThongTinSP.getSelectedIndex() == 0){
            spctl.doSearchSanPham("","");
        } else {
            if(cboLoaiTK.getSelectedIndex() != 0){
                spctl.doSearchSanPham("loai_sp",cboLoaiTK.getSelectedItem().toString().trim());
            }
            if(cboSoLuongTon.getSelectedIndex() != 0){
                spctl.doSearchSanPham("so_luong_ton",cboSoLuongTon.getSelectedItem().toString().trim());
            }
            if(cboKhoangGia.getSelectedIndex() != 0){
                if(cboGia.getSelectedIndex() == 0){
                    spctl.doSearchSanPham("gia_nhap",cboKhoangGia.getSelectedItem().toString().trim());
                } else spctl.doSearchSanPham("gia_xuat",cboKhoangGia.getSelectedItem().toString().trim());
            }
            if(cboThongTinSP.getSelectedIndex() != 0){
                if(null != cboThongTinSP.getSelectedItem().toString().trim())switch (cboThongTinSP.getSelectedItem().toString().trim()) {
                    case "Ma san pham" -> spctl.doSearchSanPham("ma_sp",txtTimKiemSP.getText().trim());
                    case "Ten san pham" -> spctl.doSearchSanPham("ten_sp",txtTimKiemSP.getText().trim());
                    case "Hang" -> spctl.doSearchSanPham("hang",txtTimKiemSP.getText().trim());
                    case "Mau sac" -> spctl.doSearchSanPham("mau_sac",txtTimKiemSP.getText().trim());
                    case "Kieu dang" -> spctl.doSearchSanPham("kieu_dang",txtTimKiemSP.getText().trim());
                    case "Chat lieu" -> spctl.doSearchSanPham("chat_lieu",txtTimKiemSP.getText().trim());
                    default -> {
                    }
                }
            }
        }
        tbCTSP.setRowCount(0);
        txtMaSanPhamCT.setText(" ");
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoa2btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2btnXoaActionPerformed
        // TODO add your handling code here:
        spctl.doDeleteSanPham();
        btnLamMoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoa2btnXoaActionPerformed
    
    public boolean xacNhanXoa(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        spctl.doUpdateSanPham();
    }//GEN-LAST:event_btnSuaActionPerformed

    public void resetInput(){
        check = false;
        txtChatLieu.setText("");
        txtHang.setText("");
        txtKieuDang.setText("");
        txtMaSanPham.setText(" ");
        txtMauSac.setText("");
        txtTenSanPham.setText("");
        txtSoLuongTon.setText(" ");
        txtMaSanPhamCT.setText(" ");
        cboDonVi.setSelectedIndex(0);
        cboLoai.setSelectedIndex(0);
        spnGiaXuat.setValue(0);
        spnGiaNhap.setValue(0);
    }
    
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        resetInput();
        cboKhoangGia.setSelectedIndex(0);
        cboLoaiTK.setSelectedIndex(0);
        cboSoLuongTon.setSelectedIndex(0);
        cboThongTinSP.setSelectedIndex(0);
        tbSP.setRowCount(0);
        tbCTSP.setRowCount(0);
        spctl.SanPhamPage();
    }//GEN-LAST:event_btnLamMoiActionPerformed
    public void showMessage(String msg, boolean checkMsg){
        if(checkMsg){
            JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.ERROR_MESSAGE);
    }
    
    public SanPhamModel getSanPhamInput(){
       SanPhamModel sp = new SanPhamModel();
       sp.setMaSP(txtMaSanPham.getText().trim());
       sp.setTenSP(txtTenSanPham.getText().trim());
       sp.setLoai(cboLoai.getSelectedItem().toString().trim());
       sp.setHang(txtHang.getText().trim());
       sp.setGiaXuat((int) spnGiaXuat.getValue());
       sp.setGiaNhap((int) spnGiaNhap.getValue());
       sp.setDonVi(cboDonVi.getSelectedItem().toString().trim());
       sp.setMauSac(txtMauSac.getText().trim());
       sp.setKieuDang(txtKieuDang.getText().trim());
       sp.setChatLieu(txtChatLieu.getText().trim());
       return sp;
    }
    private void tbSanPhamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseReleased
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        int col = 0;
        txtMaSanPham.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col));
        txtTenSanPham.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+1));
        cboLoai.setSelectedItem((String)tbSanPham.getValueAt(rowIndex,col+2));
        txtHang.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+3));
        txtMauSac.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+4));
        txtKieuDang.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+5));
        txtChatLieu.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+6));
        spnGiaNhap.setValue(Integer.valueOf((String)tbSanPham.getValueAt(rowIndex,col+7)));
        spnGiaXuat.setValue(Integer.valueOf((String)tbSanPham.getValueAt(rowIndex,col+8)));
        cboDonVi.setSelectedItem((String)tbSanPham.getValueAt(rowIndex,col+9));
        txtSoLuongTon.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col+10));
        txtMaSanPhamCT.setText(" " + (String)tbSanPham.getValueAt(rowIndex,col));
        tbCTSP.setRowCount(0);
        spctl.SanPhamCTPage(txtMaSanPhamCT.getText().trim());
        check = true;
    }//GEN-LAST:event_tbSanPhamMouseReleased

    private void cboKhoangGiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKhoangGiaItemStateChanged
        // TODO add your handling code here:
        cboLoaiTK.setSelectedIndex(0);
        cboSoLuongTon.setSelectedIndex(0);
        cboThongTinSP.setSelectedIndex(0);
    }//GEN-LAST:event_cboKhoangGiaItemStateChanged

    private void cboSoLuongTonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoLuongTonItemStateChanged
        // TODO add your handling code here:
        cboLoaiTK.setSelectedIndex(0);
        cboKhoangGia.setSelectedIndex(0);
        cboThongTinSP.setSelectedIndex(0);
    }//GEN-LAST:event_cboSoLuongTonItemStateChanged

    private void cboLoaiTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiTKItemStateChanged
        // TODO add your handling code here:
        cboKhoangGia.setSelectedIndex(0);
        cboSoLuongTon.setSelectedIndex(0);
        cboThongTinSP.setSelectedIndex(0);
    }//GEN-LAST:event_cboLoaiTKItemStateChanged

    private void cboThongTinSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongTinSPItemStateChanged
        // TODO add your handling code here:
        cboKhoangGia.setSelectedIndex(0);
        cboSoLuongTon.setSelectedIndex(0);
        cboLoaiTK.setSelectedIndex(0);
    }//GEN-LAST:event_cboThongTinSPItemStateChanged

    private void txtTimKiemSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemSPFocusGained
        // TODO add your handling code here:
        cboKhoangGia.setSelectedIndex(0);
        cboSoLuongTon.setSelectedIndex(0);
        cboLoaiTK.setSelectedIndex(0);
    }//GEN-LAST:event_txtTimKiemSPFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JComboBox<String> cboDonVi;
    private javax.swing.JComboBox<String> cboGia;
    private javax.swing.JComboBox<String> cboKhoangGia;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JComboBox<String> cboLoaiTK;
    private javax.swing.JComboBox<String> cboSoLuongTon;
    private javax.swing.JComboBox<String> cboThongTinSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChatLieu;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblHang;
    private javax.swing.JLabel lblKieuDang;
    private javax.swing.JLabel lblMaLoai;
    private javax.swing.JLabel lblMaLoai1;
    private javax.swing.JLabel lblMaLoai2;
    private javax.swing.JLabel lblMaLoai3;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblMauSac;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JSpinner spnGiaNhap;
    private javax.swing.JSpinner spnGiaXuat;
    private javax.swing.JTable tbChiTietSP;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtChatLieu;
    private javax.swing.JTextField txtHang;
    private javax.swing.JTextField txtKieuDang;
    private javax.swing.JLabel txtMaSanPham;
    private javax.swing.JLabel txtMaSanPhamCT;
    private javax.swing.JTextField txtMauSac;
    private javax.swing.JLabel txtSoLuongTon;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTimKiemSP;
    // End of variables declaration//GEN-END:variables
}
