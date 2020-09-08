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

public class SalexTax {
    public static void main(String[] args) {
        final double STATE_TAX_PERCENTAGE;
        STATE_TAX_PERCENTAGE = 0.04;
        final double COUNTY_TAX_PERCENTAGE = 0.02;
        
        double PurchaseAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the purchase amount: ");
        PurchaseAmount = scanner.nextDouble();
        
        
        //County Tax
        
        countyTax = COUNTY_TAX_PERCENTAGE * PurchaseAmount;
        
        //State Tax
        
        stateTax = STATE_TAX_PERCENTAGE * PurchaseAmount;
         
        //total Tax
         
        totalTax = stateTax + countyTax;
        
        //total sale
        
        totalSale = totalTax + PurchaseAmount;
        
        
        System.out.println( "PurchaseAmount: "+ PurchaseAmount + "\n State Sales Tax: " + stateTax + " \n County Sales Tax: " + countyTax + "\n Total Sales Tax: " + totalTax + "\n Total  Sale: " + totalSale);
                
        
        
         
        
        
               
        
        
    }
    
}
