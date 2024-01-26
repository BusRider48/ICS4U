/*
count number of non-alphanumeric characters
Tyler Wong
10/10/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//gets input for a sentence
        Scanner inp1=new Scanner(System.in);
        System.out.println("input a sentence");
        String sen=inp1.nextLine();
		//turns the sentence into a string array
        String[] ary=sen.split("");
        int nonAlphanumeric=0;
        for (int i=0; i<sen.length(); i++) {
            switch(ary[i]) {
				//adds to counter if the value in the string array is not alphanumeric
                //is " " a non-alphanumeric character? probably
                case("0"), ("1"), ("2"), ("3"), ("4"), ("5"), ("6"), ("7"), ("8"), ("9"), ("q"), ("w"), ("e"), ("r"), ("t"), ("y"), ("u"), ("i"), ("o"), ("p"), ("a"), ("s"), ("d"), ("f"), ("g"), ("h"), ("j"), ("k"), ("l"), ("z"), ("x"), ("c"), ("v"), ("b"), ("n"), ("m"):
                    break;
                default:
                    nonAlphanumeric++;
            }
        }
        System.out.println("your sentence has "+nonAlphanumeric+" digits");
    }
}
