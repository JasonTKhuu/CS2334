import java.util.Scanner;

public class CommonWords 
{

	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		
		String line = keyboard.nextLine();
		String[] first = line.split(" ");
		line = keyboard.next();
		String[] second = line.split(" ");
		
		System.out.println(commonWords(first, second));
				
		keyboard.close();
	}
	
	public static int commonWords(String[] words1, String[] words2) 
	{
		int count = 0; 
		
		for (int outer = 0; outer < words1.length; ++outer) {
		   for (int inner = 0; inner < words2.length; ++inner) {
		       if (words1[outer].equals(words2[inner])) {
		         count++; 
		       }
		   }
		}
		return count; // Edit this line
	}
}