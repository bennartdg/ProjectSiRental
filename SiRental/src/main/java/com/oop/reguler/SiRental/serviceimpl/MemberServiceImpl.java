/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Akun;
import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.service.MemberService;
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
public class MemberServiceImpl implements MemberService {

  private ConnectionManager conMan;
  private Connection conn;
  Statement stmt;
  ResultSet rs;

  @Override
  public Member login(String username, String password) {
    Member member = null;
    Akun akun = null;

    String sql = "SELECT M.IDMEMBER, "
        + "M.NAMA, M.JENISKELAMIN, M.ALAMAT, "
        + "M.TELEPON, M.SALDO, "
        + "AK.IDAKUN, AK.USERNAME, AK.PASSWORD, AK.LEVEL "
        + "FROM MEMBER M, AKUN AK "
        + "WHERE M.IDAKUN = AK.IDAKUN "
        + "AND AK.USERNAME = '" + username + "' "
        + "AND AK.PASSWORD = '" + password + "'";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        member = new Member();
        member.setIdMember(rs.getInt("IDMEMBER"));
        member.setNama(rs.getString("NAMA"));
        member.setJenisKelamin(rs.getString("JENISKELAMIN").charAt(0));
        member.setAlamat(rs.getString("ALAMAT"));
        member.setTelepon(rs.getString("TELEPON"));
        member.setSaldo(rs.getDouble("SALDO"));

        akun = new Akun();
        akun.setId(rs.getInt("IDAKUN"));
        akun.setUsername(rs.getString("USERNAME"));
        akun.setPassword(rs.getString("PASSWORD"));
        akun.setLevel(rs.getString("LEVEL"));

        member.setAkun(akun);
      }

      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }

    return member;
  }

  @Override
  public List<Member> findAll() {
    List<Member> listMember = new ArrayList<>();

    String sql = "SELECT * FROM member";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        Member member = new Member();

        member.setIdMember(rs.getInt("IDMEMBER"));
        member.setNama(rs.getString("NAMA"));
        member.setJenisKelamin((char) rs.getString("JENISKELAMIN").charAt(0));
        member.setAlamat(rs.getString("ALAMAT"));
        member.setTelepon(rs.getString("TELEPON"));

        listMember.add(member);
      }
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName())
          .log(Level.SEVERE, null, ex);
    }

    return listMember;
  }

  @Override
  public Object create(Member object) {
    int result = 0;
    String sql = "INSERT INTO member(NAMA, JENISKELAMIN, ALAMAT, TELEPON) "
        + "VALUES('" + object.getIdMember() + "', "
        + "'" + object.getNama() + "', "
        + "'" + object.getJenisKelamin() + "', "
        + "'" + object.getAlamat() + "', "
        + "'" + object.getTelepon() + "')";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName())
          .log(Level.SEVERE, null, ex);
    }
    return result;
  }

  @Override
  public Object update(Member object) {
    int result = 0;
    String sql = "UPDATE member SET NAMA = '" + object.getNama() + "', "
        + "JENISKELAMIN = '" + object.getJenisKelamin() + "', "
        + "ALAMAT = '" + object.getAlamat() + "', "
        + "TELEPON = '" + object.getTelepon() + "' "
        + "WHERE IDMEMBER = " + object.getIdMember() + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      result = stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
  }

  @Override
  public Member findById(int id) {
    Member member = null;
    String sql = "SELECT * FROM member WHERE IDMEMBER = " + id + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        member = new Member();
        member.setIdMember(rs.getInt("IDMEMBER"));
        member.setNama(rs.getString("NAMA"));
        member.setJenisKelamin(rs.getString("JENISKELAMIN").charAt(0));
        member.setAlamat(rs.getString("ALAMAT"));
        member.setTelepon(rs.getString("TELEPON"));
      }
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName())
          .log(Level.SEVERE, null, ex);
    }
    return member;
  }

  @Override
  public Object delete(int id) {
    int result = 0;
    String sql = "DELETE FROM member WHERE IDMEMBER=" + id + "";

    conMan = new ConnectionManager();
    conn = conMan.connect();

    try {
      stmt = conn.createStatement();
      result = stmt.executeUpdate(sql);
      conMan.disconnect();
    } catch (SQLException ex) {
      Logger.getLogger(MemberServiceImpl.class.getName())
          .log(Level.SEVERE, null, ex);
    }
    return result;
  }

}
