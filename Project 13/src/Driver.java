import java.util.*; 

public class Driver {

	public static void main(String[] args) {
		// Constructor for a legal triangle
		Triangle triangle = new Triangle(5, 5, 5); 
		
		// Display the result after assigning 5 with A B and C
		System.out.println("The three sides of the legal triangle are: " + triangle.getSideA() + " " + triangle.getSideC() +
				" " + triangle.getSideC());
		
		// Set sides A B C to 9 6 7 
		triangle.setSideA(9);
		triangle.setSideB(6);
		triangle.setSideC(7);
		
		// Display the result after using the mutators 
		System.out.println("A was set to 9, then B to 6 and C to 7: " + triangle.toString()); 
		
		// Construct a new triangle with A B C being assigned to 2 2 10
		Triangle newTriangle = new Triangle(2, 2, 10);
		System.out.println(); // Cuts the display in half and seperates 
		
		// Display the new illegal triangle 
		System.out.println("The illegal triangle contained: " + newTriangle.toString());
		
		// Assign A on the illegal triangle with 7
		newTriangle.setSideA(7);
		System.out.println("Changed side A to 7: " + newTriangle.toString()); // Display the result after using the mutator
		
		// Assign B on the illegal triangle with -10
		newTriangle.setSideB(-10);
		System.out.println("Changed side B to -10: " + newTriangle.toString()); // Display the result after using the mutator
		
		// Assign C with 21 using the mutator method 
		newTriangle.setSideC(21); 
		System.out.println("Changed side C to 21: " + newTriangle.toString()); // Display the result after using the mutator
	}

}
