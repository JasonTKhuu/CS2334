import java.util.Scanner;

public class AverageArray1323 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int SIZE = 20;
		// Construct an array
		int[] grades = new int[SIZE]; 
		
		// Read in the values for the array from the keyboard
		for (int index = 0; index < grades.length; ++index) {
			System.out.println("Enter grade #" + (index + 1));
			grades[index] = keyboard.nextInt();
			keyboard.nextLine(); 
		}
		
		// System.out.println(Arrays.toString(grades));
		
		// Calculate the average
		int sum = 0;
		for (int index = 0; index < grades.length; ++index) {
			sum = sum + grades[index];
		}
		// Show the result to the user
		System.out.println("The average grade is " + sum / (double)grades.length);
		
		keyboard.close(); 
	}
	
	// NOTES FROM CLASS 
	// int[] data = {1, 4, 6, 8, 9, 12}; 
	// int result = Arrays.binarySearch(data, 6);
	// result is 2
	// result = Arrays.binarySearch(data, 9); 
	// result is 4 
	// result = Arrays.binarySeach(data, 7); 
	// Result is -3-1, -4

}
