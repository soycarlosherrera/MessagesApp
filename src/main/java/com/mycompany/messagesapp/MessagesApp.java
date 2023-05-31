/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messagesapp;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author soycarlosherrera
 */
public class MessagesApp {

    public static void main(String[] args) {  
        
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        do{
            
            System.out.println("<<<<<-----WELCOME----->>>>>");
            System.out.println(" ::Message Aplication::");
            System.out.println("  1. Create Mesage.");
            System.out.println("  2. List Messages.");
            System.out.println("  3. Update Mesage.");
            System.out.println("  4. Delete Mesage.");
            System.out.println("  5. Exit.");
            
            option = sc.nextInt();
            
            switch (option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.readMessage();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    break;
            }
            
        }while(option != 5);        
        
    }
}
