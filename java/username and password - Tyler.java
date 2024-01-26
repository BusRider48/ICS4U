/*
username and password
Tyler Wong
09/25/2023
*/
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        String currentUser = "Admin";
        String currentPass = "admin";
        int check = 0;
        Scanner inp1 = new Scanner(System.in);
        System.out.println("username");
        String username = inp1.nextLine();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("password");
        String password = inp2.nextLine();
        if (Objects.equals(username, currentUser)) {
            check+=1;
        }
        if (Objects.equals(password, currentPass)) {
            check+=1;
        }
        if (check==2) {
            System.out.println("logging in");
        }
        else {
            System.out.println("log in failed");
        }
    }
}
