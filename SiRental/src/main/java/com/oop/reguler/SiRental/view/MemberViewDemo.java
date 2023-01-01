/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Member;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class MemberViewDemo {
  public static void menuMember(Member member) {
    int menu = 0;
    boolean keluar = false;
    char pilihan;
    Scanner scanner;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| MEMBER DASHBOARD  ");
      System.out.println("+---------------------------------------------------------------+");

      System.out.println("");
      System.out.println("Selamat Datang " + member.getNama() + "!");
      System.out.println("");

      System.out.println("Mau Ngapain?");
      System.out.println("[1] Mobil Saya");
      System.out.println("[2] Profil ");
      System.out.println("[0] Logout");
      System.out.println("");
      System.out.print("Masukkan pilihan menu : ");
      scanner = new Scanner(System.in);
      menu = scanner.nextInt();

      switch (menu) {
        case 1:
          MobilViewDemo.menuMemberMobil(member);
          break;
        case 2:
          ProfilViewDemo.memberProfil(member);
          break;
        case 0:
          System.out.println("");
          System.out.println("Apakah anda yakin untuk Logout?");
          System.out.print("[Y/N] : ");
          scanner = new Scanner(System.in);
          pilihan = scanner.next().charAt(0);
          if (pilihan == 'Y' || pilihan == 'y') {
            member.setLoginStatus(false);
            System.out.println("Logout!");
            LandingPageViewDemo.landingPage();
          }
          break;
        default:
          System.out.println("Pilihan yang Anda masukkan Salah! Coba Lagi!");
          break;
      }
    } while (member.getLoginStatus());
    System.out.println("Terima kasih sudah pakai Si Rental!");
    System.exit(0);
  }
}
