/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Customer;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class CustomerViewDemo {

  public static void menuCustomer(Customer customer) {
    int menu = 0;
    boolean keluar = false;
    char pilihan;
    Scanner scanner;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| CUSTOMER DASHBOARD  ");
      System.out.println("+---------------------------------------------------------------+");

      System.out.println("");
      System.out.println("Selamat Datang " + customer.getNama() + "!");
      System.out.println("");

      System.out.println("Mau Ngapain?");
      System.out.println("[1] Cari Mobil");
      System.out.println("[2] Profil ");
      System.out.println("[0] Logout");
      System.out.println("");
      System.out.print("Masukkan pilihan menu : ");
      scanner = new Scanner(System.in);
      menu = scanner.nextInt();

      switch (menu) {
        case 1:
          MobilViewDemo.menuCustomerMobil();
          break;
        case 2:
          ProfilViewDemo.customerProfil(customer);
          break;
        case 0:
          System.out.println("");
          System.out.println("Apakah anda yakin untuk Logout?");
          System.out.print("[Y/N] : ");
          scanner = new Scanner(System.in);
          pilihan = scanner.next().charAt(0);
          if (pilihan == 'Y' || pilihan == 'y') {
            customer.setLoginStatus(false);
            System.out.println("Logout!");
            LandingPageViewDemo.landingPage();
          }
          break;
        default:
          System.out.println("Pilihan yang Anda masukkan Salah! Coba Lagi!");
          break;
      }
    } while (customer.getLoginStatus());
    System.out.println("Terima kasih sudah pakai Si Rental!");
    System.exit(0);
  }
}
