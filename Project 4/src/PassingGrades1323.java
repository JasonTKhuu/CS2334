import java.util.Scanner; 

/**
 * 
 * @author Scrub
 * calculating number of grades passed
 */
public class PassingGrades1323 {
	public static void main(String[] args) {
		
		// Declare Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the grades in one line, seperated");
		
		String allTheGrades = keyboard.nextLine(); 
		
		final int THRESHOLD = 70; 
		
		int minGrade = 0;
		int maxGrade = 100; 
		
		// count the number passed
		int pass = countWithinRange(allTheGrades, THRESHOLD, maxGrade);
		int failed = countWithinRange(allTheGrades, minGrade, THRESHOLD - 1);
		
		int countOfStudents = countWithinRange(allTheGrades, minGrade, maxGrade); 
		
		/**
		Scanner readGrades = new Scanner(allTheGrades); 
		
		// While loop to iterate through each grade. Also no sentinel 
		while (readGrades.hasNextInt()) {
			int grade = readGrades.nextInt(); 
			
			if(grade >= THRESHOLD && grade <= maxGrade) {
				pass += 1;
			}
			else {
				failed += 1;
			}
		}
		**/
		
		System.out.println("Passed: " + pass);
		System.out.println("Failed: " + failed); 
		System.out.println("Total: " + countOfStudents);
		
		// Close Scanners 
		keyboard.close();
		//readGrades.close(); 
	}
	
	public static int countWithinRange(String grades, int lower, int upper) {
		Scanner readGrades = new Scanner(grades); 
		
		int count = 0; 
		
		// While loop to iterate through each grade. Also no sentinel 
		while (readGrades.hasNextInt()) {
			int grade = readGrades.nextInt(); 
			
			if(grade >= lower && grade <= upper) {
				count = count + 1;
			}
		}
		
		readGrades.close(); 
		return count;
	}
}
