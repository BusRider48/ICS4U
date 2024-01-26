/*
shifting an array extended
Tyler Wong
10/27/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variables for string arrays and amount to shift elements in array
        String[] strArray=new String[8];
        String[] newStrArray=new String[8];
        int shift=0;
        int i=0;
		//input for amount to shift elements in array
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter how many spaces you want to shift each string");
        shift=inp1.nextInt();
		//gets input for each string and shifts them as desired
        for (i=0; i<8; i++) {
            Scanner inp2=new Scanner(System.in);
            System.out.println("enter "+(8-i)+" more strings of text");
            strArray[i]=inp2.nextLine();
            if (i+shift<8) {
                newStrArray[i+shift]=strArray[i];
            }
            else {
                newStrArray[i+(shift-8)]=strArray[i];
            }
        }
		//prints new array
        for (i=0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
