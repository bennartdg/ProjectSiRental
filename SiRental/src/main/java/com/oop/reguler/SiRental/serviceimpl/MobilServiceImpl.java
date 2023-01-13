/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Customer;
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

    String sql = "SELECT * FROM mobil";

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
        mobil.setMember(member);

        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));
        mobil.setStatus(rs.getString("STATUS"));

        listMobil.add(mobil);
      }
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }

    return listMobil;
  }

  public List<Mobil> findAllMobilCustomer() {
    List<Mobil> listMobil = new ArrayList<>();
    Mobil mobil = null;
    Member member = null;
    String sql = "SELECT * FROM mobil WHERE STATUS = 'ON'";

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
        mobil.setMember(member);

        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));
        mobil.setStatus(rs.getString("STATUS"));

        listMobil.add(mobil);
      }
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return listMobil;
  }

  public List<Mobil> findAllMobilMember(Member member) {
    List<Mobil> listMobil = new ArrayList<>();
    Mobil mobil = null;
    String sql = "SELECT mbl.IDMOBIL, mbl.PLATNO, "
            + "mbl.MERK, mbl.WARNA, mbl.JENIS, mbl.KAPASITAS, mbl.TRANSMISI, "
            + "mbl.TAHUNKELUAR, mbl.HARGA, mbl.STATUS "
            + "FROM mobil mbl "
            + "WHERE mbl.IDMEMBER = " + member.getIdMember();

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        mobil = new Mobil();

        mobil.setIdMobil(rs.getInt("IDMOBIL"));
        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));
        mobil.setStatus(rs.getString("STATUS"));

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

    String sql = "INSERT INTO mobil ("
            + "IDMEMBER, PLATNO, MERK, WARNA, "
            + "JENIS, KAPASITAS, TRANSMISI, "
            + "TAHUNKELUAR, HARGA, STATUS) "
            + "VALUES ("
            + "" + object.getMember().getIdMember() + ", "
            + "'" + object.getPlatNo() + "', "
            + "'" + object.getMerk() + "', "
            + "'" + object.getWarna() + "', "
            + "'" + object.getJenis() + "', "
            + "" + object.getKapasitas() + ", "
            + "'" + object.getTransmisi() + "', "
            + "" + object.getTahunKeluar() + ", "
            + "" + object.getHarga() + ", "
            + "'ON')";

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

    String sql = "UPDATE mobil SET "
            + "PLATNO = '" + object.getPlatNo() + "', "
            + "MERK = '" + object.getMerk() + "', "
            + "WARNA = '" + object.getWarna() + "', "
            + "JENIS = '" + object.getJenis() + "', "
            + "KAPASITAS = '" + object.getKapasitas() + "', "
            + "TRANSMISI = '" + object.getTransmisi() + "', "
            + "TAHUNKELUAR = " + object.getTahunKeluar() + ", "
            + "HARGA = " + object.getHarga() + ", "
            + "STATUS = '" + object.getStatus() + "' "
            + "WHERE IDMOBIL = " + object.getIdMobil() + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      result = stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
  }

  @Override
  public Mobil findById(int id) {
    Mobil mobil = null;
    Member member = null;

    String sql = "SELECT mbl.IDMOBIL, mbr.IDMEMBER, mbl.PLATNO, "
            + "mbl.MERK, mbl.WARNA, mbl.JENIS, mbl.KAPASITAS, mbl.TRANSMISI, "
            + "mbl.TAHUNKELUAR, mbl.HARGA "
            + "FROM mobil mbl, member mbr "
            + "WHERE mbl.IDMEMBER = mbr.IDMEMBER "
            + "AND mbl.IDMOBIL = " + id + "";

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

  public List<Mobil> findByMerk(String merk) {
    List<Mobil> listMobil = new ArrayList<>();
    Mobil mobil = new Mobil();
    Member member = null;

    String sql = "SELECT * from MOBIL "
            + "WHERE MERK LIKE '%" + merk + "%' AND STATUS = 'ON'";
    
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
        mobil.setMember(member);

        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getDouble("HARGA"));
        mobil.setStatus(rs.getString("STATUS"));

        listMobil.add(mobil);
      }
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    
    return listMobil;
  }

  @Override
  public Object delete(int id) {
    int result = 0;
    String sql = "DELETE FROM mobil WHERE IDMOBIL = " + id + "";

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

  public Object updateStatusOn(int id) {
    int result = 0;
    String sql = "UPDATE mobil SET STATUS = 'ON' WHERE IDMOBIL = " + id + "";
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

  public Object updateStatusOff(int id) {
    int result = 0;
    String sql = "UPDATE mobil SET STATUS = 'OFF' WHERE IDMOBIL = " + id + "";
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

  public Mobil customerMobil(Customer customer) {
    Mobil mobil = null;
    Member member = null;

    String sql = "SELECT t.IDMOBIL, t.IDMEMBER, "
            + "mbl.PLATNO, mbl.MERK, mbl.WARNA, mbl.JENIS, mbl.KAPASITAS, mbl.TRANSMISI, "
            + "mbl.TAHUNKELUAR, mbl.STATUS, mbl.HARGA "
            + "FROM transaksi t, mobil mbl "
            + "WHERE t.IDCUSTOMER = " + customer.getIdCustomer() + " AND mbl.STATUS = 'OFF'";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) {

        mobil = new Mobil();
        member = new Member();

        mobil.setIdMobil(rs.getInt("IDMOBIL"));
        member.setIdMember(rs.getInt("IDMEMBER"));
        mobil.setPlatNo(rs.getString("PLATNO"));
        mobil.setMerk(rs.getString("MERK"));
        mobil.setWarna(rs.getString("WARNA"));
        mobil.setJenis(rs.getString("JENIS"));
        mobil.setKapasitas(rs.getInt("KAPASITAS"));
        mobil.setTransmisi(rs.getString("TRANSMISI").charAt(0));
        mobil.setTahunKeluar(rs.getInt("TAHUNKELUAR"));
        mobil.setHarga(rs.getInt("HARGA"));

        mobil.setMember(member);
      }

      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MobilServiceImpl.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return mobil;
  }
}
