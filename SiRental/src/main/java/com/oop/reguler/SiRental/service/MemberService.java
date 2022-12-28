/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.reguler.SiRental.service;

import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.repository.AkunRepository;
import com.oop.reguler.SiRental.repository.CrudRepository;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
public interface MemberService extends AkunRepository<Member, Integer>, CrudRepository<Member, Object>{
    
}
