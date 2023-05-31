/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messagesapp;

import java.util.Scanner;

/**
 *
 * @author soycarlosherrera
 */
public class MessageService {
    
    public static void createMessage(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe tu mensaje");
        String text = sc.nextLine();
        
        System.out.println("Ahora dime quien eres");
        String name = sc.nextLine();
        
        Message message = new Message();
        message.setMessage(text);
        message.setMessageAuthor(name);
        
        MessageDAO.createMessage(message);
        
    }
    
    public static void readMessage(){
        
    }
    
    public static void deleteMessage(){
        
    }
    
    public static void updateMessage(){
        
    }
    
}
