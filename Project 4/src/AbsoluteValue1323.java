
public class AbsoluteValue1323 {
	public static void main(String[] args) {
		int result = absoluteValue(7);
		System.out.println("The absolute value of 7 is " + result); 
		
		int size = -3;
		result = absoluteValue(size);
		System.out.println("The absolute value of -3 is " + result); 
		
		int length = -5;
		result = absoluteValue(length);
		System.out.println("The absolute value of -5 is " + result); 
	}
	/** This is not legal because the parameters are the same--even though the return type is different. 
	 *  Return types are not used in matching method calls to method bodies
	public static double absoluteValue(int number) {
		return 0.0; 
	}
	**/
	public static int absoluteValue(int number) {
		
		if (number < 0)
		{
			return -1 * number;
		}
		else 
		{
		return number; // Stub
		}
	}
}
