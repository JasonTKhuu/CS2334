import java.util.*; 

public class Sorting1323 {

	public static void main(String[] args) {
		int[] array = {9, 4, 2, 1, 7}; 
		
		selectionSort(array); 
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void selectionSort(int[] data) {
		for (int start = 0; start < data.length - 1; ++start) {
			// MinIndex will contain the location of the minimum value found so far
			int minIndex = start; 
			for (int compare = start + 1; compare < data.length; ++compare) {
				if (data[minIndex] > data[compare]) {
					minIndex = compare; 
				}
			}
			
			// Swap
			int temp = data[minIndex]; 
			data[minIndex] = data[start];
			data[start] = temp; 
		}
	}
}
