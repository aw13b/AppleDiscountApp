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
public class macProdDB {
    public static Product getMac(String productDevice, double EmpDisc)
    {
        //Create a Product object
        Product product= null;
        
        //Set variables
        double cost=0.0;
        double discountAmt=0.0;
        double finalCost=0.0;
        double employeeDisc= EmpDisc;
        //fill the product object with data
        mac m= new mac();
        
        m.setProductDevice(productDevice);
        
        //Database for iPhones
        if(productDevice.equalsIgnoreCase("1a"))
        {
            //Normal cost of product
            cost=1299;
            //Calculates the discount the user gets
            discountAmt=cost*employeeDisc;
            //Calculates the final total by subtracting the discount amount from the subtotal
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook");
            m.setProductDesc("Gold, Rose Gold, Silver, Space Gray");
            m.setMemory("8GB");
            m.setStorage("256GB");
            m.setProcessor("1.2GHz i3 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        
       else if(productDevice.equalsIgnoreCase("1b"))
        {
            cost=1599;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook");
            m.setProductDesc("Gold, Rose Gold, Silver, Space Gray");
            m.setMemory("8GB");
            m.setStorage("512GB");
            m.setProcessor("1.3GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
       else if(productDevice.equalsIgnoreCase("2a"))
        {
            cost=999;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Air");
            m.setProductDesc("Silver");
            m.setMemory("8GB");
            m.setStorage("128GB");
            m.setProcessor("1.8GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("2b"))
        {
            cost=1199;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Air");
            m.setProductDesc("Silver");
            m.setMemory("8GB");
            m.setStorage("256GB");
            m.setProcessor("1.8GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3a"))
        {
            cost=1299;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("13-inch - Silver, Gray");
            m.setMemory("8GB");
            m.setStorage("128GB");
            m.setProcessor("2.3GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3b"))
        {
            cost=1499;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("13-inch - Silver, Gray");
            m.setMemory("8GB");
            m.setStorage("256GB");
            m.setProcessor("2.3GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3c"))
        {
            cost=1799;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("13-inch - Touch Bar and Touch ID - Silver, Gray");
            m.setMemory("8GB");
            m.setStorage("256GB");
            m.setProcessor("3.1GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3d"))
        {
            cost=1999;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("13-inch - Touch Bar and Touch ID - Silver, Gray");
            m.setMemory("8GB");
            m.setStorage("512GB");
            m.setProcessor("3.1GHz i5 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("4a"))
        {
            cost=2399;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("15-inch - Touch Bar and Touch ID - Silver, Gray");
            m.setMemory("16GB");
            m.setStorage("256GB");
            m.setProcessor("2.8GHz i7 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("4b"))
        {
            cost=2799;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("15-inch - Touch Bar and Touch ID - Silver, Gray");
            m.setMemory("16GB");
            m.setStorage("256GB");
            m.setProcessor("2.9GHz i7 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
         else if(productDevice.equalsIgnoreCase("4c"))
        {
            cost=1999;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            m.setProductDevice("MacBook Pro");
            m.setProductDesc("15-inch - Silver");
            m.setMemory("16GB");
            m.setStorage("256GB");
            m.setProcessor("2.2GHz i7 Processor");
            m.setProductCost(cost);
            m.setEmpDisc(employeeDisc);
            m.setDiscAmount(finalCost);
        }
        else
          {
            product.setProductDesc("Unknown");
          }
        product=m; //set Product variable equal to Mac Object
        return product;
    }
    
}
