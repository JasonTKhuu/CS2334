// James Dizikes
// CS 1323/1324, Fall 2019
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Project12 {

	public static void main(String[] args)
		throws FileNotFoundException, IOException {

		final String FILENAME_COMMON = "common-dictionary.txt";
		final String FILENAME_PERSONAL = "personal-dictionary.txt";
		final int CAPACITY_PERSONAL_DICT = 100;
		String prompt = "Enter a word or 'quit' to stop: ";

		// Read the common dictionary and store the words in an arraylist.
		ArrayList<String> common = readFile(FILENAME_COMMON);

		// Construct an arraylist to store the personal dictionary.
		ArrayList<String> personal = new ArrayList<String>(CAPACITY_PERSONAL_DICT);

		// Read the personal dictionary, creating the file if it doesn't 
		// exist. Store the words in an oversize array.
		personal = readFile(FILENAME_PERSONAL);
		
		// Construct a Scanner to read user input from the keyboard.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Spell Checker");
		System.out.println("-------------");
		
		// Perform a priming read to get the first word.
		System.out.print(prompt);
		String word = keyboard.nextLine().toLowerCase();
		
		// Enter the user input loop.
		while (!word.equals("quit")) {
			
			// Check if the word is in either dictionary.
			if (checkSpelling(word, common, personal)) {
				System.out.println("The word is spelled correctly.");
			} 
			else {
				System.out.println("The word was not found in the "
					+ "dictionary.");			
				System.out.println("Would you like to add it to your personal "
					+ "dictionary (yes/no)?");
				String response = keyboard.nextLine().toLowerCase();
				
				// If the user responds "yes" and there is room in the oversize
				// array, add the word to the end of the array and sort it.
				if (response.equals("yes") && personal.size() < CAPACITY_PERSONAL_DICT) {
					personal.add(word); // .add to add the word to the word to the personal dictionary
					Collections.sort(personal); // Since this is not an array this requires the collections class to sort 
				}
			}
			
			// Get the next word from the user.
			System.out.println();
			System.out.print(prompt);
			word = keyboard.nextLine().toLowerCase();
		}
		
		keyboard.close();
		writeFile(FILENAME_PERSONAL, personal, personal.size());
		System.out.println("Goodbye!");
	}
	
	// readFile method gets the file name and adds the word into an arraylist and return the arraylist
	public static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
		// Read file name 
		Scanner file = new Scanner(new File(fileName));
		
		// Create an arraylist
		ArrayList<String> arrayListForWords = new ArrayList<String>();
		
		// add all words from the file
		while (file.hasNextLine()) {
			arrayListForWords.add(file.nextLine());
		}
		file.close();
		
		return arrayListForWords;
	}
	// Return true if word is in either array; otherwise, return false. Note 
	// that the arrays are sorted, so binary search can be used.
	public static boolean checkSpelling(String word, ArrayList<String> common, 
		ArrayList<String> personal) {
			
		if (Collections.binarySearch(common, word) >= 0) {
			return true;
		}
		
		// Since this is an arraylist the original code doesn't work since it has 2 more parts to it which the arraylist 
		// version doesn't have 
		if (Collections.binarySearch(personal, word) >= 0) {
			return true;
		}
		
		return false;
	}
	
	// Write the nonempty elements of an arraylist to a given file.
	public static void writeFile(String filename, ArrayList<String> array, int size)
			throws FileNotFoundException {

		PrintWriter writer = new PrintWriter(filename);

		for (int idx = 0; idx < size; ++idx) {
			writer.println(array.get(idx)); // Get method so that it will grab the value from that result and display it
		}

		// Close the file; otherwise, the contents will be lost.
		writer.close();
	}
}
