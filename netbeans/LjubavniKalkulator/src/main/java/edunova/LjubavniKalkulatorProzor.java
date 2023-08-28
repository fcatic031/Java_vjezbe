/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova;

import javax.swing.JLabel;

/**
 *
 * @author FILIP
 */
public class LjubavniKalkulatorProzor extends javax.swing.JFrame {

    /**
     * Creates new form LjubavniKalkulator
     */
    public LjubavniKalkulatorProzor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGlavni = new javax.swing.JButton();
        txtIme1 = new javax.swing.JTextField();
        txtIme2 = new javax.swing.JTextField();
        lblBrojevi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBrojevi1 = new javax.swing.JLabel();
        lblBrojevi2 = new javax.swing.JLabel();
        lblBrojevi3 = new javax.swing.JLabel();
        lblBrojevi4 = new javax.swing.JLabel();
        lblBrojevi5 = new javax.swing.JLabel();
        lblBrojevi6 = new javax.swing.JLabel();
        lblBrojevi7 = new javax.swing.JLabel();
        lblBrojevi8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));

        btnGlavni.setBackground(new java.awt.Color(153, 255, 255));
        btnGlavni.setForeground(new java.awt.Color(255, 51, 51));
        btnGlavni.setText("LJUBAV?");
        btnGlavni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlavniActionPerformed(evt);
            }
        });

        txtIme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIme2ActionPerformed(evt);
            }
        });

        lblBrojevi.setForeground(new java.awt.Color(255, 0, 0));
        lblBrojevi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi.setText(" ");
        lblBrojevi.setToolTipText("");
        lblBrojevi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        lblBrojevi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText(" ");

        lblBrojevi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi1.setText(" ");

        lblBrojevi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi2.setText(" ");

        lblBrojevi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi3.setText(" ");

        lblBrojevi4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi4.setText(" ");

        lblBrojevi5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi5.setText(" ");

        lblBrojevi6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi6.setText(" ");

        lblBrojevi7.setText(" ");

        lblBrojevi8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrojevi8.setText(" ");

        jLabel2.setText("Prvo ime");

        jLabel3.setText("Drugo ime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIme2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBrojevi, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(lblBrojevi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojevi8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtIme1)
                                    .addGap(45, 45, 45))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(119, 119, 119)))
                            .addComponent(btnGlavni)
                            .addGap(49, 49, 49)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGlavni)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addComponent(lblBrojevi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrojevi8)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIme2ActionPerformed
        
    }//GEN-LAST:event_txtIme2ActionPerformed

    private void btnGlavniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlavniActionPerformed
        JLabel[] lbls = {lblBrojevi,lblBrojevi1,lblBrojevi2,lblBrojevi3,lblBrojevi4,lblBrojevi5,lblBrojevi6,lblBrojevi7,lblBrojevi8};
        int x = LjubavniKalkulator.LjubavniPostotak(txtIme1.getText(), txtIme2.getText(),lbls);
        String s = String.valueOf(x);
        //lblBrojevi.setText(s);
        //lblBrojevi7.setText(s + "%");
        //lblBrojevi.setText("1\n2\n3\n4");
        
        
        
    }//GEN-LAST:event_btnGlavniActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGlavni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBrojevi;
    private javax.swing.JLabel lblBrojevi1;
    private javax.swing.JLabel lblBrojevi2;
    private javax.swing.JLabel lblBrojevi3;
    private javax.swing.JLabel lblBrojevi4;
    private javax.swing.JLabel lblBrojevi5;
    private javax.swing.JLabel lblBrojevi6;
    private javax.swing.JLabel lblBrojevi7;
    private javax.swing.JLabel lblBrojevi8;
    private javax.swing.JTextField txtIme1;
    private javax.swing.JTextField txtIme2;
    // End of variables declaration//GEN-END:variables
}
