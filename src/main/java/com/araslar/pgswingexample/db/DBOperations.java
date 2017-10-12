/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.araslar.pgswingexample.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DBOperations {

    public int insert(String sqlQuery) {
   try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            return stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
       return 0;
            
    }

    public void select(String sqlQuery) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean delete(String sqlQuery) {

        return true;
    }
    
    
    
    public boolean update(String sqlQuery) {

        return true;
    }
}
