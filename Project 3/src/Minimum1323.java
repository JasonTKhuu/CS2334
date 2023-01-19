import java.util.Scanner;

public class Minimum1323 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		final int LIMIT = 3;
		
		int count = 0;
		int minimum = Integer.MAX_VALUE; // By making this as big as possible, all values are smaller
		
		while(count < LIMIT)
		{
			System.out.println("Enter a number");
			int value = keyboard.nextInt();
			keyboard.nextLine();
			
			// See if the new value is the smallest so far
			if(value < minimum)
			{
				minimum = value;
			}
			
			count = count + 1; 
		}
		
		System.out.println("The minimum is " + minimum); 
		
		keyboard.close();
	}
}
