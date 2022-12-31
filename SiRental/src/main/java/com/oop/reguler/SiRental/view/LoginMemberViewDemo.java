/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.service.MemberService;
import com.oop.reguler.SiRental.serviceimpl.MemberServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class LoginMemberViewDemo {

  public static void login() {
    Scanner scanner = new Scanner(System.in);
    MemberService memberService = new MemberServiceImpl();
    Member member;

    String username, password;
    boolean login = false;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| LOGIN MEMBER ");
      System.out.println("+---------------------------------------------------------------+");
      System.out.print("| Username : ");
      username = scanner.nextLine();
      System.out.print("| Password : ");
      password = scanner.nextLine();
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("");

      member = memberService.login(username, password);

      if (member != null) {
        login = true;
        member.setLoginStatus(true);
        System.out.println("Login berhasil...!");
        System.out.println("");
        // TODO : MemberViewDemo.menuMember(member);
      } else {
        System.out.println("Username atau Password Salah! Coba Lagi!");
      }

    } while (!login);
  }
}
