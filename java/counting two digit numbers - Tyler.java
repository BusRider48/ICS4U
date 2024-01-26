/*
counting two digit numbers
Tyler Wong
10/30/2023
*/
public class Main {
	public static void main(String[]args) {
		//modified array from example
		int[] values = {10, 70, 80, 40, 60, 60, 7};
        int numberOfTwoDigit = 0;
		// Loop through every single element in the array
        for (int i = 0; i < values.length; i++) {
            if (values[i]>9 && values[i]<100) {
                numberOfTwoDigit++;
            }
        }
        System.out.println("There are " + numberOfTwoDigit + " two digit numbers.");
	}
}
