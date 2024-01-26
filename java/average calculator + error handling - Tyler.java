/*
average calculator + error handling
Tyler Wong
10/19/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //variables for user input, counter for numbers inputted, and sum of inputs
        int num=0;
        int count=0;
        int total=0;
        boolean lock=false;
        while (lock==false) {
            //gets input for each number
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter a grade percentage, enter a 0 to calculate average");
            num=inp1.nextInt();
            //outputs if the input is higher than 100
            if (num>100) {
                System.out.println("invalid input");
            }
            //outputs if the input is lower than 0
            else if (num<0) {
                System.out.println("invalid input");
            }
            //calculates average when the user inputs a 0
            else if (num==0) {
                System.out.println("your grade percent average is "+(total/count));
                lock=true;
            }
            //adds input to total and 1 to count
            else {
                count++;
                total=total+num;
            }
        }
    }
}
