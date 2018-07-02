/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applediscountapp;
import java.text.NumberFormat;

/**
 *
 * @author weira
 */
class Product {
    private String productDevice;
    private String productDesc;
    private double productCost;
    private double empDisc;
    private double discAmount;
    
    public Product(String productDevice, String productDesc, double productCost, double empDisc, double discAmount)
    {
        this.productDevice=productDevice;
        this.productDesc= productDesc;
        this.productCost=productCost;
        this.empDisc=empDisc;
        this.discAmount=discAmount;
    }

    /*Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     public Product()
    {
        productDevice = "";
        productDesc = "";
        productCost = 0.0;
        empDisc=0.0;
        discAmount=0.0;
        
    }
    
    public void setProductDevice(String productDevice)
    {
        this.productDevice=productDevice;
    }
    
    public String getProductDevice()
    {
        return productDevice;
    }
    
    public void setProductDesc(String productDesc)
    {
        this.productDesc=productDesc;
    }
    
    public String getProductDesc()
    {
        return productDesc;
    }
    
    public void setProductCost(double productCost)
    {
        this.productCost=productCost;
    }
    
    public double getProductCost()
    {
        return productCost;
    }
    
    public void setEmpDisc(double empDisc)
    {
        this.empDisc=empDisc;
    }
    
    public double getEmpDisc()
    {
        return empDisc;
    }
    
    public void setDiscAmount(double discAmount)
    {
        this.discAmount=discAmount;
    }
    
    public double getDiscAmount()
    {
        return discAmount;
    }
    
    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(productCost);
    }
     public String getFormattedDiscPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(discAmount);
    }
    public String getFormattedEmpDiscount()
    {
        NumberFormat percent= NumberFormat.getPercentInstance();
        return percent.format(empDisc);
    }
    
    @Override
    public String toString()
    {
        return "Product:        " + productDevice + "\n" +
               "Description:    " + productDesc + "\n" +
               "Original Price: " + this.getFormattedPrice() + "\n" +
               "Employee Discount: "+ this.getFormattedEmpDiscount() + "\n" +
               "Discounted Price:  " + this.getFormattedDiscPrice() + "\n";
    }
}
