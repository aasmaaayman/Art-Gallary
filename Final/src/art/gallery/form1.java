/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import static art.gallery.form0.s;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author clt
 */
public class form1 extends javax.swing.JFrame {
 static Customer cust ;
    /**
     * Creates new form form1
     */
    public form1() {
        initComponents();
          this.setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 530));
        setPreferredSize(new java.awt.Dimension(890, 530));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(247, 247, 199));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(123, 80, 38));
        jLabel1.setText("Customer Login  ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 30, 307, 40);

        jLabel2.setBackground(new java.awt.Color(247, 247, 199));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 80, 38));
        jLabel2.setText(" Password");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 230, 130, 40);

        jButton1.setBackground(new java.awt.Color(123, 80, 38));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButton1.setForeground(new java.awt.Color(247, 247, 199));
        jButton1.setText("Verify");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(247, 247, 199), new java.awt.Color(247, 247, 199)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 350, 180, 50);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 160, 340, 35);

        jLabel3.setBackground(new java.awt.Color(247, 247, 199));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 80, 38));
        jLabel3.setText("Name ");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 160, 82, 39);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 230, 340, 35);

        jButton3.setBackground(new java.awt.Color(123, 80, 38));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButton3.setForeground(new java.awt.Color(247, 247, 199));
        jButton3.setText("Return Back");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(247, 247, 199), new java.awt.Color(247, 247, 199)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 350, 180, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/check-mark.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 350, 40, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/left-arrow.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 350, 40, 50);

        jButton7.setBackground(new java.awt.Color(123, 80, 38));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/audio-speaker-on.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(60, 10, 40, 40);

        jButton6.setBackground(new java.awt.Color(123, 80, 38));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/volume-off-indicator 32.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 10, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/038_003_Nacionalna_hudojestvena_galeria.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        form1 f = new form1();
        String UserName = jTextField2.getText();
        String Password = jPasswordField1.getText();
          cust = new Customer();
        if(UserName.equals("") || Password.equals(""))
        {
            JOptionPane.showMessageDialog(f,"Please Complete Your Information","Empty",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        boolean verify=cust.Login(UserName, Password);
        if(verify==true){
          JOptionPane.showMessageDialog(f,"Succeeded","Logged In",JOptionPane.INFORMATION_MESSAGE);
          load l=new load();
            try {
                l.load_customer();
            } catch (IOException ex) {
                Logger.getLogger(form1.class.getName()).log(Level.SEVERE, null, ex);
            }
            cust=l.custmer.get(UserName);
form7 f7 = new form7();
f7.setVisible(true);
this.setVisible(false);
        }
                else
                    JOptionPane.showMessageDialog(f,"Error","Wrong UserName or Password",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        form6 f6 = new form6();
        f6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          s.Pflag=false;
        s.play();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
             s.Cflag=false;
        s.play();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
