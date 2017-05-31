import java.util.Scanner;

/**
 * Created by Alex on 17.1.2017 г..
 */
public class MetricConverter {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        double value=Double.parseDouble(console.nextLine());
        String vhodnaEdinica=console.nextLine();
        String izhodnaEdinica=console.nextLine();
        double izhodnaValue=0.0;

        if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("mm")){

            izhodnaValue=value*1000;
        }else if (vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value*100;
        }else if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.000621371192;
        }else if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*39.3700787;
        }else if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value*0.001;
        }else if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*3.2808399;
        }else if(vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*1.0936133;
        }else if(vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/1000;
        }else if(vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value/10;
        }else if(vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.000000621371192;
        }else if(vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*0.0393700787;
        }else if (vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value*0.000001;
        }else if (vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*0.0032808399;
        }else if (vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*0.0010936133;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/100;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value*10;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.00000621371192;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*0.393700787;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value*0.00001;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*0.032808399;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*0.010936133;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/0.000621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value/0.000000621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value/0.00000621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*39.3700787/0.000621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value/0.621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*3.2808399/0.000621371192;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*1.0936133/0.000621371192;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/39.3700787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value/0.0393700787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value/0.393700787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.000621371192/39.3700787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value/39370.0787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*3.2808399/39.3700787;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*1.0936133/39.3700787;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value*1000;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value*1000000;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value*100000;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.621371192;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("in")){

            izhodnaValue=value*39370.0787;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*3280.8399;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*1093.6133;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/3.2808399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value/0.0032808399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value/0.032808399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.000621371192/3.2808399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*39.3700787/3.2808399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value/3280.8399;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value*1.0936133/3.2808399;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value/1.0936133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value/0.0010936133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value/0.010936133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value*0.000621371192/1.0936133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value*39.3700787/1.0936133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value/1093.6133;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value*3.2808399/1.0936133;
        }else if (vhodnaEdinica.equals("m")&&izhodnaEdinica.equals("m")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("mm")&&izhodnaEdinica.equals("mm")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("cm")&&izhodnaEdinica.equals("cm")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("mi")&&izhodnaEdinica.equals("mi")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("in")&&izhodnaEdinica.equals("in")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("km")&&izhodnaEdinica.equals("km")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("ft")&&izhodnaEdinica.equals("ft")){
            izhodnaValue=value;
        }else if (vhodnaEdinica.equals("yd")&&izhodnaEdinica.equals("yd")){
            izhodnaValue=value;
        }

        System.out.printf("%f %s", izhodnaValue, izhodnaEdinica);

    }
}
