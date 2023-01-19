import java.util.Scanner; 
public class ex1323 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int SENTINEL = -20;
		int accum = 0;
		int data = 0;
		data = keyboard.nextInt();
		while (data > SENTINEL)
		{
		if (data < 0)
		{
		data = Math.abs(data);
		accum = accum + data;
		}
		System.out.println(accum + " " + data); 
		data = keyboard.nextInt();
		System.out.println(accum + " " + data); 
		}
		keyboard.close();
	}
	}

