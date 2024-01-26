/*
a rectangular prism class
Tyler Wong
11/15/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//creates rect with 5 variables
        Rect rect=new Rect();
		//user input for length, width, height
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter the length");
        rect.length=inp1.nextInt();
        Scanner inp2=new Scanner(System.in);
        System.out.println("enter the width");
        rect.width=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("enter the height");
        rect.height=inp3.nextInt();
		//calculates the volume and surface area
        rect.volume=(rect.length*rect.width*rect.height);
        rect.surfaceArea=((rect.length*rect.height)*4+(rect.width*rect.height)*2);
        System.out.println("volume "+rect.volume+"\nsurface area "+rect.surfaceArea);
    }
}
class Rect {
    int length;
    int width;
    int height;
    int volume;
    int surfaceArea;
}
