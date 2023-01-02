/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.service.MobilService;
import com.oop.reguler.SiRental.serviceimpl.MobilServiceImpl;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class MobilViewMemberDemo {
  static Scanner scanner;

  public static void menuMemberMobil(Member member) {
    scanner = new Scanner(System.in);
    int menu;
    char pilihan;

    MobilServiceImpl mobilService = new MobilServiceImpl();
    List<Mobil> listMobil;
    listMobil = mobilService.findAllMobilMember(member);

    System.out.println("List Mobil Saya");
    System.out.println("");
    if (listMobil != null) {
      for (Mobil mobil : listMobil) {
        System.out.println("ID MOBIL    : " + mobil.getIdMobil());
        System.out.println("PLAT NOMOR  : " + mobil.getPlatNo());
        System.out.println("MERK        : " + mobil.getMerk());
        System.out.println("WARNA       : " + mobil.getWarna());
        System.out.println("JENIS       : " + mobil.getJenis());
        System.out.println("KAPASITAS   : " + mobil.getKapasitas());
        System.out.println("TRANSMISI   : " + mobil.getTransmisi());
        System.out.println("TAHUN KELUAR: " + mobil.getTahunKeluar());
        System.out.println("HARGA       : " + mobil.getHarga());
        System.out.println("STATUS      : " + mobil.getStatus());
        System.out.println("");
      }
    } else {
      System.out.println("Anda belum memiliki mobil! Silakan tambahkan mobil!");
      tambahMobil(member);
    }

    System.out.println("Menu :");
    System.out.println("[1] Tambah Mobil");
    System.out.println("[2] Update Mobil");
    System.out.println("[3] Hapus Mobil");
    System.out.println("[4] Ubah Status Mobil");
    System.out.println("[0] Kembali");
    System.out.print("Pilih Menu : ");
    menu = scanner.nextInt();
    scanner.nextLine();

    switch (menu) {
      case 1:
        tambahMobil(member);
        break;
      case 2:
        updateMobil(member);
        break;
      case 3:
        hapusMobil();
        break;
      case 4:
        ubahStatus();
        break;
      case 0:
        break;
      default:
        System.out.println("Menu tidak tersedia, silakan coba lagi!");
        break;
    }
  }

  public static void ubahStatus() {
    scanner = new Scanner(System.in);
    int id;
    char pilih;

    System.out.print("Pilih IDMOBIL dari mobil yang ingin diubah status! : ");
    id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("[Y] = ON");
    System.out.println("[N] = OFF");
    System.out.print("[Y/N] : ");
    pilih = scanner.next().charAt(0);

    MobilServiceImpl mobilServiceImpl = new MobilServiceImpl();

    if (pilih == 'Y' || pilih == 'y') {
      try {
        mobilServiceImpl.updateStatusOn(id);
        System.out.println("Mobil Status : ON!");
        System.out.println();
      } catch (Exception e) {
        System.out.println("Gagal Mengubah Status Mobil!");
        System.out.println();
      }
    } else {
      try {
        mobilServiceImpl.updateStatusOff(id);
        System.out.println("Mobil Status : OFF!");
        System.out.println();
      } catch (Exception e) {
        System.out.println("Gagal Mengubah Status Mobil!");
        System.out.println();
      }
    }
  }

  public static void tambahMobil(Member member) {
    Mobil mobil = new Mobil();
    scanner = new Scanner(System.in);

    System.out.println("Input Mode!");
    System.out.println();

    mobil = inputMobil(mobil);

    mobil.setMember(member);

    try {
      MobilService mobilService = new MobilServiceImpl();
      mobilService.create(mobil);
      System.out.println("Mobil Berhasil diTambahkan!");
      System.out.println();

    } catch (Exception e) {
      System.out.println("Mobil Tidak Berhasil diTambahkan!");
      System.out.println();

    }
  }

  public static void updateMobil(Member member) {
    Mobil mobil = new Mobil();
    scanner = new Scanner(System.in);

    System.out.println("Input Mode!");
    System.out.println();

    System.out.print("Pilih IDMOBIL yang ingin diupdate! : ");
    mobil.setIdMobil(scanner.nextInt());
    scanner.nextLine();

    System.out.println("Ubah menjadi");
    System.out.println();

    mobil = inputMobil(mobil);
    mobil.setMember(member);

    try {
      MobilService mobilService = new MobilServiceImpl();
      mobilService.update(mobil);
      System.out.println("Mobil Berhasil diUpdate!");
      System.out.println();

    } catch (Exception e) {
      System.out.println("Mobil Tidak Berhasil diUpdate!");
      System.out.println();

    }
  }

  public static Mobil inputMobil(Mobil mobil) {
    System.out.print("PLAT NOMOR            : ");
    mobil.setPlatNo(scanner.nextLine());
    System.out.print("MERK                  : ");
    mobil.setMerk(scanner.nextLine());
    System.out.print("WARNA                 : ");
    mobil.setWarna(scanner.nextLine());
    System.out.print("JENIS [MPV/SUV/SEDAN] : ");
    mobil.setJenis(scanner.nextLine());
    System.out.print("KAPASITAS             : ");
    mobil.setKapasitas(scanner.nextInt());
    scanner.nextLine();
    System.out.print("TRANSMISI [A/M]       : ");
    mobil.setTransmisi(scanner.nextLine().charAt(0));
    System.out.print("TAHUN KELUAR          : ");
    mobil.setTahunKeluar(scanner.nextInt());
    scanner.nextLine();
    System.out.print("HARGA                 : ");
    mobil.setHarga(scanner.nextDouble());
    scanner.nextLine();

    return mobil;
  }

  public static void hapusMobil() {
    scanner = new Scanner(System.in);

    int id;
    System.out.print("Pilih IDMOBIL dari mobil yang ingin diHapus! : ");
    id = scanner.nextInt();
    scanner.nextLine();
    try {
      MobilService mobilService = new MobilServiceImpl();
      mobilService.delete(id);
      System.out.println("Mobil Berhasil diHapus!");
      System.out.println();

    } catch (Exception e) {
      System.out.println("Mobil Tidak Berhasil diHapus!");
      System.out.println();
    }
  }
}
