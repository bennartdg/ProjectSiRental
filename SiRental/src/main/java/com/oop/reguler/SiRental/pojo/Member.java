package com.oop.reguler.SiRental.pojo;

import java.util.List;

public class Member {

  private Integer idMember;
  private String nama;
  private char jenisKelamin;
  private String alamat;
  private String telepon;
  private double saldo;

  List<Mobil> listMobil;

  private boolean loginStatus;
  private Akun akun;

  public Integer getIdMember() {
    return idMember;
  }

  public void setIdMember(Integer idMember) {
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

  public List<Mobil> getListMobil() {
    return listMobil;
  }

  public void setListMobil(List<Mobil> listMobil) {
    this.listMobil = listMobil;
  }

  public boolean getLoginStatus() {
    return loginStatus;
  }

  public void setLoginStatus(boolean loginStatus) {
    this.loginStatus = loginStatus;
  }

  public Akun getAkun() {
    return akun;
  }

  public void setAkun(Akun akun) {
    this.akun = akun;
  }
}
