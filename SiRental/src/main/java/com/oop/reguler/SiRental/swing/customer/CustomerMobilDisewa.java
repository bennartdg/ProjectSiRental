/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.customer;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.pojo.Transaksi;
import com.oop.reguler.SiRental.service.TransaksiService;
import com.oop.reguler.SiRental.serviceimpl.MobilServiceImpl;
import com.oop.reguler.SiRental.serviceimpl.TransaksiServiceImpl;
import com.oop.reguler.SiRental.swing.landingpage.LandingPageCustomer;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MEMi
 */
public class CustomerMobilDisewa extends javax.swing.JFrame {

  private static Customer customer;
  TransaksiServiceImpl transaksiServiceImpl;

  /**
   * Creates new form CustomerMobilDisewa
   */
  public CustomerMobilDisewa(Customer customer) {
    Transaksi transaksi = new Transaksi();
    initComponents();
    this.customer = customer;
    setLocationRelativeTo(null);
    transaksi.setCostumer(customer);
    loadData(transaksi);
    lblNamaCustomer.setText(customer.getNama());
  }

  public void close() {
    WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
  }

  private void loadData(Transaksi transaksi) {
    transaksiServiceImpl = new TransaksiServiceImpl();
    List<Transaksi> listTransaksi;
    listTransaksi = transaksiServiceImpl.findAllCustomerTransaksi(transaksi);
    Object[][] objectTransaksi = new Object[listTransaksi.size()][8];

    int counter = 0;

    for (Transaksi transaksiTbl : listTransaksi) {
      objectTransaksi[counter][0] = transaksiTbl.getIdTransaksi();
      objectTransaksi[counter][1] = transaksiTbl.getMobil().getIdMobil();
      objectTransaksi[counter][2] = transaksiTbl.getMember().getIdMember();
      objectTransaksi[counter][3] = transaksiTbl.getMobil().getPlatNo();
      objectTransaksi[counter][4] = transaksiTbl.getMobil().getMerk();
      objectTransaksi[counter][5] = transaksiTbl.getTanggalPesan();
      objectTransaksi[counter][6] = transaksiTbl.getLamaPeminjaman();
      objectTransaksi[counter][7] = transaksiTbl.getTotalHarga();
      counter++;
    }

    tblCustomerMobilSewa.setModel(new javax.swing.table.DefaultTableModel(
            objectTransaksi, new String[]{
              "ID Transaksi", "ID Mobil",
              "ID Member", "No Plat",
              "Merk", "Tanggal Pesan",
              "Lama Peminjaman", "Total Harga"
            }
    ));

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
    btnCariMobil = new javax.swing.JButton();
    profile = new javax.swing.JLabel();
    lblNamaCustomer = new javax.swing.JLabel();
    btnMobilDisewa = new javax.swing.JButton();
    mainPage = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblCustomerMobilSewa = new javax.swing.JTable();
    btnKembalikanMobil = new javax.swing.JButton();
    chooserTanggalKembali = new com.toedter.calendar.JDateChooser();
    jcSewa = new javax.swing.JLabel();
    txtTanggalPengembalian = new javax.swing.JTextField();
    jcSewa1 = new javax.swing.JLabel();
    txtIdTransaksi = new javax.swing.JTextField();
    jcSewa2 = new javax.swing.JLabel();
    txtIdMobil = new javax.swing.JTextField();
    jcSewa3 = new javax.swing.JLabel();

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

    btnCariMobil.setBackground(new java.awt.Color(33, 33, 33));
    btnCariMobil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnCariMobil.setForeground(new java.awt.Color(255, 255, 255));
    btnCariMobil.setText("Cari Mobil");
    btnCariMobil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    btnCariMobil.setBorderPainted(false);
    btnCariMobil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCariMobilActionPerformed(evt);
      }
    });

    profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\profile-user.png")); // NOI18N
    profile.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        profileMouseClicked(evt);
      }
    });

    lblNamaCustomer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lblNamaCustomer.setForeground(new java.awt.Color(255, 255, 255));
    lblNamaCustomer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblNamaCustomer.setText("User");

    btnMobilDisewa.setBackground(new java.awt.Color(33, 33, 33));
    btnMobilDisewa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnMobilDisewa.setForeground(new java.awt.Color(255, 255, 255));
    btnMobilDisewa.setText("Mobil Disewa");
    btnMobilDisewa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    btnMobilDisewa.setBorderPainted(false);
    btnMobilDisewa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMobilDisewaActionPerformed(evt);
      }
    });

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
        .addComponent(btnCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(12, 12, 12)
        .addComponent(btnMobilDisewa, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(lblNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
          .addComponent(btnCariMobil)
          .addComponent(profile)
          .addComponent(lblNamaCustomer)
          .addComponent(btnMobilDisewa))
        .addContainerGap(8, Short.MAX_VALUE))
    );

    getContentPane().add(navbar, java.awt.BorderLayout.PAGE_START);

    mainPage.setBackground(new java.awt.Color(255, 0, 70));

    tblCustomerMobilSewa.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null}
      },
      new String [] {
        "ID Transaksi", "ID Mobil", "ID Member", "No Plat", "Merk", "Tanggal Pesan", "Lama Sewa", "Total Harga"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblCustomerMobilSewa.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblCustomerMobilSewaMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblCustomerMobilSewa);

    btnKembalikanMobil.setBackground(new java.awt.Color(33, 33, 33));
    btnKembalikanMobil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnKembalikanMobil.setForeground(new java.awt.Color(255, 255, 255));
    btnKembalikanMobil.setText("KEMBALIKAN MOBIL");
    btnKembalikanMobil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnKembalikanMobilActionPerformed(evt);
      }
    });

    chooserTanggalKembali.setBackground(new java.awt.Color(255, 255, 255));
    chooserTanggalKembali.setForeground(new java.awt.Color(33, 33, 33));

    jcSewa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jcSewa.setForeground(new java.awt.Color(255, 255, 255));
    jcSewa.setText("Pilih Tanggal Pengembalian");

    txtTanggalPengembalian.setEditable(false);

    jcSewa1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jcSewa1.setForeground(new java.awt.Color(255, 255, 255));
    jcSewa1.setText("Tanggal Pengembalian");

    txtIdTransaksi.setEditable(false);

    jcSewa2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jcSewa2.setForeground(new java.awt.Color(255, 255, 255));
    jcSewa2.setText("ID Transaksi");

    txtIdMobil.setEditable(false);

    jcSewa3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jcSewa3.setForeground(new java.awt.Color(255, 255, 255));
    jcSewa3.setText("ID Mobil");

    javax.swing.GroupLayout mainPageLayout = new javax.swing.GroupLayout(mainPage);
    mainPage.setLayout(mainPageLayout);
    mainPageLayout.setHorizontalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPageLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainPageLayout.createSequentialGroup()
              .addComponent(jcSewa1)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(txtTanggalPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(31, 31, 31)
              .addComponent(btnKembalikanMobil))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(mainPageLayout.createSequentialGroup()
            .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jcSewa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(chooserTanggalKembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(163, 163, 163)
            .addComponent(jcSewa2)
            .addGap(18, 18, 18)
            .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jcSewa3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(55, Short.MAX_VALUE))
    );
    mainPageLayout.setVerticalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPageLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jcSewa)
        .addGap(9, 9, 9)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(mainPageLayout.createSequentialGroup()
            .addComponent(chooserTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnKembalikanMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtTanggalPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jcSewa1))
            .addContainerGap(27, Short.MAX_VALUE))
          .addGroup(mainPageLayout.createSequentialGroup()
            .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcSewa3))
              .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcSewa2)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    getContentPane().add(mainPage, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    LandingPageCustomer landingPageCustomer = new LandingPageCustomer(customer);
    landingPageCustomer.setVisible(true);
    close();
  }//GEN-LAST:event_btnHomeActionPerformed

  private void btnCariMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariMobilActionPerformed
    CustomerCariMobil customerCariMobil = new CustomerCariMobil(customer);
    customerCariMobil.setVisible(true);
    close();
  }//GEN-LAST:event_btnCariMobilActionPerformed

  private void btnMobilDisewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilDisewaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnMobilDisewaActionPerformed

  private void btnKembalikanMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanMobilActionPerformed
    // TODO add your handling code here:
    TransaksiService transaksiService = new TransaksiServiceImpl();
    MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();

    Transaksi transaksi = new Transaksi();
    int idTransaksi, idMobil;
    String tanggalKembali;

    //Execption untuk chooserTanggalKembali null
    Date date = chooserTanggalKembali.getDate();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    if (txtIdTransaksi.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Pilih terlebih dahulu Data pada Tabel!");
    } else {
      tanggalKembali = dateFormat.format(date);

      txtTanggalPengembalian.setText(tanggalKembali);
      idTransaksi = Integer.parseInt(txtIdTransaksi.getText());
      idMobil = Integer.parseInt(txtIdMobil.getText());

      transaksi.setIdTransaksi(idTransaksi);
      transaksi.setTanggalKembali(tanggalKembali);
      transaksi.setCostumer(customer);

      int dialogButton = JOptionPane.YES_NO_OPTION;
      int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin untuk mengembalikan Mobil?", "Warning", dialogButton);

      if (dialogResult == JOptionPane.YES_OPTION) {
        transaksiService.update(transaksi);
        mobilServiceImpl.updateStatusOn(idMobil);

        JOptionPane.showMessageDialog(null, "Mobil berhasil dikembalikan!");

        loadData(transaksi);
        emptyField();
      }
    }
  }//GEN-LAST:event_btnKembalikanMobilActionPerformed
  private void emptyField() {
    txtIdTransaksi.setText("");
    txtIdMobil.setText("");
    txtTanggalPengembalian.setText("");
  }
  private void tblCustomerMobilSewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMobilSewaMouseClicked
    int idTransaksi, idMobil;
    int row = tblCustomerMobilSewa.getSelectedRow();
    idTransaksi = Integer.parseInt(tblCustomerMobilSewa.getValueAt(row, 0).toString());
    idMobil = Integer.parseInt(tblCustomerMobilSewa.getValueAt(row, 1).toString());

    txtIdTransaksi.setText(idTransaksi + "");
    txtIdMobil.setText(idMobil + "");
  }//GEN-LAST:event_tblCustomerMobilSewaMouseClicked

  private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
    ProfileCustomer profileCustomer = new ProfileCustomer(customer);
    profileCustomer.setVisible(true);
    close();
  }//GEN-LAST:event_profileMouseClicked

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
      java.util.logging.Logger.getLogger(CustomerMobilDisewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CustomerMobilDisewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CustomerMobilDisewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CustomerMobilDisewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CustomerMobilDisewa(customer).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel SiRental;
  private javax.swing.JButton btnCariMobil;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnKembalikanMobil;
  private javax.swing.JButton btnMobilDisewa;
  private com.toedter.calendar.JDateChooser chooserTanggalKembali;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel jcSewa;
  private javax.swing.JLabel jcSewa1;
  private javax.swing.JLabel jcSewa2;
  private javax.swing.JLabel jcSewa3;
  private javax.swing.JLabel lblNamaCustomer;
  private javax.swing.JPanel mainPage;
  private javax.swing.JPanel navbar;
  private javax.swing.JLabel profile;
  private javax.swing.JTable tblCustomerMobilSewa;
  private javax.swing.JTextField txtIdMobil;
  private javax.swing.JTextField txtIdTransaksi;
  private javax.swing.JTextField txtTanggalPengembalian;
  // End of variables declaration//GEN-END:variables
}
