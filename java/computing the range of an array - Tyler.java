/*
computing the range of an array
Tyler Wong
10/30/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//array to store user inputs, variables for minimum value, maximum value
        int[] numArray=new int[10];
        int min=0;
        int max=0;
        int i=0;
		//gets input for 10 numbers
        for (i=0; i<numArray.length; i++) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter "+(10-i)+" more numbers");
            numArray[i]=inp1.nextInt();
        }
		//finds minimum value and maximum value of user inputs
        for (i=0; i<numArray.length; i++) {
            if (max==0 && min==0) {
                max=numArray[i];
                min=numArray[i];
            }
            if (numArray[i]>max) {
                max=numArray[i];
            }
            if (numArray[i]<min) {
                min=numArray[i];
            }
        }
        System.out.println("the range of your numbers is "+(max-min));
    }
}
