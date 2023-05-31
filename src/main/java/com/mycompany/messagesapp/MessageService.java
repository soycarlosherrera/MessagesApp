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
        
        MessageDAO.readMessage();
        
    }
    
    public static void deleteMessage(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe el ID del mensaje a borrar");
        int id_message = sc.nextInt();
        
        MessageDAO.deleteMessage(id_message);
        
    }
    
    public static void updateMessage(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe tu nuevo mensaje");
        String text = sc.nextLine();
        
        System.out.println("Ahora dime cual es el ID del mensaje a editar");
        int id_message = sc.nextInt();
        
        Message message = new Message();
        message.setMessage(text);
        message.setId_message(id_message);
        
        MessageDAO.updateMessage(message);
        
    }
    
}
