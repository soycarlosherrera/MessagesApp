/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messagesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author soycarlosherrera
 */
public class MessageDAO {
    
    public static void createMessage(Message message){
        
        ConnectionApp connectionApp = new ConnectionApp();
        
        try(Connection connection = connectionApp.getConnection()){
            
            PreparedStatement preparedStatement = null;
            
            try{
                
                String query = "INSERT INTO Message (message, messageAuthor) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getMessageAuthor());
                
                preparedStatement.executeUpdate();
                System.out.println("...........................");
                System.out.println("Mensaje creado con exito...");
                System.out.println("...........................");
                
            }catch(SQLException ex){
                System.out.println(ex);
            }
            
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
    }
    
    public static void readMessage(){
        
    }
    
    public static void deleteMessage(int id_Message){
        
    }
    
    public static void updateMessage(Message message){
        
    }
    
}
