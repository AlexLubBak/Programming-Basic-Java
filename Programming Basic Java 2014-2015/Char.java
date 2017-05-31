/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Char {
    public static void main(String[] args)
    {
        int[] arr = {2, 1, 1, 2, 3, 3, 3, 2, 2, 2, 1};
        int maxCounter=0;
        int counter=0;
        int tempInt=0;
        for(int i=0; i<arr.length-1; i++)
        {
            counter=1;
           for(int j=i+1; j<arr.length; j++)
           {
                if(arr[i]==arr[j])
                {
                    counter++;
                    
                    }else break;
            
           }  
        if(maxCounter<counter)
        {
            maxCounter=counter;
            tempInt=arr[i];            
            
        }
    
        
    }
    int[] max = new int[maxCounter];
    for(int i=0; i<max.length; i++)
    {
      max[i]=tempInt;  
    }
    for(int i=0; i<max.length; i++)
    {
        System.out.println(max[i]);
    }
    
    }
}
