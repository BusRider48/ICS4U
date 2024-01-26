/*
calculator function
Tyler Wong
11/02/2023
*/
public class Main {
	//takes 2 numbers and a string value for operation
    private static void calculator(int num1,int num2,String op) {
        if (op.equals("a")) {
            System.out.println(num1+num2);
        }
        else if (op.equals("s")) {
            System.out.println(num1-num2);
        }
        else if (op.equals("m")) {
            System.out.println(num1*num2);
        }
        else if (op.equals("d")) {
            System.out.println(num1/num2);
        }
    }
    public static void main(String[]args) {
        calculator(3,3,"a");
        calculator(3,3,"s");
        calculator(3,3,"m");
        calculator(3,3,"d");
    }
}
