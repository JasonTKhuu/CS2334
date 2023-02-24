
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/** The class implements a spelling checker program. This program uses a standard
 * dictionary, that is not modified. It also uses a personal dictionary. The personal dictinary
 * is initially empty and then gets words added to it as the user directs.
 * 
 * @author Deborah A. Trytten and James Dizikes
 *
 */
public class Project9 {

	/** Run the spelling checker program. The program will read in the personal and common dictionary, and
	 * let the user enter words to see if they are spelled correctly. If the word is not found in the
	 * common dictionary, the user will be given the opportunity to add it to the personal dictionary.
	 * 
	 * @param args There are no command line arguments.
	 * @throws FileNotFoundException If the home directory of the project does not contain "common-dictionary.txt".
	 * @throws IOException If it is not possible, for any reason, to save a file called "personal-dictionary.txt" to
	 * the project directory. This could happen if the disk was full, for example.
	 */
	public static void main(String[] args)
		throws FileNotFoundException, IOException {

		final String FILENAME_COMMON = "common-dictionary.txt";
		final String FILENAME_PERSONAL = "personal-dictionary.txt";
		final int CAPACITY_PERSONAL_DICT = 100;
		String prompt = "Enter a word or 'quit' to stop: ";
		
		// TODO Read the common dictionary and store the words in an array.
		String[] commonDictionary = readFilePerfect(FILENAME_COMMON);
		
		// TODO Construct an oversize array to store the personal dictionary.

		String[] overSizeDictionary = new String[CAPACITY_PERSONAL_DICT]; 

		// TODO Read the personal dictionary, creating the file if it doesn't 
		// exist. Store the words in an oversize array.
		int oversizeLength = readFileOversize(FILENAME_PERSONAL, overSizeDictionary); 
		
		// TODO Construct a Scanner to read user input from the keyboard.
		Scanner input = new Scanner(System.in);
		// TODO Perform a priming read to get the first word.
		System.out.println("Spell Checker"); 
		System.out.println("-------------");
		// TODO Enter the user input loop.
		System.out.println(prompt); 
		
		String userInput = input.nextLine(); 
		writeFile(FILENAME_PERSONAL, overSizeDictionary, oversizeLength); 
		
			while(!userInput.equalsIgnoreCase("quit"))
			{
			// TODO Check if the word is in either dictionary.
				boolean isThere = checkSpelling(userInput, commonDictionary, overSizeDictionary, oversizeLength);
				if (isThere == true) {
					System.out.println(userInput + " is spelled correctly"); 
				}
				
				if (isThere == false){
				// TODO If the user responds "yes" and there is room in the oversize
				// array, add the word to the end of the array and sort it.
				System.out.println("The word was not found in the dictionary.");
				System.out.println("would you like to add it to your personal dictionary (yes/no)?");
				String responseAnswer = input.nextLine(); 
				
				if (responseAnswer.equalsIgnoreCase("yes")) {
					// overSizeDictionary store variable!
					overSizeDictionary[oversizeLength] = userInput; 
					oversizeLength++; 
				}
			}
				
			writeFile(FILENAME_PERSONAL, overSizeDictionary, oversizeLength); 
			
			// TODO Get the next word from the user.
			System.out.println(prompt);
			userInput = input.nextLine(); 
			}
		System.out.println("Goodbye!"); 
		input.close(); 
	}
	
	/** Read each line of a file and store them in a perfect size array.
	 * 
	 * @param filename The name of the file that contains the contents of the perfect size array.
	 * @return A perfect size array that contains the contents of the file. Each line in the file will be
	 * a separate array element.
	 * @throws FileNotFoundException If a file with the given name is not found in the project home directory.
	 */
	
	public static String[] readFilePerfect(String filename) 
		throws FileNotFoundException {
		int countLines = 0;
		
		Scanner file = new Scanner(new File(filename));
		while (file.hasNextLine()) {
			++countLines; 
			file.nextLine();
		}
		
		String[] commonDictionary = new String[countLines]; 
		
		file.close(); 
		
		Scanner fileRead = new Scanner(new File(filename));
		
		for (int index = 0; index < commonDictionary.length; ++index) {
			String word = fileRead.nextLine(); 
			commonDictionary[index] = word; 
		}
		fileRead.close(); 
		
		return commonDictionary;
	}
	
	/** Read each line of a file and store them in an oversize array.
	 *  If the file does not exist, create an empty file with the given name.
	 * @param filename The name of the file where the contents of the oversize array are stored.
	 * @param array An oversize array where the data will be stored.
	 * @return The number of elements in the oversize array that are used. This should match the
	 * number of lines in the file--unless the array runs out of space. In this case, the returned
	 * value will be the capacity of the array.
	 * @throws FileNotFoundException If it is not possible to open 
	 * a file with the given filename is not located in the project home
	 * directory.
	 * @throws IOException If a file with the given filename cannot be create in the home directory
	 * if no such file exists.
	 */
	public static int readFileOversize(String filename, String[] array) 
		throws FileNotFoundException, IOException {
		
		// TODO Construct a file object for the file with the given name.
		File file = new File(filename);
		
		// TODO If the file does not exist, create it.
		file.createNewFile();

		// Construct a scanner to read the file.
		Scanner fileScanner = new Scanner(file);

		// TODO Store each line of the file in the array. Exit the loop when the 
		// array is full or the entire file has been read.
		
		int countElements = 0;
		
		while(fileScanner.hasNextLine()) {
			countElements++;
			fileScanner.nextLine(); 
		}
		
		fileScanner.close();

		return countElements; 
	}

	/** Return true if word is in either array; otherwise, return false. 
	 * Note that the arrays are sorted, so binary search can be used.
	 * 
	 * @param word The word to be sought in the array.
	 * @param common The common dictionary in a perfect size array.
	 * @param personal The personal dictionary in an oversize array.
	 * @param sizePersonal The number of elements of the oversize array that
	 * have been used.
	 * @return True if the word is found in one of the two arrays, or
	 * false otherwise.
	 */
	public static boolean checkSpelling(String word, String[] common, 
		String[] personal, int sizePersonal) {
		
		for (int index = 0; index < common.length; ++index) {
			if (common[index].equals(word)) {
				return true; 
			}
		}
		
		for (int index = 0; index < personal.length; ++index) {
			if (word.equals(personal[index])) {
				return true;
			}
		}
		return false;
	}
	
	/** Write the nonempty elements of an oversize array to a given file.
	 * 
	 * @param filename The name of the file to be written to the project home directory.
	 * @param array The oversize array that contains the data to be written. Each element
	 * in the array should be written on a separate line.
	 * @param size The number of elements in the array that are used.
	 * @throws FileNotFoundException If it is impossible to write a file with the given
	 * name to the home directory for any reason.
	 */
	public static void writeFile(String filename, String[] array, int size)
			throws FileNotFoundException {

		PrintWriter writer = new PrintWriter(filename);

		// TODO Print out the array one line at a time to the file
		for (int index = 0; index < size; ++index) {
			writer.println(array[index]);
		}
		
		// Close the file; otherwise, the contents will be lost.
		writer.close();
	}
}
