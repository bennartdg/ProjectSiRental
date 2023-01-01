/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.reguler.SiRental.service;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.repository.AkunRepository;
import com.oop.reguler.SiRental.repository.CrudRepository;

/**
 *
 * @author Ben
 */
public interface CustomerService extends AkunRepository<Customer, Integer>, CrudRepository<Customer, Object>{
  
}
