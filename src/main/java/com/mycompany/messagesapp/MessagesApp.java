/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messagesapp;

import java.sql.Connection;

/**
 *
 * @author soycarlosherrera
 */
public class MessagesApp {

    public static void main(String[] args) {        
        
        ConnectionApp connectionApp = new ConnectionApp();
        
        try(Connection connection = connectionApp.getConnection()){
            
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
}
