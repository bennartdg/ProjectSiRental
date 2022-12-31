/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.service.HargaService;
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
public class HargaServiceImpl implements HargaService {

  ConnectionManager conMan;
  Connection conn;
  Statement stmt;
  ResultSet rs;

  @Override
  public Double hitungHarga(Mobil object) {
    Mobil tmpMobil = new Mobil();
    double harga = 0;
    int kapasitas = 0;

    String sql = "SELECT mbl.JENIS, mbl.TRANSMISI, mbl.TAHUNKELUAR "
            + "FROM mobil mbl "
            + "WHERE mbl.IDMOBIL=" + object.getIdMobil() + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      tmpMobil.setJenis(rs.getString("JENIS"));
      tmpMobil.setTransmisi((char) rs.getObject("TRANSMISI"));
      tmpMobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));

      harga = total(tmpMobil);
      kapasitas = hitungKapasitas(tmpMobil);

      String sqlUpdate = "UPDATE mobil set HARGA = " + harga + ", "
              + "KAPASITAS = " + kapasitas + ""
              + "WHERE IDMOBIL = " + object.getIdMobil() + "";
      
      conMan = new ConnectionManager();
      conn = conMan.connect();

      try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlUpdate);
      } catch (SQLException ex) {
        Logger.getLogger(HargaServiceImpl.class.getName())
                .log(Level.SEVERE, null, ex);
      }
    } catch (SQLException ex) {
      Logger.getLogger(HargaServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }

    return null;
  }

  public int hitungKapasitas(Mobil tmpMobil) {

    if (tmpMobil.getJenis().equals("MPV")) {
      return 9;
    } else if (tmpMobil.getJenis().equals("SUV")) {
      return 7;
    } else {
      return 4;
    }

  }

  public double hitungHargaTahunKeluar(Mobil tmpMobil) {

    if (tmpMobil.getTahunKeluar() < 2010) {
      return 20000;
    } else if (tmpMobil.getTahunKeluar() >= 2010 && tmpMobil.getTahunKeluar() <= 2015) {
      return 40000;
    } else {
      return 60000;
    }

  }

  public double hitungHargaTransmisi(Mobil tmpMobil) {

    if (tmpMobil.getTransmisi() == 'A' || tmpMobil.getTransmisi() == 'a') {
      return 200000;
    } else {
      return 100000;
    }

  }

  public double total(Mobil tmpMobil) {
    return hitungHargaTransmisi(tmpMobil) + hitungHargaTahunKeluar(tmpMobil);
  }

}
