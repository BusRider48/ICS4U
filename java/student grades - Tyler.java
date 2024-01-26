/*
student grades
Tyler Wong
10/31/2023
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args) {
        //array list for all inputs, variables for input to add to list, user input, minimum value, maximum value, average, total to calculate average, count of 90 or above, count of below fifty, count of numbers to calculate average
        ArrayList<Integer> grades=new ArrayList<>();
        int grade=0;
        String inp="";
        int min=0;
        int max=0;
        int avg=0;
        int total=0;
        int ninety=0;
        int fifty=0;
        int count=0;
        boolean lock=false;
        while (lock==false) {
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter a grade value. enter 'quit' to get analysis");
            inp=inp1.nextLine();
            //exits while loop if user inputs 'quit'
            if (inp.equals("quit")) {
                lock=true;
            }
            //adds user input to array list
            else {
                grade=Integer.parseInt(inp);
                grades.add(grade);
            }
        }
		//calculates maximum, minimum, count of 90 or above, count of below 50
        for (int i=0; i<grades.size(); i++) {
            total+=grades.get(i);
            count++;
            if (max==0 && min==0) {
                max=grades.get(i);
                min=grades.get(i);
            }
            if (grades.get(i)>max) {
                max=grades.get(i);
            }
            if (grades.get(i)<min) {
                min=grades.get(i);
            }
            if (grades.get(i)>=90) {
                ninety++;
            }
            if (grades.get(i)<50) {
                fifty++;
            }
        }
        avg=total/count;
        //outputs maximum, minimum, average, 90 or above, below 50
        System.out.println("maximum: "+max+"\nminimum: "+min+"\naverage: "+avg+"\n90 or above "+ninety+"\nbelow 50 "+fifty);
    }
}
