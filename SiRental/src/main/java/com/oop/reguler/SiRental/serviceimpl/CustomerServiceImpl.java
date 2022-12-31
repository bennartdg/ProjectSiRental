/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Akun;
import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.service.CustomerService;
import com.oop.reguler.SiRental.util.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben
 */
public class CustomerServiceImpl implements CustomerService {

  private ConnectionManager conMan;
  private Connection conn;
  Statement stmt;
  ResultSet rs;

  @Override
  public Customer login(String username, String password) {
    Customer customer = null;
    Akun akun = null;

    String sql = "SELECT C.IDCUSTOMER, "
            + "C.NAMA, C.JENISKELAMIN, C.ALAMAT, "
            + "C.TELEPON, C.SALDO, "
            + "AK.IDAKUN, AK.USERNAME, AK.PASSWORD, AK.LEVEL "
            + "FROM CUSTOMER C, AKUN AK "
            + "WHERE C.IDAKUN = AK.IDAKUN "
            + "AND AK.USERNAME = '" + username + "' "
            + "AND AK.PASSWORD = '" + password + "'";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        customer = new Customer();
        customer.setIdCostumer(rs.getInt("IDCUSTOMER"));
        customer.setNama(rs.getString("NAMA"));
        customer.setJenisKelamin(rs.getString("JENISKELAMIN").charAt(0));
        customer.setAlamat(rs.getString("ALAMAT"));
        customer.setTelepon(rs.getString("TELEPON"));
        customer.setSaldo(rs.getDouble("SALDO"));

        akun = new Akun();
        akun.setId(rs.getInt("IDAKUN"));
        akun.setUsername(rs.getString("USERNAME"));
        akun.setUsername(rs.getString("PASSWORD"));
        akun.setLevel(rs.getString("LEVEL"));

        customer.setAkun(akun);
      }

      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }

    return customer;
  }

}
