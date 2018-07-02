/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applediscountapp;

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import java.util.InputMismatchException;

/**
 *
 * @author weira
 */
public class AppleDiscountApp {
    
    public static void main(String[] args) {
            System.out.println("Welcome to the Apple Discount App, where employees can easily find the discounted price for apple products.");
                    
            //Initialize variables
		int employee=0;
		String discountType="";
		String choice="y";
                double customerType=0.0;
                String productDevice="";
		String appleProd="";
                int invoice=0;
                String phone="";
                String mac="";
                
		//Create Scanner object
		Scanner userInput= new Scanner(System.in);
		
		//Using the NumberFormat class to format values
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent= NumberFormat.getPercentInstance();
               
                //Ask for employee number
                System.out.println("Please enter your employee badge number: ");
                employee=Validator.getValidEmployee(userInput);
                //blank line
                System.out.println();
		
		//Run program while choice is not equal to "n"
                
		while(!choice.equalsIgnoreCase("n"))
		{
                    //Create new Validator object
			Validator v=new Validator();
                        //Ask if user is buying for themselves or friend/family
                        System.out.println("Are you shopping for you personally or for friends and family?\n p) personal(25%)\n f) friends and family(15%)");
                        customerType=v.getValidCustomer(userInput);
                        
                        //blank line
                        System.out.println();
                        System.out.println("Select a Product: \n 1)iPhone \n 2)Mac");
                        appleProd=userInput.nextLine();
                        Product product = null;
                        //Ask user what device 
                        if(appleProd.equalsIgnoreCase("1"))
                        {
                           phone=iPhoneProd.getiPhoneProd("What iPhone will you like to purchase? Only choose the number\n 1)iPhone X\n 2)iPhone 8\n 3)iPhone 7\n 4)iPhone 6s\n 5)iPhone SE", userInput); 
                           product = iPhoneDB.getiPhone(phone, customerType);
                        }
                        else if(appleProd.equalsIgnoreCase("2"))
                        {
                           mac=macProd.getMac("What Mac will you like to purchase?\n 1)MacBook\n 2)MacBook Air\n 3)MacBook Pro 13-inch\n 4)MacBook Pro 15-inch\n", userInput);
                           product= macProdDB.getMac(mac, customerType);
                        }
                       
                        
                        //blank line
                        System.out.println();
                        //print output
                        System.out.println(product); 
                        
                        /*
                        System.out.println("Product:        " + product.getProductDevice());
                        System.out.println("Description: " + product.getProductDesc());
                        System.out.println("Original Price:       " + product.getFormattedPrice());
                        System.out.println("Employee Discount:       " + product.getFormattedEmpDiscount());
                        System.out.println("Discounted Price:       " + product.getFormattedDiscPrice());
                       */
                        //Adds the number of invoices the user inputs
                        invoice=invoice+1;
                        
                        System.out.println("Do you have another entry to input? (y/n)");
                        choice = userInput.next();
                        while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y"))
                        {
                            System.out.println("Invalid Entry. Please type \'y\' or \'n\'");
                            choice=userInput.next();
                        }
                        System.out.println("Number of entries entered: " + invoice);

		}//end of while loop
    }//end of main method
    
}//end of class

