
package QLKHView;
import QLKHController.*;
import QLKHModel.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TimSanPhamView extends javax.swing.JPanel {

    final String headerSPTK[] = {"Mã sản phẩm","Tên sản phẩm"};
    final DefaultTableModel tbSPTK = new DefaultTableModel(headerSPTK,0);
    private static final long serialVersionUID = 1L;
    public TimSanPhamView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtTimSP = new javax.swing.JTextField();
        btnTimSP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSanPhamTimKiem = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Tìm SP:");

        txtTimSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimSP.setBackground(new java.awt.Color(51, 102, 255));
        btnTimSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimSP.setText("Tìm");
        btnTimSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSPActionPerformed(evt);
            }
        });

        tbSanPhamTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã SP", "Tên SP"
            }
        ));
        tbSanPhamTimKiem.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane3.setViewportView(tbSanPhamTimKiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimSP, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSPActionPerformed
        // TODO add your handling code here:
        new SanPhamController(this).doSearchSanPham2(txtTimSP.getText().trim());
    }//GEN-LAST:event_btnTimSPActionPerformed
    
    public void loadTableTimKiemSanPham(ArrayList<SanPhamModel> tksp){
        tbSPTK.getDataVector().removeAllElements();
        for(int i=0; i < tksp.size(); i++){
            String[] d = {tksp.get(i).getMaSP(), tksp.get(i).getTenSP()};
            tbSPTK.addRow(d);
            tbSanPhamTimKiem.setModel(tbSPTK);
        }
    }
    
    public void showMessage(String msg, boolean checkMsg){
        if(checkMsg){
            JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(this, msg,"Thông báo", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimSP;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbSanPhamTimKiem;
    private javax.swing.JTextField txtTimSP;
    // End of variables declaration//GEN-END:variables
}
