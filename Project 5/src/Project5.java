import java.util.Scanner; 

public class Project5 {

	public static void main(String[] args) {
		// Not going to lie this is the most ugliest code I have ever done in my life.
		
		Scanner userIn = new Scanner(System.in); // Declare Scanner for user input 
		// Declare Variables for each dial 
		int dialNum = 3;
		// Declare accumulators 
		int dialOne = 0; 
		int dialTwo = 0;
		int dialThree = 0;
		int dialFour = 0;
		int dialFive = 0;
		int noChangeValue = 0;
		int posChange = 0;
		int negChange = 0; 
		// Holds the previous input value and does the comparison 
		int holdValue; 
		// Constant value for ending loop or sentinel value
		final int END = -1; 
		// Priming Read 
		System.out.println("Response Dial Simulator");
		System.out.println("-----------------------"); 
		System.out.println("Initial Setting: 3"); 
		System.out.println("Enter the next setting (1-5) or -1 to stop."); 
		// Holds the inital value of 3 for dialNum 
		holdValue = dialNum; 
		dialNum = userIn.nextInt(); 
		
		// Keeps on repeating till user enters -1
		while (dialNum != END) {
			
			// Throughout this entire code it checks for the user input and if they equal 1-5
			// After that it will then compare the holdValue with the dialNum to see if it's a postive or negative or no change
			// After that it will count each accumulator by adding 1 to add to the result at the end
			if(dialNum == 1) {
				if(dialNum < holdValue) {
					System.out.println("Negative Change: " + holdValue + " to " + dialNum);
					negChange += 1;
				}
				else if (dialNum > holdValue){
					System.out.println("Positive Change: " + holdValue + " to " + dialNum);
					posChange += 1; 
				}
				else {
					System.out.println("No Change: " + holdValue + " to " + dialNum);
					noChangeValue += 1; 
				 }
				dialOne += 1;
			}
			else if (dialNum == 2) {
				if(dialNum < holdValue) {
					System.out.println("Negative Change: " + holdValue + " to " + dialNum);
					negChange += 1;
				}
				else if (dialNum > holdValue){
					System.out.println("Positive Change: " + holdValue + " to " + dialNum);
					posChange += 1; 
				}
				else {
					System.out.println("No Change: " + holdValue + " to " + dialNum);
					noChangeValue += 1; 
				 }
				dialTwo += 1;
			}
			else if (dialNum == 3) {
				if(dialNum < holdValue) {
					System.out.println("Negative Change: " + holdValue + " to " + dialNum);
					negChange += 1;
				}
				else if (dialNum > holdValue){
					System.out.println("Positive Change: " + holdValue + " to " + dialNum); 
					posChange += 1; 
				}
				else {
					System.out.println("No Change: " + holdValue + " to " + dialNum);
					noChangeValue += 1; 
				 }
				dialThree += 1;
			}
			else if (dialNum == 4) {
				if(dialNum < holdValue) {
					System.out.println("Negative Change: " + holdValue + " to " + dialNum);
					negChange += 1;
				}
				else if (dialNum > holdValue){
					System.out.println("Positive Change: " + holdValue + " to " + dialNum);
					posChange += 1; 
				}
				else {
					System.out.println("No Change: " + holdValue + " to " + dialNum);
					noChangeValue += 1; 
				 }
				dialFour += 1;
			}
			else if (dialNum == 5) {
				if(dialNum < holdValue) {
					System.out.println("Negative Change: " + holdValue + " to " + dialNum);
					negChange += 1;
				}
				else if (dialNum > holdValue){
					System.out.println("Positive Change: " + holdValue + " to " + dialNum); 
					posChange += 1; 
				}
				else {
					System.out.println("No Change: " + holdValue + " to " + dialNum);
					noChangeValue += 1; 
				 }
				dialFive += 1;
			}
			else {
				// If the user goes below or above the numbers between 1-5 it will give an invalid input and redirect the value back to the previous value
				System.out.println("Invalid input");
				dialNum = holdValue; 
			}
			
			// Ask the input again to either continue or get out 
			holdValue = dialNum; 
			System.out.println("Current Setting: " + dialNum); 
			System.out.println("Enter the next setting (1-5) or -1 to stop.");
			dialNum = userIn.nextInt();
		}
		// Display each dial numbers amount
		System.out.println("Response Summary");
		System.out.println("----------------");
		System.out.println("1 was chosen " + dialOne + " time(s).");
		System.out.println("2 was chosen " + dialTwo + " time(s).");
		System.out.println("3 was chosen " + dialThree + " time(s).");
		System.out.println("4 was chosen " + dialFour + " time(s).");
		System.out.println("5 was chosen " + dialFive + " time(s).");
		
		System.out.println(); 
		// Display each number of changes 
		System.out.println("Positive Changes: " + posChange);
		System.out.println("Negative Changes: " + negChange);
		System.out.println("No changes: " + noChangeValue); 
		
		// Close Scanner 
		userIn.close(); 

	}

}
