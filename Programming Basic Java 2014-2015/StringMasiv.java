/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class StringMasiv {

    public static void main(String[] args) {
        String izrechenie = "";
        String[] array = {"dMnogo", "obicham", "da", "yam", "shokolad"};

        // for(int i = 0; i<array.length; i++)
        
        for (int i = array.length - 1; i >= 0; i--) {

            
            
            if(array[i].charAt(0)=='d') 
            {
               array[i]="da ne";
            } 
            
            izrechenie = izrechenie + " " + array[i];
            }

        System.out.printf("%s", izrechenie );
        }

    }


