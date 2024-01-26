/*
collatz conjecture simulator
Tyler Wong
10/03/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        int initial=0;
        boolean lock=false;
        Scanner inp1=new Scanner(System.in);
        System.out.println("starting number: ");
        initial=inp1.nextInt();
        while (lock==false) {
            if (initial==1) {
                lock=true;
            }
            else if (initial%2==0) {
                initial=initial/2;
                System.out.println(initial);
            }
            else if (initial%2!=0) {
                initial=(initial*3)+1;
                System.out.println(initial);
            }
        }
    }
}
