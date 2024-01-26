/*
fancier dice roll simulator
Tyler Wong
10/30/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variables to count dice rolls, user input for number of rolls, and die roll to add to dice array
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;
        int rolls=0;
        int die=0;
        int i=0;
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter how many dice you want to roll");
        rolls=inp1.nextInt();
		//creates array with the length of the user input
        int[] dice=new int[rolls];
		//generates a die for each roll and adds them to the array
        for (i=0; i<rolls; i++) {
            die = (int) ((6 - 1 + 1) * Math.random() + 1);
            dice[i] = die;
        }
		//counts how much each number was rolled
        for (i=0; i<dice.length; i++) {
            switch(dice[i]) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
        }
        System.out.println("one: "+one+"\ntwo: "+two+"\nthree: "+three+"\nfour: "+four+"\nfive: "+five+"\nsix: "+six);
    }
}
