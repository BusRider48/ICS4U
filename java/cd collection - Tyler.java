/*
cd collection
Tyler Wong
10/31/2023
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[]args) {
		//array list for all inputs, variable for input to add to list
		ArrayList<String> cds=new ArrayList<>();
		String cd="";
		boolean lock=false;
		while (lock==false) {
			Scanner inp1=new Scanner(System.in);
			System.out.println("enter a cd name. enter 'quit' to show your list");
			cd=inp1.nextLine();
			//exits while loop if user inputs 'quit'
			if (cd.equals("quit")) {
				lock=true;
			}
			//adds user input to array list
			else {
				cds.add(cd);
			}
		}
		//outputs all items in array list
		for (int i=0; i<cds.size(); i++) {
			System.out.println(cds.get(i));
		}
	}
}
