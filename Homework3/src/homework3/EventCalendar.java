/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author stephenthoen
 */
public class EventCalendar extends javax.swing.JFrame {

    ArrayList<String> runningEventList = new ArrayList<String>();
    
    /**
     * Creates new form EventCalendar
     */
    public EventCalendar() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextLocation = new javax.swing.JTextField();
        MonthCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DateCombo = new javax.swing.JComboBox();
        YearCombo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Event Manager");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 6, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Month", "Date", "Year"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 42, 673, 257));

        jLabel2.setText("New Event");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 311, -1, -1));

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 351, -1, -1));
        getContentPane().add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 345, 149, -1));

        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 398, -1, -1));
        getContentPane().add(TextLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 392, 149, -1));

        MonthCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MonthCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthComboActionPerformed(evt);
            }
        });
        getContentPane().add(MonthCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 347, 123, -1));

        jLabel5.setText("Month:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 351, -1, -1));

        jLabel6.setText("Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 386, -1, -1));

        jLabel7.setText("Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 420, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        getContentPane().add(DateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, -1));

        YearCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        getContentPane().add(YearCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 120, -1));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[] {TextName.getText().toString(), 
            TextLocation.getText().toString(),
            MonthCombo.getSelectedItem().toString(),
            DateCombo.getSelectedItem().toString(),
            YearCombo.getSelectedItem().toString()

        });
        
        
        String eventList = TextName.getText().toString()+ ", " + TextLocation.getText().toString() + ", " 
        + MonthCombo.getSelectedItem().toString() + ", " + DateCombo.getSelectedItem().toString() + ", " +
            YearCombo.getSelectedItem().toString();
        
        runningEventList.add(eventList);
        
        TextName.setText("");
        TextLocation.setText("");
        MonthCombo.setSelectedIndex(0);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void MonthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthComboActionPerformed
        // TODO add your handling code here:
        
        
        ArrayList<Integer> datelist = DateValidation.getDate(MonthCombo.getSelectedItem().toString(), 
                YearCombo.getSelectedItem().toString());
        
        //DateCombo.setModel(new ComboBoxMo);
        DateCombo.setModel(new javax.swing.DefaultComboBoxModel(datelist.toArray()));
        
    }//GEN-LAST:event_MonthComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        WriteReadFile.save(runningEventList);
        
        JOptionPane.showMessageDialog(null, "The file was saved Successfully!");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       Vector<Vector<String>> newvect = WriteReadFile.load();
       for(Vector<String> e : newvect)
           model.addRow(e);
       
       jTable1.setAutoCreateRowSorter(true);
       
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EventCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventCalendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DateCombo;
    private javax.swing.JComboBox MonthCombo;
    private javax.swing.JTextField TextLocation;
    private javax.swing.JTextField TextName;
    private javax.swing.JComboBox YearCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
