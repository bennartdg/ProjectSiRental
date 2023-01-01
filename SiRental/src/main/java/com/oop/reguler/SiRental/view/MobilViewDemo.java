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

/**
 *
 * @author Ben
 */
public class MobilViewDemo {
  public static void menuMemberMobil(Member member) {
    int menu;
    char pilihan;

    MobilServiceImpl mobilService = new MobilServiceImpl();
    List<Mobil> listMobil;
    listMobil = mobilService.findAllMobilMember(member);

    System.out.println("List Mobil Saya");
    System.out.println("");
    for (Mobil mobil : listMobil) {
      System.out.println("ID MOBIL    : " + mobil.getIdMobil());
      System.out.println("PLAT NOMOR  : " + mobil.getPlatNo());
      System.out.println("MERK        : " + mobil.getMerk());
      System.out.println("WARNA       : " + mobil.getWarna());
      System.out.println("JENIS       : " + mobil.getJenis());
      System.out.println("KAPASITAS   : " + mobil.getTransmisi());
      System.out.println("TAHUN KELUAR: " + mobil.getTahunKeluar());
      System.out.println("HARGA       : " + mobil.getHarga());
      System.out.println("STATUS      : " + mobil.getStatus());
      System.out.println("");
    }

    System.out.println("Menu :");
    System.out.println("[1] Tambah Mobil");
    System.out.println("[2] Update Mobil");
    System.out.println("[3] Hapus Mobil");

  }

  public static void menuCustomerMobil() {
    MobilService mobilService = new MobilServiceImpl();
    List<Mobil> listMobil;
    listMobil = mobilService.findAll();

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
  }
}
