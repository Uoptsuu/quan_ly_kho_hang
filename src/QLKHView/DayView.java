
package QLKHView;
import QLKHController.*;
import QLKHModel.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DayView extends javax.swing.JPanel {

    public boolean checkD;
    private static DayController dctl;
    final String headerD[] = {"Mã dãy","Sức chứa","Khu","Trống"};
    final DefaultTableModel tbD = new DefaultTableModel(headerD, 0);
    public boolean checkCTD;
    final String headerCTD[] = {"Mã sản phẩm","Số lượng","Ghi chú"};
    final DefaultTableModel tbCTD = new DefaultTableModel(headerCTD, 0);
    private static final long serialVersionUID = 1L;
    public DayView() {
        initComponents();
        dctl = new DayController(this);
        dctl.DayPage();
        txtSoLuongCu.setVisible(false);
    }
    public void loadTableDay(ArrayList<DayModel> ld){
        tbD.getDataVector().removeAllElements();
        for(int i=0; i<ld.size(); i++){
            String[] d = {ld.get(i).getMaDay(), Integer.toString(ld.get(i).getSucChua()), ld.get(i).getKhu(), Integer.toString(ld.get(i).getTrong())};
            tbD.addRow(d);
            tbDay.setModel(tbD);
        }
    }
    public void loadTableChiTietDay(ArrayList<SanPhamModel> ctd){
        tbCTD.getDataVector().removeAllElements();
        for(int i=0; i < ctd.size(); i++){
            String[] d = {ctd.get(i).getMaSP(), Integer.toString(ctd.get(i).getSoLuong()), ctd.get(i).getGhiChu()};
            tbCTD.addRow(d);
            tbChiTietDay.setModel(tbCTD);
        }
    }
    
    public void resetInput(){
        checkD = false;
        txtMaDay.setText(" ");
        spnSucChua.setValue(0);
        txtTrong.setText(" ");
        txtMaDayCT.setText(" ");
        tbCTD.setRowCount(0); 
        cboKhu.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTimD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboTimKiemKhu = new javax.swing.JComboBox<>();
        cboTimKiemSucChua = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lblMaDay = new javax.swing.JLabel();
        lblMaKhu = new javax.swing.JLabel();
        cboKhu = new javax.swing.JComboBox<>();
        lblSucChua = new javax.swing.JLabel();
        spnSucChua = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        txtTrong = new javax.swing.JLabel();
        txtMaDay = new javax.swing.JLabel();
        txtSoLuongCu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnThemD = new javax.swing.JButton();
        btnSuaD = new javax.swing.JButton();
        btnXoaD = new javax.swing.JButton();
        btnLamMoiD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDay = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        spnSoLuong = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        btnThemCTD = new javax.swing.JButton();
        btnSuaCTD = new javax.swing.JButton();
        btnXoaCTD = new javax.swing.JButton();
        btnLamMoiCTD = new javax.swing.JButton();
        txtMaDayCT = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbChiTietDay = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 344));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Quản lý dãy");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimD.setBackground(new java.awt.Color(51, 102, 255));
        btnTimD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimD.setForeground(new java.awt.Color(255, 255, 255));
        btnTimD.setText("Tìm");
        btnTimD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDActionPerformed(evt);
            }
        });

        jLabel7.setText("Khu:");

        jLabel8.setText("Sức chứa:");

        cboTimKiemKhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Xe dap", "Phu tung" }));
        cboTimKiemKhu.setBorder(null);
        cboTimKiemKhu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTimKiemKhuItemStateChanged(evt);
            }
        });

        cboTimKiemSucChua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Tang dan", "Giam dan", "Nhieu nhat", "It nhat" }));
        cboTimKiemSucChua.setBorder(null);
        cboTimKiemSucChua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTimKiemSucChuaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboTimKiemSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cboTimKiemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnTimD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTimKiemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTimKiemSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimD)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaDay.setText("Mã dãy:");

        lblMaKhu.setText("Khu:");

        cboKhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Phu tung", "Xe dap" }));
        cboKhu.setBorder(null);

        lblSucChua.setText("Sức chứa:");

        spnSucChua.setBorder(null);

        jLabel1.setText("Trống:");

        txtTrong.setText(" ");
        txtTrong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaDay.setText(" ");
        txtMaDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSoLuongCu.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSucChua)
                    .addComponent(lblMaDay)
                    .addComponent(lblMaKhu)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboKhu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaDay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSoLuongCu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDay)
                    .addComponent(txtMaDay))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKhu)
                    .addComponent(cboKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucChua)
                    .addComponent(spnSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongCu))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemD.setBackground(new java.awt.Color(51, 102, 255));
        btnThemD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemD.setForeground(new java.awt.Color(255, 255, 255));
        btnThemD.setText("Thêm");
        btnThemD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDActionPerformed(evt);
            }
        });

        btnSuaD.setBackground(new java.awt.Color(51, 102, 255));
        btnSuaD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaD.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaD.setText("Sửa");
        btnSuaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDActionPerformed(evt);
            }
        });

        btnXoaD.setBackground(new java.awt.Color(51, 102, 255));
        btnXoaD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaD.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaD.setText("Xóa");
        btnXoaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDActionPerformed(evt);
            }
        });

        btnLamMoiD.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoiD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiD.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoiD.setText("Làm mới");
        btnLamMoiD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoiD, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemD)
                .addGap(32, 32, 32)
                .addComponent(btnSuaD)
                .addGap(32, 32, 32)
                .addComponent(btnXoaD)
                .addGap(32, 32, 32)
                .addComponent(btnLamMoiD)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbDay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã dãy", "Sức chứa", "Khu", "Trống"
            }
        ));
        tbDay.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDayMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbDay);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Chi tiết dãy");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtGhiChu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Ghi chú:");

        jLabel3.setText("Số lượng:");

        jLabel2.setText("Mã sản phẩm:");

        txtMaSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        spnSoLuong.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(69, 69, 69)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThemCTD.setBackground(new java.awt.Color(51, 102, 255));
        btnThemCTD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemCTD.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCTD.setText("Thêm");
        btnThemCTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTDActionPerformed(evt);
            }
        });

        btnSuaCTD.setBackground(new java.awt.Color(51, 102, 255));
        btnSuaCTD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaCTD.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCTD.setText("Sửa");
        btnSuaCTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTDActionPerformed(evt);
            }
        });

        btnXoaCTD.setBackground(new java.awt.Color(51, 102, 255));
        btnXoaCTD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaCTD.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCTD.setText("Xóa");
        btnXoaCTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTDActionPerformed(evt);
            }
        });

        btnLamMoiCTD.setBackground(new java.awt.Color(51, 102, 255));
        btnLamMoiCTD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiCTD.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoiCTD.setText("Làm mới");
        btnLamMoiCTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiCTDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoiCTD, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnThemCTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaCTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaCTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnThemCTD)
                .addGap(32, 32, 32)
                .addComponent(btnSuaCTD)
                .addGap(32, 32, 32)
                .addComponent(btnXoaCTD)
                .addGap(30, 30, 30)
                .addComponent(btnLamMoiCTD)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtMaDayCT.setText(" ");
        txtMaDayCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaDayCT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaDayCT))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tbChiTietDay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Số lượng", "Ghi chú"
            }
        ));
        tbChiTietDay.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbChiTietDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbChiTietDayMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbChiTietDay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDActionPerformed
        // TODO add your handling code here:
        dctl.doAddDay();
    }//GEN-LAST:event_btnThemDActionPerformed

    private void btnTimDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDActionPerformed
        // TODO add your handling code here:
        btnLamMoiCTDActionPerformed(evt);
        resetInput();
        if(!"*".equals(cboTimKiemKhu.getSelectedItem().toString())){
            dctl.doSearchDay("khu",cboTimKiemKhu.getSelectedItem().toString());
        }
        if(!"*".equals(cboTimKiemSucChua.getSelectedItem().toString())){
            dctl.doSearchDay("trong",cboTimKiemSucChua.getSelectedItem().toString());
        }
    }//GEN-LAST:event_btnTimDActionPerformed

    private void btnXoaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDActionPerformed
        // TODO add your handling code here:
        dctl.doDeleteDay();
        btnLamMoiDActionPerformed(evt);
    }//GEN-LAST:event_btnXoaDActionPerformed

    private void btnSuaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDActionPerformed
        // TODO add your handling code here:
        dctl.doUpdateDay();
    }//GEN-LAST:event_btnSuaDActionPerformed

    private void btnLamMoiDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiDActionPerformed
        // TODO add your handling code here:
        resetInput();
        dctl.DayPage();
        btnLamMoiCTDActionPerformed(evt);
    }//GEN-LAST:event_btnLamMoiDActionPerformed

    public DayModel getDayInput(){
       DayModel d = new DayModel();
       d.setMaDay(txtMaDay.getText().trim());
       d.setKhu(cboKhu.getSelectedItem().toString().trim());
       d.setSucChua((int) spnSucChua.getValue());
       return d;
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
    
    private void btnThemCTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTDActionPerformed
        // TODO add your handling code here:
        dctl.doAddChiTietDay(txtMaDayCT.getText().trim());
    }//GEN-LAST:event_btnThemCTDActionPerformed

    private void btnSuaCTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTDActionPerformed
        // TODO add your handling code here:
        dctl.doUpdateChiTietDay(txtMaDayCT.getText().trim());
    }//GEN-LAST:event_btnSuaCTDActionPerformed

    public int soLuongCu() {
        return Integer.parseInt(txtSoLuongCu.getText().trim());
    }
    
    private void btnXoaCTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTDActionPerformed
        // TODO add your handling code here:
        dctl.doDeleteChiTietDay(txtMaDayCT.getText().trim(),txtMaSanPham.getText().trim());
        btnLamMoiCTDActionPerformed(evt);

    }//GEN-LAST:event_btnXoaCTDActionPerformed

    private void btnLamMoiCTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiCTDActionPerformed
        // TODO add your handling code here:
        txtMaSanPham.setEnabled(true);
        tbCTD.setRowCount(0);
        dctl.DayCTPage(txtMaDayCT.getText().trim(),"");
        checkCTD = false;
        txtMaSanPham.setText("");
        spnSoLuong.setValue(0);
        txtGhiChu.setText("");
        txtSoLuongCu.setText("");
    }//GEN-LAST:event_btnLamMoiCTDActionPerformed

    private void cboTimKiemKhuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTimKiemKhuItemStateChanged
        // TODO add your handling code here:
        cboTimKiemSucChua.setSelectedIndex(0);
    }//GEN-LAST:event_cboTimKiemKhuItemStateChanged

    private void cboTimKiemSucChuaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTimKiemSucChuaItemStateChanged
        // TODO add your handling code here:
        cboTimKiemKhu.setSelectedIndex(0);
    }//GEN-LAST:event_cboTimKiemSucChuaItemStateChanged

    private void tbDayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDayMouseReleased
    // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int rowIndex = target.getSelectedRow();
        txtMaDay.setText(" " + (String)tbDay.getValueAt(rowIndex,0));
        spnSucChua.setValue(Integer.valueOf((String)tbDay.getValueAt(rowIndex,1)));
        cboKhu.setSelectedItem((String)tbDay.getValueAt(rowIndex,2));
        txtTrong.setText(" "+ (String)tbDay.getValueAt(rowIndex,3));
        txtMaDayCT.setText(" " + (String)tbDay.getValueAt(rowIndex,0));
        txtMaSanPham.setEnabled(true);
        txtMaSanPham.setText("");
        spnSoLuong.setValue(0);
        txtGhiChu.setText("");
        txtSoLuongCu.setText("");
        tbCTD.setRowCount(0);
        dctl.DayCTPage((String)tbDay.getValueAt(rowIndex,0),"");
        checkD = true;
        checkCTD = false;
    }//GEN-LAST:event_tbDayMouseReleased

    private void tbChiTietDayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietDayMouseReleased
        // TODO add your handling code here:
        if (checkD == true){
            JTable target = (JTable) evt.getSource();
            int rowIndexCTD = target.getSelectedRow();
            txtMaSanPham.setText(" " + (String)tbChiTietDay.getValueAt(rowIndexCTD,0));
            spnSoLuong.setValue(Integer.valueOf((String)tbChiTietDay.getValueAt(rowIndexCTD,1)));
            txtGhiChu.setText((String)tbChiTietDay.getValueAt(rowIndexCTD,2));
            txtSoLuongCu.setText(" " + (String)tbChiTietDay.getValueAt(rowIndexCTD,1));
            txtMaSanPham.setEnabled(false);
            checkCTD = true;     
        }
    }//GEN-LAST:event_tbChiTietDayMouseReleased

    public SanPhamModel getChiTietDayInput(){
       SanPhamModel sp = new SanPhamModel();
       sp.setMaSP(txtMaSanPham.getText().trim());
       sp.setSoLuong((int)spnSoLuong.getValue());
       sp.setGhiChu(txtGhiChu.getText().trim());
       return sp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoiCTD;
    private javax.swing.JButton btnLamMoiD;
    private javax.swing.JButton btnSuaCTD;
    private javax.swing.JButton btnSuaD;
    private javax.swing.JButton btnThemCTD;
    private javax.swing.JButton btnThemD;
    private javax.swing.JButton btnTimD;
    private javax.swing.JButton btnXoaCTD;
    private javax.swing.JButton btnXoaD;
    private javax.swing.JComboBox<String> cboKhu;
    private javax.swing.JComboBox<String> cboTimKiemKhu;
    private javax.swing.JComboBox<String> cboTimKiemSucChua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMaDay;
    private javax.swing.JLabel lblMaKhu;
    private javax.swing.JLabel lblSucChua;
    private javax.swing.JSpinner spnSoLuong;
    private javax.swing.JSpinner spnSucChua;
    private javax.swing.JTable tbChiTietDay;
    private javax.swing.JTable tbDay;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JLabel txtMaDay;
    private javax.swing.JLabel txtMaDayCT;
    private javax.swing.JTextField txtMaSanPham;
    public javax.swing.JLabel txtSoLuongCu;
    private javax.swing.JLabel txtTrong;
    // End of variables declaration//GEN-END:variables
}
