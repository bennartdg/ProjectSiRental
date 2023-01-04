/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.pojo.Transaksi;
import com.oop.reguler.SiRental.service.MobilService;
import com.oop.reguler.SiRental.service.TransaksiService;
import com.oop.reguler.SiRental.serviceimpl.CustomerServiceImpl;
import com.oop.reguler.SiRental.serviceimpl.MobilServiceImpl;
import com.oop.reguler.SiRental.serviceimpl.TransaksiServiceImpl;

/**
 *
 * @author Ben
 */
public class MobilViewCustomerDemo {
  static Scanner scanner;

  public static void menuCustomerMobil(Customer customer) {
    scanner = new Scanner(System.in);
    int menu;

    MobilService mobilService = new MobilServiceImpl();
    List<Mobil> listMobil;
    listMobil = mobilService.findAll();

    System.out.println("List Mobil tersedia di SI'Rental");
    System.out.println();
    for (Mobil mobil : listMobil) {
      System.out.println("ID MOBIL    : " + mobil.getIdMobil());
      System.out.println("PLAT NOMOR  : " + mobil.getPlatNo());
      System.out.println("MERK        : " + mobil.getMerk());
      System.out.println("WARNA       : " + mobil.getWarna());
      System.out.println("JENIS       : " + mobil.getJenis());
      System.out.println("KAPASITAS   : " + mobil.getTransmisi());
      System.out.println("TAHUN KELUAR: " + mobil.getTahunKeluar());
      System.out.println("HARGA       : " + mobil.getHarga());
      System.out.println("");
    }

    System.out.println("Menu :");
    System.out.println("[1] Pilih Mobil");
    System.out.println("[2] Mobil yang disewa");
    System.out.println("[0] Kembali");
    System.out.print("Pilih Menu : ");
    menu = scanner.nextInt();
    scanner.nextLine();

    switch (menu) {
      case 1:
        pilihMobil(customer);
        break;
      case 2:
        mobilSewa(customer);
        break;
      case 0:
        break;
      default:
        System.out.println("Menu tidak tersedia, silakan coba lagi!");
        break;
    }
  }

  public static void mobilSewa(Customer customer) {
    Mobil mobil = new Mobil();
    MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();
    scanner = new Scanner(System.in);

    char pilihan;

    System.out.println("Mobil yang Saya Sewa!");
    try {
      mobil = mobilServiceImpl.customerMobil(customer);

      rincianMobil(mobil);

      System.out.print("Kembalikan Mobil? [Y/N] : ");
      pilihan = scanner.next().charAt(0);

      if (pilihan == 'Y' || pilihan == 'y') {
        try {
          pengembalianMobil(customer);

          System.out.println("Mobil Berhasil diKembalikan");
        } catch (Exception e) {
          System.out.println("Mobil Gagal diKembalikan! " + e);
        }
      }
    } catch (Exception e) {
      System.out.println("Mobil Tidak Ada!");
    }
  }

  public static void pengembalianMobil(Customer customer) {
    scanner = new Scanner(System.in);
    Transaksi transaksi = new Transaksi();
    TransaksiServiceImpl transaksiServiceImpl = new TransaksiServiceImpl();
    MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();
    int id;

    System.out.println("Tentukan Tanggal Kembali [dd-MM-YYYY]! ");
    String tanggal;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.print("TANGGAL KEMBALI : ");
    tanggal = scanner.nextLine();
    LocalDate localDate = LocalDate.parse(tanggal, formatter);
    String tanggalKembali = localDate.toString();

    CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
    customer = customerServiceImpl.getAllAtribut(customer);
    id = customer.getMobil().getIdMobil();
    transaksi.setTanggalKembali(tanggalKembali);

    transaksiServiceImpl.returnMobilTanggal(customer, transaksi);
    mobilServiceImpl.updateStatusOn(id);

  }

  public static void pilihMobil(Customer customer) {
    scanner = new Scanner(System.in);
    int id;
    char pilihan;

    Mobil mobil = new Mobil();

    System.out.print("Pilih IDMOBIL dari mobil yang ingin diPilih! : ");
    id = scanner.nextInt();
    scanner.nextLine();

    try {
      MobilService mobilService = new MobilServiceImpl();
      mobil = mobilService.findById(id);

      System.out.println("Mobil Terpilih!");
      System.out.println();
    } catch (Exception e) {
      System.out.println("Mobil Tidak Berhasil diPilih! ");
      System.out.println();
    }

    System.out.print("Lakukan Transaksi? [Y/N] : ");
    pilihan = scanner.next().charAt(0);
    if (pilihan == 'Y' || pilihan == 'y') {
      try {
        lakukanTransaksi(customer, mobil);
      } catch (Exception e) {
        System.out.println("Mobil Transaksi Gagal!");
        System.out.println();
      }
    }
  }

  public static void lakukanTransaksi(Customer customer, Mobil mobil) {
    scanner = new Scanner(System.in);
    char pilihan;

    Transaksi transaksi = new Transaksi();
    TransaksiService transaksiService = new TransaksiServiceImpl();

    System.out.println("Anda Memilih Mobil dengan Spesifikasi berikut!");
    rincianMobil(mobil);

    System.out.println();

    System.out.println("Tentukan!");
    String tanggal;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.print("TANGGAL PESAN [dd-MM-YYYY] : ");
    tanggal = scanner.nextLine();
    LocalDate localDate = LocalDate.parse(tanggal, formatter);
    String tanggalPesan = localDate.toString();

    transaksi.setTanggalPesan(tanggalPesan);

    System.out.print("LAMA PEMINJAMAN            : ");
    transaksi.setLamaPeminjaman(scanner.nextInt());
    scanner.nextLine();

    transaksi.setTotalHarga(mobil.getHarga());

    transaksi.setMobil(mobil);
    transaksi.setCostumer(customer);
    transaksi.setMember(mobil.getMember());

    rincianTransaksi(transaksi, mobil);

    System.out.print("Lakukan Transaksi? [Y/N] : ");
    pilihan = scanner.next().charAt(0);

    if (pilihan == 'Y' || pilihan == 'y') {
      try {
        transaksiService.create(transaksi);

        TransaksiServiceImpl transaksiServiceImpl = new TransaksiServiceImpl();
        transaksiServiceImpl.updateSaldoAdmin(transaksi);
        transaksiServiceImpl.updateSaldoMember(transaksi);

        System.out.println("Transaksi Berhasil diLakukan!");

        MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();
        mobilServiceImpl.updateStatusOff(transaksi.getMobil().getIdMobil());

        double tmpSaldoCustomer = customer.getSaldo();
        customer.setSaldo(tmpSaldoCustomer - transaksi.getTotalHarga());

        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        customerServiceImpl.saldoPengurangan(customer);

      } catch (Exception e) {
        System.out.println("Transaksi Gagal diLakukan!");
      }
    }

  }

  public static void rincianMobil(Mobil mobil) {
    System.out.println("IDMOBIL         : " + mobil.getIdMobil());
    System.out.println("IDMEMBER        : " + mobil.getMember().getIdMember());
    System.out.println("MERK            : " + mobil.getMerk());
    System.out.println("WARNA           : " + mobil.getWarna());
    System.out.println("JENIS           : " + mobil.getJenis());
    System.out.println("KAPASITAS       : " + mobil.getKapasitas());
    System.out.println("TRANSMISI       : " + mobil.getTransmisi());
    System.out.println("TAHUN KELUAR    : " + mobil.getTahunKeluar());
  }

  public static void rincianTransaksi(Transaksi transaksi, Mobil mobil) {
    System.out.println("Rincian Transaksi");

    rincianMobil(mobil);

    System.out.println("HARGA           : " + mobil.getHarga());
    System.out.println("TANGGAL PESAN   : " + transaksi.getTanggalPesan());
    System.out.println("LAMA PEMINJAMAN : " + transaksi.getLamaPeminjaman());

    transaksi.setPajak(hitungPajakTransaksi(transaksi));
    transaksi.setHargaDurasi(hitungHargaLamaPeminjaman(transaksi));

    System.out.println("TOTAL PAJAK     : " + hitungPajakTransaksi(transaksi));
    System.out.println("HARGA LAMA PEMINJAMAN : " + hitungHargaLamaPeminjaman(transaksi));
    System.out.println("---------------------------------------(+)");

    transaksi.setTotalHarga(hitungTotalTransaksi(transaksi));
    System.out.println("TOTAL           : " + transaksi.getTotalHarga());

  }

  public static double hitungTotalTransaksi(Transaksi transaksi) {
    double total;

    total = hitungPajakTransaksi(transaksi) + hitungHargaLamaPeminjaman(transaksi);

    return total;
  }

  public static double hitungPajakTransaksi(Transaksi transaksi) {
    double pajak = (0.1 * transaksi.getTotalHarga());
    return pajak;
  }

  public static double hitungHargaLamaPeminjaman(Transaksi transaksi) {
    double hargaLamaPeminjaman = (transaksi.getTotalHarga() * transaksi.getLamaPeminjaman());
    return hargaLamaPeminjaman;
  }
}
