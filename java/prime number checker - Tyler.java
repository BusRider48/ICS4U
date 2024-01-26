/*
prime number checker
Tyler Wong
11/02/2023
*/
public class Main {
	//takes a number and tests every number from 2 until that number to find if it is a prime number
    private static void is_prime_number(int num) {
        boolean isPrime=false;
        for (int i=2; i<num; i++) {
            int prime=num%i;
            if (prime==0) {
                isPrime=true;
            }
        }
        if (isPrime==true) {
            System.out.println("this is a prime number");
        }
        else {
            System.out.println("this is not a prime number");
        }
    }
    public static void main(String[]args) {
        is_prime_number(9);
        is_prime_number(13);
    }
}
