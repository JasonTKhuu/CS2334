import java.util.Scanner; 

public class hw1323 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int THRESHOLD = 10; 
		
		System.out.println("Enter integers on a single line");
		String result = keyboard.nextLine(); 
		
		System.out.println("There were " + countValuesExclusive(result, THRESHOLD, true) + " values larger than " + THRESHOLD);
		System.out.print("There were " + countValuesExclusive(result, THRESHOLD, false) + " values smaller than " + THRESHOLD);
	}
	public static int countValuesExclusive(String lineOfValues, int threshold,
			boolean above)
			{
			Scanner intValues = new Scanner(lineOfValues);
			int count = 0;
			while (intValues.hasNextInt())
			{
			int next = intValues.nextInt();
			if (above && next > threshold)
			{
			++count;
			}
			else if (!above && next < threshold)
			{
			++count;
			}
			}
			intValues.close();
			return count;
			}
}
