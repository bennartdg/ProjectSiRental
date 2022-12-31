/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.reguler.SiRental.repository;

/**
 *
 * @author Ben
 */
public interface HargaRepository<T, D> {
  Double hitungHarga(T object);
}
