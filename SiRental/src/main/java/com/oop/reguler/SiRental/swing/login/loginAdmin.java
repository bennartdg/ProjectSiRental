/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.reguler.SiRental.swing.login;

import com.oop.reguler.SiRental.pojo.Admin;
import com.oop.reguler.SiRental.service.AdminService;
import com.oop.reguler.SiRental.serviceimpl.AdminServiceImpl;
import com.oop.reguler.SiRental.swing.admin.DataMember;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ME1
 */
public class LoginAdmin extends javax.swing.JFrame {

  AdminService adminService = new AdminServiceImpl();
  DataMember dataMember;
  Admin admin;
  String username, password;
  boolean login = false;

  /**
   * Creates new form login
   */
  public LoginAdmin() {
    initComponents();
    this.setLocationRelativeTo(null);
    txtusername.setBackground(new java.awt.Color(0, 0, 0, 1));
    txtpassword.setBackground(new java.awt.Color(0, 0, 0, 1));
  }

  public void close() {
    WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    leftPage = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    rightPage = new javax.swing.JPanel();
    Login = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtusername = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtpassword = new javax.swing.JPasswordField();
    jLabel9 = new javax.swing.JLabel();
    cbShowPassword = new javax.swing.JCheckBox();
    btnlogin = new javax.swing.JButton();
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

    logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\car icon.png")); // NOI18N
    leftPage.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 740, 440));

    getContentPane().add(leftPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 440));

    rightPage.setBackground(new java.awt.Color(255, 0, 70));
    rightPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Login.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
    Login.setForeground(new java.awt.Color(255, 255, 255));
    Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Login.setText("Login");
    rightPage.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 420, 41));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Selamat datang Admin!");
    rightPage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, 420, -1));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(199, 226, 255));
    jLabel5.setText("Username");
    rightPage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 341, -1));

    txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
    txtusername.setForeground(new java.awt.Color(255, 255, 255));
    txtusername.setBorder(null);
    txtusername.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtusernameActionPerformed(evt);
      }
    });
    rightPage.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, 30));

    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("_________________________________________");
    rightPage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 39));

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(199, 226, 255));
    jLabel8.setText("Password");
    rightPage.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 341, -1));

    txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+2f));
    txtpassword.setForeground(new java.awt.Color(255, 255, 255));
    txtpassword.setBorder(null);
    txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
    txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtpasswordKeyPressed(evt);
      }
    });
    rightPage.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 240, 30));

    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("_________________________________________");
    rightPage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 40));

    cbShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    cbShowPassword.setForeground(new java.awt.Color(199, 226, 255));
    cbShowPassword.setText("Show Password");
    cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbShowPasswordActionPerformed(evt);
      }
    });
    rightPage.add(cbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

    btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnlogin.setText("LOGIN");
    btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnlogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnloginActionPerformed(evt);
      }
    });
    rightPage.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 290, 40));

    btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\back-button.png")); // NOI18N
    btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnBackMouseClicked(evt);
      }
    });
    rightPage.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

    getContentPane().add(rightPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 350, 440));

    setSize(new java.awt.Dimension(916, 438));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      for (double i = 0.0; i <= 1.0; i = i + 0.1) {
        String val = i + "";
        float f = Float.valueOf(val);
        this.setOpacity(f);
        try {
          Thread.sleep(50);
        } catch (Exception e) {

        }
      }
    }//GEN-LAST:event_formWindowOpened

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
      // TODO add your handling code here:
      username = txtusername.getText();
      password = txtpassword.getText();

      try {
        if (username.equals("") || password.equals("")) {
          JOptionPane.showMessageDialog(null, "Isi Username dan Password untuk Login!");
        } else {
          admin = adminService.login(username, password);

          if (admin != null) {
            admin.setLoginStatus(true);
            JOptionPane.showMessageDialog(null, "Login Berhasil!");
            dataMember = new DataMember(admin);
            dataMember.setVisible(true);
            close();
          } else {
            JOptionPane.showMessageDialog(null, "Login Gagal! Username atau Password salah!");
          }
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e + ": Server dalam keadaan tidak menyala atau down!");
      }
    }//GEN-LAST:event_btnloginActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
      // TODO add your handling code here:
      showPassword();
    }//GEN-LAST:event_cbShowPasswordActionPerformed

  public void showPassword() {
    if (cbShowPassword.isSelected()) {
      txtpassword.setEchoChar((char) 0);
      cbShowPassword.setText("Hide Password");
    } else {
      txtpassword.setEchoChar('*');
      cbShowPassword.setText("Show Password");
    }
  }

  private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
    // TODO add your handling code here:
    LoginMain login = new LoginMain();
    login.setVisible(true);
    close();
  }//GEN-LAST:event_btnBackMouseClicked

  private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtusernameActionPerformed

  private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
    String user = txtusername.getText();
    String pass = txtpassword.getText();

    try {
      if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
        if (user.equals("") || pass.equals("")) {
          JOptionPane.showMessageDialog(null, "Isi Username dan Password untuk Login!");
        } else {
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            username = txtusername.getText();
            password = txtpassword.getText();

            admin = adminService.login(username, password);

            if (admin != null) {
              admin.setLoginStatus(true);
              JOptionPane.showMessageDialog(null, "Login Berhasil!");
              dataMember = new DataMember(admin);
              dataMember.setVisible(true);
              close();
            } else {
              JOptionPane.showMessageDialog(null, "Login Gagal! Username atau Password salah!");
            }
          }
        }
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e + ": Server dalam keadaan tidak menyala atau down!");
    }
  }//GEN-LAST:event_txtpasswordKeyPressed

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
      java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginAdmin().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Login;
  private javax.swing.JLabel btnBack;
  private javax.swing.JButton btnlogin;
  private javax.swing.JCheckBox cbShowPassword;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel leftPage;
  private javax.swing.JLabel logo;
  private javax.swing.JPanel rightPage;
  private javax.swing.JPasswordField txtpassword;
  private javax.swing.JTextField txtusername;
  // End of variables declaration//GEN-END:variables
}
