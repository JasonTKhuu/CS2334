import java.util.Arrays; 

public class InsertionSort1323 {

	public static void main(String[] args) {
		int[] data = {4, 6, 0, 2, 5, 1, 9, 3, 7, 9};
		int dataSize = 6;
		//insertionSortPerfect(data);
		insertionSortOversize(data, dataSize); 
		
		insertionSortRange(data, 3, 6);
		System.out.println(Arrays.toString(data));
	}
	
	public static void insertionSortRange(int[] array, int from, int to) {
		for (int compare = from + 1; compare < to; ++compare) {
			// Put the data at compare in a temp location
			int temp = array[compare]; 
			
			// Shift values to the right until you find one that is smaller
			// than temp
			int next;
			System.out.println(temp);
			for (next = compare - 1; next >= from && array[next] > temp; --next) {
				array[next + 1] = array[next];
			}
			
			// Put the value at temp into its location 
			array[next + 1] = temp;
		}
	}
	
	// KEEP IN MIND, AN INSERTION SHOULD NOT CHANGE THE ARRAY NOR THE SIZE OF AN ARRAY SO HAVE IT VOID
	public static void insertionSortOversize(int[] array, int arraySize) {
			insertionSortRange(array, 0, arraySize); 
	}
	public static void insertionSortPerfect(int[] array) {
			insertionSortOversize(array, array.length); 
	}

}
