import java.util.Scanner;

/**
 * Created by Alex on 20.12.2016 г..
 */
public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Double suma = Double.parseDouble(console.nextLine());
        String vhodnaValuta = console.nextLine();
        String izhodnaValuta = console.nextLine();
        Double result = 0.0;
        if (vhodnaValuta.equals("BGN") && izhodnaValuta.equals("USD")) {
            result = suma/1.79549;
        } else {
            if (vhodnaValuta.equals("BGN") && izhodnaValuta.equals("EUR")) {
                result = suma / 1.95583;
            } else {
                if (vhodnaValuta.equals("BGN") && izhodnaValuta.equals("GBP")) {
                    result = suma / 2.53405;
                } else {
                    if (vhodnaValuta.equals("USD") && izhodnaValuta.equals("BGN")) {
                        result = suma * 1.79549;
                    } else {

                        if (vhodnaValuta.equals("USD") && izhodnaValuta.equals("EUR")) {
                            result = suma * 0.91802;
                        } else {
                            if (vhodnaValuta.equals("USD") && izhodnaValuta.equals("GBP")) {
                                result = suma * 0.70855;
                            } else {
                                if (vhodnaValuta.equals("EUR") && izhodnaValuta.equals("BGN")) {
                                    result = suma * 1.95583;
                                } else {
                                    if (vhodnaValuta.equals("EUR") && izhodnaValuta.equals("USD"))
                                    {
                                        result = suma / 0.91802;

                                    } else {
                                        if (vhodnaValuta.equals("EUR") && izhodnaValuta.equals("GBP")) {
                                            result = suma * 0.7718;
                                        } else {
                                            if (vhodnaValuta.equals("GBP") && izhodnaValuta.equals("BGN"))
                                            {
                                                result = suma * 2.53405;
                                            } else {
                                                if (vhodnaValuta.equals("GBP") && izhodnaValuta.equals("USD")) {
                                                    result = suma / 0.70855;
                                                } else {
                                                    if (vhodnaValuta.equals("GBP") && izhodnaValuta.equals("EUR")) {
                                                        result = suma / 0.7718;
                                                    }else{
                                                        if (vhodnaValuta.equals("BGN") && izhodnaValuta.equals("BGN")){
                                                            result=suma*1;
                                                        }else{
                                                            if (vhodnaValuta.equals("USD") && izhodnaValuta.equals("USD")){
                                                                result=suma*1;
                                                            }else{
                                                                if (vhodnaValuta.equals("EUR") && izhodnaValuta.equals("EUR")){
                                                                    result=suma*1;
                                                                }else{
                                                                    if (vhodnaValuta.equals("GBP") && izhodnaValuta.equals("GBP")){
                                                                        result=suma*1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }




        }
        System.out.printf("%.2f %s", result, izhodnaValuta);
    }
}