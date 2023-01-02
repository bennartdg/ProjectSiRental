package com.oop.reguler.SiRental.pojo;

public class Customer {

  private Integer idCustomer;
  private String nama;
  private char jenisKelamin;
  private String alamat;
  private String telepon;
  private double saldo;

  private Mobil mobil;
  private Transaksi transaksi;

  private boolean loginStatus;
  private Akun akun;

  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
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

  public Mobil getListMobil() {
    return mobil;
  }

  public void setListMobil(Mobil mobil) {
    this.mobil = mobil;
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

  public Mobil getMobil() {
    return mobil;
  }

  public void setMobil(Mobil mobil) {
    this.mobil = mobil;
  }

  public Transaksi getTransaksi() {
    return transaksi;
  }

  public void setTransaksi(Transaksi transaksi) {
    this.transaksi = transaksi;
  }

}
