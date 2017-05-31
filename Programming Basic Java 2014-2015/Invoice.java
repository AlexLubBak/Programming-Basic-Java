/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    

    public Invoice(String pNumber, String pDescription, int nquantity, double nprice) {

        setPartNumber(pNumber);
        setPartDescription(pDescription);
        setQuantity(nquantity);
        setPrice(nprice);
        

    }

    public void setPartNumber(String pNumber) {

        partNumber = pNumber;

    }

    public void setPartDescription(String pDescription) {

        partDescription = pDescription;

    }

    public void setQuantity(int nquantity) {

        quantity = nquantity;
    }

    public void setPrice(double nprice) {

        
        price = nprice;

    }
    
    public String getPartNumber(){
        return partNumber;
    }
    
    
    public String getPartDescription(){
        return partDescription;
            
    }
    
    public int getQuantity(){
        return quantity;
        
    }
    
    public double getPrice(){
    
        return price;
    
    }
    
     public double getInvoiceAmount() {
        
        double invoiceAmount = quantity*price;
        return invoiceAmount;
        
    }
   
}
