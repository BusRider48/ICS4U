/*
another contact book
Tyler Wong
11/16/2023
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[]args) {
        //map for name and contact class
        Map<String,Contact> contactBook=new HashMap<>();
        boolean lock=false;
        //main loop
        while (lock==false) {
            //input for add or get command
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter 'add' to add a contact. enter 'get' to display a contact. enter 'quit' to end the program");
            String inp=inp1.nextLine();
            //exits loop
            if (inp.equals("quit")) {
                lock=true;
            }
            //gets inputs for name and contact elements
            else if (inp.equals("add")) {
                Contact contact=new Contact();
                System.out.println("enter a name, phone number, address, and email");
                Scanner inp2=new Scanner(System.in);
                String name=inp2.nextLine();
                Scanner inp3=new Scanner(System.in);
                contact.number=inp3.nextLine();
                Scanner inp4=new Scanner(System.in);
                contact.address=inp4.nextLine();
                Scanner inp5=new Scanner(System.in);
                contact.email=inp5.nextLine();
                contactBook.put(name,contact);
            }
            //outputs contact elements from name key
            else if (inp.equals("get")) {
                Scanner inp6=new Scanner(System.in);
                System.out.println("enter name of contact you want to display");
                inp=inp6.nextLine();
                if (contactBook.containsKey(inp)==true) {
                    System.out.println(contactBook.get(inp).number);
                    System.out.println(contactBook.get(inp).address);
                    System.out.println(contactBook.get(inp).email);
                }
                else {
                    System.out.println("this contact does not exist");
                }
            }
        }
        System.out.println("quitting program");
    }
}
class Contact {
    String number;
    String address;
    String email;
}
