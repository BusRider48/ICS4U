/*
area and circumference of a circle
Tyler Wong
09/19/2023
 */
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //calls Scanner for radius input
        Scanner inp1=new Scanner (System.in);
        System.out.println("radius of circle:");
        float r=inp1.nextFloat();
        //calculates area, circumference and diameter using 3.14 as pi
        float pi=3.14f;
        float area=pi*r*r;
        float circumference=2*pi*r;
        float diameter=r*2;
        System.out.println("the area of the circle is "+area+" units.\nthe circumference of the circle is "+circumference+" units.\nthe diameter of the circle is "+diameter+" units.");
    }
}
