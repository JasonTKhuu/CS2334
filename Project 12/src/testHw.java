import java.util.*;
public class testHw {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = input.nextLine(); 
		
		StringTokenizer st1 = new StringTokenizer(result, "()", true);
		StringTokenizer st2 = new StringTokenizer(result, "{", true);
		StringTokenizer st3 = new StringTokenizer(result, "}", true);
		StringTokenizer st4 = new StringTokenizer(result, "[]", true);
		
		while (st1.hasMoreTokens()) {
				System.out.println(st1.nextToken());
				System.out.println(st2.nextToken());
				System.out.println(st3.nextToken());
				System.out.println(st4.nextToken());
	}
	}
}
