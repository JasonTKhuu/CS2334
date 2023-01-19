import java.util.Arrays;

public class classExample1323 {

	public static void main(String[] args) {
		int[] data = {9, 1, 2, 7, 3, 5};
		Arrays.sort(data);
		int result = Arrays.binarySearch(data, 3); 
		System.out.print(result);
	}

}
