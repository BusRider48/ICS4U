/*
gcf calculator
Tyler Wong
11/06/2023
*/
import java.util.ArrayList;
public class Main {
	//returns the greatest common factor of two numbers
    private static int gcf_calculator(int num1, int num2) {
		//arraylists for the factors of both numbers
        ArrayList<Integer> num1factors=new ArrayList<>();
        ArrayList<Integer> num2factors=new ArrayList<>();
        int gcf=0;
        int i=0;
		//tests first number for factors
        for (i=1; i<=(num1/2); i++) {
            if (num1%i==0) {
                num1factors.add(i);
            }
        }
		//tests second number for factors
        for (i=1; i<=(num2/2); i++) {
            if (num2%i==0) {
                num2factors.add(i);
            }
        }
		//finds common elements in both arraylists
        for (i=0; i<num1factors.size(); i++) {
            if (num2factors.contains(num1factors.get(i))==true) {
                if (num1factors.get(i)>gcf) {
                    gcf=num1factors.get(i);
                }
            }
        }
        return gcf;
    }
    public static void main(String[]args) {
        System.out.println(gcf_calculator(10,12));
        System.out.println(gcf_calculator(18,24));
        System.out.println(gcf_calculator(6,9));
    }
}
