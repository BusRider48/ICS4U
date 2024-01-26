/*
product of natural numbers
Tyler Wong
11/02/2023
*/
public class Main {
	//multiplies a number by every number below it and above 0
    private static void print_1_to_N_product(int num) {
        int i=0;
        for (i=num-1; i>0; i--) {
            num*=i;
        }
        System.out.println(num);
    }
    public static void main(String[]args) {
        print_1_to_N_product(3);
        print_1_to_N_product(4);
        print_1_to_N_product(5);
    }
}
