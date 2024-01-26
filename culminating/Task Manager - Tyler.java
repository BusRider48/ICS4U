/*
Task Manager
Tyler Wong
01/16/2024
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Main {
	public static void main(String[]args) {
		
		//variables to select mode, input for name, array list for completed tasks, main map for tasks
		String mode;
		String name;
		ArrayList<String> completed=new ArrayList<>();
		Map<String,Boolean> taskMan=new HashMap<String,Boolean>();
		boolean lock=false;
		System.out.println("------------------------------------\ntask manager\n------------------------------------");
		
		//main loop
		while (lock==false) {
			
			//input to select a command
			Scanner sc1=new Scanner(System.in);
			System.out.println("\nhome page\nenter '1' to add a task\nenter '2' to set a task as complete\nenter '3' to display your task list\nenter '4' to exit the program");
			mode=sc1.nextLine();
			
			//switch case for each command
			switch (mode) {
				
				//creates a task
				case "1":
					Scanner sc2=new Scanner(System.in);
					System.out.println("enter name of task");
					name=sc2.nextLine();
					taskMan.put(name,false);
					System.out.println("created task");
					break;
					
				//sets a task as complete
				case "2":
					Scanner sc3=new Scanner(System.in);
					System.out.println("enter name of task");
					name=sc3.nextLine();
					if (taskMan.containsKey(name)==true) {
						completed.add(name);
						taskMan.put(name,true);
						System.out.println("updated task");
					}
					else {
						System.out.println("this task does not exist");
					}
					break;
					
				//view either all tasks with either true (complete) or false (not complete), or only view complete tasks
				case "3":
					Scanner sc4=new Scanner(System.in);
					System.out.println("enter '1' to view all tasks (false is not complete, true is complete)\nenter '2' to show only completed tasks");
					mode=sc4.nextLine();
					switch (mode) {
						case "1":
							System.out.println(taskMan);
							break;
						case "2":
							for (int i=0; i<completed.size(); i++) {
								System.out.println(completed.get(i));
							}
							break;
						default:
							System.out.println("invalid command");
					}
					break;
					
				//exits program
				case "4":
					System.out.println("exiting program");
					lock=true;
					break;
				default:
					System.out.println("invalid command");
			}
		}
	}
}
