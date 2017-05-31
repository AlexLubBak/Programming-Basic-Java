

    import java.util.Scanner;

    /**
     * Created by Alex on 14.2.2017 г..
     */
    public class RombusOfStars {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i<=n; i++) {

                System.out.println(strRepeat(" ",n-i)+strRepeat("* ", i)+strRepeat(" ",n-i));


            }


            for (int i = n-1; i >0; i--) {

                System.out.println(strRepeat(" ",n-i)+strRepeat("* ", i)+strRepeat(" ",n-i));

            }

        }





        static String strRepeat(String str, int count){

            StringBuilder sb=new StringBuilder();

            for (int i = 0; i <count ; i++) {

                sb.append(str);

            }
            return sb.toString();
        }

    }




