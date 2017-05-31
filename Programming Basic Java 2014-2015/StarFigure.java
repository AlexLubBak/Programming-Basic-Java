/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class StarFigure {

    public static void main(String[] args) {

        int counter = 0;
        String T = "";
        String S = "";

        while (counter < 4) {
            S = S.concat("*");
            T = T.concat(" ");
            System.out.println(T + S);

            counter++;

        }
        String New = T + S;
        while (counter > 0) {

            New = New.substring(1, New.length() - 1);
            System.out.println(New);
            counter--;

        }

    }

}
