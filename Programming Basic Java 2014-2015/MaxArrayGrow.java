/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class MaxArrayGrow {

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 2, 3, 4, 5, 4, 1};

        int maxCounter = 0;
        int counter = 1;
        int curentHomeIndex = 0;
        int startMax = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                counter++;

            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                    startMax = curentHomeIndex;

                }
                curentHomeIndex = i + 1;
                counter=1;

            }

        }

        int[] max = new int[maxCounter];
        for (int i = 0; i < maxCounter; i++) {
            max[i] = arr[startMax + i];
        }
        for (int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
        }

    }
}
