/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class bira {

    public static void main(String args[]) {

        String str = "bira";
        String anotherStr = str;
        String bi = "bi";
        String ra = "ra";

        String thirdStr = bi + ra;

        System.out.println("str = " + str);
        System.out.println("anotherStr = " + anotherStr);
        System.out.println("thirdStr= " + thirdStr);
        System.out.println(str == anotherStr);
        System.out.println(str == thirdStr);

    }

}
