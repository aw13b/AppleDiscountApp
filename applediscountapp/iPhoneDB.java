/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applediscountapp;

/**
 *
 * @author weira
 */
public class iPhoneDB {
   
    public static Product getiPhone(String productDevice, double EmpDisc)
    {
        //Create a Product object
        Product product= new Product();
        
        //Set variables
        double cost=0.0;
        double discountAmt=0.0;
        double finalCost=0.0;
        double employeeDisc= EmpDisc;
        
        //fill the product object with data
        product.setProductDevice(productDevice);
        
        //Database for iPhones
        if(productDevice.equalsIgnoreCase("1a"))
        {
            //Normal cost of product
            cost=999;
            //Calculates the discount the user gets
            discountAmt=cost*employeeDisc;
            //Calculates the final total by subtracting the discount amount from the subtotal
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone X");
            product.setProductDesc("64GB-Silver, Space Gray");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("1b"))
        {
            cost=1149;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone X");
            product.setProductDesc("256GB-Silver, Space Gray");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("2a"))
        {
            cost=699;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 8");
            product.setProductDesc("64GB-Silver, Gold, Space Gray, Product Red");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
          else if(productDevice.equalsIgnoreCase("2b"))
        {
            cost=849;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 8");
            product.setProductDesc("256GB-Silver, Gold, Space Gray, Product Red");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
          else if(productDevice.equalsIgnoreCase("2c"))
        {
            cost=799;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 8 Plus");
            product.setProductDesc("64GB-Silver, Gold, Space Gray, Product Red");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
            else if(productDevice.equalsIgnoreCase("2d"))
        {
            cost=949;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 8 Plus");
            product.setProductDesc("256GB-Silver, Gold, Space Gray, Product Red");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3a"))
        {
            cost=549;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 7");
            product.setProductDesc("32GB-Jet Black, Black, Silver, Gold, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3b"))
        {
            cost=649;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 7");
            product.setProductDesc("128GB-Jet Black, Black, Silver, Gold, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3c"))
        {
            cost=699;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 7 Plus");
            product.setProductDesc("32GB-Jet Black, Black, Silver, Gold, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("3d"))
        {
            cost=769;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 7 Plus");
            product.setProductDesc("128GB-Jet Black, Black, Silver, Gold, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("4a"))
        {
            cost=449;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 6s");
            product.setProductDesc("32GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("4b"))
        {
            cost=549;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 6s");
            product.setProductDesc("128GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        else if(productDevice.equalsIgnoreCase("4c"))
        {
            cost=549;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 6s Plus");
            product.setProductDesc("32GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
          else if(productDevice.equalsIgnoreCase("4d"))
        {
            cost=649;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone 6s Plus");
            product.setProductDesc("128GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
          else if(productDevice.equalsIgnoreCase("5a"))
        {
            cost=349;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone SE");
            product.setProductDesc("32GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
         else if(productDevice.equalsIgnoreCase("5b"))
        {
            cost=449;
            discountAmt=cost*employeeDisc;
            finalCost=cost-discountAmt;
            product.setProductDevice("iPhone SE");
            product.setProductDesc("128GB-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(cost);
            product.setEmpDisc(employeeDisc);
            product.setDiscAmount(finalCost);
        }
        
         /*
        //Database for iPads
         else if(productDevice.equalsIgnoreCase("iPad Pro 12.9 64GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("12.9 inch-64GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
         else if(productDevice.equalsIgnoreCase("iPad Pro 12.9 256GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("12.9 inch-256GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("iPad Pro 12.9 512GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("12.9 inch-512GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("iPad Pro 10.5 64GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("10.5 inch-64GB{Wi-Fi}-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("iPad Pro 10.5 256GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("10.5 inch-256GB{Wi-Fi}-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("iPad Pro 10.5 512GB"))
        {
            product.setProductDevice("iPad Pro");
            product.setProductDesc("10.5 inch-512GB{Wi-Fi}-Silver, Gold, Space Gray, Rose Gold");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("iPad 32GB"))
        {
            product.setProductDevice("iPad");
            product.setProductDesc("9.7 inch-32GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(0);
            product.setDiscAmount(0);
        }
         else if(productDevice.equalsIgnoreCase("iPad 128GB"))
        {
            product.setProductDevice("iPad");
            product.setProductDesc("9.7 inch-128GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
         else if(productDevice.equalsIgnoreCase("iPad mini 4"))
        {
            product.setProductDevice("iPad mini 4");
            product.setProductDesc("7.9 inch-128GB{Wi-Fi}-Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
         
         //Databse for iPod Touch
          else if(productDevice.equalsIgnoreCase("iPod 32GB"))
        {
            product.setProductDevice("iPod Touch");
            product.setProductDesc("32GB-Pink, Silver, Gold, Space Gray, Blue, Red");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
          else if(productDevice.equalsIgnoreCase("iPod 128GB"))
        {
            product.setProductDevice("iPod Touch");
            product.setProductDesc("128GB-Pink, Silver, Gold, Space Gray, Blue, Red");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        
        //Database for Apple TV
         else if(productDevice.equalsIgnoreCase("Apple TV 32GB"))
        {
            product.setProductDevice("Apple TV");
            product.setProductDesc("32GB");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
          else if(productDevice.equalsIgnoreCase("Apple TV 4K 32GB"))
        {
            product.setProductDevice("Apple TV 4K");
            product.setProductDesc("32GB");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
          else if(productDevice.equalsIgnoreCase("Apple TV 4K 64GB"))
        {
            product.setProductDevice("Apple TV 4K");
            product.setProductDesc("64GB");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        
        //Database for Apple HomePod
          else if(productDevice.equalsIgnoreCase("HomePod"))
        {
            product.setProductDevice("HomePod");
            product.setProductDesc("White, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        
        //Database for Mac
          else if(productDevice.equalsIgnoreCase("MacBook 256GB"))
        {
            product.setProductDevice("MacBook");
            product.setProductDesc("256GB SSD-1.2GHz Processor-8GB Memory-Pink, Silver, Gold, Space Gray");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("MacBook Air 128GB"))
        {
            product.setProductDevice("MacBook Air");
            product.setProductDesc("128GB SSD-1.8GHz Processor-8GB Memory");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
        else if(productDevice.equalsIgnoreCase("MacBook Air 256GB"))
        {
            product.setProductDevice("MacBook Air");
            product.setProductDesc("256GB SSD-1.8GHz Processor-8GB Memory");
            product.setProductCost(0);
            product.setEmpDisc(25);
            product.setDiscAmount(0);
        }
*/
          else
          {
            product.setProductDesc("Unknown");
          }
        return product;
    }
    
    
}
