/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.register;

import com.oop.reguler.SiRental.pojo.Akun;
import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.service.CustomerService;
import com.oop.reguler.SiRental.serviceimpl.CustomerServiceImpl;
import com.oop.reguler.SiRental.swing.login.LoginCustomer;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ME1
 */
public class CustomerRegister extends javax.swing.JFrame {

  /**
   * Creates new form CustomerRegister
   */
  public CustomerRegister() {
    initComponents();
    setLocationRelativeTo(null);
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

    groupGender = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtUsername = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();
    jLabel6 = new javax.swing.JLabel();
    txtKonfirmasiPassword = new javax.swing.JPasswordField();
    cbShowPassword = new javax.swing.JCheckBox();
    btnRegister = new javax.swing.JButton();
    txtTelepon = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    txtAlamat = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtNama = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    backButton = new javax.swing.JLabel();
    radioLakiLaki = new javax.swing.JRadioButton();
    radioPerempuan = new javax.swing.JRadioButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\car icon.png")); // NOI18N
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 460, 440));

    jPanel2.setBackground(new java.awt.Color(255, 0, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 40, 29));

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(199, 226, 255));
    jLabel8.setText("Username");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

    txtUsername.setBackground(new java.awt.Color(255, 0, 70));
    txtUsername.setFont(txtUsername.getFont().deriveFont(txtUsername.getFont().getSize()+2f));
    txtUsername.setForeground(new java.awt.Color(255, 255, 255));
    txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
    txtUsername.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUsernameActionPerformed(evt);
      }
    });
    jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(199, 226, 255));
    jLabel5.setText("Password");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

    txtPassword.setBackground(new java.awt.Color(255, 0, 70));
    txtPassword.setForeground(new java.awt.Color(255, 255, 255));
    txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
    txtPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordActionPerformed(evt);
      }
    });
    jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 30));

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(199, 226, 255));
    jLabel6.setText("Konfirmasi Password");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, -1));

    txtKonfirmasiPassword.setBackground(new java.awt.Color(255, 0, 70));
    txtKonfirmasiPassword.setForeground(new java.awt.Color(255, 255, 255));
    txtKonfirmasiPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtKonfirmasiPassword.setCaretColor(new java.awt.Color(255, 255, 255));
    txtKonfirmasiPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtKonfirmasiPasswordActionPerformed(evt);
      }
    });
    jPanel2.add(txtKonfirmasiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 297, 200, 30));

    cbShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    cbShowPassword.setForeground(new java.awt.Color(199, 226, 255));
    cbShowPassword.setText("Show Password");
    cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbShowPasswordActionPerformed(evt);
      }
    });
    jPanel2.add(cbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

    btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnRegister.setText("REGISTER");
    btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRegister.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegisterActionPerformed(evt);
      }
    });
    jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

    txtTelepon.setBackground(new java.awt.Color(255, 0, 70));
    txtTelepon.setFont(txtTelepon.getFont().deriveFont(txtTelepon.getFont().getSize()+2f));
    txtTelepon.setForeground(new java.awt.Color(255, 255, 255));
    txtTelepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtTelepon.setCaretColor(new java.awt.Color(255, 255, 255));
    txtTelepon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTeleponActionPerformed(evt);
      }
    });
    jPanel2.add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 200, 30));

    jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(199, 226, 255));
    jLabel13.setText("Telepon");
    jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 70, -1));

    txtAlamat.setBackground(new java.awt.Color(255, 0, 70));
    txtAlamat.setFont(txtAlamat.getFont().deriveFont(txtAlamat.getFont().getSize()+2f));
    txtAlamat.setForeground(new java.awt.Color(255, 255, 255));
    txtAlamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtAlamat.setCaretColor(new java.awt.Color(255, 255, 255));
    txtAlamat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAlamatActionPerformed(evt);
      }
    });
    jPanel2.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 200, 30));

    jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(199, 226, 255));
    jLabel11.setText("Alamat");
    jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 90, -1));

    jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(199, 226, 255));
    jLabel10.setText("Jenis kelamin");
    jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 90, -1));

    txtNama.setBackground(new java.awt.Color(255, 0, 70));
    txtNama.setFont(txtNama.getFont().deriveFont(txtNama.getFont().getSize()+2f));
    txtNama.setForeground(new java.awt.Color(255, 255, 255));
    txtNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtNama.setCaretColor(new java.awt.Color(255, 255, 255));
    txtNama.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNamaActionPerformed(evt);
      }
    });
    jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 200, 30));

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(199, 226, 255));
    jLabel9.setText("Nama");
    jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 110, -1));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Selamat datang Customer!");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 420, -1));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Register");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 420, 41));

    backButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    backButton.setForeground(new java.awt.Color(255, 255, 255));
    backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\back-button.png")); // NOI18N
    backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    backButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        backButtonMouseClicked(evt);
      }
    });
    jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

    groupGender.add(radioLakiLaki);
    radioLakiLaki.setForeground(new java.awt.Color(255, 255, 255));
    radioLakiLaki.setText("Laki-laki");
    radioLakiLaki.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioLakiLakiActionPerformed(evt);
      }
    });
    jPanel2.add(radioLakiLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

    groupGender.add(radioPerempuan);
    radioPerempuan.setForeground(new java.awt.Color(255, 255, 255));
    radioPerempuan.setText("Perempuan");
    radioPerempuan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioPerempuanActionPerformed(evt);
      }
    });
    jPanel2.add(radioPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 990, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, 0)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 440, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    System.exit(0);
  }//GEN-LAST:event_jLabel2MouseClicked

  private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtUsernameActionPerformed

  private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPasswordActionPerformed

  private void txtKonfirmasiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKonfirmasiPasswordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtKonfirmasiPasswordActionPerformed

  private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
    showPassword();
  }//GEN-LAST:event_cbShowPasswordActionPerformed

  private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    String username, password, konfirmasiPassword,
            nama, alamat, telepon;
    char jenisKelamin;

    CustomerService customerService = new CustomerServiceImpl();
    CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

    username = txtUsername.getText();
    password = txtPassword.getText();
    konfirmasiPassword = txtKonfirmasiPassword.getText();
    nama = txtNama.getText();
    jenisKelamin = genderGlobal;
    alamat = txtAlamat.getText();
    telepon = txtTelepon.getText();

    Akun akun = new Akun();
    Customer customer = new Customer();
    
    if (username.equals("") || password.equals("") || konfirmasiPassword.equals("") || nama.equals("")
            || jenisKelamin != 'L' || jenisKelamin != 'P' || alamat.equals("") || telepon.equals("")) {
      JOptionPane.showMessageDialog(null, "Isi semua Data untuk melakukan Register!");
    } else {
      if (password.equals(konfirmasiPassword)) {

        akun.setUsername(username);
        akun.setPassword(password);

        customerServiceImpl.create(akun);

        customer.setNama(nama);
        customer.setJenisKelamin(jenisKelamin);
        customer.setAlamat(alamat);
        customer.setTelepon(telepon);
        customer.setAkun(akun);

        customerService.create(customer);
        JOptionPane.showMessageDialog(null, "Akun Berhasil diDaftarkan! Silakan Login!");
        LoginCustomer loginCustomer = new LoginCustomer();
        loginCustomer.setVisible(true);
        close();
      } else {
        JOptionPane.showMessageDialog(null, "Konfirmasi Password Salah! Coba Lagi! ");
      }
    }
  }//GEN-LAST:event_btnRegisterActionPerformed

  private void showPassword() {
    if (cbShowPassword.isSelected()) {
      txtPassword.setEchoChar((char) 0);
      txtKonfirmasiPassword.setEchoChar((char) 0);
      cbShowPassword.setText("Hide Password");
    } else {
      txtPassword.setEchoChar('*');
      txtKonfirmasiPassword.setEchoChar('*');
      cbShowPassword.setText("Show Password");
    }
  }

  private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTeleponActionPerformed

  private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAlamatActionPerformed

  private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaActionPerformed

  private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
    RegisterMain registerMain = new RegisterMain();
    registerMain.setVisible(true);
    close();
  }//GEN-LAST:event_backButtonMouseClicked

  private char genderGlobal;

  private void radioLakiLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLakiLakiActionPerformed
    genderGlobal = 'L';
  }//GEN-LAST:event_radioLakiLakiActionPerformed

  private void radioPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPerempuanActionPerformed
    genderGlobal = 'P';
  }//GEN-LAST:event_radioPerempuanActionPerformed

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
      java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CustomerRegister().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel backButton;
  private javax.swing.JButton btnRegister;
  private javax.swing.JCheckBox cbShowPassword;
  private javax.swing.ButtonGroup groupGender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JRadioButton radioLakiLaki;
  private javax.swing.JRadioButton radioPerempuan;
  private javax.swing.JTextField txtAlamat;
  private javax.swing.JPasswordField txtKonfirmasiPassword;
  private javax.swing.JTextField txtNama;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtTelepon;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}