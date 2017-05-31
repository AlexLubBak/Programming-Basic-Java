import java.util.Scanner;

/**
 * Created by Alex on 17.1.2017 г..
 */
public class BonusScore {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        double bonusScore = 0.0;
        double sumScore;
        double evenBonusScore=0.0;
        double fiveBonusScore=0.0;
       

        if(number <=100){
            bonusScore=5;
        }else if( number >100 && number <=1000){
            bonusScore=number/5.0;
        }else if(number > 1000){
            bonusScore=number/10.0;
        }

        if(number % 2 == 0){
            evenBonusScore=1;
        }
        if (number % 10 == 5){
            fiveBonusScore=2;
        }

        double sumBonusScore = bonusScore + evenBonusScore + fiveBonusScore;
        sumScore=number+bonusScore+evenBonusScore+fiveBonusScore;
        

        System.out.println(sumBonusScore);
        System.out.println(sumScore);
    }

}
