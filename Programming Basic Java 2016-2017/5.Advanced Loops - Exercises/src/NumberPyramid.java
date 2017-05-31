import java.util.Scanner;

/**
 * Created by Alex on 24.2.2017 г..
 */
public class NumberPyramid {

    public static void main(String[] args) {

        int countNumber=1;
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(countNumber+" ");
                countNumber++;

                if (countNumber==n+1){
                    return;
                }

            }


            System.out.println();
            
        }
    }


}
