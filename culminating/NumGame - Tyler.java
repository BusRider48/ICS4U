/*
number recall game, or simon says
Tyler Wong
01/10/2024
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		
		//variables - random number, user input, round counter (also used in score), highscore, array for random numbers, maximum for random number, minimum for random number
        int num=0;
        String inp;
        int round=0;
        int highscore=0;
        int[] seq;
        int max=9;
        int min=1;
        boolean lock=false;
        boolean optionLock=false;
        boolean gameLock=false;
        System.out.println("------------------------------------\nnumber recall game\n------------------------------------");
		
		//main loop
        while (lock==false) {
			
			//options loop
            while (optionLock==false) {
                Scanner sc=new Scanner(System.in);
                System.out.println("you are in the options. to change a setting enter the setting name followed by what you want to change it to, seperated by a space (' ').\ntype 'done' to exit.\nminimum_number: "+min+"\nmaximum_number: "+max);
                inp=sc.nextLine();
				
				//exits option loop
                if (inp.equals("done")) {
                    System.out.println("starting game");
                    optionLock=true;
                    break;
                }
				
				//splits the input for changing settings
                int space=inp.indexOf(" ");
                String settingName=inp.substring(0,space);
                String settingValue=inp.substring(space+1,inp.length());
				
				//changes setting for minimum number
                if (settingName.equals("minimum_number")) {
                    min=Integer.parseInt(settingValue);
                }
				
				//changes setting for maximum number
                else if (settingName.equals("maximum_number")) {
                    max=Integer.parseInt(settingValue);
                }
            }
			
			//game loop
            while (gameLock==false) {
				
				//generates an array dictated by the round number and adds random numbers to it
                seq=new int[round+1];
                for (int i=0; i<round+1; i++) {
                    num=(int)((max-min+1)*Math.random()+min);
                    seq[i]=num;
                    System.out.print(num+" ");
                }
				
				//waits 5 seconds, then allows the user to repeat the sequence
                try { Thread.sleep(5000); } catch (InterruptedException e) {}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the sequence of numbers you saw with spaces");
                inp=sc.nextLine();
                String[] inpArr=inp.split(" ");
				
				//loops through the array to determine if it is correct
				//if not, then it will exit the game loop
				//if yes, then it will increment the round value
                for (int i=0; i<inpArr.length; i++) {
                    if (seq[i]!=Integer.parseInt(inpArr[i])) {
                        System.out.println("you lose");
                        gameLock=true;
                        break;
                    }
                }
                round++;
            }
			
			//shows the score and highscore
            System.out.println("you reached round "+round);
            if (round>highscore) {
                highscore=round;
                System.out.println("you beat your highscore for this session");
            }
            else {
                System.out.println("your highscore for this session is "+highscore);
            }
			
			//allows the user to restart the game
            Scanner sc=new Scanner(System.in);
            System.out.println("play again? y/n");
            inp=sc.nextLine();
            if (inp.equals("y")) {
                round=0;
                gameLock=false;
            }
            else {
                System.out.println("ending program");
                lock=true;
            }
        }
    }
}
