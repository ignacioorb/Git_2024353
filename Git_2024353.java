/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024353;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class Git_2024353 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   System.out.println("Luiz Ignacio Ribeiro - 2024353");
        
        //start a scanner to read user's input    
   Scanner myKB = new Scanner (System.in);
   
   //store user's name into a string 
   String userName;
   
   //loop - keep asking until user's input is valid 
       do{
          System.out.println("Please, enter your name.");
          System.out.println("No numbers allowed!");
       
          //read user's name from input 
          userName = myKB.nextLine();
        
        //check if user's name contains only letters 
        if (userName.matches("[a-zA-Z]+")) {
            
            //convert user's input into uppercase 
            userName = userName.toUpperCase();
            System.out.println("your name in uppercase is: " + userName);
            
          }
        else {
            //error message if user enters an invalid input 
            System.out.println("Invalid. Please enter only letters.");
        }
      
     //continue the loop if user's input is not valid 
    }   
        while (!userName.matches("[a-z-A-Z]+"));
      
    }

    }
    

