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
        
        
        DBOperations dboperation = new DBOperations();
        String sqlQuery = "insert into kisi (ad,soyad,email,tel,adres)\n" +
"values ('Mahmut','ZIRLAYAN','mhmtzrlyn@gmail.com','05075343499','demetevler demet')";
        dboperation.insert(sqlQuery);
        
        
        
        
    }
    
    
    
    
}
