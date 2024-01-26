/*
fibonacci numbers
Tyler Wong
10/04/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variables for input, counter, and variables to generate the numbers
        int num=0;
        int count=0;
        int fibonacci1=0;
        int fibonacci2=1;
        int addFibonacci1=0;
        int addFibonacci2=0;
        int fibonacci3=0;
        boolean lock=false;
        Scanner inp1=new Scanner(System.in);
        System.out.println("amount of numbers you want generated:");
        num=inp1.nextInt();
		//prints the first 2 numbers
        System.out.println(fibonacci1);
        System.out.println(fibonacci2);
        while (lock==false) {
            if (num==count) {
                lock=true;
            }
			//generates and prints an amount of the next numbers as defined by the user
            else {
                addFibonacci1=fibonacci1;
                addFibonacci2=fibonacci2;
                fibonacci3=addFibonacci1+addFibonacci2;
                System.out.println(fibonacci3);
                count+=1;
                fibonacci1=addFibonacci2;
                fibonacci2=fibonacci3;
            }
        }
        System.out.println("you printed "+count+" fibonacci numbers");
    }
}
