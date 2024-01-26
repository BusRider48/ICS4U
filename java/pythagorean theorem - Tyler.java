/*
pythagorean theorem
Tyler Wong
09/20/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //calls Scanner for two sides of the right triangle
        Scanner inp1=new Scanner(System.in);
        System.out.println("first leg of the right triangle");
        float side1=inp1.nextFloat();
        Scanner inp2=new Scanner(System.in);
        System.out.println("second leg of the right triangle");
        float side2=inp2.nextFloat();
        //gets the square of the two sides
        side1=side1*side1;
        side2=side2*side2;
        //adds the squares then takes the square root for the hypotenuse
        float side3=side1+side2;
        side3=(float)Math.sqrt(side3);
        //multiplies the float by 100, rounds the float, then divides by 100 to round the number to the nearest hundredth
        side3=side3*100;
        side3=Math.round(side3);
        side3=side3/100;
        System.out.println("the hypotenuse of the right triangle is "+side3);
    }
}
