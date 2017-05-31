import java.util.Scanner;


/**
 * Created by Alex on 14.3.2017 г..
 */
public class Hospital {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int period=Integer.parseInt(scanner.nextLine());

        int numberPacient=0;

        int counterDay=0;
        int numberDoctor=7;

        int numberPregledaniPacienti=0;
        int numberPregledaniPacientiNatovareniDni=0;
        int numberNepregledaniPacienti=0;
        int allPregledaniPacienti=0;
        int balans=0;
        int allNepregledaniPacienti=0;

        int allNepregledaniPacientiTemp=0;
        int allPregledaniPacientiTemp=0;


        for (int i = 1; i <=period ; i++) {
            numberPacient=Integer.parseInt(scanner.nextLine());
            counterDay++;


//            if (counterDay%3==0){
//                numberDoctor=7;
//            }


            if (counterDay%3==0&&balans<0){
            numberDoctor++;

            }


            if (numberPacient>numberDoctor){
                numberNepregledaniPacienti=numberPacient-numberDoctor;
                numberPregledaniPacientiNatovareniDni+=numberDoctor;
                allNepregledaniPacienti+=numberNepregledaniPacienti;
            }else {
                numberPregledaniPacienti+=numberPacient;
            }

            allPregledaniPacienti=numberPregledaniPacienti+numberPregledaniPacientiNatovareniDni;

            allNepregledaniPacientiTemp=allNepregledaniPacienti;
            allPregledaniPacientiTemp=allPregledaniPacienti;


            balans=allPregledaniPacientiTemp-allNepregledaniPacientiTemp;



            if (counterDay % 3 == 0) {

                allNepregledaniPacientiTemp=0;
                allPregledaniPacientiTemp=0;
            }



        }

        System.out.printf("Treated patients: %d.%n",allPregledaniPacienti);
        System.out.printf("Untreated patients: %d.",allNepregledaniPacienti);


    }
}
