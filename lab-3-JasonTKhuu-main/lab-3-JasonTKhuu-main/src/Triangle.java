
public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	public static final String POLYGONSHAPE = "Triangle";
	public static final double DEFAULT_SIDE = 1.0;
	
	public Triangle() {
		this.sideA = DEFAULT_SIDE;
		this.sideB = DEFAULT_SIDE;
		this.sideC = DEFAULT_SIDE; 
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC; 
		}
		else {
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;
		}
	}
	
	public Triangle(double[] sides) {
			
		    if (isTriangle(sides) == true){
		    	if (isTriangle(sides) == false) {
		    		this.sideA = DEFAULT_SIDE;
					this.sideB = DEFAULT_SIDE;
					this.sideC = DEFAULT_SIDE; 
		    	}
		    	else if (isTriangle(sides) == true) {
		    		this.sideA = sides[0];
		    		this.sideB = sides[1];
		    		this.sideC = sides[2];
		    	}
		    	else {
		    		this.sideA = DEFAULT_SIDE;
					this.sideB = DEFAULT_SIDE;
					this.sideC = DEFAULT_SIDE; 
		    	}
		}
			else {
				this.sideA = DEFAULT_SIDE;
				this.sideB = DEFAULT_SIDE;
				this.sideC = DEFAULT_SIDE; 
			}
		}
	
	public Triangle(Triangle triangle) {
		if (triangle == null) {
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE; 
		}
		else {
			this.sideA = triangle.sideA;
			this.sideB = triangle.sideB;
			this.sideC = triangle.sideC;
		}
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	
	public double[] getSides() {
		double newArray[] = new double[3];
		newArray[0] = sideA;
		newArray[1] = sideB;
		newArray[2] = sideC;
	
		return newArray;
	}
	
	public double getAngleA() {
		return lawOfCosines(sideC, sideB, sideA);
	}
	
	public double getAngleB() {
		return lawOfCosines(sideA, sideC, sideB);
	}
	
	public double getAngleC() {
		return lawOfCosines(sideB, sideA, sideC);
	}
	
	public double[] getAngles() {
		double newArray[] = new double[3];
		newArray[0] = lawOfCosines(sideC, sideB, sideA);
		newArray[1] = lawOfCosines(sideA, sideC, sideB);
		newArray[2] = lawOfCosines(sideB, sideA, sideC);
		
		return newArray; 
	}
	
	public boolean setSideA(double sideA) {

		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideA = sideA; 
			return true;
		}
		
		return false;
	}
	
	public boolean setSideB(double sideB) {
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideB = sideB; 
			return true;
		}
		
		return false;
	}
	
	public boolean setSideC(double sideC) {
		if (isTriangle(sideA, sideB, sideC) == true) {
			this.sideC = sideC; 
			return true;
		}
		
		return false;
	}
	
	public boolean setSides(double sides[]) {

		if (isTriangle(sides) == false) {
			return false;
		}
		
		sideA = sides[0];
		sideB = sides[1];
		sideC = sides[2];
		return true;
	}
	public static boolean isTriangle(double sideA, double sideB, double sideC) {
		
		if(sideA > 0 && sideB > 0 && sideC > 0) {
			if (sideA == sideB && sideA == sideC && sideB == sideC && sideB == sideA && sideC == sideB && sideC == sideA) {
				return true;
			}
			else if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isTriangle(double sides[]) {
		
		if (sides == null) {
			return false;
		}
		else if (sides.length != 3) {
			return false;
		}
		else if (isTriangle(sides[0], sides[1], sides[2]) == false) {
			return false;
		}
		
		return true;
	}
	
	public static double lawOfCosines(double a, double b, double c) {
		double result = Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b));
		return Math.toDegrees(result);
	}
	
	public String toString() {
		return POLYGONSHAPE + "(" + String.format("%.4f", sideA) + ", " + String.format("%.4f", sideB) + ", " + String.format("%.4f", sideC) + ")"; 
	}
}
