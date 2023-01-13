/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.admin;

import com.oop.reguler.SiRental.pojo.Admin;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.service.MobilService;
import com.oop.reguler.SiRental.serviceimpl.MobilServiceImpl;
import com.oop.reguler.SiRental.swing.landingpage.LandingPage;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MEMi
 */
public class KelolaMobil extends javax.swing.JFrame {

  public static Admin admin;
  MobilService mobilService;
  DataMember dataMember;
  DataCustomer dataCustomer;
  KelolaTransaksi kelolaTransaksi;

  /**
   * Creates new form KelolaMember
   */
  public KelolaMobil(Admin admin) {
    initComponents();
    setLocationRelativeTo(null);
    this.admin = admin;
    loadData();
  }

  public void close() {
    WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
  }

  private void emptyField() {
    txtPlatno.setText("");
    txtMerk.setText("");
    txtWarna.setText("");
    txtJenis.setText("");
    txtKapasitas.setText("");
    txtTransmisi.setText("");
    txtTahun.setText("");
    txtHarga.setText("");
    txtStatus.setText("");
    txtIdMember.setText("");
    txtIdMobil.setText("");
  }

  private void loadData() {
    mobilService = new MobilServiceImpl();
    List<Mobil> listMobil;

    listMobil = mobilService.findAll();
    Object[][] objectMobil = new Object[listMobil.size()][11];

    int counter = 0;

    for (Mobil mobil : listMobil) {
      objectMobil[counter][0] = mobil.getIdMobil();
      objectMobil[counter][1] = mobil.getMember().getIdMember();
      objectMobil[counter][2] = mobil.getPlatNo();
      objectMobil[counter][3] = mobil.getMerk();
      objectMobil[counter][4] = mobil.getWarna();
      objectMobil[counter][5] = mobil.getJenis();
      objectMobil[counter][6] = mobil.getKapasitas();
      objectMobil[counter][7] = mobil.getTransmisi();
      objectMobil[counter][8] = mobil.getTahunKeluar();
      objectMobil[counter][9] = mobil.getHarga();
      objectMobil[counter][10] = mobil.getStatus();
      counter++;
    }

    tblMobil.setModel(new javax.swing.table.DefaultTableModel(
            objectMobil, new String[]{
              "ID Mobil", "ID Member", "Plat Nomor", "Merk", "Warna", "Jenis", "Kapasitas", "Transmisi", "Tahun Keluar", "Harga", "Status"
            }
    ));

    double saldoAdmin = admin.getSaldo();
    txtSaldoAdmin.setText(saldoAdmin + "");
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    navbar = new javax.swing.JPanel();
    SiRental = new javax.swing.JLabel();
    profile = new javax.swing.JLabel();
    namaLogin = new javax.swing.JLabel();
    hiraukan = new javax.swing.JLabel();
    mainPage = new javax.swing.JPanel();
    sidePanel = new javax.swing.JPanel();
    btnKelolaMobil = new javax.swing.JButton();
    btnDataMember = new javax.swing.JButton();
    btnDataCustomer = new javax.swing.JButton();
    btnKelolaTransaksi = new javax.swing.JButton();
    txtSaldoAdmin = new javax.swing.JTextField();
    txtRp1 = new javax.swing.JTextField();
    Nama3 = new javax.swing.JLabel();
    btnLogout = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblMobil = new javax.swing.JTable();
    Platno = new javax.swing.JLabel();
    txtWarna = new javax.swing.JTextField();
    Warna = new javax.swing.JLabel();
    txtKapasitas = new javax.swing.JTextField();
    Kapasitas = new javax.swing.JLabel();
    btnDelete = new javax.swing.JButton();
    txtPlatno = new javax.swing.JTextField();
    txtTahun = new javax.swing.JTextField();
    Tahun = new javax.swing.JLabel();
    Merk = new javax.swing.JLabel();
    txtMerk = new javax.swing.JTextField();
    Jenis = new javax.swing.JLabel();
    txtJenis = new javax.swing.JTextField();
    Transmisi = new javax.swing.JLabel();
    txtTransmisi = new javax.swing.JTextField();
    Harga = new javax.swing.JLabel();
    txtHarga = new javax.swing.JTextField();
    txtStatus = new javax.swing.JTextField();
    Status = new javax.swing.JLabel();
    txtIdMember = new javax.swing.JTextField();
    idMember = new javax.swing.JLabel();
    txtIdMobil = new javax.swing.JTextField();
    idMobil = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    navbar.setBackground(new java.awt.Color(33, 33, 33));
    navbar.setPreferredSize(new java.awt.Dimension(800, 50));

    SiRental.setFont(new java.awt.Font("Neusharp", 1, 20)); // NOI18N
    SiRental.setForeground(new java.awt.Color(255, 255, 255));
    SiRental.setText("SI RENTAL");

    profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\benna\\OneDrive\\Documents\\Itenas Doc Ben\\PROGRAMING LANGUAGE\\Java\\OOP\\OOPRegulerFinal\\ProjectSiRental\\SiRental\\src\\main\\java\\com\\oop\\reguler\\SiRental\\swing\\resources\\profile-user.png")); // NOI18N

    namaLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    namaLogin.setForeground(new java.awt.Color(255, 255, 255));
    namaLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    namaLogin.setText("Admin");

    hiraukan.setForeground(new java.awt.Color(33, 33, 33));
    hiraukan.setText("jLabel1");

    javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
    navbar.setLayout(navbarLayout);
    navbarLayout.setHorizontalGroup(
      navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(navbarLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(SiRental)
        .addGap(283, 283, 283)
        .addComponent(hiraukan)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
        .addComponent(namaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
          .addComponent(profile)
          .addComponent(namaLogin)
          .addComponent(hiraukan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(8, Short.MAX_VALUE))
    );

    getContentPane().add(navbar, java.awt.BorderLayout.PAGE_START);

    mainPage.setBackground(new java.awt.Color(255, 0, 70));
    mainPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    sidePanel.setBackground(new java.awt.Color(68, 68, 68));
    sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnKelolaMobil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnKelolaMobil.setForeground(new java.awt.Color(68, 68, 68));
    btnKelolaMobil.setText("Kelola Mobil");
    sidePanel.add(btnKelolaMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 50));

    btnDataMember.setBackground(new java.awt.Color(68, 68, 68));
    btnDataMember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnDataMember.setForeground(new java.awt.Color(255, 255, 255));
    btnDataMember.setText("Data Member");
    btnDataMember.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDataMemberActionPerformed(evt);
      }
    });
    sidePanel.add(btnDataMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 50));

    btnDataCustomer.setBackground(new java.awt.Color(68, 68, 68));
    btnDataCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnDataCustomer.setForeground(new java.awt.Color(255, 255, 255));
    btnDataCustomer.setText("Data Customer");
    btnDataCustomer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDataCustomerActionPerformed(evt);
      }
    });
    sidePanel.add(btnDataCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 50));

    btnKelolaTransaksi.setBackground(new java.awt.Color(68, 68, 68));
    btnKelolaTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnKelolaTransaksi.setForeground(new java.awt.Color(255, 255, 255));
    btnKelolaTransaksi.setText("Kelola Transaksi");
    btnKelolaTransaksi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnKelolaTransaksiActionPerformed(evt);
      }
    });
    sidePanel.add(btnKelolaTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 50));

    txtSaldoAdmin.setEditable(false);
    txtSaldoAdmin.setBackground(new java.awt.Color(255, 255, 255));
    txtSaldoAdmin.setForeground(new java.awt.Color(33, 33, 33));
    sidePanel.add(txtSaldoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 30));

    txtRp1.setEditable(false);
    txtRp1.setBackground(new java.awt.Color(255, 255, 255));
    txtRp1.setForeground(new java.awt.Color(33, 33, 33));
    txtRp1.setText("Rp.");
    sidePanel.add(txtRp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, 30));

    Nama3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Nama3.setForeground(new java.awt.Color(255, 255, 255));
    Nama3.setText("Saldo");
    sidePanel.add(Nama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

    btnLogout.setBackground(new java.awt.Color(33, 33, 33));
    btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnLogout.setForeground(new java.awt.Color(255, 255, 255));
    btnLogout.setText("LOGOUT");
    btnLogout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogoutActionPerformed(evt);
      }
    });
    sidePanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 40));

    mainPage.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 450));

    tblMobil.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "ID Mobil", "ID Member", "Plat Nomor", "Merk", "Warna", "Jenis", "Kapasitas", "Transmisi", "Tahun", "Harga", "Status"
      }
    ));
    tblMobil.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblMobilMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblMobil);

    mainPage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 490, 140));

    Platno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Platno.setForeground(new java.awt.Color(255, 255, 255));
    Platno.setText("Plat nomor");
    mainPage.add(Platno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

    txtWarna.setEditable(false);
    txtWarna.setBackground(new java.awt.Color(255, 255, 255));
    txtWarna.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, 30));

    Warna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Warna.setForeground(new java.awt.Color(255, 255, 255));
    Warna.setText("Warna");
    mainPage.add(Warna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

    txtKapasitas.setEditable(false);
    txtKapasitas.setBackground(new java.awt.Color(255, 255, 255));
    txtKapasitas.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtKapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 210, 30));

    Kapasitas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Kapasitas.setForeground(new java.awt.Color(255, 255, 255));
    Kapasitas.setText("Kapasitas");
    mainPage.add(Kapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

    btnDelete.setBackground(new java.awt.Color(33, 33, 33));
    btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnDelete.setForeground(new java.awt.Color(255, 255, 255));
    btnDelete.setText("DELETE");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });
    mainPage.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

    txtPlatno.setEditable(false);
    txtPlatno.setBackground(new java.awt.Color(255, 255, 255));
    txtPlatno.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtPlatno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 210, 30));

    txtTahun.setEditable(false);
    txtTahun.setBackground(new java.awt.Color(255, 255, 255));
    txtTahun.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 210, 30));

    Tahun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Tahun.setForeground(new java.awt.Color(255, 255, 255));
    Tahun.setText("Tahun");
    mainPage.add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

    Merk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Merk.setForeground(new java.awt.Color(255, 255, 255));
    Merk.setText("Merk");
    mainPage.add(Merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

    txtMerk.setEditable(false);
    txtMerk.setBackground(new java.awt.Color(255, 255, 255));
    txtMerk.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 210, 30));

    Jenis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Jenis.setForeground(new java.awt.Color(255, 255, 255));
    Jenis.setText("Jenis");
    mainPage.add(Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

    txtJenis.setEditable(false);
    txtJenis.setBackground(new java.awt.Color(255, 255, 255));
    txtJenis.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 210, 30));

    Transmisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Transmisi.setForeground(new java.awt.Color(255, 255, 255));
    Transmisi.setText("Transmisi");
    mainPage.add(Transmisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

    txtTransmisi.setEditable(false);
    txtTransmisi.setBackground(new java.awt.Color(255, 255, 255));
    txtTransmisi.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtTransmisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 210, 30));

    Harga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Harga.setForeground(new java.awt.Color(255, 255, 255));
    Harga.setText("Harga");
    mainPage.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

    txtHarga.setEditable(false);
    txtHarga.setBackground(new java.awt.Color(255, 255, 255));
    txtHarga.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 210, 30));

    txtStatus.setEditable(false);
    txtStatus.setBackground(new java.awt.Color(255, 255, 255));
    txtStatus.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 30));

    Status.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Status.setForeground(new java.awt.Color(255, 255, 255));
    Status.setText("Status");
    mainPage.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

    txtIdMember.setEditable(false);
    txtIdMember.setBackground(new java.awt.Color(255, 255, 255));
    txtIdMember.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 90, 30));

    idMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    idMember.setForeground(new java.awt.Color(255, 255, 255));
    idMember.setText("ID Member");
    mainPage.add(idMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 80, -1));

    txtIdMobil.setEditable(false);
    txtIdMobil.setBackground(new java.awt.Color(255, 255, 255));
    txtIdMobil.setForeground(new java.awt.Color(33, 33, 33));
    mainPage.add(txtIdMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 90, 30));

    idMobil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    idMobil.setForeground(new java.awt.Color(255, 255, 255));
    idMobil.setText("ID Mobil");
    mainPage.add(idMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 70, -1));

    getContentPane().add(mainPage, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int id;
    if (txtIdMobil.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
    } else {
      mobilService = new MobilServiceImpl();
      int dialogButton = JOptionPane.YES_NO_OPTION;

      id = Integer.parseInt(txtIdMobil.getText());
      int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin untuk menghapus?", "Warning", dialogButton);
      if (dialogResult == JOptionPane.YES_OPTION) {
        mobilService.delete(id);
        loadData();
        emptyField();
      }
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void btnDataMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataMemberActionPerformed
    dataMember = new DataMember(admin);
    dataMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnDataMemberActionPerformed

  private void btnDataCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataCustomerActionPerformed
    dataCustomer = new DataCustomer(admin);
    dataCustomer.setVisible(true);
    close();
  }//GEN-LAST:event_btnDataCustomerActionPerformed

  private void btnKelolaTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelolaTransaksiActionPerformed
    kelolaTransaksi = new KelolaTransaksi(admin);
    kelolaTransaksi.setVisible(true);
    close();
  }//GEN-LAST:event_btnKelolaTransaksiActionPerformed

  private void tblMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMobilMouseClicked
    // TODO add your handling code here:
    String noPlat, merk, warna, jenis, status;
    char transmisi;
    int idMobil, idMember, kapasitas, tahun;
    double harga;

    int row = tblMobil.getSelectedRow();
    idMobil = Integer.parseInt(tblMobil.getValueAt(row, 0).toString());
    idMember = Integer.parseInt(tblMobil.getValueAt(row, 1).toString());
    noPlat = tblMobil.getValueAt(row, 2).toString();
    merk = tblMobil.getValueAt(row, 3).toString();
    warna = tblMobil.getValueAt(row, 4).toString();
    jenis = tblMobil.getValueAt(row, 5).toString();
    kapasitas = Integer.parseInt(tblMobil.getValueAt(row, 6).toString());
    transmisi = tblMobil.getValueAt(row, 7).toString().charAt(0);
    tahun = Integer.parseInt(tblMobil.getValueAt(row, 8).toString());
    harga = Double.parseDouble(tblMobil.getValueAt(row, 9).toString());
    status = tblMobil.getValueAt(row, 10).toString();

    txtIdMobil.setText(idMobil + "");
    txtIdMember.setText(idMember + "");
    txtPlatno.setText(noPlat + "");
    txtWarna.setText(warna);
    txtJenis.setText(jenis);
    txtKapasitas.setText(kapasitas + "");
    if (transmisi == 'A') {
      txtTransmisi.setText("Automatic");
    } else {
      txtTransmisi.setText("Manual");
    }
    txtMerk.setText(merk);
    txtTahun.setText(tahun + "");
    txtHarga.setText(harga + "");
    txtStatus.setText(status);
  }//GEN-LAST:event_tblMobilMouseClicked

  private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    int dialogButton = JOptionPane.YES_NO_OPTION;

    int dialogResult = JOptionPane.showConfirmDialog(null, "yakin mau Logout nih?", "Warning", dialogButton);
    if (dialogResult == JOptionPane.YES_OPTION) {
      LandingPage landingPage = new LandingPage();
      admin.setLoginStatus(false);
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
      java.util.logging.Logger.getLogger(KelolaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(KelolaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(KelolaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(KelolaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new KelolaMobil(admin).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Harga;
  private javax.swing.JLabel Jenis;
  private javax.swing.JLabel Kapasitas;
  private javax.swing.JLabel Merk;
  private javax.swing.JLabel Nama3;
  private javax.swing.JLabel Platno;
  private javax.swing.JLabel SiRental;
  private javax.swing.JLabel Status;
  private javax.swing.JLabel Tahun;
  private javax.swing.JLabel Transmisi;
  private javax.swing.JLabel Warna;
  private javax.swing.JButton btnDataCustomer;
  private javax.swing.JButton btnDataMember;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnKelolaMobil;
  private javax.swing.JButton btnKelolaTransaksi;
  private javax.swing.JButton btnLogout;
  private javax.swing.JLabel hiraukan;
  private javax.swing.JLabel idMember;
  private javax.swing.JLabel idMobil;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel mainPage;
  private javax.swing.JLabel namaLogin;
  private javax.swing.JPanel navbar;
  private javax.swing.JLabel profile;
  private javax.swing.JPanel sidePanel;
  private javax.swing.JTable tblMobil;
  private javax.swing.JTextField txtHarga;
  private javax.swing.JTextField txtIdMember;
  private javax.swing.JTextField txtIdMobil;
  private javax.swing.JTextField txtJenis;
  private javax.swing.JTextField txtKapasitas;
  private javax.swing.JTextField txtMerk;
  private javax.swing.JTextField txtPlatno;
  private javax.swing.JTextField txtRp1;
  private javax.swing.JTextField txtSaldoAdmin;
  private javax.swing.JTextField txtStatus;
  private javax.swing.JTextField txtTahun;
  private javax.swing.JTextField txtTransmisi;
  private javax.swing.JTextField txtWarna;
  // End of variables declaration//GEN-END:variables
}
