/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messagesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author soycarlosherrera
 */
public class ConnectionApp {
    
    public Connection getConnection(){
        
        Connection connection = null;        
        
        try{
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MESSAGESAPPBD", "root", "");
                   
        }catch(SQLException e){
            
            System.out.println(e);
        
        }
        
        return connection;
        
    }
    
}
