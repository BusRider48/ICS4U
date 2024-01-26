/*
Tyler Wong
summing user inputs
10/12/2023
*/
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args) {
        boolean lock=false;
        int total=0;
        //loop continues until user inputs "quit"
        while (lock==false) {
            //gets user input from message dialog
            String numStr=JOptionPane.showInputDialog("enter numbers to add, type 'quit' to end");
            //ends loop
            if (numStr.equals("quit")) {
                lock=true;
            }
            //adds user input to total of inputs
            else {
                int numInt=Integer.parseInt(numStr);
                total=total+numInt;
            }
        }
        JOptionPane.showMessageDialog(null,"sum of inputs is "+total);
    }
}
