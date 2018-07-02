/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applediscountapp;

import java.util.Scanner;

/**
 *
 * @author weira
 */
public class macProd {
    public static String getMac(String prompt, Scanner userInput)
    {
         boolean isValid=false;
         int product=0;
         Scanner user=new Scanner(System.in);
         
         String mac="";
         while(isValid==false)
         {
             System.out.println(prompt);
             product=userInput.nextInt();
             System.out.println("Choose a Mac Product. Ex. " + product + "a");
             if(product==1)
             {
                 System.out.println("1a)MacBook 256GB");
                 System.out.println("1b)MacBook 512GB");
                 mac=user.next();
                 isValid=true;
             } 
             else if(product==2)
             {
                 System.out.println("2a)MacBook Air 128GB");
                 System.out.println("2b)MacBook Air 256GB");
                 mac=userInput.next();
                 isValid=true;
             }
             else if(product==3)
             {
                 System.out.println("3a)MacBook Pro 13-inch 128GB");
                 System.out.println("3b)MacBook Pro 13-inch 256GB");
                 System.out.println("3c)MacBook Pro 13-inch Touch-Bar 256GB");
                 System.out.println("3d)MacBook Pro 13-inch Touch-Bar 512GB");
                 mac=userInput.next();
                 isValid=true;
             }
             else if(product==4)
             {
                 System.out.println("4a)MacBook Pro 15-inch Touch-Bar 256GB");
                 System.out.println("4b)MacBook Pro 15-inch Touch-Bar 512GB");
                 System.out.println("4c)MacBook Pro 13-inch 256GB");
                 mac=userInput.next();
                 isValid=true;
             }
             else
             {
                 System.out.println("Invalid Entry. No Product Found");
             }
             userInput.nextLine();
             
         }return mac;
    }
}
