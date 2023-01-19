import java.util.*;
public class TestHw {
	
	public static void main(String args[]) {
		
		int[] data = {3, 9, 1, 4, 6, 0, 5, 2, 7};
		for (int limit = 2; limit < data.length; ++limit) // Read carefully
		{
		int sum = 0;
		for (int next = 0; next < limit; ++next)
		{
		sum += data[next];
		System.out.print(sum + " ");
		}
		data[limit] = sum / limit;
		
		//System.out.print(false);
		}
	}
}