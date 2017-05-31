/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class TenCheck {
    
    public TenCheck() {
        
    }
    
    
    public  boolean makes10(int number1, int number2)
    {
           
    
        int sum=number1+number2;
        
        if(number1==10||number2==10||sum==10){
        return true;
        }
        else
        
            return false;
    
    
    } 

    
    
}
