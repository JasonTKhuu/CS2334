import java.util.Arrays;
import java.util.*;
public class Split1323 {

	public static void main(String[] args) {
		String words = "These are four words";
		
		String[] result = splitPerfect(words); 
		
		System.out.println(Arrays.toString(result));
		
		// Oversize array 
		result = new String[100];
		int resultSize = splitOverSize(words, result);
		
		System.out.println(toString(result, 0, resultSize)); 
		
	}
	
	public static String toString(String[] source, int from, int to) {
		String result = "["; 
		
		for (int index = from; index < to; index++) {
			result = result + source[index]; 
			
			if (index < to - 1) {
				result += ", "; 
			}
		}
		
		result += "]";
		
		return result; 
	}
	public static int splitOverSize(String source, String[] result) {
		
		// Fill the array contents 
		Scanner words = new Scanner(source);
		int count = 0;
		while(words.hasNext()) {
			result[count++] = words.next(); 
			//++count; 
		}
		words.close(); 
		
		return count; 
	}
	public static String[] splitPerfect(String source) {
		
		// Figure how many elements are needed in the array
		Scanner words = new Scanner(source);
		int count = 0;
		while(words.hasNext()) {
			++count; 
			words.next(); 
		}
		words.close(); 
		
		// Construct the array
		String[] result = new String[count]; 
		
		// Fill the array contents 
		words = new Scanner(source);
		count = 0;
		while(words.hasNext()) {
			result[count++] = words.next(); 
			//++count; 
		}
		
		// Return the array
		return result; 
	}
}
