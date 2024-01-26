/*
detect the season
Tyler Wong
09/25/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner inp1=new Scanner(System.in);
        System.out.println("day1");
        int day1=inp1.nextInt();
        Scanner inp2=new Scanner(System.in);
        System.out.println("day2");
        int day2=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("day3");
        int day3=inp3.nextInt();
        Scanner inp4=new Scanner(System.in);
        System.out.println("day4");
        int day4=inp4.nextInt();
        Scanner inp5=new Scanner(System.in);
        System.out.println("day5");
        int day5=inp5.nextInt();
        Scanner inp6=new Scanner(System.in);
        System.out.println("day6");
        int day6=inp6.nextInt();
        Scanner inp7=new Scanner(System.in);
        System.out.println("day7");
        int day7=inp7.nextInt();
        int average=(day1+day2+day3+day4+day5+day6+day7)/7;
        if (average>=21) {
            System.out.println("the season is Summer");
        }
        if (average<=20) {
            if (average>=0) {
                System.out.println("the season is Spring or Fall");
            }
        }
        if (average<0) {
            System.out.println("the season is Winter");
        }
    }
}
