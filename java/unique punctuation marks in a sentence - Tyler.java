/*
unique punctuation marks in a sentence
Tyler Wong
11/09/2023
*/
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[]args) {
        //variable for user input, set list to scan for special characters
        String inp="";
        Set<Character> uniquePunctuation=new HashSet<>();
        Scanner inp1=new Scanner(System.in);
        System.out.println("input a sentence");
        inp=inp1.nextLine();
        //finds special characters in user input
        for (int i=0; i<inp.length(); i++) {
            char character_i = inp.charAt(i);
            switch (character_i) {
                case '.', '?', '!', ';', ':', '-':
                    uniquePunctuation.add(character_i);
                    break;
            }
        }
        int uniquePunctuationCount=uniquePunctuation.size();
        System.out.println("this sentence has "+uniquePunctuationCount+" unique punctuation marks");
    }
}
