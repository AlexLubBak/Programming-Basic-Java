import java.util.Scanner;

/**
 * Created by Alex on 6.2.2017 г..
 */
public class Volleyball {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        String leapYear=scanner.nextLine();
        int holidayNumber=Integer.parseInt(scanner.nextLine());
        int weekendNumberOwnTown=Integer.parseInt(scanner.nextLine());

        int weekendSofia=48-weekendNumberOwnTown;
        Double numberGameSofia=weekendSofia*3.0/4;
        Double numberGameHoliday=holidayNumber*2.0/3;

        Double allGame=numberGameSofia+numberGameHoliday+weekendNumberOwnTown;

        if(leapYear.equals("leap")){
            allGame=allGame+allGame*15/100;
        }else if (leapYear.equals("normal")){
            allGame=allGame;
        }

        System.out.println(Math.floor(allGame));

    }
}
