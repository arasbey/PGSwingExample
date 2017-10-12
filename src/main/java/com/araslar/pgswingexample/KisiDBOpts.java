/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.araslar.pgswingexample;

import com.araslar.pgswingexample.db.DBOperations;

/**
 *
 * @author PC
 */
public class KisiDBOpts {
    
    public void kisiEkle(Kisi kisi){
        DBOperations dboperation = new DBOperations();
        String sqlQuery = "insert into kisi (ad,soyad,email,tel,adres)\n" +
"values ('"+kisi.getIsim()+"','"+kisi.getSoyisim()+"','"+kisi.getEmail()+"','"+kisi.getTel()+"','"+kisi.getAdres()+"')";
        int count = dboperation.insert(sqlQuery);
        
    }
    public void kisiGuncelle(Kisi kisi){
        DBOperations dboperation = new DBOperations();
        String sqlQuery = "update kisi ad='"+kisi.getIsim()+"'+,soyad = '"+kisi.getSoyisim()+"',email = '"+kisi.getEmail()+"',tel= '"+kisi.getTel()+"',adres = '"+kisi.getAdres()+"'\n" +
"where id ="+kisi.getId();
         dboperation.update(sqlQuery);
    
    
    
}}
