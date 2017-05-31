import java.util.Scanner;

/**
 * Created by Alex on 12.3.2017 г..
 */
public class Fox {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            System.out.println(repeatStr("*", i)+repeatStr("\\", 1)+repeatStr("-", 2*n-(2*i-1))+repeatStr("/", 1)+repeatStr("*", i));
            
        }

        int b=n/3;
        int c=n/2;

        for (int i = 0; i <b; i++) {

            System.out.println(repeatStr("|", 1)+repeatStr("*", c+i)+repeatStr("\\", 1)+repeatStr("*", n-2*i)+repeatStr("/", 1)+repeatStr("*", c+i)+repeatStr("|", 1));

        }

        for (int i = 1; i <=n ; i++) {

            System.out.println(repeatStr("-", i)+repeatStr("\\", 1)+repeatStr("*", 2*n-(2*i-1))+repeatStr("/", 1)+repeatStr("-", i));

        }
        
        
    }
    
    
    public static String repeatStr(String str, int count){
        
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {
            
            sb.append(str);
        }
        
        return sb.toString();
        
    }
}
