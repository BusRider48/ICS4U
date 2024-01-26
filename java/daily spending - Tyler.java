/*
daily spending
Tyler Wong
09/19/2023
 */
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //calls Scanner for item, cost, and days inputs
        Scanner inp1=new Scanner (System.in);
        System.out.println("what is the item you will be buying?");
        String item=inp1.nextLine();
        Scanner inp2=new Scanner (System.in);
        System.out.println("how much does this item cost?");
        float cost=inp2.nextFloat();
        Scanner inp3=new Scanner (System.in);
        System.out.println("how many days will you be buying this item?");
        float days=inp3.nextFloat();
        //calculates the total cost then outputs the result with the name of the item user specified
        float total=cost*days;
        System.out.println("the total cost of "+item+" will be "+total+" dollars");
    }
}
