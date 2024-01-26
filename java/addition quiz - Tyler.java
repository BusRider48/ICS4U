/*
addition quiz
Tyler Wong
09/28/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        int q=0;
        int num1=0;
        int num2=0;
        int correct=0;
        //runs the loop for 5 questions
        while (q<5) {
            //gets 2 random numbers
            num1=(int)((20-1+1)*Math.random()+1);
            num2=(int)((20-1+1)*Math.random()+1);
            String str1=String.valueOf(num1);
            String str2=String.valueOf(num2);
            //input for user answer
            Scanner inp1=new Scanner(System.in);
            System.out.println(str1+"+"+str2);
            int a=inp1.nextInt();
            //runs if the user got the question right
            if (a==num1+num2) {
                System.out.println("correct");
                correct+=1;
                q+=1;
            }
            //runs if the user got the question wrong
            else {
                System.out.println("incorrect");
                q+=1;
            }
        }
        System.out.println("you got a score of "+correct+" out of 5");
    }
}
