/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class Account {

    private double balance;

    public Account(double initialBalance) {

        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
        
        
       
    }

//    public void credit(double amount) {
//        balance = balance + amount;
//    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
   
    public void debit(double amount){
        
          
        if(amount > balance){
            
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
                       
            
       }
        
        if(amount <= balance ){
        balance = balance - amount;
        
        }
    }
    
    public double getBalance() {
        return balance;

    }

       
    
}
