/*
fraction simplifier
Tyler Wong
11/06/2023
*/
import java.util.ArrayList;
public class Main {
	//method from gcf calculator
    private static int gcf_calculator(int num1, int num2) {
        ArrayList<Integer> num1factors=new ArrayList<>();
        ArrayList<Integer> num2factors=new ArrayList<>();
        int gcf=0;
        int i=0;
        for (i=1; i<=(num1/2); i++) {
            if (num1%i==0) {
                num1factors.add(i);
            }
        }
        for (i=1; i<=(num2/2); i++) {
            if (num2%i==0) {
                num2factors.add(i);
            }
        }
        for (i=0; i<num1factors.size(); i++) {
            if (num2factors.contains(num1factors.get(i))==true) {
                if (num1factors.get(i)>gcf) {
                    gcf=num1factors.get(i);
                }
            }
        }
        return gcf;
    }
	//returns a string with simplified fraction
    private static String fraction_simplifier(int num, int den) {
		//divides numerator and denominator with the greatest common factor
        int gcfnum=num/gcf_calculator(num,den);
        int gcfden=den/gcf_calculator(num,den);
        int whole=0;
		//simplifies improper fractions to mixed fractions
        if (gcfnum>=gcfden) {
            gcfnum=gcfnum-gcfden;
            whole++;
        }
        String fraction=whole+" "+gcfnum+"/"+gcfden;
        return fraction;
    }
    public static void main(String[]args) {
        System.out.println(fraction_simplifier(79,44));
        System.out.println(fraction_simplifier(87,54));
        System.out.println(fraction_simplifier(26,34));
    }
}
