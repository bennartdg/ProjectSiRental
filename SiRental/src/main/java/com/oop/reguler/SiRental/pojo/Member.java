package com.oop.reguler.SiRental.pojo;

import java.util.List;

public class Member {
  
  private int idMember;
  private String nama;
  private char jenisKelamin;
  private String alamat;
  private String telepon;
  private double saldo;
  
  List<Mobil> listMobil;

  private String username;
  private String password;

  public int getIdMember() {
    return idMember;
  }

  public void setIdMember(int idMember) {
    this.idMember = idMember;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public char getJenisKelamin() {
    return jenisKelamin;
  }

  public void setJenisKelamin(char jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getTelepon() {
    return telepon;
  }

  public void setTelepon(String telepon) {
    this.telepon = telepon;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public List<Mobil> getListMobil() {
    return listMobil;
  }

  public void setListMobil(List<Mobil> listMobil) {
    this.listMobil = listMobil;
  }
  
}
