
public class forHw1323 {
	public static int main(int number) {
		int factor = 2;
		
		while (factor < number) {
			if (factor % number == 0) {
				// Found factor 
				return factor; 
			}
		}
		return -1; // returning a negative value would tell the user that there
		// are no factors
	}
}
