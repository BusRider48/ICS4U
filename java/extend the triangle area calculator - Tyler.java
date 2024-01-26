/*
extend the triangle area calculator
Tyler Wong
11/16/2023
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args) {
        System.out.println("triangle area calculator");
        //array lists for triangles and areas of triangles
        ArrayList<Triangle> triangles=new ArrayList<>();
        ArrayList<Integer> areas=new ArrayList<>();
        String inp="";
        boolean lock=false;
        //loop gets triangles from user
        while (lock==false) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter the side lengths of a triangle or type 'quit' to calculate");
            inp=inp1.nextLine();
            //exits loop
            if (inp.equals("quit")) {
                lock=true;
            }
            else {
                Triangle triangle=new Triangle();
                triangle.side1=Float.parseFloat(inp);
                Scanner inp2=new Scanner(System.in);
                inp=inp2.nextLine();
                triangle.side2=Float.parseFloat(inp);
                Scanner inp3=new Scanner(System.in);
                inp=inp3.nextLine();
                triangle.side3=Float.parseFloat(inp);
                triangles.add(triangle);
                System.out.println("added a triangle");
            }
        }
        //variables to check for the largest triangle
        int largest=0;
        float largestArea=0;
        int i=0;
        //calculates areas of the triangles and stores them in an array list
        for (i=0; i<triangles.size(); i++) {
            float a=triangles.get(i).side1;
            float b=triangles.get(i).side2;
            float c=triangles.get(i).side3;
            float p=(float)((0.5)*(a+b+c));
            float area=(float)Math.sqrt((p)*(p-a)*(p-b)*(p-c));
            areas.add((int)area);
        }
        //finds which area is the largest
        for (i=0; i<areas.size(); i++) {
            if (i>largestArea) {
                largestArea=areas.get(i);
                largest=(i+1);
            }
        }
        System.out.println("you gave "+areas.size()+" triangles.\nthe triangle with the largest area is triangle "+largest);
    }
}
class Triangle {
    float side1;
    float side2;
    float side3;
}
