/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Admin;
import com.oop.reguler.SiRental.pojo.Akun;
import com.oop.reguler.SiRental.service.AdminService;
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
public class AdminServiceImpl implements AdminService {

  private ConnectionManager conMan;
  private Connection conn;
  Statement stmt;
  ResultSet rs;

  @Override
  public Admin login(String username, String password) {
    Admin admin = null;
    Akun akun = null;
    String sql = "SELECT AD.IDADMIN, AD.SALDO, "
            + "AK.USERNAME, AK.PASSWORD, AK.LEVEL "
            + "FROM ADMIN AD, AKUN AK "
            + "WHERE AD.USERNAME = AK.USERNAME "
            + "AND AK.USERNAME = '" + username + "' "
            + "AND AK.PASSWORD = '" + password + "'";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        admin = new Admin();
        admin.setIdAdmin(rs.getInt("IDADMIN"));
        admin.setSaldo(rs.getDouble("SALDO"));

        akun = new Akun();
        akun.setUsername(rs.getString("USERNAME"));
        akun.setUsername(rs.getString("PASSWORD"));
        akun.setLevel(rs.getString("LEVEL"));

        admin.setAkun(akun);
      }

      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(AdminServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }

    return admin;
  }
}
