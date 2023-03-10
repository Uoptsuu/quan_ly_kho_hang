
package QLKHView;

import QLKHController.*;
import QLKHModel.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CuaHangView extends javax.swing.JPanel {

    public boolean checkCH;
    private static CuaHangController chctl;
    final String headerCH[] = {"Mã cửa hàng","Tên cửa hàng","Số điện thoại","Địa chỉ","Số phiếu đã xuất","Số phiếu chưa xuất","Tổng giá trị đã xuất"};
    final DefaultTableModel tbCH = new DefaultTableModel(headerCH, 0);
    final String headerCHPX[] = {"Mã phiếu","Ngày lập","Ngày xuất","Người lập","Giá trị","Trạng thái"};
    final DefaultTableModel tbCHPX = new DefaultTableModel(headerCHPX, 0);
    private static final long serialVersionUID = 1L;
    public CuaHangView() {
        initComponents();
        chctl = new CuaHangController(this);
        chctl.CuaHangPage();
    }

    public void loadTableCuaHang(ArrayList<CuaHangModel> lch){
        tbCH.getDataVector().removeAllElements();
        for(int i=0; i < lch.size(); i++){
            String[] ch = {lch.get(i).getMaCH(), lch.get(i).getTenCH(), lch.get(i).getSdtCH(), lch.get(i).getDiaChiCH(), String.valueOf(lch.get(i).getSoPhieuDaXuat()), String.valueOf(lch.get(i).getSoPhieuChuaXuat()), String.valueOf(lch.get(i).getTongGiaTriXuat())};
            tbCH.addRow(ch);
            tbCuaHang.setModel(tbCH);
        }
    }
    
    public void loadTableCHPX(ArrayList<PhieuXuatModel> lpx){
        tbCHPX.getDataVector().removeAllElements();
        for(int i=0; i < lpx.size(); i++){
            String[] chpx = {lpx.get(i).getMaPhieuXuat(), lpx.get(i).getNgayTao(), lpx.get(i).getNgayXuat(), lpx.get(i).getMaND(), String.valueOf(lpx.get(i).getGiaTriXuat()), lpx.get(i).getTrangThai()};
            tbCHPX.addRow(chpx);
            tbCuaHangPX.setModel(tbCHPX);
        }
    }

    public void resetInput(){
        checkCH = false;
        txtDiaChi.setText("");
        txtMaCuaHang.setText(" ");
        txtSoDienThoai.setText("");
        txtTenCuaHang.setText("");
        txtGiaTriXuat.setText(" ");
        txtSoPhieuDaXuat.setText(" ");
        txtSoPhieuChuaXuat.setText(" ");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCuaHang = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCuaHangPX = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSoPhieuDaXuat = new javax.swing.JLabel();
        txtGiaTriXuat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtTenCuaHang = new javax.swing.JTextField();
        lblMaCuaHang = new javax.swing.JLabel();
        lblTenCuaHang = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSoPhieuChuaXuat = new javax.swing.JLabel();
        txtMaCuaHang = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        cboThongTinCH = new javax.swing.JComboBox<>();
        txtTimKiemCH = new javax.swing.JTextField();
        cboTongGiaTriXuat = new javax.swing.JComboBox<>();
        cboSoPhieuDaXuat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboSoPhieuChuaXuat = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));

        tbCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã cửa hàng", "Tên cửa hàng", "Số điện thoại", "Địa chỉ", "Số phiếu đã xuất", "Số phiếu chưa xuất", "Tổng giá trị đã xuất"
            }
        ));
        tbCuaHang.setGridColor(new java.awt.Color(204, 204, 204));
        tbCuaHang.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbCuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbCuaHangMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbCuaHang);
        if (tbCuaHang.getColumnModel().getColumnCount() > 0) {
            tbCuaHang.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbCuaHang.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        tbCuaHangPX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu xuất", "Ngày lập", "Ngày xuất", "Người lập", "Giá trị", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCuaHangPX.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tbCuaHangPX);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Quản lý cửa hàng");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Phiếu đã xuất:");

        txtSoPhieuDaXuat.setText(" ");
        txtSoPhieuDaXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGiaTriXuat.setText(" ");
        txtGiaTriXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Tổng giá trị đã xuất:");

        txtDiaChi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTenCuaHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaCuaHang.setText("Mã cửa hàng:");

        lblTenCuaHang.setText("Tên cửa hàng:");

        lblSoDienThoai.setText("Số điện thoại:");

        lblDiaChi.setText("Địa chỉ:");

        jLabel7.setText("Phiếu chưa xuất:");

        txtSoPhieuChuaXuat.setText(" ");
        txtSoPhieuChuaXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaCuaHang.setBackground(new java.awt.Color(255, 255, 255));
        txtMaCuaHang.setText(" ");
        txtMaCuaHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenCuaHang)
                    .addComponent(lblMaCuaHang)
                    .addComponent(lblSoDienThoai)
                    .addComponent(lblDiaChi))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDiaChi)
                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenCuaHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoPhieuDaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPhieuChuaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaTriXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaCuaHang)
                            .addComponent(txtMaCuaHang))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoPhieuDaXuat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenCuaHang)
                            .addComponent(txtTenCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDienThoai)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChi))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSoPhieuChuaXuat))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtGiaTriXuat))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Số phiếu đã xuất:");

        jLabel3.setText("Tổng giá trị xuất:");

        jLabel1.setText("Thông tin khác:");

        btnTim.setBackground(new java.awt.Color(51, 102, 255));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        cboThongTinCH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Ma cua hang", "Ten cua hang", "SDT", "Dia chi" }));
        cboThongTinCH.setBorder(null);
        cboThongTinCH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongTinCHItemStateChanged(evt);
            }
        });

        txtTimKiemCH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimKiemCH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemCHFocusGained(evt);
            }
        });

        cboTongGiaTriXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboTongGiaTriXuat.setBorder(null);
        cboTongGiaTriXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTongGiaTriXuatItemStateChanged(evt);
            }
        });

        cboSoPhieuDaXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboSoPhieuDaXuat.setBorder(null);
        cboSoPhieuDaXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoPhieuDaXuatItemStateChanged(evt);
            }
        });

        jLabel8.setText("Số phiếu chưa xuất:");

        cboSoPhieuChuaXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboSoPhieuChuaXuat.setBorder(null);
        cboSoPhieuChuaXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoPhieuChuaXuatItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTimKiemCH)
                                .addComponent(cboTongGiaTriXuat, 0, 165, Short.MAX_VALUE)
                                .addComponent(cboSoPhieuChuaXuat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboSoPhieuDaXuat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(cboThongTinCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSoPhieuDaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSoPhieuChuaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTongGiaTriXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThongTinCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim)
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        chctl.doAddCuaHang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        chctl.doUpdateCuaHang();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        chctl.doDeleteCuaHang();
        btnLamMoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        resetInput();
        tbCHPX.setRowCount(0);
        chctl.CuaHangPage();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tbCuaHangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCuaHangMouseReleased
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        int col = 0;
        txtMaCuaHang.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col));
        txtTenCuaHang.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+1));
        txtSoDienThoai.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+2));
        txtDiaChi.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+3));
        txtSoPhieuDaXuat.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+4));
        txtSoPhieuChuaXuat.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+5));
        txtGiaTriXuat.setText(" " + (String)tbCuaHang.getValueAt(rowIndex,col+6));
        tbCHPX.setRowCount(0);
        chctl.CuaHangPXPage((String)tbCuaHang.getValueAt(rowIndex,col));
        checkCH = true;
    }//GEN-LAST:event_tbCuaHangMouseReleased

    private void cboThongTinCHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongTinCHItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaXuat.setSelectedIndex(0);
        cboSoPhieuChuaXuat.setSelectedIndex(0);
        cboTongGiaTriXuat.setSelectedIndex(0);
    }//GEN-LAST:event_cboThongTinCHItemStateChanged

    private void cboTongGiaTriXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTongGiaTriXuatItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaXuat.setSelectedIndex(0);
        cboSoPhieuChuaXuat.setSelectedIndex(0);
        cboThongTinCH.setSelectedIndex(0);
        //txtTimKiemCH.setText("");
    }//GEN-LAST:event_cboTongGiaTriXuatItemStateChanged

    private void cboSoPhieuDaXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoPhieuDaXuatItemStateChanged
        // TODO add your handling code here:
        cboTongGiaTriXuat.setSelectedIndex(0);
        cboSoPhieuChuaXuat.setSelectedIndex(0);
        cboThongTinCH.setSelectedIndex(0);
        //txtTimKiemCH.setText("");
    }//GEN-LAST:event_cboSoPhieuDaXuatItemStateChanged

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        resetInput();
        if(cboSoPhieuDaXuat.getSelectedIndex() == 0 && cboTongGiaTriXuat.getSelectedIndex() == 0 && cboSoPhieuChuaXuat.getSelectedIndex() == 0 && cboThongTinCH.getSelectedIndex() == 0){
            chctl.doSearchCuaHang("","");
        } else {
            if(cboSoPhieuDaXuat.getSelectedIndex() != 0){
                chctl.doSearchCuaHang("so_phieu_da_xuat",cboSoPhieuDaXuat.getSelectedItem().toString().trim());
            }
            if(cboSoPhieuChuaXuat.getSelectedIndex() != 0){
                chctl.doSearchCuaHang("so_phieu_chua_xuat",cboSoPhieuChuaXuat.getSelectedItem().toString().trim());
            }
            if(cboTongGiaTriXuat.getSelectedIndex() != 0){
                chctl.doSearchCuaHang("tong_gia_tri_xuat",cboTongGiaTriXuat.getSelectedItem().toString().trim());
            }
            if(cboThongTinCH.getSelectedIndex() != 0){
                if(null != cboThongTinCH.getSelectedItem().toString().trim())switch (cboThongTinCH.getSelectedItem().toString().trim()) {
                    case "Ma cua hang" -> chctl.doSearchCuaHang("ma_ch",txtTimKiemCH.getText().trim());
                    case "Ten cua hang" -> chctl.doSearchCuaHang("ten_ch",txtTimKiemCH.getText().trim());
                    case "SDT" -> chctl.doSearchCuaHang("sdt",txtTimKiemCH.getText().trim());
                    case "Dia chi" -> chctl.doSearchCuaHang("dia_chi",txtTimKiemCH.getText().trim());
                    default -> {
                    }
                }
            }
        }
        tbCHPX.setRowCount(0);
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtTimKiemCHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemCHFocusGained
        // TODO add your handling code here:
        cboSoPhieuDaXuat.setSelectedIndex(0);
        cboSoPhieuChuaXuat.setSelectedIndex(0);
        cboTongGiaTriXuat.setSelectedIndex(0);
    }//GEN-LAST:event_txtTimKiemCHFocusGained

    private void cboSoPhieuChuaXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoPhieuChuaXuatItemStateChanged
        // TODO add your handling code here:
        cboSoPhieuDaXuat.setSelectedIndex(0);
        cboThongTinCH.setSelectedIndex(0);
        cboTongGiaTriXuat.setSelectedIndex(0);
    }//GEN-LAST:event_cboSoPhieuChuaXuatItemStateChanged
    public CuaHangModel getCuaHangInput(){
       CuaHangModel ch = new CuaHangModel();
       ch.setMaCH(txtMaCuaHang.getText().trim());
       ch.setTenCH(txtTenCuaHang.getText().trim());
       ch.setDiaChiCH(txtDiaChi.getText().trim());
       ch.setSdtCH(txtSoDienThoai.getText().trim());
       return ch;
    }
    
    public void showMessage(String msg, boolean checkMsg){
        if(checkMsg){
            JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.ERROR_MESSAGE);
    }    
    
    public boolean xacNhanXoa(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSoPhieuChuaXuat;
    private javax.swing.JComboBox<String> cboSoPhieuDaXuat;
    private javax.swing.JComboBox<String> cboThongTinCH;
    private javax.swing.JComboBox<String> cboTongGiaTriXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaCuaHang;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenCuaHang;
    private javax.swing.JTable tbCuaHang;
    private javax.swing.JTable tbCuaHangPX;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JLabel txtGiaTriXuat;
    private javax.swing.JLabel txtMaCuaHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JLabel txtSoPhieuChuaXuat;
    private javax.swing.JLabel txtSoPhieuDaXuat;
    private javax.swing.JTextField txtTenCuaHang;
    private javax.swing.JTextField txtTimKiemCH;
    // End of variables declaration//GEN-END:variables
}
