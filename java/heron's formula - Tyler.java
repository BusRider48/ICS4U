/*
heron's formula
Tyler Wong
11/06/2023
*/
public class Main {
	//returns the area of a triangle using heron's formula
    private static int heron_formula(int a, int b, int c) {
        int p=((a+b+c)/2);
        int area=(int)Math.sqrt((p)*(p-a)*(p-b)*(p-c));
        return area;
    }
    public static void main(String[]args) {
        System.out.println(heron_formula(4,13,15));
        System.out.println(heron_formula(13,14,15));
        System.out.println(heron_formula(3,4,5));
    }
}
