/*
car motion calculator revisited
Tyler Wong
09/25/2023
*/
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner inp1=new Scanner(System.in);
        System.out.println("magnitude 1");
        int mag1=inp1.nextInt();
        Scanner inp2=new Scanner(System.in);
        System.out.println("unit 1");
        String unit1=inp2.nextLine();
        Scanner inp3=new Scanner(System.in);
        System.out.println("magnitude 2");
        int mag2=inp3.nextInt();
        Scanner inp4=new Scanner(System.in);
        System.out.println("unit 2");
        String unit2=inp4.nextLine();
        if (Objects.equals(unit1, "d")) {
            if (Objects.equals(unit2, "s")) {
                System.out.println("time = "+mag1/mag2);
            }
            if (Objects.equals(unit2, "t")) {
                System.out.println("speed = "+mag1/mag2);
            }
        }
        if (Objects.equals(unit1, "s")) {
            if (Objects.equals(unit2, "d")) {
                System.out.println("time = "+mag2/mag1);
            }
            if (Objects.equals(unit2, "t")) {
                System.out.println("distance = "+mag1*mag2);
            }
        }
        if (Objects.equals(unit1, "t")) {
            if (Objects.equals(unit2, "d")) {
                System.out.println("speed = "+mag2/mag1);
            }
            if (Objects.equals(unit2, "s")) {
                System.out.println("distance = "+mag1*mag2);
            }
        }
    }
}
