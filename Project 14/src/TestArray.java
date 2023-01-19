import java.util.*;
public class TestArray {
	public static void main(String[] args) {
		int[] first = {5, 3, 1, 7};
		int firstSize = 4;
		int target = 6;
		mystery(first, firstSize, target); // Read carefully
		System.out.println(Arrays.toString(first));
		System.out.println(firstSize);
	}
	
	public static void mystery(int[] array, int arraySize, int substitute) {
		array[0] = substitute;
		System.out.println(Arrays.toString(array));
		for (int index=0; index < arraySize; ++index){
		array[index] = substitute;
		}
	}
}
