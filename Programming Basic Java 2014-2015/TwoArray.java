
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class TwoArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of array: ");

        int lengthOfArray = input.nextInt();

        int[] arrA = new int[lengthOfArray];
        int[] arrB = new int[lengthOfArray];

        for(int i=0; i<arrA.length; i++)
        {
            System.out.println("Please enter element: "+ i);
        arrA[i]=input.nextInt();
    }
        
        for(int i=0; i<arrB.length; i++)
        {
            System.out.println("Please enter element: "+i);
            arrB[i]=input.nextInt();
        }
        
       System.out.println("Array is equals:" + arrEquals(arrA, arrB)); ;
    }

    public static boolean arrEquals(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
                return true;
            }
        }
        return false;

    }
}
