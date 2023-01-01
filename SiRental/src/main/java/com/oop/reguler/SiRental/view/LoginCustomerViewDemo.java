/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.view;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.service.CustomerService;
import com.oop.reguler.SiRental.serviceimpl.CustomerServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class LoginCustomerViewDemo {

  public static void login() {
    Scanner scanner = new Scanner(System.in);
    CustomerService customerService = new CustomerServiceImpl();
    Customer customer;

    String username, password;
    boolean login = false;

    do {
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("| LOGIN CUSTOMER ");
      System.out.println("+---------------------------------------------------------------+");
      System.out.print("| Username : ");
      username = scanner.nextLine();
      System.out.print("| Password : ");
      password = scanner.nextLine();
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("");

      customer = customerService.login(username, password);

      if (customer != null) {
        login = true;
        customer.setLoginStatus(true);
        System.out.println("Login berhasil...!");
        System.out.println("");
        CustomerViewDemo.menuCustomer(customer);
      } else {
        System.out.println("Username atau Password Salah! Coba Lagi!");
      }

    } while (!login);
  }
}
