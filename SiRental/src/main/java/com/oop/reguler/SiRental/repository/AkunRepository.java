/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.repository;

/**
 *
 * @author Ben
 */
public interface AkunRepository<T,ID> {
  T login(String username, String password);
}
