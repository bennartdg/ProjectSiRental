package com.oop.reguler.SiRental.pojo;

public class Transaksi {
  private Integer idTransaksi;
  private Mobil mobil;
  private Member member;
  private Customer customer;
  private String tanggalPesan;
  private String tanggalKembali;
  private int lamaPeminjaman;
  private double totalHarga;

  public Integer getIdTransaksi() {
    return idTransaksi;
  }

  public void setIdTransaksi(Integer idTransaksi) {
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

  public String getTanggalPesan() {
    return tanggalPesan;
  }

  public void setTanggalPesan(String tanggalPesan) {
    this.tanggalPesan = tanggalPesan;
  }

  public String getTanggalKembali() {
    return tanggalKembali;
  }

  public void setTanggalKembali(String tanggalKembali) {
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
