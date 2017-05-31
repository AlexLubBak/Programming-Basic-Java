import java.util.Scanner;


/**
 * Created by Alex on 10.3.2017 г..
 */
public class SoftUniCamp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberPeopleOfGroup = 0;
        int numberPeopleOfGroupAutomobil = 0;
        int numberPeopleOfGroupMikrobus = 0;
        int numberPeopleOfGroupAutobus = 0;
        int numberPeopleOfGroupLargebus = 0;
        int numberPeopleOfGroupTrain = 0;




        int numberOfGroup = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberOfGroup; i++) {

            numberPeopleOfGroup = Integer.parseInt(scanner.nextLine());

            if (numberPeopleOfGroup <= 5) {
                numberPeopleOfGroupAutomobil += numberPeopleOfGroup;
            }

            if (numberPeopleOfGroup >= 6 && numberPeopleOfGroup <= 12) {

                numberPeopleOfGroupMikrobus += numberPeopleOfGroup;

            }

             if (numberPeopleOfGroup >= 13 && numberPeopleOfGroup <= 25){

                numberPeopleOfGroupAutobus +=numberPeopleOfGroup;
        }

                if (numberPeopleOfGroup>=26&&numberPeopleOfGroup<=40){

                    numberPeopleOfGroupLargebus+=numberPeopleOfGroup;

    }

                if (numberPeopleOfGroup>40){

                    numberPeopleOfGroupTrain+=numberPeopleOfGroup;

                }


             }

             double allNumberPeople=(double) (numberPeopleOfGroupAutomobil+numberPeopleOfGroupMikrobus+numberPeopleOfGroupAutobus+numberPeopleOfGroupLargebus+numberPeopleOfGroupTrain);

        double percentPeopleAutomobil=(double) ((numberPeopleOfGroupAutomobil/allNumberPeople)*100);
        double percentPeopleMikrobus=(double)((numberPeopleOfGroupMikrobus/allNumberPeople)*100);
        double percentPeopleAutobus=(double)((numberPeopleOfGroupAutobus/allNumberPeople)*100);
        double percentPeopleLargebus=(double)((numberPeopleOfGroupLargebus/allNumberPeople)*100);
        double percentPeopleTrain=(double)((numberPeopleOfGroupTrain/allNumberPeople)*100);

        System.out.printf("%.2f%%%n",percentPeopleAutomobil);
        System.out.printf("%.2f%%%n",percentPeopleMikrobus);
        System.out.printf("%.2f%%%n",percentPeopleAutobus);
        System.out.printf("%.2f%%%n",percentPeopleLargebus);
        System.out.printf("%.2f%%%n",percentPeopleTrain);



    }
}
