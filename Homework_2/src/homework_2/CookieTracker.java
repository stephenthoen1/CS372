/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.*;

/**
 *
 * @author stephenthoen
 */
public class CookieTracker extends javax.swing.JFrame {

    
    ArrayList<Integer> tm = new ArrayList<Integer>();
    ArrayList<Integer> sc = new ArrayList<Integer>();
    ArrayList<Integer> cc = new ArrayList<Integer>();
    
    /**
     * Creates new form CookieTracker
     */
    public CookieTracker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ThinTextF = new javax.swing.JTextField();
        SamoasTextF = new javax.swing.JTextField();
        ChipTextF = new javax.swing.JTextField();
        ThinSubmit = new javax.swing.JButton();
        SamoasSubmit = new javax.swing.JButton();
        ChipsSubmit = new javax.swing.JButton();
        ThinTotal = new javax.swing.JLabel();
        SamoasTotal = new javax.swing.JLabel();
        ChipTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TotalSales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cookie Sales Tracker");

        jLabel2.setText("Thin Mints");

        jLabel3.setText("Samoas");

        jLabel4.setText("Chocolate Chips");

        jLabel5.setText("Sold");

        jLabel6.setText("Sold");

        jLabel7.setText("Sold");

        ThinSubmit.setText("Submit");
        ThinSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThinSubmitActionPerformed(evt);
            }
        });

        SamoasSubmit.setText("Submit");
        SamoasSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamoasSubmitActionPerformed(evt);
            }
        });

        ChipsSubmit.setText("Submit");
        ChipsSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsSubmitActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Sales =   $");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChipTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(SamoasTextF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ThinTextF, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ThinSubmit)
                                                .addComponent(SamoasSubmit, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(ChipsSubmit, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ThinTotal)
                                            .addComponent(SamoasTotal)
                                            .addComponent(ChipTotal)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(TotalSales))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ThinTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThinSubmit)
                    .addComponent(ThinTotal))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SamoasTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SamoasSubmit)
                    .addComponent(SamoasTotal))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ChipTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChipsSubmit)
                    .addComponent(ChipTotal))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TotalSales))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThinSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThinSubmitActionPerformed
        // TODO add your handling code here:
        tm.add(Integer.parseInt(this.ThinTextF.getText()));
        String totalthin = String.valueOf(CookiePricing.thinMintTotal(tm));
        
        ThinTotal.setText(totalthin);
        ThinTextF.setText("");
        
        String totalprice = String.valueOf(CookiePricing.TotalSales(tm, sc, cc));
        
        TotalSales.setText(totalprice);
        
        
           
    }//GEN-LAST:event_ThinSubmitActionPerformed

    private void SamoasSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamoasSubmitActionPerformed
        // TODO add your handling code here:
        sc.add(Integer.parseInt(this.SamoasTextF.getText()));
        
        String total_s = String.valueOf(CookiePricing.SamoasCookieTotal(sc));
        SamoasTotal.setText(total_s);
        SamoasTextF.setText("");
        
        String totalprice = String.valueOf(CookiePricing.TotalSales(tm, sc, cc));
        
        TotalSales.setText(totalprice);
        
    }//GEN-LAST:event_SamoasSubmitActionPerformed

    private void ChipsSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsSubmitActionPerformed
        // TODO add your handling code here:
        cc.add(Integer.parseInt(this.ChipTextF.getText()));
        
        String total_cc = String.valueOf(CookiePricing.ChocoChipTotal(cc));
        ChipTotal.setText(total_cc);
        ChipTextF.setText("");
        String totalprice = String.valueOf(CookiePricing.TotalSales(tm, sc, cc));
        
        TotalSales.setText(totalprice);
    }//GEN-LAST:event_ChipsSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CookieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CookieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CookieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CookieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CookieTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChipTextF;
    private javax.swing.JLabel ChipTotal;
    private javax.swing.JButton ChipsSubmit;
    private javax.swing.JButton SamoasSubmit;
    private javax.swing.JTextField SamoasTextF;
    private javax.swing.JLabel SamoasTotal;
    private javax.swing.JButton ThinSubmit;
    private javax.swing.JTextField ThinTextF;
    private javax.swing.JLabel ThinTotal;
    private javax.swing.JLabel TotalSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
