/*
basic timer
Tyler Wong
10/20/2023
*/
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//inputs for user input and counter
        int secondsInp=0;
        int secondsCounter=0;
        boolean lock=false;
		boolean endLock=true;
		//gets input for setting the timer
        Scanner inp1=new Scanner(System.in);
        System.out.println("set the timer in seconds");
        secondsInp=inp1.nextInt();
		//first loop counts and displays the seconds. activates second loop when the timer ends
        while (lock==false) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            secondsCounter++;
            if (secondsCounter==secondsInp) {
				endLock=false;
				//second loop prompts the user to dismiss or reset the timer
				while (endLock==false) {
					Scanner inp2=new Scanner(System.in);
					System.out.println("timer ended. type 'ok' to dismiss. type 'reset' to reset the current timer");
					String end=inp2.nextLine();
					//exits both loops if the user dismisses the timer
					if (Objects.equals(end,"ok")) {
						endLock=true;
						lock=true;
					}
					//exits only the second loop and resets the timer if the user resets the timer
					else if (Objects.equals(end,"reset")) {
						endLock=true;
						secondsCounter=0;
					}
				}
            }
            else {
                System.out.println(secondsInp-secondsCounter);
            }
        }
    }
}
