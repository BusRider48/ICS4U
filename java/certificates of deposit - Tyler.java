/*
certificates of deposit
Tyler Wong
10/03/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        float initial=0;
        float interest=0;
        float ending=0;
        float total=0;
        int years=0;
        Scanner inp1=new Scanner(System.in);
        System.out.println("initial investment ($):");
        initial=inp1.nextFloat();
        Scanner inp2=new Scanner(System.in);
        System.out.println("interest rate (%):");
        interest=inp2.nextFloat();
        interest=interest/100;
        Scanner inp3=new Scanner(System.in);
        System.out.println("desired ending value ($):");
        ending=inp3.nextFloat();
        while (total<ending) {
            total=initial+(initial*interest);
            years++;
            System.out.println("year: "+years);
        }
        System.out.println("\nyears: "+years);
    }
}
