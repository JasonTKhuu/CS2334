import java.util.Scanner;
public class ExampleofClassLecture {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word and I'll tell you whether it start with a vowel");
		String word = keyboard.nextLine(); 
		
		// Use characters first 
		/*
		char first = word.charAt(0); // this is not a static method, so it is called using an object before the .
		
		first = Character.toLowerCase(first); // called from character because method is static
		
		if(first == 'a' 
				|| first == 'i' 
				|| first == 'o' 
				|| first == 'u')
		{
			System.out.println("The word starts with a vowel");
		}
		else {
			System.out.println("The word does not start with a vowel"); 
		}
		*/
		
		word = word.toLowerCase(); // this is not a static method 
		
		// Consonants are not vowels--this makes the code shorter
		if(!(word.startsWith("a")
				|| word.startsWith("e")
				|| word.startsWith("o")
				|| word.startsWith("i")
				|| word.startsWith("u")))
		{
			System.out.println("The word starts with a consonant");
		}
		else {
			System.out.println("The word does not start with a consonant"); 
		}
		// Use method in string class
		keyboard.close(); 
	}

}
