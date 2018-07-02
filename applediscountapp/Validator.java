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
public class Validator {
    public static int getValidEmployee(Scanner userInput)
	{
            //String choice="";
		boolean isValid=false;
		int empNum=0;
                while(isValid==false)
		{
			if(userInput.hasNextInt())
			{
                                empNum=userInput.nextInt();
				if(empNum>0)
				{
                                        System.out.println("The badge number you entered is " + empNum);
                                        isValid=true;
				}
				else
				{
					System.out.println("Invalid Entry. Employee number needs to be higher than 0");
                                       userInput.nextLine();
				}
			}
			else 
			{
				System.out.println("Invalid Entry. Employee number needs to be a valid integer.");
                               userInput.nextLine();
			}
			
		}//end of while loop
		return empNum;
	}//end of getValidEmployee
    
    //Get Valid Customer Type
    public static double getValidCustomer(Scanner userInput)
    {
        String choice="";
        boolean isValid=false;
        String customer="";
        double disc=0.0;
        while(isValid==false)
        {
            //Create String variable and set its value to the user's input for customer type.
            String user="";
            user=userInput.next();
            if(user.equalsIgnoreCase("p"))
            {
                System.out.println("It seems you're shopping for yourself.");
                
                customer=user; 
                disc=0.25;
                isValid=true;
            }
            else if(user.equalsIgnoreCase("f"))
            {
                System.out.println("It's always nice to shop for freinds and family.");
                customer=user;
                disc=0.15;
                isValid=true;
            }
            else
            {
                System.out.println("Invalid entry. Please type \'p\' or \'f\'");
            }
            userInput.nextLine();
        }//end of while
        return disc;
    }//end of getValidCustomer
    
}
 