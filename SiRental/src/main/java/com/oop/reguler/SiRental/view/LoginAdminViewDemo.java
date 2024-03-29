/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Admin;
import com.oop.reguler.SiRental.service.AdminService;
import com.oop.reguler.SiRental.serviceimpl.AdminServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class LoginAdminViewDemo {

  public static void login() {
    Scanner scanner = new Scanner(System.in);
    AdminService adminService = new AdminServiceImpl();
    Admin admin;
    
    String username, password;
    boolean login = false;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| LOGIN ADMIN ");
      System.out.println("+---------------------------------------------------------------+");
      System.out.print("| Username : ");
      username = scanner.nextLine();
      System.out.print("| Password : ");
      password = scanner.nextLine();
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("");
      
      admin = adminService.login(username, password);
      
      if(admin != null){
        login = true;
        admin.setLoginStatus(true);
        System.out.println("Login berhasil...!");
        System.out.println("");
        // TODO : AdminViewDemo.menuAdmin(admin);
      }else{
        System.out.println("Username atau Password Salah! Coba Lagi!");
      }
      
    } while (!login);

  }
}
