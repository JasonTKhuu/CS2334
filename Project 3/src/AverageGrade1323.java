import java.util.Scanner;

public class AverageGrade1323 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int SENTINEL = -1;
		
		int sum = 0;
		int count = 0; 
		int grade = 0; 
		
		//priming read
		//read in the grade
		System.out.println("Enter the next grade or " + SENTINEL + " to quit");
		grade = keyboard.nextInt();
		keyboard.nextLine();
		
		while(grade != SENTINEL) 
		{	
			if(grade != SENTINEL)
			{
			sum = sum + grade;
			count = count + 1;
			}
			//Priming 
			//read in the grade
			System.out.println("Enter the next grade or " + SENTINEL + " to quit");
			grade = keyboard.nextInt();
			keyboard.nextLine();
		}
		System.out.println("The average is " + 1.0 * sum / count);
		
		keyboard.close(); 

	}

}
