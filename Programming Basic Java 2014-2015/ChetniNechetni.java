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
public class ChetniNechetni {
    
    public static void main(String[] args){
    
        int chetno = 0;
        int nechetno = 0;
        int i=1;
        
        Scanner input = new Scanner(System.in);
    
        
       
        
    while(i<=10) {
                System.out.println(" Enter ten int number: ");
int a = input.nextInt();

    
    
    if(a%2==0){
    chetno++;
    }
    
    else{
    nechetno++;
    }
    i++;
    }
    
    System.out.println("Четните номера са: "+chetno + ", " + "Нечетните номера са: "+nechetno);
    
    
    }
    }
