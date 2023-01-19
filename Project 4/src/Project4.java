/**
 * Fourth Project 
 * @author Jason Khuu 
 * @version 1.0
 */
import java.util.Scanner; 
public class Project4 {
	
	public static void main(String[] args) {
		// Get user keyboard 
		Scanner userIn = new Scanner(System.in);
		// Declare variables 
		String userInput; 
		int points = 0;
		// Get user input 
		System.out.println("Answer yes or no to the following questions");
		
		System.out.println("I find myself less eager to go back to work or to resume my chores after a weekend.");
		userInput = userIn.nextLine();
		if(userInput.equalsIgnoreCase("yes") || userInput.compareTo("yes") == 0) /** this checks the input but also checks if there is any words after which will make it "no" **/{
			points = points + 1;
		}
		
		System.out.println("I try to get away from people as soon as I can.");
		userInput = userIn.nextLine();
		if(userInput.equalsIgnoreCase("yes") || userInput.compareTo("yes") == 0) {
			points = points + 1; 
		}
		
		System.out.println("I feel trapped.");
		userInput = userIn.nextLine();
		if(userInput.equalsIgnoreCase("yes") || userInput.compareTo("yes") == 0) {
			points = points + 1;
			}
		
		// Display results after user puts in data 
		if(points == 0) {
			System.out.println(points + " Points: You are more exhausted than stressed out"); 
		}
		else if (points == 1) {
			System.out.println(points + " Point: You are beginning to stress out"); 
		}
		else if (points == 2) {
			System.out.println(points + " Points: You are possibly stressed out");
		}
		else {
			System.out.println(points + " Points: You are probably stressed out");
		}
		// Close Scanner 
		userIn.close();
	}
}
