/*
shifting an array
Tyler Wong
10/27/2023
*/
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		//variables for string arrays
		String[] strArray=new String[8];
		String[] newStrArray=new String[8];
        int i=0;
		//gets inputs for each string and shifts them 3 to the right
        for (i=0; i<8; i++) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter "+(8-i)+" more strings of text");
            strArray[i]=inp1.nextLine();
			if (i+3<8) {
				newStrArray[i+3]=strArray[i];
			}
			else {
				newStrArray[i-5]=strArray[i];
			}
        }
		//prints new array
		for (i=0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
		}
	}
}
