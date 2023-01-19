import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** This program implements the Wordle game that has been so popular on social media. The game chooses a word from a file of possible words.
 * It then gives the user 6 turns to guess the word. For each guess it shows which letters are in the word but not in the right place with an !,
 * in the word and in the right place with an *, and not in the word with an X. This allows the user to guess the correct word.
 * 
 * One of the things that makes this game both fun and frustrating is that they only publish on word a day. Using this program, you can
 * practice and play multiple times.
 * 
 * The data file was taken from: https://medium.com/@owenyin/here-lies-wordle-2021-2027-full-answer-list-52017ee99e86
 * Wordle is owned by the New York Times.
 * 
 * @author Deborah A. Trytten
 * @version 1.0
 *
 */
public class Project6 {

	// Constants for the game setup
	final private static int NUMBER_WORDS = 255;
	final private static int MAX_GUESSES = 6;
	final private static int WORD_LENGTH = 5;
	final private static String FILENAME = "Wordle.txt";
	
	// Symbols for printing out results
	final private static char SUCCESS = '*';
	final private static char RIGHT_LETTER_WRONG_PLACE = '!';
	final private static char WRONG_LETTER = 'X';
	
	/** Play a version of the Wordle game. The data is stored in Wodle.txt in a strange format. Users will choose the number of a hidden
	 * word. This allows users to play the game repeatedly. Users then guess five letter words that could be the chosen word. They will e
	 * told which letters and positions are correct in the word. Users get only six guesses. If they don't guess it in six guesses, they
	 * lose the game.
	 * @param args There are no command line arguments
	 * @throws FileNotFoundException If the Wordle.txt file is not available in the Project directory (not the src directory).
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		// Declare values 
		int guessCount = 1; // have a counter 
		String userIn; // user input
		boolean isCorrect = false; // see if the word is correct or not
		// Declare and construct a Scanner that is attached to the keyboard.
		//TODO Declare and construct a Scanner that is attached to the keyboard of the computer
		Scanner keyboard = new Scanner(System.in);
	
		// Get the hidden word from the file by calling the getWordFromFileMethod
		//TODO Call the getWordFromFile method 
		// Convert the word to lower case.
		// TODO Convert the word that is returned from the method call to lower case
		String word = getWordFromFile(NUMBER_WORDS, keyboard).toLowerCase(); 
		
		System.out.println("Enter your guess. Remember the word has " + WORD_LENGTH + " letters"); 
		userIn = keyboard.next(); 
		// Counting loop
		// Let the user make MAX_GUESSES. Stop if they get all the characters correct
		//TODO Write a loop that lets the user make six guesses as to what the hidden word is
		while (guessCount <= MAX_GUESSES && isCorrect != true) { 
			//TODO Let the user enter their guess and convert it to lower case
			userIn = userIn.toLowerCase();  
			int guessWord = showResult(word, userIn); 
			if (guessWord == 5) {
				isCorrect = true;
			}
			else if (guessCount < 6){ // makes sure to stop user input when the guess is up
			System.out.println("Enter your guess. Remember the word has " + WORD_LENGTH + " letters"); 
			userIn = keyboard.next(); 
			}
			++guessCount;
		}
		// display if won or not by determining the guesses 
		if (guessCount >= 6) {
		System.out.println("The word was " + word);
		}
		else {
		System.out.println();
		}
		System.out.println(guessCount - 1 + " / 6"); 
			
			//TODO Call the showResult method to show progress to the user
		}
		// If they didn't guess the word, tell them what it was.
		//TODO Let the user know what the hidden word was if they didn't guess it
		
		//Print out the number of guesses they took to get their answer (or not).
		//TODO Print out the number of guesses

	
	/** Choose a word from the Wordle file. The word will be chosen by letting the user pick a
	 * word number. This allows the user to play the game multiple times in the same day.
	 * @param size The number of words that are in the file.
	 * @param keyboard A Scanner that is attached to the console--this should be constructed in the 
	 * main program.
	 * @return The selected word.
	 * @throws FileNotFoundException If the given filename is not in the home folder for the project.
	 */
	public static String getWordFromFile(int size, Scanner keyboard) throws FileNotFoundException
	{
		// Open the file
		Scanner file = new Scanner (new File(FILENAME));
		String wordPicked = ""; 
		//TODO Let the user tell you which word number they want to play--think about newline characters and whether
		// they need to be read
		System.out.println("Which word number would you like? The maximum is " + NUMBER_WORDS); 
		size = keyboard.nextInt(); 
		//TODO Skip number of lines in the file that the user entered--the first word was at 0, so this is not off by one
		// This should use a loop
		for (int i = 0; i < size; ++i) {
			wordPicked = file.nextLine();
			if (i + 1 == size) {
				wordPicked = file.nextLine(); 
				}	
		}
		//TODO Skip over the stuff we don't need in the line of the file that contains the word we want to read
		//TODO Read in the word we do need
		wordPicked = wordPicked.split(" ")[5]; // makes sure to have the words in the string split off so that the word itself can be applied 
		// No need to read the rest of the file
		
		// Close the file
		file.close();
		
		//TODO Return the word read to end the method
		return wordPicked; // returns the word picked 
	}
	
	/** Show the user how well their guess did by printing an * if the letter is the right
	 * letter in the correct position, an ! if the letter is in the word but not in the correct
	 * position, and an X otherwise. Output should go to the console and terminate with a newline.
	 * 
	 * @param chosenWord The hidden word in the game.
	 * @param guess The user's guess.
	 * @return The number of characters that are in the correct position in the guess.
	 */
	public static int showResult(String chosenWord, String guess)
	{
		int countRight = 0; 
		//TODO step through the user's guess one character at a time--this should be a loop
			for (int readChar = 0; readChar < WORD_LENGTH; ++readChar) {
				 if (guess.charAt(readChar) == chosenWord.charAt(readChar)) { // if the letters are correct itll add points and print the stars 
					 System.out.print(SUCCESS);
					 countRight += 1; 
			}
				 else { // these will check to see if the character value matches with other values and if so will display !
					 if (guess.charAt(readChar) == chosenWord.charAt(0) || guess.charAt(readChar) == chosenWord.charAt(1) || guess.charAt(readChar) == chosenWord.charAt(2) || guess.charAt(readChar) == chosenWord.charAt(3) || guess.charAt(readChar) == chosenWord.charAt(4)) {
						 System.out.print( RIGHT_LETTER_WRONG_PLACE);
					 }
					 else { // this will give X if the letter is wrong 
					 System.out.print(WRONG_LETTER);
					 }
			 }
			}
			System.out.println();
			//TODO Determine the fate of the letter--order here is important--this should be a nested if else statement
		
		//TODO Return the number of letters that are in the correct place--this is how you figure out if the user won
		return countRight; // return the amount correct 
	}
}
