/*
number guessing
Tyler Wong
10/04/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //variables for an input, answer, and counter
        int num=0;
        int answer=0;
        int count=0;
        boolean lock=false;
        //gets a number between 1 and 100
        answer=(int)((100-1+1)*Math.random()+1);
        while (lock==false) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("guess a number between 1 and 100");
            num=inp1.nextInt();
            //if the input equals the answer the loop will end
            if (num==answer) {
                count+=1;
                lock=true;
            }
            //if the input does not equal the answer, a hint will be given
            else if (num!=answer) {
                if (num<answer) {
                    count+=1;
                    System.out.println("higher");
                }
                if (num>answer) {
                    count+=1;
                    System.out.println("lower");
                }
            }
        }
        System.out.println("correct!\nyou took "+count+" guesses");
    }
}
