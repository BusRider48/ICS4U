/*
filtering an array
Tyler Wong
10/27/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variable for string array
        String[] strArray=new String[10];
        int i=0;
		//gets 10 strings to store in the array
        for (i=0; i<10; i++) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter "+(10-i)+" more strings of text");
            strArray[i]=inp1.nextLine();
        }
		//outputs only strings with an even amount of characters
        for (i=0; i<strArray.length; i++) {
            if (strArray[i].length()%2==0) {
                System.out.println(strArray[i]);
            }
        }
    }
}
