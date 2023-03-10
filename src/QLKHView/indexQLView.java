
package QLKHView;
import QLKHController.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class indexQLView extends javax.swing.JFrame {

    private static JButton btnQL;
    
    public indexQLView() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        btnBaoCaoThongKe.setBackground(new Color(255, 255, 255));
        btnNguoiDung.setBackground(new Color(255, 255, 255));
        btnSanPham.setBackground(new Color(255, 255, 255));
        btnDay.setBackground(new Color(255, 255, 255));
        btnPhieuNhap.setBackground(new Color(255, 255, 255));
        btnPhieuXuat.setBackground(new Color(255, 255, 255));
        btnNhaCungCap.setBackground(new Color(255, 255, 255));
        btnCuaHang.setBackground(new Color(255, 255, 255));
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/warehouse_logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        content = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnNguoiDung = new javax.swing.JButton();
        btnNhaCungCap = new javax.swing.JButton();
        btnDay = new javax.swing.JButton();
        lblKho = new javax.swing.JLabel();
        lblQuanLy = new javax.swing.JLabel();
        btnCuaHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnPhieuXuat = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnBaoCaoThongKe = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 70));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1800, 1060));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        header.setBackground(new java.awt.Color(255, 255, 255));

        btnNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNguoiDung.setText("Quản lý người dùng");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });

        btnNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhaCungCap.setText("Quản lý nhà cung cấp");
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });

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
        lblQuanLy.setText("QUẢN LÝ");

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

        btnBaoCaoThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBaoCaoThongKe.setText("Báo cáo, thống kê");
        btnBaoCaoThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(lblQuanLy)
                        .addGap(849, 849, 849))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(lblKho)
                        .addGap(539, 539, 539)
                        .addComponent(btnDangXuat)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(btnNguoiDung)
                        .addGap(18, 18, 18)
                        .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhaCungCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKho)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuanLy)
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        if(btnQL != null){
          btnQL.setBackground(Color.white);
          btnQL.setForeground(Color.black);
        }
        NguoiDungView qlnd = new NguoiDungView();
        qlnd.setSize(1800,600);
        qlnd.setLocation(0, 0);
        content.removeAll();
        content.add(qlnd,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51,102,255);
        btnNguoiDung.setBackground(cl);
        btnNguoiDung.setForeground(Color.white);
        btnQL = btnNguoiDung;
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuaHangActionPerformed
        if(btnQL != null){
           btnQL.setBackground(Color.white);
           btnQL.setForeground(Color.black);
        }
        CuaHangView qlch = new CuaHangView();
        qlch.setSize(1800,600);
        qlch.setLocation(0, 0);
        content.removeAll();
        content.add(qlch,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51,102,255);
        btnCuaHang.setBackground(cl);
        btnCuaHang.setForeground(Color.white);
        btnQL = btnCuaHang;
    }//GEN-LAST:event_btnCuaHangActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if(xacNhanDangXuat()){
            this.dispose();
            NguoiDungController.loginPage();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
       if(btnQL != null){
            btnQL.setBackground(Color.white);
            btnQL.setForeground(Color.black);
        }
        SanPhamView qlsp = new SanPhamView();
        qlsp.setSize(1800,600);
        qlsp.setLocation(0, 0);
        content.removeAll();
        content.add(qlsp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51,102,255);
        btnSanPham.setBackground(cl);
        btnSanPham.setForeground(Color.white);
        btnQL = btnSanPham;
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayActionPerformed
        if(btnQL != null){
           btnQL.setBackground(Color.white);
           btnQL.setForeground(Color.black);
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
        Color cl = new Color(51,102,255);
        btnDay.setBackground(cl);
        btnDay.setForeground(Color.white);
        btnQL = btnDay;
    }//GEN-LAST:event_btnDayActionPerformed

    private void btnPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuXuatActionPerformed
       if(btnQL != null){
            btnQL.setBackground(Color.white);
            btnQL.setForeground(Color.black);
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
        Color cl = new Color(51,102,255);
        btnPhieuXuat.setBackground(cl);
        btnPhieuXuat.setForeground(Color.white);
        btnQL = btnPhieuXuat;
    }//GEN-LAST:event_btnPhieuXuatActionPerformed

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
       if(btnQL != null){
            btnQL.setBackground(Color.white);
            btnQL.setForeground(Color.black);
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
        Color cl = new Color(51,102,255);
        btnPhieuNhap.setBackground(cl);
        btnPhieuNhap.setForeground(Color.white);
        btnQL = btnPhieuNhap;
    }//GEN-LAST:event_btnPhieuNhapActionPerformed

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        if(btnQL != null){
            btnQL.setBackground(Color.white);
            btnQL.setForeground(Color.black);
        }
        NhaCungCapView qlncc = new NhaCungCapView();
        qlncc.setSize(1800,600);
        qlncc.setLocation(0, 0);
        content.removeAll();
        content.add(qlncc,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51,102,255);
        btnNhaCungCap.setBackground(cl);
        btnNhaCungCap.setForeground(Color.white);
        btnQL = btnNhaCungCap;
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnBaoCaoThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoThongKeActionPerformed
        // TODO add your handling code here:
        if(btnQL != null){
            btnQL.setBackground(Color.white);
            btnQL.setForeground(Color.black);
        }
        ThongKe bctk = new ThongKe();
        bctk.setSize(1800,650);
        bctk.setLocation(0, 0);
        content.removeAll();
        content.add(bctk,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Color cl = new Color(51,102,255);
        btnBaoCaoThongKe.setBackground(cl);
        btnBaoCaoThongKe.setForeground(Color.white);
        btnQL = btnBaoCaoThongKe;
    }//GEN-LAST:event_btnBaoCaoThongKeActionPerformed
    
    public static boolean xacNhanDangXuat(){
        int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return input == JOptionPane.YES_OPTION;
    }
    /**
     */
    public static void runIndexQL() {
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
            java.util.logging.Logger.getLogger(indexQLView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indexQLView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indexQLView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indexQLView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new indexQLView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoCaoThongKe;
    private javax.swing.JButton btnCuaHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JButton btnPhieuXuat;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblKho;
    private javax.swing.JLabel lblQuanLy;
    // End of variables declaration//GEN-END:variables
}
