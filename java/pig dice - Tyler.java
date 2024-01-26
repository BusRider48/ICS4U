/*
pig dice
Tyler Wong
10/23/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variables for player counter, goal (or score limit), score counters, die, sum of dice in a turn, and player names
        int player=1;
        int goal=30;
        int score1=0;
        int score2=0;
        int die=0;
        int dieTotal=0;
        String player1="player1";
        String player2="player2";
        boolean optionLock=false;
        boolean lock=false;
        while (lock==false) {

			//loop for options page
            while (optionLock==false) {
                Scanner inp=new Scanner(System.in);
                System.out.println("you are in the options. to change a setting enter the setting name followed by what you want to change it to, seperated by a space (' ').\ntype 'done' to exit.\nscore_limit: "+goal+"\nplayer1_name: "+player1+"\nplayer2_name: "+player2);
                String inp1=inp.nextLine();
				//exits option page and starts the game
                if (inp1.equals("done")) {
                    System.out.println("exiting");
                    optionLock=true;
                }
                if (optionLock==false) {
                    int space=inp1.indexOf(" ");
                    String settingName=inp1.substring(0,space);
                    String settingValue=inp1.substring(space+1,inp1.length());
					//option for player name
                    if (settingName.equals("player1_name")) {
                        player1=settingValue;
                    }
					//option for player name
                    else if (settingName.equals("player2_name")) {
                        player2=settingValue;
                    }
					//option for score limit
                    else if (settingName.equals("score_limit")) {
                        goal=Integer.parseInt(settingValue);
                    }
                }
                else {
                    break;
                }
            }

			//loop for player 1
            while (player==1) {
				//exits player loop if there is a winner
                if (score1>=goal) {
                    player=0;
                    lock=true;
                }
				//exits player loop if there is a winner
                else if (score2>=goal) {
                    player=0;
                    lock=true;
                }
                if (player==1) {
                    Scanner inp=new Scanner(System.in);
                    System.out.println("---\n"+player1+"\nscore: "+score1+"\ndietotal: "+dieTotal+"\ntype 'roll' to roll the die. type 'end' to end your turn");
                    String inp1=inp.nextLine();
					//generates a die
                    die=(int)((6-1+1)*Math.random()+1);
					//ends turn and adds sum of dice rolled to the score
                    if (inp1.equals("end")) {
                        score1=score1+dieTotal;
                        dieTotal=0;
                        player=2;
                    }
					//ends turn. does not add to score
                    else if (die==1) {
                        System.out.println("you rolled a 1. ending turn");
                        dieTotal=0;
                        die=0;
                        player=2;
                    }
					//adds generated die to sum of dice rolled
                    else if (inp1.equals("roll")) {
                        System.out.println("you rolled "+die);
                        dieTotal=dieTotal+die;
                    }
                }
                else {
                    break;
                }
            }
			//loop for player 2
            while (player==2) {
				//exits player loop if there is a winner
                if (score1>=goal) {
                    player=0;
                    lock=true;
                }
				//exits player loop if there is a winner
                else if (score2>=goal) {
                    player=0;
                    lock=true;
                }
                if (player==2) {
                    Scanner inp=new Scanner(System.in);
                    System.out.println("---\n"+player2+"\nscore: "+score2+"\ndietotal: "+dieTotal+"\ntype 'roll' to roll the die. type 'end' to end your turn");
                    String inp1=inp.nextLine();
					//generates a die
                    die=(int)((6-1+1)*Math.random()+1);
					//ends turn and adds sum of dice rolled to the score
                    if (inp1.equals("end")) {
                        score2=score2+dieTotal;
                        dieTotal=0;
                        player=1;
                    }
					//ends turn. does not add to score
                    else if (die==1) {
                        System.out.println("you rolled a 1. ending turn");
                        dieTotal=0;
                        die=0;
                        player=1;
                    }
					//adds generated die to sum of dice rolled
                    else if (inp1.equals("roll")) {
                        System.out.println("you rolled "+die);
                        dieTotal=dieTotal+die;
                    }
                }
                else {
                    break;
                }
            }
        }
        if (score1>=goal) {
            System.out.println(player1+" wins");
        }
        else if (score2>=goal) {
            System.out.println(player2+" wins");
        }
        System.out.println("quitting");
    }
}
