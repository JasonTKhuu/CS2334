import java.util.Scanner; 

public class PassandFail1323 {
	public static void main(String[] args)
	{
		int passed = 0;
		int failed = 0;
		final int THRESHOLD = 70; 
		
		// Get data from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the grades, separated by spaces");
		String line = input.nextLine(); // This now has all of the grades
		
		// Use the data to count how many students passed and failed
		Scanner grade = new Scanner(line); // This Scanner will break apart the line into individual integers
		while (grade.hasNextInt()) 
		{
			int nextGrade = grade.nextInt(); 
			if(nextGrade >= THRESHOLD)
			{
				passed = passed + 1;
			}
			else 
			{
				failed = failed + 1;
			}
		}
		// Show the result to the user
		System.out.println(passed + " students passed the class");
		System.out.println(failed + " students failed the class");
		
		// Close all Scanner objects
		input.close();
		grade.close(); 
	}
}
