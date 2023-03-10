
package QLKHView;
import QLKHController.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class indexNVTNView extends javax.swing.JFrame {

    private static JButton btnNVTN;

    public indexNVTNView() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        btnSanPham.setBackground(new Color(255, 255, 255));
        btnNhaCungCap.setBackground(new Color(255, 255, 255));
        btnPhieuNhap.setBackground(new Color(255, 255, 255));
        btnPhieuXuat.setBackground(new Color(255, 255, 255));
        btnCuaHang.setBackground(new Color(255, 255, 255));
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/warehouse_logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNhaCungCap = new javax.swing.JButton();
        lblKho = new javax.swing.JLabel();
        lblQuanLy = new javax.swing.JLabel();
        btnCuaHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnPhieuXuat = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 70));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 900));

        btnNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhaCungCap.setText("Quản lý nhà cung cấp");
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });

        lblKho.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblKho.setText("QUẢN LÝ KHO XE ĐẠP");

        lblQuanLy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuanLy.setText("NHÂN VIÊN TIẾP NHẬN");

        btnCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCuaHang.setText("Quản lý cửa hàng");
        btnCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuaHangActionPerformed(evt);
            }
        });

        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSanPham.setText("Quản lý sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPhieuXuat.setText("Quản lý phiếu xuất");
        btnPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuXuatActionPerformed(evt);
            }
        });

        btnPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPhieuNhap.setText("Quản lý phiếu nhập");
        btnPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuNhapActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 0, 0));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1798, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(747, 747, 747)
                .addComponent(lblKho)
                .addGap(568, 568, 568)
                .addComponent(btnDangXuat)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuanLy)
                        .addGap(782, 782, 782))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhaCungCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuanLy)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        if(btnNVTN != null){
            btnNVTN.setBackground(null);
            btnNVTN.setForeground(Color.black);
        }
        NhaCungCapView qlncc = new NhaCungCapView();
        qlncc.setSize(1800,600);
        qlncc.setLocation(0, 0);
        content.removeAll();
        content.add(qlncc,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnNhaCungCap.setBackground(cl);
        btnNhaCungCap.setForeground(Color.white);
        btnNVTN = btnNhaCungCap;
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuaHangActionPerformed
        if(btnNVTN != null){
            btnNVTN.setBackground(null);
            btnNVTN.setForeground(Color.black);
        }
        CuaHangView qlch = new CuaHangView();
        qlch.setSize(1800,600);
        qlch.setLocation(0, 0);
        content.removeAll();
        content.add(qlch,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnCuaHang.setBackground(cl);
        btnCuaHang.setForeground(Color.white);
        btnNVTN = btnCuaHang;
    }//GEN-LAST:event_btnCuaHangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        if(btnNVTN != null){
            btnNVTN.setBackground(null);
            btnNVTN.setForeground(Color.black);
        }
        SanPhamView qlsp = new SanPhamView();
        qlsp.setSize(1800,600);
        qlsp.setLocation(0, 0);
        content.removeAll();
        content.add(qlsp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnSanPham.setBackground(cl);
        btnSanPham.setForeground(Color.white);
        btnNVTN = btnSanPham;
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuXuatActionPerformed
        if(btnNVTN != null){
            btnNVTN.setBackground(null);
            btnNVTN.setForeground(Color.black);
        }
        PhieuXuatView qlpx = new PhieuXuatView();
        TimSanPhamView tsp = new TimSanPhamView();
        qlpx.setSize(1450,600);
        qlpx.setLocation(0, 0);
        tsp.setSize(350,600);
        tsp.setLocation(1450,0);
        content.removeAll();
        content.add(qlpx,BorderLayout.WEST);
        content.add(tsp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnPhieuXuat.setBackground(cl);
        btnPhieuXuat.setForeground(Color.white);
        btnNVTN = btnPhieuXuat;
    }//GEN-LAST:event_btnPhieuXuatActionPerformed

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
        if(btnNVTN != null){
            btnNVTN.setBackground(null);
            btnNVTN.setForeground(Color.black);
        }
        PhieuNhapView qlpn = new PhieuNhapView();
        TimSanPhamView tsp = new TimSanPhamView();
        qlpn.setSize(1450,600);
        qlpn.setLocation(0, 0);
        tsp.setSize(350,600);
        tsp.setLocation(1450,0);
        content.removeAll();
        content.add(qlpn,BorderLayout.WEST);
        content.add(tsp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnPhieuNhap.setBackground(cl);
        btnPhieuNhap.setForeground(Color.white);
        btnNVTN = btnPhieuNhap;
    }//GEN-LAST:event_btnPhieuNhapActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if(xacNhanDangXuat()){
            this.dispose();
            NguoiDungController.loginPage();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    public static boolean xacNhanDangXuat(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }
    
    /**
     */
    public static void runIndexNVTN() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(indexNVTNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indexNVTNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indexNVTNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indexNVTNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new indexNVTNView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuaHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JButton btnPhieuXuat;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKho;
    private javax.swing.JLabel lblQuanLy;
    // End of variables declaration//GEN-END:variables
}
