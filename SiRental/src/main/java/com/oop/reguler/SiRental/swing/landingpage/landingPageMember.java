/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.landingpage;

import com.oop.reguler.SiRental.pojo.Member;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import com.oop.reguler.SiRental.swing.member.ProfileMember;
import com.oop.reguler.SiRental.swing.member.MobilMember;


/**
 *
 * @author MEMi
 */
public class LandingPageMember extends javax.swing.JFrame {
  public static Member member;
  /**
   * Creates new form test
   */
  public LandingPageMember(Member member) {
    initComponents();
    this.setLocationRelativeTo(null);
    this.member = member;
    lblNamaMember.setText(member.getNama());
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

    navbar = new javax.swing.JPanel();
    SiRental = new javax.swing.JLabel();
    btnHome = new javax.swing.JButton();
    btnMobil = new javax.swing.JButton();
    profile = new javax.swing.JLabel();
    lblNamaMember = new javax.swing.JLabel();
    mainPage = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    kenapaSiRental = new javax.swing.JLabel();
    garis = new javax.swing.JSeparator();
    baris1 = new javax.swing.JLabel();
    baris2 = new javax.swing.JLabel();
    baris3 = new javax.swing.JLabel();
    baris4 = new javax.swing.JLabel();
    btnTambahMobil = new javax.swing.JButton();
    instagram = new javax.swing.JLabel();
    facebook = new javax.swing.JLabel();
    email = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
    profile.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        profileMouseClicked(evt);
      }
    });

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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
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

    getContentPane().add(navbar, java.awt.BorderLayout.PAGE_START);

    mainPage.setBackground(new java.awt.Color(255, 0, 70));

    logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\sirental.jpeg")); // NOI18N

    kenapaSiRental.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
    kenapaSiRental.setForeground(new java.awt.Color(255, 255, 255));
    kenapaSiRental.setText("KENAPA SI RENTAL ?");

    baris1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    baris1.setForeground(new java.awt.Color(255, 255, 255));
    baris1.setText("Raihlah keuntungan dengan hanya kendaraan");

    baris2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    baris2.setForeground(new java.awt.Color(255, 255, 255));
    baris2.setText("mobil yang anda miliki  di rumah tanpa harus");

    baris3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    baris3.setForeground(new java.awt.Color(255, 255, 255));
    baris3.setText("mengeluarkan biaya  apapun untuk bisa men-");

    baris4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    baris4.setForeground(new java.awt.Color(255, 255, 255));
    baris4.setText("dapatkan keuntungan bersama Si Rental");

    btnTambahMobil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnTambahMobil.setText("Tambah Mobil");
    btnTambahMobil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnTambahMobilActionPerformed(evt);
      }
    });

    instagram.setForeground(new java.awt.Color(255, 255, 255));
    instagram.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\instagram.png")); // NOI18N
    instagram.setText("SIRental");

    facebook.setForeground(new java.awt.Color(255, 255, 255));
    facebook.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\facebook.png")); // NOI18N
    facebook.setText("SI_Rental");

    email.setForeground(new java.awt.Color(255, 255, 255));
    email.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\email.png")); // NOI18N
    email.setText("sirental205@gmail.com");

    javax.swing.GroupLayout mainPageLayout = new javax.swing.GroupLayout(mainPage);
    mainPage.setLayout(mainPageLayout);
    mainPageLayout.setHorizontalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(baris1)
          .addComponent(baris2)
          .addComponent(baris3)
          .addComponent(baris4)
          .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(garis, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kenapaSiRental, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(btnTambahMobil)
          .addGroup(mainPageLayout.createSequentialGroup()
            .addComponent(instagram)
            .addGap(18, 18, 18)
            .addComponent(facebook)
            .addGap(18, 18, 18)
            .addComponent(email)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
        .addComponent(logo))
    );
    mainPageLayout.setVerticalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPageLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(logo)
        .addContainerGap(17, Short.MAX_VALUE))
      .addGroup(mainPageLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(kenapaSiRental)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(baris1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(baris2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(baris3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(baris4)
        .addGap(32, 32, 32)
        .addComponent(btnTambahMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(instagram)
          .addComponent(facebook)
          .addComponent(email))
        .addGap(25, 25, 25))
    );

    getContentPane().add(mainPage, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnHomeActionPerformed

  private void btnMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilActionPerformed
    MobilMember mobilMember = new MobilMember(member);
    mobilMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnMobilActionPerformed

  private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
    ProfileMember profileMember = new ProfileMember(member);
    profileMember.setVisible(true);
    close();
  }//GEN-LAST:event_profileMouseClicked

  private void btnTambahMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMobilActionPerformed
    MobilMember mobilMember = new MobilMember(member);
    mobilMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnTambahMobilActionPerformed

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
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LandingPageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LandingPageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LandingPageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LandingPageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LandingPageMember(member).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel SiRental;
  private javax.swing.JLabel baris1;
  private javax.swing.JLabel baris2;
  private javax.swing.JLabel baris3;
  private javax.swing.JLabel baris4;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnMobil;
  private javax.swing.JButton btnTambahMobil;
  private javax.swing.JLabel email;
  private javax.swing.JLabel facebook;
  private javax.swing.JSeparator garis;
  private javax.swing.JLabel instagram;
  private javax.swing.JLabel kenapaSiRental;
  private javax.swing.JLabel lblNamaMember;
  private javax.swing.JLabel logo;
  private javax.swing.JPanel mainPage;
  private javax.swing.JPanel navbar;
  private javax.swing.JLabel profile;
  // End of variables declaration//GEN-END:variables
}
