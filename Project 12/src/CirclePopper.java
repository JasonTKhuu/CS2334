import java.util.ArrayList;
public class CirclePopper {

	
	private static final int X_MAX = 50;
	private static final int Y_MAX = 200;
	private static final int MAX_RADIUS = 25;
	private static final int NUMBER_OF_CIRCLES = 3; // Change at the end
	private static final int ITERATIONS = 10;
	
	public static void main(String[] args) {
		ArrayList<Circle> circles = initializeCircles();
		
		for (int count = 0; count < ITERATIONS; ++count) {
			showCircles(circles);
			growAndPopCircles(circles);
		}
	}
	
	private static ArrayList<Circle> initializeCircles() {
		ArrayList<Circle> list = new ArrayList<Circle>();
		
		for (int count = 0; count < NUMBER_OF_CIRCLES; ++count) {
			Circle c = createRandomCircle();
			list.add(c); 
		}
		return list;
	}
	
	private static Circle createRandomCircle() {
		int x = (int) (Math.random() * X_MAX);
		int y = (int) (Math.random() * Y_MAX);
		double r = (int) (Math.random() * MAX_RADIUS); 
		
		Circle c = new Circle (x, y, r); 
		
		return c;
	}
	
	private static void growAndPopCircles(ArrayList<Circle> list) {
		for(int index = 0; index < list.size(); ++index) {
			Circle c = list.get(index);
			double radius = c.getRadius();
			radius = radius + 1.0;
			
			// If the circle is too big, then remove it and start another one
			// At a random location
			if (radius >= MAX_RADIUS) {
				list.remove(index);
				Circle circle = createRandomCircle();
				list.add(circle); 
			}
			c.setRadius(radius); // this changes the object in the list
			// Side effect
		}
	}
	
	private static void showCircles(ArrayList<Circle> list) {
		System.out.println(list); 
	}
}
