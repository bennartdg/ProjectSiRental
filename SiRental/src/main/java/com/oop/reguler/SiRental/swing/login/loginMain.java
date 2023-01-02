/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.reguler.SiRental.swing.login;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import com.oop.reguler.SiRental.swing.landingpage.landingPage;
//import sirental.Login.loginAdmin;

/**
 *
 * @author ME1
 */
public class loginMain extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public loginMain() {
       initComponents();
       this.setLocationRelativeTo(null);
    }
    
    public void close(){
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    leftPage = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    rightPage = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    Login = new javax.swing.JLabel();
    welcome = new javax.swing.JLabel();
    btnAdmin = new javax.swing.JButton();
    btnMember = new javax.swing.JButton();
    btnCustomer = new javax.swing.JButton();
    btnBack = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setUndecorated(true);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    leftPage.setBackground(new java.awt.Color(255, 255, 255));
    leftPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\ITENAS\\OOP\\cobaSIRental\\src\\main\\java\\sirental\\Resources\\car icon.png")); // NOI18N
    leftPage.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 520, 440));

    getContentPane().add(leftPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 440));

    rightPage.setBackground(new java.awt.Color(255, 0, 70));
    rightPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("X");
    jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel2MouseClicked(evt);
      }
    });
    rightPage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 29));

    Login.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
    Login.setForeground(new java.awt.Color(255, 255, 255));
    Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Login.setText("Login");
    rightPage.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, 41));

    welcome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    welcome.setForeground(new java.awt.Color(255, 255, 255));
    welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    welcome.setText("Selamat datang Customer!");
    rightPage.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, -1));

    btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnAdmin.setText("ADMIN");
    btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAdmin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAdminActionPerformed(evt);
      }
    });
    rightPage.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 40));

    btnMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnMember.setText("MEMBER");
    btnMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnMember.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMemberActionPerformed(evt);
      }
    });
    rightPage.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 40));

    btnCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnCustomer.setText("CUSTOMER");
    btnCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnCustomer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCustomerActionPerformed(evt);
      }
    });
    rightPage.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, 40));

    btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\ITENAS\\OOP\\cobaSIRental\\src\\main\\java\\sirental\\Resources\\back-button.png")); // NOI18N
    btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnBackMouseClicked(evt);
      }
    });
    rightPage.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

    getContentPane().add(rightPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 570, 440));

    setSize(new java.awt.Dimension(704, 438));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        loginAdmin loginadmin = new loginAdmin();
        loginadmin.setVisible(true);
        close();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        loginMember loginmember = new loginMember();
        loginmember.setVisible(true);
        close();
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        loginCustomer logincustomer = new loginCustomer();
        logincustomer.setVisible(true);
        close();
    }//GEN-LAST:event_btnCustomerActionPerformed

  private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
    // TODO add your handling code here:
    landingPage lpMain = new landingPage();
    lpMain.setVisible(true);
    close();
  }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginMain().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Login;
  private javax.swing.JButton btnAdmin;
  private javax.swing.JLabel btnBack;
  private javax.swing.JButton btnCustomer;
  private javax.swing.JButton btnMember;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel leftPage;
  private javax.swing.JLabel logo;
  private javax.swing.JPanel rightPage;
  private javax.swing.JLabel welcome;
  // End of variables declaration//GEN-END:variables
}
