/*
division calculator
Tyler Wong
09/20/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //calls Scanner for two inputs for division
        Scanner inp1=new Scanner(System.in);
        System.out.println("first number");
        float num1=inp1.nextFloat();
        Scanner inp2=new Scanner(System.in);
        System.out.println("second number");
        float num2=inp2.nextFloat();
        //divides the first number by the second number
        float num3=num1/num2;
        //multiplies the result by 100, rounds the result, then divides by 100 to round the number to the nearest hundredth
        num3=num3*100;
        num3=Math.round(num3);
        num3=num3/100;
        System.out.println("the answer rounded to the nearest hundredth is "+num3);
    }
}
