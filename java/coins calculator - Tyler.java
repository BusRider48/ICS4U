/*
coins calculator
Tyler Wong
09/25/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        //gets input for a number to convert to coins
        Scanner inp1=new Scanner(System.in);
        System.out.println("number between 0 and 100");
        int total=inp1.nextInt();
        //only runs the calculator when the total value left is over 0
        while (total>0) {
            //tests if there is more than 25 left in the total
            while (total >= 25) {
                total -= 25;
                //adds to the quarters counter if there is more than 25 left in the total
                if (total>-1) {
                    quarters += 1;
                }
            }
            //tests if there is more than 10 left in the total
            while (total >= 10) {
                total-=10;
                //adds to the dimes counter if there is more than 10 left in the total
                if (total>-1) {
                    dimes+=1;
                }
            }
            //tests if there is more than 5 left in the total
            while (total >= 5) {
                total-=5;
                //adds to the nickels counter if there is more than 5 left in the total
                if (total>-1) {
                    nickels+=1;
                }
            }
            // tests if there is more than 1 left in the total
            while (total >= 1) {
                total-=1;
                //adds to the pennies counter if there is more than 1 left in the total
                if (total>-1) {
                    pennies+=1;
                }
            }
        }
        System.out.println("quarters\n"+quarters+"\n"+"dimes\n"+dimes+"\n"+"nickels\n"+nickels+"\n"+"pennies\n"+pennies);
    }
}
