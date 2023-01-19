import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException; 
public class AverageGrades1323 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the filename");
		String filename = input.nextLine(); 
		
		double totalAverage = averageGrades(filename, 5); 
		
		System.out.println(totalAverage);
		input.close();
		
	}
	
	// Method to calculate the average midterm grade over all students
			public static double averageGrades(String filename, int numberOfMidterms) throws FileNotFoundException {
				Scanner fileScanner = new Scanner(new File(filename)); 
				
				// Total average of all students 
				double totalAverage = 0.0; 
				
				int numberOfStudents = fileScanner.nextInt(); 
				fileScanner.nextLine(); // Skip the newline
				// Outer loop through each student
				for (int outer = 0; outer < numberOfStudents; ++outer) {
					
					double individualAverage = 0.0; 
					// Inner loop goes through each midterm grade for individual student
					for (int inner = 0; inner < numberOfMidterms; ++inner) {
						 individualAverage += fileScanner.nextDouble();
					} // End of inner loop
					// Skip the name 
					fileScanner.nextLine(); // Move to the next student 
					
					individualAverage = individualAverage / numberOfMidterms; 
					
					// Still in outer loop
					totalAverage += individualAverage; 
				} // End of outer loop
				
				fileScanner.close();
				return totalAverage / numberOfStudents; 
			}

}
