/**
 * Second project
 * @author Jason Khuu
 * @version 1.0
 */
public class Project2 {
	
	public static void main(String[] args)
	{
	//Declare variables
	String firstBook, secondBook, thirdBook, authorOne, authorTwo, authorThree; 
	double priceOfFirstSet, priceOfSecondSet, priceOfThirdSet;
	int numCopiesOfFirstBooks, numCopiesOfSecondBooks, numCopiesOfThirdBooks; 
	double totalOfAllBooks, salesTax, totalAfterTax;
	final double TAX_RATE = 8.75; 
	
	//Assign the titles of books, price, and amount of copies
	firstBook = "Three Sisters";
	authorOne = "Bi Feiyu";
	priceOfFirstSet = 18.99; 
	numCopiesOfFirstBooks = 2;
	secondBook = "Song of Solomon";
	authorTwo = "Toni Morrison";
	priceOfSecondSet = 11.99; 
	numCopiesOfSecondBooks = 4;
	thirdBook = "Owls Don't Have to Mean Death";
	authorThree = "Chip Livingston";
	priceOfThirdSet = 80.50; 
	numCopiesOfThirdBooks = 1; 
	
	//Calculate for books and tax
	totalOfAllBooks = (priceOfFirstSet * numCopiesOfFirstBooks) + (priceOfSecondSet * numCopiesOfSecondBooks) + (priceOfThirdSet * numCopiesOfThirdBooks);
	salesTax = totalOfAllBooks * (TAX_RATE / 100); 
	totalAfterTax = totalOfAllBooks + salesTax; 
	
	//Display information
	System.out.println("Purchase " + numCopiesOfFirstBooks + " copies of " + firstBook + ", " + authorOne + "." + " Each copy costs $" + priceOfFirstSet + "."); 
	System.out.println("Purchase " + numCopiesOfSecondBooks + " copies of " + secondBook + ", " + authorTwo + "." + " Each copy costs $" + priceOfSecondSet + ".");
	System.out.println("Purchase " + numCopiesOfThirdBooks + " copy of " + thirdBook + ", " + authorThree + "." + " Each copy costs $" + String.format("%.2f", priceOfThirdSet) + ".");
	
	//Display After Calculations
	System.out.println("Total before tax: $" + totalOfAllBooks); 
	System.out.println("Sales Tax: $" + String.format("%.2f", salesTax));
	System.out.println("The total cost of your order will be $" + String.format("%.2f", totalAfterTax));
	}
}

