import java.awt.Point;

/** The immutable Circle class stores a (x,y) point that is the origin and a radius. There is no error checking  
 * 
 * @author Scrub
 * @version 1.0
 */
public class Circle {
	
	// Instance data
	private Point origin;
	private double radius;
	
	// Class data
	private static final double DEFAULT_RADIUS = 0.0;
	
	// Class methods 
	public static double area(double radius) {
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	public static double circumference(double radius) {
		return 2.0 * Math.PI * radius; // the this doesn't work here
	}
	
	// Constructors
	
	/** Construct a Circle object with the given origin at (x,y) and 
	 * radius. The radius must be non-negative. If r is negative, the radius
	 * will be set to 0.0.
	 * @param x The x coordinate of the origin.
	 * @param y The y coordinate of the origin.
	 * @param r The radius of the Circle. 
	 */
	
	// shadowing the instance data radius
	public Circle (int x, int y, double radius) {
		origin = new Point(x, y);
		if (radius >= 0) {
			this.radius = radius; // this is an implicit parameter
			// it represents the object that is being constructed
		}
		else {
			this.radius = DEFAULT_RADIUS;
		}
		this.radius = radius; 
	}
	
	public Circle() { // Default Constructor
		// Circle
		this(0, 0, DEFAULT_RADIUS);
	}
	
	public Circle(double radius) {
		this(0, 0, radius);
	}
	
	public Circle(int x, int y) {
		this(x, y, DEFAULT_RADIUS);
	}
	
	// Accessors
	/** Access the x coordinate of the origin
	 * 
	 * @return the x coordinate of the origin 
	 */
	public int getX() {
		return origin.x;
	}
	
	/** Access the y coordinate of the origin
	 * 
	 * @return the y coordinate of the origin
	 */
	public int getY() {
		return origin.y;
	}
	
	/** Access the radius of the Circle 
	 * 
	 * @return the radius of the Circle 
	 */
	public double getRadius() {
		return radius;
	}
	
	/** Convert the Circle object into a String format. The Circle will be shown as (x,y) and radius
	 * 
	 */
	public String toString() {
		return "(" + origin.x + ", " + origin.y + ") radius: " + radius; 
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	public double circumference() {
		return 2.0 * Math.PI * radius; // the this works
	}
	// Mutators
	public void setX(int x) {
		// No error checking is done because any place could be the origin
		origin.x = x;
	}
	
	public void setY(int y) {
		origin.y = y; 
	}
	
	public boolean setRadius(double radius) {
		if (radius < 0) {
			return false;
		}
		
		this.radius = radius;
		return true; 
	}
}
