package com.oop.reguler.SiRental.pojo;

import java.util.List;

public class Mobil {

  private int idMobil;
  private Member member;
  private String platNo;
  private String merk;
  private String warna;
  private String jenis;
  private int kapasitas;
  private char transmisi;
  private int tahunKeluar;
  private double harga;
  
  List<Customer> costumer;

  public List<Customer> getCostumer() {
    return costumer;
  }

  public void setCostumer(List<Customer> costumer) {
    this.costumer = costumer;
  }

  public int getIdMobil() {
    return idMobil;
  }

  public void setIdMobil(int idMobil) {
    this.idMobil = idMobil;
  }

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public String getPlatNo() {
    return platNo;
  }

  public void setPlatNo(String platNo) {
    this.platNo = platNo;
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public String getJenis() {
    return jenis;
  }

  public void setJenis(String jenis) {
    this.jenis = jenis;
  }

  public int getKapasitas() {
    return kapasitas;
  }

  public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
  }

  public char getTransmisi() {
    return transmisi;
  }

  public void setTransmisi(char transmisi) {
    this.transmisi = transmisi;
  }

  public int getTahunKeluar() {
    return tahunKeluar;
  }

  public void setTahunKeluar(int tahunKeluar) {
    this.tahunKeluar = tahunKeluar;
  }

  public double getHarga() {
    return harga;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

}
