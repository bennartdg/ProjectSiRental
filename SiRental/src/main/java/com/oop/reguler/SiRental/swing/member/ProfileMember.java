/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.member;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.swing.landingpage.LandingPage;
import com.oop.reguler.SiRental.swing.landingpage.LandingPageMember;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author MEMi
 */
public class ProfileMember extends javax.swing.JFrame {

  /**
   * Creates new form ProfileMember
   */
  private static Member member;

  public ProfileMember(Member member) {
    initComponents();
    this.setLocationRelativeTo(null);
    this.member = member;
    loadData();
    lblNamaMember.setText(member.getNama());
  }

  private void loadData() {
    txtUsername.setText(member.getAkun().getUsername());
    txtNama.setText(member.getNama());

    char jenisKelamin = member.getJenisKelamin();
    if (jenisKelamin == 'L') {
      txtJenisKelamin.setText("Laki-laki");
    } else {
      txtJenisKelamin.setText("Perempuan");
    }
    txtTelepon.setText(member.getTelepon());
    txtAlamat.setText(member.getAlamat());
    txtSaldo.setText(member.getSaldo() + "");
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

    navbar = new javax.swing.JPanel();
    SiRental = new javax.swing.JLabel();
    btnHome = new javax.swing.JButton();
    btnMobil = new javax.swing.JButton();
    profile = new javax.swing.JLabel();
    lblNamaMember = new javax.swing.JLabel();
    profilPanel = new javax.swing.JPanel();
    txtUsername = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtNama = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    txtJenisKelamin = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtAlamat = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    txtTelepon = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    txtSaldo = new javax.swing.JTextField();
    btnLogout = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    navbar.setBackground(new java.awt.Color(33, 33, 33));
    navbar.setPreferredSize(new java.awt.Dimension(800, 50));

    SiRental.setFont(new java.awt.Font("Neusharp", 1, 20)); // NOI18N
    SiRental.setForeground(new java.awt.Color(255, 255, 255));
    SiRental.setText("SI RENTAL");

    btnHome.setBackground(new java.awt.Color(33, 33, 33));
    btnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnHome.setForeground(new java.awt.Color(255, 255, 255));
    btnHome.setText("Home");
    btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    btnHome.setBorderPainted(false);
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    btnMobil.setBackground(new java.awt.Color(33, 33, 33));
    btnMobil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnMobil.setForeground(new java.awt.Color(255, 255, 255));
    btnMobil.setText("Mobil");
    btnMobil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    btnMobil.setBorderPainted(false);
    btnMobil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMobilActionPerformed(evt);
      }
    });

    profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\profile-user.png")); // NOI18N

    lblNamaMember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lblNamaMember.setForeground(new java.awt.Color(255, 255, 255));
    lblNamaMember.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblNamaMember.setText("Member");

    javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
    navbar.setLayout(navbarLayout);
    navbarLayout.setHorizontalGroup(
      navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(navbarLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(SiRental)
        .addGap(65, 65, 65)
        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lblNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(profile)
        .addGap(50, 50, 50))
    );
    navbarLayout.setVerticalGroup(
      navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(navbarLayout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(SiRental)
          .addComponent(btnHome)
          .addComponent(btnMobil)
          .addComponent(profile)
          .addComponent(lblNamaMember))
        .addContainerGap(8, Short.MAX_VALUE))
    );

    getContentPane().add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    profilPanel.setBackground(new java.awt.Color(68, 68, 68));
    profilPanel.setForeground(new java.awt.Color(255, 255, 255));

    txtUsername.setEditable(false);
    txtUsername.setBackground(new java.awt.Color(68, 68, 68));
    txtUsername.setFont(txtUsername.getFont().deriveFont(txtUsername.getFont().getSize()+2f));
    txtUsername.setForeground(new java.awt.Color(255, 255, 255));
    txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtUsername.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUsernameActionPerformed(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(199, 226, 255));
    jLabel5.setText("Username");

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(199, 226, 255));
    jLabel8.setText("Nama");

    txtNama.setEditable(false);
    txtNama.setBackground(new java.awt.Color(68, 68, 68));
    txtNama.setFont(txtNama.getFont().deriveFont(txtNama.getFont().getSize()+2f));
    txtNama.setForeground(new java.awt.Color(255, 255, 255));
    txtNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtNama.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNamaActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(199, 226, 255));
    jLabel10.setText("Jenis Kelamin");

    txtJenisKelamin.setEditable(false);
    txtJenisKelamin.setBackground(new java.awt.Color(68, 68, 68));
    txtJenisKelamin.setFont(txtJenisKelamin.getFont().deriveFont(txtJenisKelamin.getFont().getSize()+2f));
    txtJenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
    txtJenisKelamin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtJenisKelaminActionPerformed(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(199, 226, 255));
    jLabel7.setText("Alamat");

    txtAlamat.setEditable(false);
    txtAlamat.setBackground(new java.awt.Color(68, 68, 68));
    txtAlamat.setFont(txtAlamat.getFont().deriveFont(txtAlamat.getFont().getSize()+2f));
    txtAlamat.setForeground(new java.awt.Color(255, 255, 255));
    txtAlamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtAlamat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAlamatActionPerformed(evt);
      }
    });

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(199, 226, 255));
    jLabel9.setText("Telepon");

    txtTelepon.setEditable(false);
    txtTelepon.setBackground(new java.awt.Color(68, 68, 68));
    txtTelepon.setFont(txtTelepon.getFont().deriveFont(txtTelepon.getFont().getSize()+2f));
    txtTelepon.setForeground(new java.awt.Color(255, 255, 255));
    txtTelepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtTelepon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTeleponActionPerformed(evt);
      }
    });

    jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(199, 226, 255));
    jLabel11.setText("Saldo");

    txtSaldo.setEditable(false);
    txtSaldo.setBackground(new java.awt.Color(68, 68, 68));
    txtSaldo.setFont(txtSaldo.getFont().deriveFont(txtSaldo.getFont().getSize()+2f));
    txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
    txtSaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtSaldo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSaldoActionPerformed(evt);
      }
    });

    btnLogout.setBackground(new java.awt.Color(33, 33, 33));
    btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnLogout.setForeground(new java.awt.Color(255, 255, 255));
    btnLogout.setText("LOGOUT");
    btnLogout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogoutActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout profilPanelLayout = new javax.swing.GroupLayout(profilPanel);
    profilPanel.setLayout(profilPanelLayout);
    profilPanelLayout.setHorizontalGroup(
      profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(profilPanelLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilPanelLayout.createSequentialGroup()
              .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilPanelLayout.createSequentialGroup()
              .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel5))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(profilPanelLayout.createSequentialGroup()
              .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(35, Short.MAX_VALUE))
    );
    profilPanelLayout.setVerticalGroup(
      profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(profilPanelLayout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(22, 22, 22)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8))
        .addGap(22, 22, 22)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel10))
        .addGap(21, 21, 21)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7))
        .addGap(18, 18, 18)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9))
        .addGap(18, 18, 18)
        .addGroup(profilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel11)
          .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(41, Short.MAX_VALUE))
    );

    getContentPane().add(profilPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 430));

    jPanel1.setBackground(new java.awt.Color(255, 0, 70));

    jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\sirental.jpeg")); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(43, 43, 43)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(11, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 450, 430));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    LandingPageMember lpMember = new LandingPageMember(member);
    lpMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnHomeActionPerformed

  private void btnMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilActionPerformed
    MobilMember mobilMember = new MobilMember(member);
    mobilMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnMobilActionPerformed

  private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSaldoActionPerformed

  private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTeleponActionPerformed

  private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAlamatActionPerformed

  private void txtJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisKelaminActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtJenisKelaminActionPerformed

  private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaActionPerformed

  private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtUsernameActionPerformed

  private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    int dialogButton = JOptionPane.YES_NO_OPTION;

    int dialogResult = JOptionPane.showConfirmDialog(null, "yakin mau Logout nih?", "Warning", dialogButton);
    if (dialogResult == JOptionPane.YES_OPTION) {
      LandingPage landingPage = new LandingPage();
      member.setLoginStatus(false);
      landingPage.setVisible(true);
      close();
    }
  }//GEN-LAST:event_btnLogoutActionPerformed

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
      java.util.logging.Logger.getLogger(ProfileMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ProfileMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ProfileMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ProfileMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ProfileMember(member).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel SiRental;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnLogout;
  private javax.swing.JButton btnMobil;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblNamaMember;
  private javax.swing.JPanel navbar;
  private javax.swing.JPanel profilPanel;
  private javax.swing.JLabel profile;
  private javax.swing.JTextField txtAlamat;
  private javax.swing.JTextField txtJenisKelamin;
  private javax.swing.JTextField txtNama;
  private javax.swing.JTextField txtSaldo;
  private javax.swing.JTextField txtTelepon;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
