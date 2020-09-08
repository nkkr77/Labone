/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
import java.util.Scanner;

public class SalesTax {
    
    public static void main(String[] args) {
        final double statetaxpercentage = 0.04;
        final double countytaxpercentage = 0.02;
        double PurchaseAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the purchase amount: ");
        PurchaseAmount = scanner.nextDouble();
       countyTax = countytaxpercentage * PurchaseAmount;
    
       stateTax = statetaxpercentage * PurchaseAmount;
       
       totalTax = stateTax + countyTax;
        
       totalSale = totalTax + PurchaseAmount;
        
        
        ystem.out.println( "PurchaseAmount: "+ PurchaseAmount + "\n State Sales Tax: " + stateTax + " \n County Sales Tax: " + countyTax + "\n Total Sales Tax: " + totalTax + "\n Total  Sale: " + totalSale);
                
        
        
         
        
        
               
        
        
    }
    
}
