/*
rolling dice
Tyler Wong
09/28/2023
*/
public class Main {
    public static void main(String[]args) {
        int die1=0;
        int die2=0;
        int total=0;
        String str1="";
        String str2="";
        String str3="";
        //gets random numbers for 2 dice
        die1=(int)((6-1+1)*Math.random()+1);
        die2=(int)((6-1+1)*Math.random()+1);
        total=die1+die2;
        //converts numbers to words
        switch(die1) {
            case 1:
                str1="one";
                break;
            case 2:
                str1="two";
                break;
            case 3:
                str1="three";
                break;
            case 4:
                str1="four";
                break;
            case 5:
                str1="five";
                break;
            case 6:
                str1="six";
                break;
        }
        switch(die2) {
            case 1:
                str2="one";
                break;
            case 2:
                str2="two";
                break;
            case 3:
                str2="three";
                break;
            case 4:
                str2="four";
                break;
            case 5:
                str2="five";
                break;
            case 6:
                str2="six";
                break;
        }
        switch(total) {
            case 1:
                str3="one";
                break;
            case 2:
                str3="two";
                break;
            case 3:
                str3="three";
                break;
            case 4:
                str3="four";
                break;
            case 5:
                str3="five";
                break;
            case 6:
                str3="six";
                break;
            case 7:
                str3="seven";
                break;
            case 8:
                str3="eight";
                break;
            case 9:
                str3="nine";
                break;
            case 10:
                str3="ten";
                break;
            case 11:
                str3="eleven";
                break;
            case 12:
                str3="twelve";
                break;
        }
        System.out.println("die 1: "+str1+"\n"+"die 2: "+str2+"\n"+"total: "+str3);
    }
}
