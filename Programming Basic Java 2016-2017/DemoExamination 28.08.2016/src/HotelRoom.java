import java.util.Scanner;

/**
 * Created by Alex on 12.3.2017 г..
 */
public class HotelRoom {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String mounth=scanner.nextLine();
        int numberNight= Integer.parseInt(scanner.nextLine());
        double pricePerApartament=0.0;
        double pricePerStudio=0.0;


        if (mounth.equals("May")||mounth.equals("October")){

            pricePerApartament=numberNight*65.0;
            pricePerStudio=numberNight*50.0;

            if (numberNight>14){

                pricePerStudio=numberNight*(50-50*0.3);
                pricePerApartament=numberNight*(65-65*0.1);
            }

            if (numberNight>7&&numberNight<=14){

                pricePerStudio=numberNight*(50-50*0.05);
            }



        }

        if (mounth.equals("June")||mounth.equals("September")){

            pricePerApartament=numberNight*68.70;
            pricePerStudio=numberNight*75.20;

            if (numberNight>14){

                pricePerApartament=numberNight*(68.70-68.70*0.1);
                pricePerStudio=numberNight*(75.20-75.20*0.2);
            }

        }

        if (mounth.equals("July")||mounth.equals("August")){

            pricePerApartament=numberNight*77.0;
            pricePerStudio=numberNight*76.0;

            if (numberNight>14){

                pricePerApartament=numberNight*(77.0-77.0*0.1);
            }

        }

        System.out.printf("Apartment: %.2f lv.%n", pricePerApartament);
        System.out.printf("Studio: %.2f lv.", pricePerStudio);



    }
}
