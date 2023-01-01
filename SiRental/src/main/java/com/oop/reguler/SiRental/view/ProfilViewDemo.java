/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.service.CustomerService;
import com.oop.reguler.SiRental.service.MemberService;
import com.oop.reguler.SiRental.serviceimpl.CustomerServiceImpl;
import com.oop.reguler.SiRental.serviceimpl.MemberServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class ProfilViewDemo {

  static Scanner scanner;

  public static void memberProfil(Member member) {
    scanner = new Scanner(System.in);
    char pilihanKembali;
    char pilihanEdit;
    boolean keluar = false;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| PROFIL MEMBER");
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("MEMBER ID     : " + member.getIdMember());
      System.out.println("USERNAME      : " + member.getAkun().getUsername());
      System.out.println("NAMA          : " + member.getNama());
      System.out.println("JENIS KELAMIN : " + pilihJenisKelamin(member));
      System.out.println("ALAMAT        : " + member.getAlamat());
      System.out.println("TELEPON       : " + member.getTelepon());
      System.out.println("SALDO         : Rp. " + member.getSaldo() + ",00");

      System.out.println("");

      System.out.print("Edit Profil? [Y/N] : ");
      pilihanEdit = scanner.next().charAt(0);
      if (pilihanEdit == 'Y' || pilihanEdit == 'y') {
        manageMemberProfil(member);
      }

      System.out.print("Kembali? [Y/N] : ");
      pilihanKembali = scanner.next().charAt(0);
      if (pilihanKembali == 'Y' || pilihanKembali == 'y') {
        keluar = true;
      }
    } while (!keluar);
  }
  
    public static void customerProfil(Customer customer) {
    scanner = new Scanner(System.in);
    char pilihanKembali;
    char pilihanEdit;
    boolean keluar = false;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| PROFIL MEMBER");
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("MEMBER ID     : " + customer.getIdCustomer());
      System.out.println("USERNAME      : " + customer.getAkun().getUsername());
      System.out.println("NAMA          : " + customer.getNama());
      System.out.println("JENIS KELAMIN : " + pilihJenisKelamin(customer));
      System.out.println("ALAMAT        : " + customer.getAlamat());
      System.out.println("TELEPON       : " + customer.getTelepon());
      System.out.println("SALDO         : Rp. " + customer.getSaldo() + ",00");

      System.out.println("");

      System.out.print("Edit Profil? [Y/N] : ");
      pilihanEdit = scanner.next().charAt(0);
      if (pilihanEdit == 'Y' || pilihanEdit == 'y') {
        manageCustomerProfil(customer);
      }

      System.out.print("Kembali? [Y/N] : ");
      pilihanKembali = scanner.next().charAt(0);
      if (pilihanKembali == 'Y' || pilihanKembali == 'y') {
        keluar = true;
      }
    } while (!keluar);
  }
  
  
  public static String pilihJenisKelamin(Member member) {
    if (member.getJenisKelamin() == 'L' || member.getJenisKelamin() == 'l') {
      return "Laki-laki";
    } else {
      return "Perempuan";
    }
  }
  
  public static String pilihJenisKelamin(Customer customer) {
    if (customer.getJenisKelamin() == 'L' || customer.getJenisKelamin() == 'l') {
      return "Laki-laki";
    } else {
      return "Perempuan";
    }
  }

  public static void manageMemberProfil(Member member) {
    MemberService memberService = new MemberServiceImpl();
    scanner = new Scanner(System.in);

    System.out.println("Edit Mode!");
    System.out.println("");
    System.out.print("NAMA                : ");
    member.setNama(scanner.nextLine());
    System.out.print("JENIS KELAMIN [L/P] : ");
    member.setJenisKelamin(scanner.next().charAt(0));
    scanner.nextLine();
    System.out.print("ALAMAT              : ");
    member.setAlamat(scanner.nextLine());
    System.out.print("TELEPON             : ");
    member.setTelepon(scanner.nextLine());
    
    memberService.update(member);
    System.out.println("Data Berhasil diUpdate!");
    System.out.println("");
  }
  
  public static void manageCustomerProfil(Customer customer){
    CustomerService customerService = new CustomerServiceImpl();
    scanner = new Scanner(System.in);

    System.out.println("Edit Mode!");
    System.out.println("");
    System.out.print("NAMA                : ");
    customer.setNama(scanner.nextLine());
    System.out.print("JENIS KELAMIN [L/P] : ");
    customer.setJenisKelamin(scanner.next().charAt(0));
    scanner.nextLine();
    System.out.print("ALAMAT              : ");
    customer.setAlamat(scanner.nextLine());
    System.out.print("TELEPON             : ");
    customer.setTelepon(scanner.nextLine());
    
    customerService.update(customer);
    System.out.println("Data Berhasil diUpdate!");
    System.out.println("");
  }
}
