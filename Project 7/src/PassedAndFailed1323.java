import java.util.Scanner;
import java.util.*;

public class PassedAndFailed1323 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int THRESHOLD = 70;
		
		// Enter the number of students
		System.out.println("Enter the number of students");
		int numStudents = input.nextInt(); 
		input.nextLine(); 
		// Construct the array
		int[] grades = new int[numStudents]; 
		//System.out.println(grades.length);
		// Read the data into the array
		for (int x = 0; x < grades.length; ++x) {
			System.out.println("Enter a grade");
			grades[x] = input.nextInt(); 
			input.nextLine(); 
		}
		//System.out.println(Arrays.toString(grades));
		
		// Calculate the number of passes and fails
		int passes = 0;
		int fails = 0;
		
		for (int x = 0; x < grades.length; ++x) {
			if (grades[x] < THRESHOLD) {
				++fails;
			}
			else {
				++passes; 
			}
		}
		// Show results to the user
		System.out.println(passes + " students passed " + fails + " students failed ");
		input.close();
	}

}
