/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oop.reguler.SiRental.swing.member;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.service.MobilService;
import com.oop.reguler.SiRental.serviceimpl.MobilServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import com.oop.reguler.SiRental.swing.landingpage.LandingPageMember;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MEMi
 */
public class MobilMember extends javax.swing.JFrame {

  public static Member member;
  MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();

  /**
   * Creates new form Mobil
   */
  public MobilMember(Member member) {
    initComponents();
    this.setLocationRelativeTo(null);
    this.member = member;
    loadData(member);
    lblNamaMember.setText(member.getNama());
  }

  public void close() {
    WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
  }

  private void emptyField() {
    txtIdMobil.setText("");
    txtNoPlat.setText("");
    txtMerk.setText("");
    txtWarna.setText("");
    cbJenis.setSelectedIndex(0);
    cbKapasitas.setSelectedIndex(0);
    rbTransmisiGroup.clearSelection();
    txtTahun.setText("");
    radioGroupStatus.clearSelection();
    txtHarga.setText("");
  }

  private void loadData(Member member) {
    mobilServiceImpl = new MobilServiceImpl();
    List<Mobil> listMobil;
    listMobil = mobilServiceImpl.findAllMobilMember(member);
    Object[][] objectMobil = new Object[listMobil.size()][10];

    int counter = 0;

    for (Mobil mobil : listMobil) {
      objectMobil[counter][0] = mobil.getIdMobil();
      objectMobil[counter][1] = mobil.getPlatNo();
      objectMobil[counter][2] = mobil.getMerk();
      objectMobil[counter][3] = mobil.getWarna();
      objectMobil[counter][4] = mobil.getJenis();
      objectMobil[counter][5] = mobil.getKapasitas();
      objectMobil[counter][6] = mobil.getTransmisi();
      objectMobil[counter][7] = mobil.getTahunKeluar();
      objectMobil[counter][8] = mobil.getHarga();
      objectMobil[counter][9] = mobil.getStatus();
      counter++;
    }
    tabelMobilMember.setModel(new javax.swing.table.DefaultTableModel(
            objectMobil, new String[]{
              "ID", "No Plat", "Merk", "Warna", "Jenis", "Kapasitas", "Transmisi", "Tahun", "Harga", "Status"
            }));
    
    double saldo = member.getSaldo();
    txtSaldoMember.setText(saldo + "");
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    rbTransmisiGroup = new javax.swing.ButtonGroup();
    radioGroupStatus = new javax.swing.ButtonGroup();
    navbar = new javax.swing.JPanel();
    SiRental = new javax.swing.JLabel();
    btnHome = new javax.swing.JButton();
    btnMobil = new javax.swing.JButton();
    profile = new javax.swing.JLabel();
    lblNamaMember = new javax.swing.JLabel();
    mainPage = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    mobilAnda = new javax.swing.JLabel();
    btnDelete = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnTambah = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelMobilMember = new javax.swing.JTable();
    form = new javax.swing.JPanel();
    noPlat = new javax.swing.JLabel();
    txtNoPlat = new javax.swing.JTextField();
    Warna = new javax.swing.JLabel();
    txtWarna = new javax.swing.JTextField();
    Kapasitas = new javax.swing.JLabel();
    Tahun = new javax.swing.JLabel();
    txtTahun = new javax.swing.JTextField();
    Merk = new javax.swing.JLabel();
    txtMerk = new javax.swing.JTextField();
    Jenis = new javax.swing.JLabel();
    Transmisi = new javax.swing.JLabel();
    Harga = new javax.swing.JLabel();
    txtHarga = new javax.swing.JTextField();
    cbKapasitas = new javax.swing.JComboBox<>();
    cbJenis = new javax.swing.JComboBox<>();
    Status = new javax.swing.JLabel();
    radioAutomatic = new javax.swing.JRadioButton();
    radioManual = new javax.swing.JRadioButton();
    radioStatusOn = new javax.swing.JRadioButton();
    radioStatusOff = new javax.swing.JRadioButton();
    txtOrang = new javax.swing.JTextField();
    idMobil = new javax.swing.JLabel();
    txtIdMobil = new javax.swing.JTextField();
    btnRefresh = new javax.swing.JButton();
    txtSaldoMember = new javax.swing.JTextField();
    txtRp = new javax.swing.JTextField();
    Nama2 = new javax.swing.JLabel();

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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
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

    mobilAnda.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
    mobilAnda.setForeground(new java.awt.Color(255, 255, 255));
    mobilAnda.setText("Mobil Anda");

    btnDelete.setBackground(new java.awt.Color(33, 33, 33));
    btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
    btnDelete.setForeground(new java.awt.Color(255, 255, 255));
    btnDelete.setText("DELETE");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnUpdate.setBackground(new java.awt.Color(33, 33, 33));
    btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
    btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
    btnUpdate.setText("UPDATE");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnTambah.setBackground(new java.awt.Color(33, 33, 33));
    btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
    btnTambah.setForeground(new java.awt.Color(255, 255, 255));
    btnTambah.setText("TAMBAH");
    btnTambah.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnTambahActionPerformed(evt);
      }
    });

    tabelMobilMember.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "ID", "No Plat", "Merk", "Warna", "Jenis", "Kapasitas", "Transmisi", "Tahun", "Harga", "Status"
      }
    ));
    tabelMobilMember.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tabelMobilMemberMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tabelMobilMember);

    form.setBackground(new java.awt.Color(68, 68, 68));

    noPlat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    noPlat.setForeground(new java.awt.Color(255, 255, 255));
    noPlat.setText("No Plat");

    txtNoPlat.setForeground(new java.awt.Color(33, 33, 33));

    Warna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Warna.setForeground(new java.awt.Color(255, 255, 255));
    Warna.setText("Warna");

    txtWarna.setForeground(new java.awt.Color(33, 33, 33));

    Kapasitas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Kapasitas.setForeground(new java.awt.Color(255, 255, 255));
    Kapasitas.setText("Kapasitas");

    Tahun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Tahun.setForeground(new java.awt.Color(255, 255, 255));
    Tahun.setText("Tahun");

    txtTahun.setForeground(new java.awt.Color(33, 33, 33));

    Merk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Merk.setForeground(new java.awt.Color(255, 255, 255));
    Merk.setText("Merk");

    txtMerk.setForeground(new java.awt.Color(33, 33, 33));

    Jenis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Jenis.setForeground(new java.awt.Color(255, 255, 255));
    Jenis.setText("Jenis");

    Transmisi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Transmisi.setForeground(new java.awt.Color(255, 255, 255));
    Transmisi.setText("Transmisi");

    Harga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Harga.setForeground(new java.awt.Color(255, 255, 255));
    Harga.setText("Harga");

    txtHarga.setForeground(new java.awt.Color(33, 33, 33));

    cbKapasitas.setForeground(new java.awt.Color(33, 33, 33));
    cbKapasitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "7", "8" }));
    cbKapasitas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbKapasitasActionPerformed(evt);
      }
    });

    cbJenis.setForeground(new java.awt.Color(33, 33, 33));
    cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "SUV", "MPV" }));

    Status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Status.setForeground(new java.awt.Color(255, 255, 255));
    Status.setText("Status");

    rbTransmisiGroup.add(radioAutomatic);
    radioAutomatic.setForeground(new java.awt.Color(255, 255, 255));
    radioAutomatic.setText("Automatic");
    radioAutomatic.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioAutomaticActionPerformed(evt);
      }
    });

    rbTransmisiGroup.add(radioManual);
    radioManual.setForeground(new java.awt.Color(255, 255, 255));
    radioManual.setText("Manual");
    radioManual.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioManualActionPerformed(evt);
      }
    });

    radioGroupStatus.add(radioStatusOn);
    radioStatusOn.setForeground(new java.awt.Color(255, 255, 255));
    radioStatusOn.setText("On");
    radioStatusOn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioStatusOnActionPerformed(evt);
      }
    });

    radioGroupStatus.add(radioStatusOff);
    radioStatusOff.setForeground(new java.awt.Color(255, 255, 255));
    radioStatusOff.setText("Off");
    radioStatusOff.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioStatusOffActionPerformed(evt);
      }
    });

    txtOrang.setEditable(false);
    txtOrang.setText("orang");
    txtOrang.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtOrangActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
    form.setLayout(formLayout);
    formLayout.setHorizontalGroup(
      formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtNoPlat)
          .addComponent(txtWarna)
          .addComponent(txtTahun)
          .addComponent(txtHarga)
          .addComponent(noPlat)
          .addComponent(Warna)
          .addComponent(Kapasitas)
          .addComponent(Harga)
          .addGroup(formLayout.createSequentialGroup()
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(Tahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(cbKapasitas, 0, 1, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtOrang, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(txtMerk, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(Merk)
            .addComponent(Jenis)
            .addComponent(Transmisi)
            .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(radioAutomatic, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(radioManual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Status)
          .addComponent(radioStatusOn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(radioStatusOff, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(25, 25, 25))
    );
    formLayout.setVerticalGroup(
      formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(formLayout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(formLayout.createSequentialGroup()
            .addComponent(noPlat)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNoPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(14, 14, 14)
            .addComponent(Warna))
          .addGroup(formLayout.createSequentialGroup()
            .addComponent(Merk)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(14, 14, 14)
            .addComponent(Jenis)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(formLayout.createSequentialGroup()
            .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(14, 14, 14)
            .addComponent(Kapasitas))
          .addGroup(formLayout.createSequentialGroup()
            .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(Transmisi)))
        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(formLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cbKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtOrang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(Tahun)
            .addGap(8, 8, 8)
            .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(Harga)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(formLayout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addComponent(radioAutomatic)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(radioManual)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(Status)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(radioStatusOn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(radioStatusOff)))
        .addContainerGap(14, Short.MAX_VALUE))
    );

    idMobil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    idMobil.setForeground(new java.awt.Color(255, 255, 255));
    idMobil.setText("IDMOBIL");

    txtIdMobil.setEditable(false);
    txtIdMobil.setForeground(new java.awt.Color(33, 33, 33));

    btnRefresh.setBackground(new java.awt.Color(33, 33, 33));
    btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
    btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
    btnRefresh.setText("REFRESH");
    btnRefresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRefreshActionPerformed(evt);
      }
    });

    txtSaldoMember.setEditable(false);
    txtSaldoMember.setBackground(new java.awt.Color(255, 255, 255));
    txtSaldoMember.setForeground(new java.awt.Color(33, 33, 33));

    txtRp.setEditable(false);
    txtRp.setBackground(new java.awt.Color(255, 255, 255));
    txtRp.setForeground(new java.awt.Color(33, 33, 33));
    txtRp.setText("Rp.");

    Nama2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Nama2.setForeground(new java.awt.Color(255, 255, 255));
    Nama2.setText("Saldo Anda");

    javax.swing.GroupLayout mainPageLayout = new javax.swing.GroupLayout(mainPage);
    mainPage.setLayout(mainPageLayout);
    mainPageLayout.setHorizontalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPageLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(mainPageLayout.createSequentialGroup()
            .addComponent(idMobil)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnRefresh)
            .addGap(104, 104, 104)))
        .addGap(40, 40, 40)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPageLayout.createSequentialGroup()
              .addGap(174, 174, 174)
              .addComponent(mobilAnda)
              .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
              .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(btnTambah))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(mainPageLayout.createSequentialGroup()
            .addComponent(Nama2)
            .addGap(18, 18, 18)
            .addComponent(txtRp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(txtSaldoMember, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(logo)
        .addGap(41, 41, 41))
    );
    mainPageLayout.setVerticalGroup(
      mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
        .addContainerGap(9, Short.MAX_VALUE)
        .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
            .addComponent(logo)
            .addGap(362, 362, 362))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPageLayout.createSequentialGroup()
              .addComponent(mobilAnda)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtSaldoMember, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtRp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(Nama2))))
            .addGroup(mainPageLayout.createSequentialGroup()
              .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(idMobil)
                .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(14, 14, 14))
    );

    getContentPane().add(mainPage, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    // TODO add your handling code here:
    emptyField();
    LandingPageMember lpMember = new LandingPageMember(member);
    lpMember.setVisible(true);
    close();
  }//GEN-LAST:event_btnHomeActionPerformed

  private void btnMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnMobilActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int id;
    if (txtIdMobil.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Pilih Data yang akan dihapus!");
    } else {
      MobilService mobilService = new MobilServiceImpl();
      int dialogButton = JOptionPane.YES_NO_OPTION;

      id = Integer.parseInt(txtIdMobil.getText());

      int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin untuk menghapus?", "Warning", dialogButton);
      if (dialogResult == JOptionPane.YES_OPTION) {
        mobilService.delete(id);
        loadData(member);
        emptyField();
      }
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    String noPlat, merk, warna, jenis, status;
    char transmisi;
    int id, kapasitas, tahun;
    double harga;

    MobilService mobilService = new MobilServiceImpl();

    transmisi = transmisiGlobal;
    status = statusGlobal;

    if (txtIdMobil.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Pilih Data yang akan Update!");
    } else {
      if (txtNoPlat.getText().equals("") || txtMerk.getText().equals("")
              || txtWarna.getText().equals("")
              || transmisi != 'A' && transmisi != 'M'
              || status.equals("ON") && status.equals("OFF")
              || txtTahun.getText().equals("")
              || txtHarga.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Isi semua Data sebelum Update!");
      } else {
        id = Integer.parseInt(txtIdMobil.getText());
        noPlat = txtNoPlat.getText();
        merk = txtMerk.getText();
        warna = txtWarna.getText();
        jenis = cbJenis.getSelectedItem().toString();
        kapasitas = Integer.parseInt(cbKapasitas.getSelectedItem().toString());
        tahun = Integer.parseInt(txtTahun.getText());
        harga = Double.parseDouble(txtHarga.getText());

        Mobil mobil = new Mobil();
        mobil.setIdMobil(id);
        mobil.setPlatNo(noPlat);
        mobil.setMerk(merk);
        mobil.setWarna(warna);
        mobil.setJenis(jenis);
        mobil.setKapasitas(kapasitas);
        mobil.setTransmisi(transmisi);
        mobil.setTahunKeluar(tahun);
        mobil.setHarga(harga);
        mobil.setStatus(status);

        mobilService.update(mobil);
        JOptionPane.showMessageDialog(null, "Data Mobil Berhasil diUpdate!");
        loadData(member);
        emptyField();
      }
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    String noPlat, merk, warna, jenis, status;
    char transmisi;
    int idMember, kapasitas, tahun;
    double harga;

    MobilService mobilService = new MobilServiceImpl();

    transmisi = transmisiGlobal;
    if (txtNoPlat.getText().equals("") || txtMerk.getText().equals("")
            || txtWarna.getText().equals("")
            || transmisi != 'A' && transmisi != 'M'
            || txtTahun.getText().equals("")
            || txtHarga.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Isi semua Data sebelum menambahkan!");
    } else {
      idMember = member.getIdMember();
      noPlat = txtNoPlat.getText();
      merk = txtMerk.getText();
      warna = txtWarna.getText();
      jenis = cbJenis.getSelectedItem().toString();
      kapasitas = Integer.parseInt(cbKapasitas.getSelectedItem().toString());
      //Pengen masukin exception salah input integer/double
      tahun = Integer.parseInt(txtTahun.getText());
      harga = Double.parseDouble(txtHarga.getText());

      Mobil mobil = new Mobil();
      mobil.setMember(member);
      mobil.setPlatNo(noPlat);
      mobil.setMerk(merk);
      mobil.setWarna(warna);
      mobil.setJenis(jenis);
      mobil.setKapasitas(kapasitas);
      mobil.setTransmisi(transmisi);
      mobil.setTahunKeluar(tahun);
      mobil.setHarga(harga);

      mobilService.create(mobil);
      JOptionPane.showMessageDialog(null, "Data Mobil Berhasil diTambahkan!");
      loadData(member);
      emptyField();
    }
  }//GEN-LAST:event_btnTambahActionPerformed

  private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
    // TODO add your handling code here:
    ProfileMember profileMember = new ProfileMember(member);
    profileMember.setVisible(true);
    close();

  }//GEN-LAST:event_profileMouseClicked

  private void cbKapasitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKapasitasActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbKapasitasActionPerformed

  private void tabelMobilMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMobilMemberMouseClicked
    String noPlat, merk, warna, jenis, status;
    char transmisi;
    int id, kapasitas, tahun;
    double harga;

    int row = tabelMobilMember.getSelectedRow();
    id = Integer.parseInt(tabelMobilMember.getValueAt(row, 0).toString());
    noPlat = tabelMobilMember.getValueAt(row, 1).toString();
    merk = tabelMobilMember.getValueAt(row, 2).toString();
    warna = tabelMobilMember.getValueAt(row, 3).toString();
    jenis = tabelMobilMember.getValueAt(row, 4).toString();
    kapasitas = Integer.parseInt(tabelMobilMember.getValueAt(row, 5).toString());
    transmisi = tabelMobilMember.getValueAt(row, 6).toString().charAt(0);
    tahun = Integer.parseInt(tabelMobilMember.getValueAt(row, 7).toString());
    harga = Double.parseDouble(tabelMobilMember.getValueAt(row, 8).toString());
    status = tabelMobilMember.getValueAt(row, 9).toString();

    txtIdMobil.setText(id + "");
    txtNoPlat.setText(noPlat + "");
    txtWarna.setText(warna);
    txtMerk.setText(merk);
    txtTahun.setText(tahun + "");
    txtHarga.setText(harga + "");

    if (transmisi == 'A' || transmisi == 'a') {
      radioAutomatic.setSelected(true);
    }
    if (transmisi == 'M' || transmisi == 'm') {
      radioManual.setSelected(true);
    }

    if (status.equals("ON")) {
      radioStatusOn.setSelected(true);
    }
    if (status.equals("OFF")) {
      radioStatusOff.setSelected(true);
    }

    cbKapasitas.setSelectedItem(kapasitas);
    cbJenis.setSelectedItem(jenis);
  }//GEN-LAST:event_tabelMobilMemberMouseClicked

  private char transmisiGlobal;

  private void radioAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAutomaticActionPerformed
    transmisiGlobal = 'A';
  }//GEN-LAST:event_radioAutomaticActionPerformed

  private void radioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioManualActionPerformed
    transmisiGlobal = 'M';
  }//GEN-LAST:event_radioManualActionPerformed

  private String statusGlobal;

  private void radioStatusOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStatusOnActionPerformed
    statusGlobal = "ON";
  }//GEN-LAST:event_radioStatusOnActionPerformed

  private void radioStatusOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStatusOffActionPerformed
    statusGlobal = "OFF";
  }//GEN-LAST:event_radioStatusOffActionPerformed

  private void txtOrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrangActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtOrangActionPerformed

  private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
    loadData(member);
    emptyField();
  }//GEN-LAST:event_btnRefreshActionPerformed

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
      java.util.logging.Logger.getLogger(MobilMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MobilMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MobilMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MobilMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MobilMember(member).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Harga;
  private javax.swing.JLabel Jenis;
  private javax.swing.JLabel Kapasitas;
  private javax.swing.JLabel Merk;
  private javax.swing.JLabel Nama2;
  private javax.swing.JLabel SiRental;
  private javax.swing.JLabel Status;
  private javax.swing.JLabel Tahun;
  private javax.swing.JLabel Transmisi;
  private javax.swing.JLabel Warna;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnMobil;
  private javax.swing.JButton btnRefresh;
  private javax.swing.JButton btnTambah;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> cbJenis;
  private javax.swing.JComboBox<String> cbKapasitas;
  private javax.swing.JPanel form;
  private javax.swing.JLabel idMobil;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblNamaMember;
  private javax.swing.JLabel logo;
  private javax.swing.JPanel mainPage;
  private javax.swing.JLabel mobilAnda;
  private javax.swing.JPanel navbar;
  private javax.swing.JLabel noPlat;
  private javax.swing.JLabel profile;
  private javax.swing.JRadioButton radioAutomatic;
  private javax.swing.ButtonGroup radioGroupStatus;
  private javax.swing.JRadioButton radioManual;
  private javax.swing.JRadioButton radioStatusOff;
  private javax.swing.JRadioButton radioStatusOn;
  private javax.swing.ButtonGroup rbTransmisiGroup;
  private javax.swing.JTable tabelMobilMember;
  private javax.swing.JTextField txtHarga;
  private javax.swing.JTextField txtIdMobil;
  private javax.swing.JTextField txtMerk;
  private javax.swing.JTextField txtNoPlat;
  private javax.swing.JTextField txtOrang;
  private javax.swing.JTextField txtRp;
  private javax.swing.JTextField txtSaldoMember;
  private javax.swing.JTextField txtTahun;
  private javax.swing.JTextField txtWarna;
  // End of variables declaration//GEN-END:variables
}
