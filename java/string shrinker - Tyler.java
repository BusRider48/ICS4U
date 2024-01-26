/*
string shrinker
Tyler Wong
09/22/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //gets inputs for a string and the number of characters the user wants removed
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter a string");
        String sentence=inp1.nextLine();
        Scanner inp2=new Scanner(System.in);
        System.out.println("enter how many characters you want deleted from the end of the string");
        int deleted=inp2.nextInt();
        //splits the string for the output
        String sentenceFinal=sentence.substring(0,sentence.length()-deleted);
        System.out.println(sentenceFinal);
    }
}
