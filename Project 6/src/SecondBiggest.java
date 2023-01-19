import java.util.Scanner;
public class SecondBiggest
{
// Find the second biggest value of a given number of values entered at the keyboard
// ending in a sentinel
// You may assume that at least two values are entered
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
final int SENTINEL = -1;
System.out.println("The second biggest value is " + secondBiggest(SENTINEL, keyboard));
keyboard.close();
}

public static int secondBiggest(int SENTINEL, Scanner result) {
	// This is where the method should start
	// Priming read
	System.out.println("Enter the value or " + SENTINEL + " to stop");
	int value = result.nextInt();
	result.nextLine(); // get rid of the pesky newline character
	// Enter the values and find the second
	int biggest = Integer.MIN_VALUE;
	int secondBiggest = Integer.MIN_VALUE;
	// we know everything else is bigger--this is a constant in the API
	while (value != SENTINEL)
	{
	// The logic here is tricky--two cases to consider
	if (value > biggest)
	{
	secondBiggest = biggest; // shift the old biggest down
	biggest = value; // install the new biggest
	}
	else if (value > secondBiggest)
	{
	secondBiggest = value; // replace just the second biggest
	}
	// Priming read
	System.out.println("Enter the next value or " + SENTINEL
	+ " to stop");
	value = result.nextInt();
	result.nextLine(); // get rid of the pesky newline character
	}
	// This is where the method should end
	return secondBiggest; 
}
}
