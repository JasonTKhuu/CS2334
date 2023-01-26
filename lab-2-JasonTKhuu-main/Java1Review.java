
/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}

	public static Double divide(double d, double e) {
		return d / e;
	}
	
	public static Integer divide(int num, int secondNum) {
		return num / secondNum;
	}

	public static Boolean isDivisibleBy7(int i) {
		if (i % 7 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static String main(String firstSentenceAboutJava) {
		return "Overloaded main method was passed \"" + firstSentenceAboutJava + "\".";
	}

	public static Integer findMin(int i, int j, int k) {
		if (i > j && k > j) {
			return j;
		}
		else if (j > i && k > i) {
			return i;
		}
		else {
			return k;
		}
	}
	
	public static Integer findMin(int array[]) {
		int leastNumber = array[0];
		for (int index = 0; index < array.length; ++index) {
			if (array[index] < leastNumber) {
				leastNumber = array[index];
			}
		}
		return leastNumber;
	}
	
	public static Double average(int array[]) {
		double total = 0;
		for (int index = 0; index < array.length; ++index) {
			total += array[index];
		}
		
		return total / array.length;
	}
	
	public static String[] toLowerCase(String array[]) {
		
		for (int index = 0; index < array.length; ++index) {
			array[index] = array[index].toLowerCase(); 
		}
		
		return array;
	}
	
	public static String[] toLowerCaseCopy(String array[]) {
		String copy[] = new String[array.length];
		
		for (int index = 0; index < array.length; ++index) {
			copy[index] = array[index].toLowerCase();
		}
		
		return copy; 
	}
	
	public static int[] removeDuplicates(int array[]) {
		
		int[] tempArray = new int[array.length]; 
		int increment = 1;
		
		if (array.length == 1) {
			return array;
		}
	
		for (int index = 0; index < array.length; ++index) {
			for (int number = index + 1; number < array.length; ++number) {
				if (array[index] == array[number]) {
					++increment;
					if (increment > 1) {
					tempArray[index] = 0;
					tempArray[number] = 0;
					}
				}
				else {
					tempArray[index] = array[index]; 
				}
			}
		}
		
		for (int index = 0; index < array.length; index++) {
			array[index] = tempArray[index]; 
		}
		
		return array;
	}
}
