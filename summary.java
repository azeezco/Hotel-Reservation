/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class summary extends javax.swing.JFrame {

    /**
     * Creates new form summary
     */
    public summary() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bill = new javax.swing.JTextField();
        phone_no1 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        checkin1 = new javax.swing.JTextField();
        checkout1 = new javax.swing.JTextField();
        adults1 = new javax.swing.JTextField();
        children1 = new javax.swing.JTextField();
        roomtype = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        fullname1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Akma Signatures Hotel");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 162, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 26, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(24, 26, 28));
        jLabel2.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 162, 232));
        jLabel2.setText("<html>FULLNAME<b> <b>:</b></b></html>");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

        jLabel3.setBackground(new java.awt.Color(24, 26, 28));
        jLabel3.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 162, 232));
        jLabel3.setText("BILL :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, 40));

        jLabel5.setBackground(new java.awt.Color(24, 26, 28));
        jLabel5.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 162, 232));
        jLabel5.setText("PHONE NUMBER :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 40));

        jLabel6.setBackground(new java.awt.Color(24, 26, 28));
        jLabel6.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 162, 232));
        jLabel6.setText("ADDRESS :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 40));

        jLabel7.setBackground(new java.awt.Color(24, 26, 28));
        jLabel7.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 162, 232));
        jLabel7.setText("CHECK-IN :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 40));

        jLabel8.setBackground(new java.awt.Color(24, 26, 28));
        jLabel8.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 162, 232));
        jLabel8.setText("CHECK-OUT :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 40));

        jLabel9.setBackground(new java.awt.Color(24, 26, 28));
        jLabel9.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 162, 232));
        jLabel9.setText("ADULT(S) :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 40));

        jLabel11.setBackground(new java.awt.Color(24, 26, 28));
        jLabel11.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 162, 232));
        jLabel11.setText("CHILD(REN) :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 40));

        jLabel12.setBackground(new java.awt.Color(24, 26, 28));
        jLabel12.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 162, 232));
        jLabel12.setText("ROOM TYPE :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, 40));

        jLabel13.setBackground(new java.awt.Color(24, 26, 28));
        jLabel13.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 162, 232));
        jLabel13.setText("ROOM NO :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 40));

        jLabel14.setBackground(new java.awt.Color(24, 26, 28));
        jLabel14.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 162, 232));
        jLabel14.setText("RATE/NIGHT :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 140, 40));

        bill.setEditable(false);
        bill.setBackground(new java.awt.Color(24, 26, 28));
        bill.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setBorder(null);
        jPanel2.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 530, 40));

        phone_no1.setEditable(false);
        phone_no1.setBackground(new java.awt.Color(24, 26, 28));
        phone_no1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        phone_no1.setForeground(new java.awt.Color(255, 255, 255));
        phone_no1.setBorder(null);
        jPanel2.add(phone_no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 440, 40));

        address1.setEditable(false);
        address1.setBackground(new java.awt.Color(24, 26, 28));
        address1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        address1.setForeground(new java.awt.Color(255, 255, 255));
        address1.setBorder(null);
        jPanel2.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 490, 40));

        checkin1.setEditable(false);
        checkin1.setBackground(new java.awt.Color(24, 26, 28));
        checkin1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        checkin1.setForeground(new java.awt.Color(255, 255, 255));
        checkin1.setBorder(null);
        checkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkin1ActionPerformed(evt);
            }
        });
        jPanel2.add(checkin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 490, 40));

        checkout1.setEditable(false);
        checkout1.setBackground(new java.awt.Color(24, 26, 28));
        checkout1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        checkout1.setForeground(new java.awt.Color(255, 255, 255));
        checkout1.setBorder(null);
        jPanel2.add(checkout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 470, 40));

        adults1.setEditable(false);
        adults1.setBackground(new java.awt.Color(24, 26, 28));
        adults1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        adults1.setForeground(new java.awt.Color(255, 255, 255));
        adults1.setBorder(null);
        jPanel2.add(adults1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 490, 40));

        children1.setEditable(false);
        children1.setBackground(new java.awt.Color(24, 26, 28));
        children1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        children1.setForeground(new java.awt.Color(255, 255, 255));
        children1.setBorder(null);
        jPanel2.add(children1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 470, 40));

        roomtype.setEditable(false);
        roomtype.setBackground(new java.awt.Color(24, 26, 28));
        roomtype.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        roomtype.setForeground(new java.awt.Color(255, 255, 255));
        roomtype.setBorder(null);
        jPanel2.add(roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 460, 40));

        roomno.setEditable(false);
        roomno.setBackground(new java.awt.Color(24, 26, 28));
        roomno.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        roomno.setForeground(new java.awt.Color(255, 255, 255));
        roomno.setBorder(null);
        jPanel2.add(roomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 480, 40));

        rate.setEditable(false);
        rate.setBackground(new java.awt.Color(24, 26, 28));
        rate.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        rate.setForeground(new java.awt.Color(255, 255, 255));
        rate.setBorder(null);
        jPanel2.add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 470, 40));

        fullname1.setEditable(false);
        fullname1.setBackground(new java.awt.Color(24, 26, 28));
        fullname1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        fullname1.setForeground(new java.awt.Color(255, 255, 255));
        fullname1.setBorder(null);
        fullname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullname1ActionPerformed(evt);
            }
        });
        jPanel2.add(fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 480, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 640, 550));

        jLabel1.setBackground(new java.awt.Color(0, 162, 232));
        jLabel1.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 26, 28));
        jLabel1.setText(" 4/4 Reservation Summary");
        jLabel1.setToolTipText("4/4 Reservation Summary");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkin1ActionPerformed

    private void fullname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullname1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fullname1ActionPerformed

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
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1;
    private javax.swing.JTextField adults1;
    private javax.swing.JTextField bill;
    private javax.swing.JTextField checkin1;
    private javax.swing.JTextField checkout1;
    private javax.swing.JTextField children1;
    private javax.swing.JTextField fullname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phone_no1;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField roomtype;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("akmaicon.png")));
    }
}
