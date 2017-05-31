/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class InvoiceTest {
   
    
    public static void main(String args[]){
    
    Invoice invoice1 = new Invoice("12321", "moliv", 20, 3.00);
 
    
        System.out.printf("Invoice amount is: %.2f\n", invoice1.getInvoiceAmount());
    

        Scanner input = new Scanner(System.in);
        double InvoiceAmount;
        
        
        System.out.print("Enter quantity for invoice1:");
        int quantity = input.nextInt();
        
       System.out.print("Enter price for partNumber:");
        double price = input.nextDouble();
        
        invoice1.setPrice(price);
        invoice1.setQuantity(quantity);
        System.out.printf("Invoice amount is: %.2f\n", invoice1.getInvoiceAmount());
        invoice1.getInvoiceAmount();
              
        
    }
    
 
}
