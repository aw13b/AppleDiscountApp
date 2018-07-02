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
public class iPhoneProd {
    public static String getiPhoneProd(String prompt, Scanner userInput)
    {
         boolean isValid=false;
         int product=0;
         Scanner user=new Scanner(System.in);
         
         String iPhone="";
         while(isValid==false)
         {
             System.out.println(prompt);
             product=userInput.nextInt();
             System.out.println("Choose an iPhone. Ex. " + product + "a");
             if(product==1)
             {
                 System.out.println("1a)iPhone X 64GB");
                 System.out.println("1b)iPhone X 256GB");
                 iPhone=user.next();
                 isValid=true;
             } 
             else if(product==2)
             {
                 System.out.println("2a)iPhone 8 64GB");
                 System.out.println("2b)iPhone 8 256GB");
                 System.out.println("2c)iPhone 8 Plus 64GB");
                 System.out.println("2d)iPhone 8 Plus 256GB");
                 iPhone=userInput.next();
                 isValid=true;
             }
             else if(product==3)
             {
                 System.out.println("3a)iPhone 7 32GB");
                 System.out.println("3b)iPhone 7 128GB");
                 System.out.println("3c)iPhone 7 Plus 32GB");
                 System.out.println("3d)iPhone 7 Plus 128GB");
                 iPhone=userInput.next();
                 isValid=true;
             }
             else if(product==4)
             {
                 System.out.println("4a)iPhone 6s 32GB");
                 System.out.println("4b)iPhone 6s 128GB");
                 System.out.println("4c)iPhone 6s Plus 32GB");
                 System.out.println("4d)iPhone 6s Plus 128GB");
                 iPhone=userInput.next();
                 isValid=true;
             }
             else if(product==5)
             {         
                 System.out.println("5a)iPhone SE 32GB");
                 System.out.println("5b)iPhone SE 128GB");
                 iPhone=userInput.next();
                 isValid=true;
             }
             else
             {
                 System.out.println("Invalid Entry. No Product Found");
             }
             userInput.nextLine();
             
         }return iPhone;
    }
    
}
