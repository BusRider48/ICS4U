/*
motion of a car
Tyler Wong
09/19/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //calls Scanner for distance and speed inputs
        Scanner inp1=new Scanner (System.in);
        System.out.println("what is the distance you want to go? (km)");
        float distance=inp1.nextFloat();
        Scanner inp2=new Scanner (System.in);
        System.out.println("what is the current speed of your car? (km/h)");
        float speed=inp2.nextFloat();
        //calculates time and outputs the result
        float time=distance/speed;
        System.out.println("you have "+time+" hours left");
    }
}
