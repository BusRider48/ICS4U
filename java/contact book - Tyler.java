/*
contact book
Tyler Wong
11/13/2023
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
		//variables for strings used for commands
        String mode="";
        String name="";
        String number="";
        String nameGet="";
        String nameUpdate="";
        String numberUpdate="";
        String nameRemove="";
		//map for contact list
        Map<String,String> contactList=new HashMap<String,String>();
        boolean lock=false;
        while (lock==false) {
			//user input for command
            Scanner inp1=new Scanner(System.in);
            System.out.println("enter a command");
            mode=inp1.nextLine();
            switch (mode) {
				//adds name with number to map
                case "add":
                    Scanner inp2=new Scanner(System.in);
                    System.out.println("enter name of contact");
                    name=inp2.nextLine();
                    Scanner inp3=new Scanner(System.in);
                    System.out.println("enter number of contact");
                    number=inp3.nextLine();
                    contactList.put(name,number);
                    System.out.println("created contact");
                    break;
				//gets number from name if possible
                case "get":
                    Scanner inp4=new Scanner(System.in);
                    System.out.println("enter name of contact");
                    nameGet=inp4.nextLine();
                    if (contactList.containsKey(nameGet)==true) {
                        System.out.println("number: "+contactList.get(nameGet));
                    }
                    else {
                        System.out.println("this contact does not exist");
                    }
                    break;
				//updates contact if possible
                case "update":
                    Scanner inp5=new Scanner(System.in);
                    System.out.println("enter name of contact");
                    nameUpdate=inp5.nextLine();
                    if (contactList.containsKey(nameUpdate)==true) {
                        Scanner inp6=new Scanner(System.in);
                        System.out.println("enter new number for contact");
                        numberUpdate=inp6.nextLine();
                        contactList.put(nameUpdate,numberUpdate);
                        System.out.println("updated contact");
                    }
                    else {
                        System.out.println("this contact does not exist");
                    }
                    break;
				//removes contact if possible
                case "remove":
                    Scanner inp7=new Scanner(System.in);
                    System.out.println("enter name of contact");
                    nameRemove=inp7.nextLine();
                    if (contactList.containsKey(nameUpdate)==true) {
                        contactList.remove(nameRemove);
                        System.out.println("removed contact");
                    }
                    else {
                        System.out.println("this contact does not exist");
                    }
                    break;
				//prints map to console
                case "display":
                    System.out.println(contactList);
                    break;
				//ends loop
                case "quit":
                    lock=true;
                    break;
				//outputs on invalid command
                default:
                    System.out.println("invalid command");
                    break;
            }
        }
        System.out.println("exiting program");
    }
}
