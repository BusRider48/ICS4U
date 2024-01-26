/*
email analyzer
Tyler Wong
09/21/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //gets input for email address
        Scanner inp1=new Scanner(System.in);
        System.out.println("enter your email address");
        String email=inp1.nextLine();
        //finds where @ symbol is and splits the string
        int at=email.indexOf("@");
        String emailName=email.substring(0,at);
        String emailDomain=email.substring(at+1,email.length());
        System.out.println("your email name is '"+emailName+"' and your email domain is '"+emailDomain+"'");
    }
}
