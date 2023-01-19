
public class TestCircle {

	public static void main(String[] args) {
		Circle myCircle = new Circle(1, 2, 3.5);
		
		System.out.println(myCircle); // Tests toString()
		
		System.out.println(myCircle.getX() + " should be 1");
		System.out.println(myCircle.getY() + " should be 2");
		System.out.println(myCircle.getRadius() + " should be 3.5");
		
		myCircle = new Circle(3, 4, -1.0);
		System.out.println(myCircle + " should be at 3, 4 and have a radius of 0.0");
		
		myCircle.setX(6);
		myCircle.setY(7);
		System.out.println(myCircle + " x coordinate should be 6");
		System.out.println(myCircle + " y coordinate should be 7");
		System.out.println(myCircle.setRadius(7.5) + " should return true");
		System.out.println(myCircle + " radius should be 7.5");
		System.out.println(myCircle.setRadius(-10) + " should return false");
		System.out.println(myCircle + " radius should be 0.0");
		
		myCircle.setRadius(1.0);
		
		System.out.println("The area of the unit circle is " + myCircle.area() + " should be PI");
		System.out.println("The circumference of the the unit circle is " + myCircle.circumference() + " should be about 6.28");
		
		System.out.println("Area of unit circle is " + Circle.area(1.0) + " should be PI");
		System.out.println("Circumference of unit circle is " + Circle.circumference(1.0) + " should be 6.28"); 
		
		// It is legal to use myCircle instead of Circle, but it is misleading.
		// It implies that the mycircle object is involved in the calculation
		// when it is not
		
		Circle anotherCircle = new Circle(); 
		System.out.println(anotherCircle + " should be a unit circle");
		anotherCircle = new Circle(10.0);
		System.out.println(anotherCircle + " should be at origin with radius 10.0");
		anotherCircle = new Circle(-10, -20);
		System.out.println(anotherCircle + " should be at (-10, -20), radius 1.0");
	}

}
