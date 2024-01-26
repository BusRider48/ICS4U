/*
mini multiplication table
Tyler Wong
10/03/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        int num1=0;
        int num2=0;
        float multiplier=0;
        //gets inputs for multiplier, starting number, and ending number
        Scanner inp1=new Scanner(System.in);
        System.out.println("multiplier:");
        multiplier=inp1.nextFloat();
        Scanner inp2=new Scanner(System.in);
        System.out.println("starting number:");
        num1=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("ending number:");
        num2=inp3.nextInt();
        //prints the result of the multiplier and each integer between the starting number and ending number
        for (int i=num1; i<=num2; i++) {
            System.out.println(i+" x "+multiplier+" = "+(i*multiplier));
        }
    }
}
