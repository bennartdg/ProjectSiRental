package com.oop.reguler.SiRental.pojo;

import java.util.Date;

public class Transaksi {
  private String idTransaksi;
  private Mobil mobil;
  private Member member;
  private Customer customer;
  private Date tanggalPesan;
  private Date tanggalKembali;
  private int lamaPeminjaman;
  private double totalHarga;

  public String getIdTransaksi() {
    return idTransaksi;
  }

  public void setIdTransaksi(String idTransaksi) {
    this.idTransaksi = idTransaksi;
  }

  public Mobil getMobil() {
    return mobil;
  }

  public void setMobil(Mobil mobil) {
    this.mobil = mobil;
  }

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public Customer getCostumer() {
    return customer;
  }

  public void setCostumer(Customer customer) {
    this.customer = customer;
  }

  public Date getTanggalPesan() {
    return tanggalPesan;
  }

  public void setTanggalPesan(Date tanggalPesan) {
    this.tanggalPesan = tanggalPesan;
  }

  public Date getTanggalKembali() {
    return tanggalKembali;
  }

  public void setTanggalKembali(Date tanggalKembali) {
    this.tanggalKembali = tanggalKembali;
  }

  public int getLamaPeminjaman() {
    return lamaPeminjaman;
  }

  public void setLamaPeminjaman(int lamaPeminjaman) {
    this.lamaPeminjaman = lamaPeminjaman;
  }

  public double getTotalHarga() {
    return totalHarga;
  }

  public void setTotalHarga(double totalHarga) {
    this.totalHarga = totalHarga;
  }
  
  
}
