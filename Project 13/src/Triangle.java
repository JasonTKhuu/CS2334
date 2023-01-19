import java.text.DecimalFormat;
import java.util.*; 

public class Triangle {
	// Instance data 
	private double sideA; 
	private double sideB;
	private double sideC; 
	
	// Static variables 
	private static DecimalFormat FORMATTER; 
	private static double DEFAULT_SIDE_LENGTH = 1.0;
	
	// Constructor 
	public Triangle(double sideA, double sideB, double sideC) {
		// Checks if the sides are bigger than each other and if so then
		// Assign those variables with the current side variables
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideA = sideA; 
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else {
		// Only occurs if the sides changed and it made the triangle illegal which sets the 
		// Values to the defualt side length of 1.0
			this.sideA = DEFAULT_SIDE_LENGTH; 
			this.sideB = DEFAULT_SIDE_LENGTH;
			this.sideC = DEFAULT_SIDE_LENGTH;
		}
	}
	
	// Accessors 
	// All returns the current value of the private variables
	public double getSideA() {
		return sideA; 
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC; 
	}
	
	// Mutators
	// Checks if the value has changed or not
	public boolean setSideA(double sideA) {
		// Returns true if sideA has changed which
		// if true it'll assign the current sideA with the other sideA
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideA = sideA;
			return true;
		}
		
		// Returns false if isTriangle is false
		return false;
	}
	
	public boolean setSideB(double sideB) {
		// Returns true if sideB has changed which
		// if true it'll assign the current sideB with the other sideB
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideB = sideB;
			return true;
		}
		
		return false;
	}
	
	public boolean setSideC(double sideC) {
		// Returns true if sideC has changed which
		// if true it'll assign the current sideC with the other sideC
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideC = sideC;
			return true;
		}
		
		return false;
	}
	
	// Checks if the triangle sides are actually not bigger than each other
	// Returns true if one of the sides ARE bigger than the other two
	// Returns false if they are equal
	private static boolean isTriangle(double a, double b, double c) {
		if (a > b + c || b > a + c || c > b + a) {
			return false;
		}
		
		return true; 
	}
	
	// Format how the string will look like 
	// It will look like --> Triangle(#, #, #)
	public String toString() {
		DecimalFormat FORMATTER = new DecimalFormat("#.###"); 
		return "Triangle" + "(" + FORMATTER.format(sideA) + ", " + FORMATTER.format(sideB) + ", " + FORMATTER.format(sideC) + ")";  
	}
}
