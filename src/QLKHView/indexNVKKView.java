
package QLKHView;
import QLKHController.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class indexNVKKView extends javax.swing.JFrame {

    private static JButton btnNVKT;
    public indexNVKKView() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        btnSanPham.setBackground(new Color(255, 255, 255));
        btnDay.setBackground(new Color(255, 255, 255));
        btnPhieuNhap.setBackground(new Color(255, 255, 255));
        btnPhieuXuat.setBackground(new Color(255, 255, 255));
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/warehouse_logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnDay = new javax.swing.JButton();
        lblKho = new javax.swing.JLabel();
        lblQuanLy = new javax.swing.JLabel();
        btnSanPham = new javax.swing.JButton();
        btnPhieuXuat = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 70));
        setUndecorated(true);

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDay.setText("Quản lý dãy");
        btnDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDayActionPerformed(evt);
            }
        });

        lblKho.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblKho.setText("QUẢN LÝ KHO XE ĐẠP");

        lblQuanLy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuanLy.setText("NHÂN VIÊN KIỂM KÊ");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(746, 746, 746)
                .addComponent(lblKho)
                .addGap(539, 539, 539)
                .addComponent(btnDangXuat)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuanLy)
                        .addGap(801, 801, 801))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(517, 517, 517))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKho)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuanLy)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayActionPerformed
        if(btnNVKT != null){
            btnNVKT.setBackground(null);
            btnNVKT.setForeground(Color.black);
        }
        DayView qld = new DayView();
        TimSanPhamView tsp = new TimSanPhamView();
        qld.setSize(1450,600);
        qld.setLocation(0, 0);
        tsp.setSize(350,600);
        tsp.setLocation(1450,0);
        content.removeAll();
        content.add(qld,BorderLayout.WEST);
        content.add(tsp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51, 102, 255);
        btnDay.setBackground(cl);
        btnDay.setForeground(Color.white);
        btnNVKT = btnDay;
    }//GEN-LAST:event_btnDayActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        if(btnNVKT != null){
            btnNVKT.setBackground(null);
            btnNVKT.setForeground(Color.black);
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
        btnNVKT = btnSanPham;
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuXuatActionPerformed
        if(btnNVKT != null){
            btnNVKT.setBackground(null);
            btnNVKT.setForeground(Color.black);
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
        btnNVKT = btnPhieuXuat;
    }//GEN-LAST:event_btnPhieuXuatActionPerformed

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
        if(btnNVKT != null){
            btnNVKT.setBackground(null);
            btnNVKT.setForeground(Color.black);
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
        btnNVKT = btnPhieuNhap;
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
    public static void runIndexNVKK() {
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
            java.util.logging.Logger.getLogger(indexNVKKView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indexNVKKView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indexNVKKView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indexNVKKView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new indexNVKKView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JButton btnPhieuXuat;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKho;
    private javax.swing.JLabel lblQuanLy;
    // End of variables declaration//GEN-END:variables
}
