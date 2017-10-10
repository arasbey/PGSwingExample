/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.araslar.pgswingexample.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class ConnectionFactory {
    
    private static final String url = "jdbc:postgresql://localhost:5432/javadb";
    private static final String username = "postgres";
    private static final String password = "postgres";
    
  public static Connection  getConnection(){
   Connection connection = null;
   
      try {
          Class.forName("org.postgresql.Driver");
          connection = DriverManager.getConnection(url, username, password);
      } catch (Exception e) {
          e.setStackTrace(null);
      }
  return connection;
    
    
  }  
}
