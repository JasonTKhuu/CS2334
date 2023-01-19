import java.util.Scanner; 
public class Example {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int sum = 0;
		int total = 0;
		sum = stdin.nextInt(); 
		while (sum >= 0) {
			if(sum % 2 == 0) 
			{
				total += sum; 
			}
			
			sum = stdin.nextInt(); 
		}
		System.out.println(total); 
		
	}
}
