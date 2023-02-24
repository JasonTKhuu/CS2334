import java.util.*; 
public class TestCollection {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		for (int g = 90; g < 100; ++g) {
			scores.add(g); // Autoboxing -- a new Integer object is being constructed behind the scenes 
		}
		
		for (int count = 0; count < 4; ++count) {
			scores.add(93); //  Autoboxed
		}
		
		System.out.println(scores);
		
		int largest = Collections.max(scores); // return type is Autoboxed
		System.out.println(largest);

		System.out.println(Collections.frequency(scores, 93)); // 93 is Autoboxed
		// The return type is an int, so it is not autoboxed
		
		Collections.shuffle(scores);
		System.out.println(scores);
		
		ArrayList<Integer> values = new ArrayList<Integer>(); 
//		values.add(1);
//		values.add(7);
//		values.add(3);
//		values.add(4);
		boolean isEmpty = values.isEmpty();
		
//		int largestNum = Collections.max(values);
//		int smallestNum = Collections.min(values); 

		if (values.isEmpty() == true) {
		System.out.println("0");
		}
	}

}
