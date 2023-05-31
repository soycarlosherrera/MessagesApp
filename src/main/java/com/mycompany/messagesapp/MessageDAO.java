/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messagesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        ConnectionApp connectionApp = new ConnectionApp();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try(Connection connection = connectionApp.getConnection()){            
            
            String query = "SELECT * FROM Message";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                
                System.out.println("....................................");
                System.out.println("ID: " + resultSet.getInt("ID_MESSAGE"));
                System.out.println("Mensaje: " + resultSet.getString("message"));
                System.out.println("Autor: " + resultSet.getString("messageAuthor"));
                System.out.println("Fecha: " + resultSet.getString("messageDate"));
                System.out.println("....................................");
                
            }                
            
        }catch(SQLException e){
            
            System.out.println("No fue posible recuperar mensajes");            
            System.out.println(e);
        }
        
    }
    
    public static void deleteMessage(int id_message){
        
        ConnectionApp connectionApp = new ConnectionApp();
        
        try(Connection connection = connectionApp.getConnection()){
            
            PreparedStatement preparedStatement = null;
            
            try{
                
                String query = "DELETE FROM Message WHERE ID_MESSAGE = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,id_message);
                
                preparedStatement.executeUpdate();
                System.out.println("...........................");
                System.out.println("Mensaje borrado con exito...");
                System.out.println("...........................");
                
            }catch(SQLException ex){
                
                System.out.println("No fue posible eliminar el mensaje");
                System.out.println(ex);
                
            }
            
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
    }
    
    public static void updateMessage(Message message){
        
    }
    
}
