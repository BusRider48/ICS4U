/*
email analyzer + error handling
Tyler Wong
09/21/2023
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        //variables for position of @ symbol and input
        int at=0;
        String email="";
        boolean lock=false;
        while (lock==false) {
            //gets input for email
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter your email address");
            email=inp1.nextLine();
            //finds position of @ symbol
            at=email.indexOf("@");
            //if the @ symbol is the first character or not present then it outputs error
            if (at<1) {
                System.out.println("you did not input a valid email address");
            }
            //if the email is correctly inputted then it will separate the email name and domain and give the output
            else {
                String emailName=email.substring(0,at);
                String emailDomain=email.substring(at+1,email.length());
                System.out.println("your email name is '"+emailName+"' and your email domain is '"+emailDomain+"'");
                lock=true;
            }
        }
    }
}
