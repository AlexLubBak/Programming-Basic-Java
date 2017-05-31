import java.util.Scanner;

/**
 * Created by Alex on 1.3.2017 г..
 */
public class LettersCombinations {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       int counter=0;
        char letterStart= scanner.nextLine().charAt(0);
        char letterSecond=scanner.nextLine().charAt(0);
        char ignoreLetter=scanner.nextLine().charAt(0);

        StringBuilder sb=new StringBuilder();

        for (char  letter1 = letterStart; letter1 <=letterSecond ; letter1++) {
            if (letter1 == ignoreLetter){
                continue;
            }
            for (char letter2 = letterStart; letter2 <= letterSecond; letter2++) {
                if (letter2 == ignoreLetter){
                    continue;
                }
                for (char letter3 = letterStart; letter3 <=letterSecond; letter3++) {


                    if (letter3 != ignoreLetter) {
                        sb.append(String.format("%s%s%s", letter1, letter2, letter3 +" ") );




                        counter++;

                    }

                    }
                 }
            }
            System.out.print(sb.toString()+counter);
        }


        public static String repeatStr(char str, int count){
        StringBuilder sb=new StringBuilder();


            for (int i = 0; i < count; i++) {

                sb.append(str);

            }

            return sb.toString();

        }

    }

