import java.util.*;
import java.awt.*;
public class testing {
	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<String>();
		
		shoppingList.add("Milkbones");
		shoppingList.add("Orange Juice");
		shoppingList.add(0, "Kale");
		shoppingList.add("Eggs");
	
		//shoppingList.add(6, "Cheese");
		
		System.out.println(shoppingList); 
		
		for (int index = 0; index < shoppingList.size(); ++index) {
			System.out.println(index + 1 + ". " + shoppingList.get(index));
		}
	}
}
//		shoppingList.remove(0);
//		shoppingList.remove(2); 
//		shoppingList.clear();
//		
//		// Lexicographic order 
//		String[] Sauce = {"cranberries", "orange", "Sugar"};
//		Collections.addAll(shoppingList, "Turkey", "Bread", "Sausage");
//		Collections.addAll(shoppingList, Sauce);
//		
//		Collections.sort(shoppingList);
//		//shoppingList.Range(0, 2); 
//		int index = 1; 
//		for(String item : shoppingList) {
//			System.out.println(index++ + ". " + item);
//	}
//
//		ArrayList<String> copy = new ArrayList<String>();
//		copy.add("Pupperoni");
//		Collections.copy(shoppingList, copy);
//		
//		System.out.println("Shopping list: " + shoppingList);
//		System.out.println("Copy: " + copy); 
//		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);
//		
//		System.out.println("Disjoint: " + Collections.disjoint(shoppingList, numbers));
//		
//		// Mutators
//		Point p = new Point(3, 5); 
//		ArrayList<Point> points = new ArrayList<Point>();
//		points.add(new Point());
//		points.add(new Point());
//		points.add(new Point());
//		
//		Collections.fill(points, p);
//		
//		p.setLocation(7, 9);
//		System.out.println(points);
//		}
//	}
