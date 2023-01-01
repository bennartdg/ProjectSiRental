/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.reguler.SiRental.service;

import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.repository.CrudRepository;
import com.oop.reguler.SiRental.repository.HargaRepository;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
public interface MobilService extends CrudRepository<Mobil, Object>, HargaRepository<Mobil, Double>{
    
}
