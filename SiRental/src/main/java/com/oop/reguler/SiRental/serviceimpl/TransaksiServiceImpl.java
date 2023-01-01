/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.SiRental.serviceimpl;

import com.oop.reguler.SiRental.pojo.Customer;
import com.oop.reguler.SiRental.pojo.Member;
import com.oop.reguler.SiRental.pojo.Mobil;
import com.oop.reguler.SiRental.pojo.Transaksi;
import com.oop.reguler.SiRental.service.TransaksiService;
import com.oop.reguler.SiRental.util.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
public class TransaksiServiceImpl implements TransaksiService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Transaksi> findAll() {
       List<Transaksi> listTransaksi = new ArrayList<>();
        Transaksi transaksi = null;
        Member member = null;
        Mobil mobil =  null;
        Customer customer = null;
        
        String sql = "SELECT tf.IDTRANSAKSI, mbl.IDMOBIL, mbr.IDMEMBER, cs.IDCUSTOMER, tf.TANGGALPESAN, "
                + "tf.TANGGALKEMBALI, tf.LAMAPEMINJAMAN, tf.TOTALHARGA "
                + "FROM transaksi tf, mobil mbl, member mbr, customer cs "
                + "WHERE mbl.IDMEMBER=mbr.IDMEMBER AND mbr.IDMEMBER=tf.IDMEMBER "
                + "AND mbl.IDMOBIL=tf.IDMOBIL AND tf.IDCUSTOMER = cs.IDCUSTOMER;";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("IDTRANSAKSI"));

                mobil = new Mobil();
                mobil.setIdMobil(rs.getInt("IDMOBIL"));

                member = new Member();
                member.setIdMember(rs.getInt("IDMEMBER"));
                
                customer = new Customer();
                customer.setIdCustomer(rs.getInt("IDCUSTOMER"));

                transaksi.setTanggalPesan(rs.getDate("TANGGALPESAN"));
                transaksi.setTanggalKembali(rs.getDate("TANGGALKEMBALI"));
                transaksi.setLamaPeminjaman(rs.getInt("LAMAPEMINJAMAN"));
                transaksi.setTotalHarga(rs.getDouble("TOTALHARGA"));
                
                transaksi.setMobil(mobil);
                transaksi.setMember(member);
                transaksi.setCostumer(customer);

                listTransaksi.add(transaksi);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listTransaksi;
    }

    @Override
    public Object create(Transaksi object) {
        int result = 0;
        String sql = "INSERT INTO transaksi (IDTRANSAKSI, "
                + "IDMOBIL, IDMEMBER, IDCUSTOMER, TANGGALPESAN, "
                + "TANGGALKEMBALI, LAMAPEMINJAMAN, "
                + "TOTALHARGA) "
                + "VALUES ('"+object.getIdTransaksi()+"', "
                + "'"+object.getMobil().getIdMobil()+"', "
                + "'"+object.getMember().getIdMember()+"', "
                + "'"+object.getCostumer().getIdCustomer()+"', "
                + ""+object.getTanggalPesan()+", "
                + ""+object.getTanggalKembali()+", "
                + "'"+object.getLamaPeminjaman()+"', "
                + "'"+object.getTotalHarga()+"');";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Object update(Transaksi object) {
        int result = 0;
        String sql = "UPDATE transaksi SET TOTALHARGA='"+object.getTotalHarga()+"', "
                + "LAMAPEMINJAMAN='"+object.getLamaPeminjaman()+"', "
                + "TANGGALKEMBALI="+object.getTanggalKembali()+", "
                + "TANGGALPESAN="+object.getTanggalPesan()+", "
                + "IDCUSTOMER='"+object.getCostumer().getIdCustomer()+"', "
                + "IDMEMBER='"+object.getMember().getIdMember()+"', "
                + "IDMOBIL='"+object.getMobil().getIdMobil()+"', "
                + "WHERE IDTRANSAKSI='"+object.getIdTransaksi()+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(MobilServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Transaksi findById(int id) {
        Transaksi transaksi = null;
        Member member = null;
        Mobil mobil =  null;
        Customer customer = null;
        
        String sql = "SELECT tf.IDTRANSAKSI, mbl.IDMOBIL, mbr.IDMEMBER, cs.IDCUSTOMER, tf.TANGGALPESAN, "
                + "tf.TANGGALKEMBALI, tf.LAMAPEMINJAMAN, tf.TOTALHARGA "
                + "FROM transaksi tf, mobil mbl, member mbr, customer cs "
                + "WHERE mbl.IDMEMBER=mbr.IDMEMBER AND mbr.IDMEMBER=tf.IDMEMBER "
                + "AND mbl.IDMOBIL=tf.IDMOBIL AND tf.IDCUSTOMER = cs.IDCUSTOMER "
                + "AND tf.IDRANSAKSI="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("IDTRANSAKSI"));

                mobil = new Mobil();
                mobil.setIdMobil(rs.getInt("IDMOBIL"));

                member = new Member();
                member.setIdMember(rs.getInt("IDMEMBER"));
                
                customer = new Customer();
                customer.setIdCustomer(rs.getInt("IDCUSTOMER"));

                transaksi.setTanggalPesan(rs.getDate("TANGGALPESAN"));
                transaksi.setTanggalKembali(rs.getDate("TANGGALKEMBALI"));
                transaksi.setLamaPeminjaman(rs.getInt("LAMAPEMINJAMAN"));
                transaksi.setTotalHarga(rs.getDouble("TOTALHARGA"));
                
                transaksi.setMobil(mobil);
                transaksi.setMember(member);
                transaksi.setCostumer(customer);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return transaksi;
    }

    @Override
    public Object delete(int id) {
        int result = 0;
        String sql = "DELETE FROM transaksi WHERE IDTRANSAKSI="+id+"";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
