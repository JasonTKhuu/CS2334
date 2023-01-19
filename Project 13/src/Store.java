import java.util.*;
import java.util.ArrayList;

public class Store {
	
	// Data
	private String name;
	private ArrayList<Item> itemList;
	
	// Constructors
	public Store (String name) {
		this.name = name; 
		itemList = new ArrayList<Item>();
	}
	
	// Accessors
	public double getAveragePrice() {
		double sum = 0.0;
		for(Item item : itemList) {
			double price = item.getPrice()
			sum += price;
		}
		
		return sum / itemList.size();
	}
	public boolean hasItem(String itemName) {
		for (int index = 0; index < itemSize.size(); ++index) {
			Item item = itemList.get(index);
			String name = item.getName(); 
			if(name.equals(itemName))
			return true;
		}
	}
	
	// Mutators
	public void addItem(String itemName, double itemPrice) {
		Item item = new Item(itemName, itemPrice); 
		itemList.add(item); 
	}
}
