import java.util.Scanner;

/**
 * Created by Alex on 10.3.2017 г..
 */
public class MaxCombination {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int startComb=Integer.parseInt(scanner.nextLine());
        int endComb=Integer.parseInt(scanner.nextLine());
        int maxComb=Integer.parseInt(scanner.nextLine());
        int twoNumber=startComb;
        int count=0;

        for (int i = startComb; i <=endComb ; i++) {

            for (int j = twoNumber; j <=endComb ; j++) {


                System.out.printf("<%d-%d>",i,j);
                count++;

                if (count==maxComb){
                    return;
                }

            }

            
        }

    }
}
