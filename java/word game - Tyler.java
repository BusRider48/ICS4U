/*
word game
Tyler Wong
11/09/2023
*/
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[]args) {
		//variables for first letter in word, user input, set list for words entered
        char first;
        String inp="";
        Set<String> uniqueWord=new HashSet<>();
		//input for first letter in words
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter what letter you want to use");
        first=inp1.next(".").charAt(0);
        boolean lock=false;
		//main game loop
        while (lock==false) {
            Scanner inp2=new Scanner(System.in);
            System.out.println("enter as many 5 letter words starting with that letter. enter 'quit' to see how many words you got");
            inp=inp2.nextLine();
			//ends loop if user inputs 'quit'
            if (inp.equals("quit")) {
                lock=true;
            }
			//outputs if the user does not input a 5 letter word
            else if (inp.length()!=5) {
                System.out.println("invalid input");
            }
			//outputs if the user inputs a word starting with the wrong letter
            else if (inp.charAt(0)!=first) {
                System.out.println("invalid input");
            }
			//adds input to list if it passes other checks
            else {
                uniqueWord.add(inp.toLowerCase());
            }
        }
        System.out.println("you entered "+uniqueWord.size()+" words");
    }
}
