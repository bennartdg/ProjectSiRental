package com.oop.reguler.SiRental.pojo;

public class Admin {
  private Integer idAdmin;
  private double saldo;
  private boolean loginStatus;
  private Akun akun;

  public Integer getIdAdmin() {
    return idAdmin;
  }

  public void setIdAdmin(Integer idAdmin) {
    this.idAdmin = idAdmin;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
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
