import java.util.Scanner;

public class CS1323Example {
	public static void main(String[] args) {
		// Get number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number and I'll find the largest factor");
		int number = input.nextInt();
		input.nextLine(); 
		
		// Find the largest factor
		int factor = number - 1;
		
		while (number % factor != 0) {
			factor = factor - 1;
		}
		
		// Show the result to the user
		if(factor == 1)
		{
			System.out.println(number + " has no factors");
		}
		else {
			System.out.println(factor + " is the largest factor of " + number); 
		}
		
		input.close(); 
	}
}
