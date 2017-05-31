import java.util.Scanner;

/**
 * Created by Alex on 10.3.2017 г..
 */
public class Pets {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int numberOfDays=Integer.parseInt(scanner.nextLine());
        int purchasedMealsKg=Integer.parseInt(scanner.nextLine());
        double mealsDayForDogKg=Double.parseDouble(scanner.nextLine());
        double mealsDayForCatKg=Double.parseDouble(scanner.nextLine());
        double mealsDayForTurtleGram=Double.parseDouble(scanner.nextLine());


        double needMealsForDogKg=numberOfDays*mealsDayForDogKg;
        double needMealsForCatKg=numberOfDays*mealsDayForCatKg;
        double needMealsForTurtleKg=numberOfDays*(mealsDayForTurtleGram/1000);

        double allNeedMeals=needMealsForDogKg+needMealsForCatKg+needMealsForTurtleKg;

        if (allNeedMeals<=purchasedMealsKg){

            int difference=(int)Math.floor(purchasedMealsKg-allNeedMeals);
            System.out.printf("%d kilos of food left.",difference );
        }else{

            int difference=(int)Math.ceil(allNeedMeals-purchasedMealsKg);
            System.out.printf("%d more kilos of food are needed.",difference );


        }








    }
}
