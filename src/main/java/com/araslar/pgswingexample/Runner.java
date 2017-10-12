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
public class Runner {
    public static void main(String[] args) {
        System.out.println("The application started....");
        Kisi key = new Kisi();
        
        key.setAdres("Demetevler Tekirdag");
        key.setIsim("Aybuke");
        key.setSoyisim("Aras");
        key.setTel("050551233344");
        
        KisiDBOpts kdbs = new KisiDBOpts();
        kdbs.kisiEkle(key);
        System.out.println("Application Completed..");
        
        
        
        
    }
    
    
    
    
}
