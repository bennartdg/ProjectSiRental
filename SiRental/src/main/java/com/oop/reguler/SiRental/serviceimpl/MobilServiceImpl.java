/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.service.MobilService;
import com.oop.reguler.SiRental.util.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
public class MobilServiceImpl implements MobilService {

  private ConnectionManager conMan;
  private Connection conn;
  Statement stmt;
  ResultSet rs;

  @Override
  public List<Mobil> findAll() {
    List<Mobil> listMobil = new ArrayList<>();
    Mobil mobil = null;
    Member member = null;
    String sql = "SELECT mbl.IDMOBIL, mbr.IDMEMBER, mbl.PLATNO "
            + "mbl.MERK, mbl.WARNA, mbl.JENIS, mbl.KAPASITAS, mbl.TRANSMISI "
            + "mbl.TAHUNKELUAR, mbl.HARGA "
            + "FROM mobil mbl, member mbr "
            + "WHERE mbl.IDMEMBER = mbr.IDMEMBER";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        mobil = new Mobil();
        mobil.setIdMobil(rs.getInt("IDMOBIL"));

        member = new Member();
        member.setIdMember(rs.getInt("IDMEMBER"));

        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));

        mobil.setMember(member);
        listMobil.add(mobil);
      }
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }

    return listMobil;
  }

  @Override
  public Object create(Mobil object) {
    int result = 0;
    
    //Untuk Set harga Otomatis
    
    String sql = "INSERT INTO mobil (IDMOBIL, "
            + "IDMEMBER, PLATNO, MERK, WARNA, "
            + "JENIS, KAPASITAS, TRANSMISI, "
            + "TAHUNKELUAR, HARGA) "
            + "VALUES ('" + object.getIdMobil() + "', "
            + "'" + object.getMember().getIdMember() + "', "
            + "" + object.getPlatNo() + ", "
            + "" + object.getMerk() + ", "
            + "" + object.getWarna() + ", "
            + "" + object.getJenis() + ", "
            + "'" + object.getKapasitas() + "', "
            + "" + object.getTransmisi() + ", "
            + "'" + object.getTahunKeluar() + "', "
            + "'" + object.getHarga()  + "');";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return result;
  }

  @Override
  public Object update(Mobil object) {
    int result = 0;
    String sql = "UPDATE mobil SET harga='" + object.getHarga() + "', "
            + "HARGA='" + object.getHarga() + "', "
            + "TAHUNKELUAR='" + object.getTahunKeluar() + "', "
            + "TRANSMISI=" + object.getTransmisi() + ", "
            + "KAPASITAS='" + object.getKapasitas() + "', "
            + "JENIS=" + object.getJenis() + ", "
            + "WARNA=" + object.getWarna() + ", "
            + "MERK=" + object.getMerk() + ", "
            + "PLATNO=" + object.getPlatNo() + ", "
            + "IDMEMBER=" + object.getMember().getIdMember() + " "
            + "WHERE IDMOBIL=" + object.getIdMobil() + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      result = stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName()).
              log(Level.SEVERE, null, ex);
    }
    return result;
  }

  @Override
  public Mobil findById(int id) {
    Mobil mobil = null;
    Member member = null;

    String sql = "SELECT mbl.IDMOBIL, mbr.IDMEMBER, mbl.PLATNO "
            + "mbl.MERK, mbl.WARNA, mbl.JENIS, mbl.KAPASITAS, mbl.TRANSMISI "
            + "mbl.TAHUNKELUAR, mbl.HARGA "
            + "FROM mobil mbl, member mbr "
            + "WHERE mbl.IDMEMBER = mbr.IDMEMBER "
            + "AND mbl.IDMOBIL=" + id + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        mobil = new Mobil();
        mobil.setIdMobil(rs.getInt("IDMOBIL"));

        member = new Member();
        member.setIdMember(rs.getInt("IDMEMBER"));

        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));

        mobil.setMember(member);
      }
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return mobil;
  }

  @Override
  public Object delete(int id) {
    int result = 0;
    String sql = "DELETE FROM mobil WHERE IDMOBIL=" + id + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      result = stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return result;

  }
}
