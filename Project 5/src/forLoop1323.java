
public class forLoop1323 {

	public static void main(String[] args) {
		String word = "abcde";
		
		word = reverse(word); 
		
		System.out.println(word);
	}
	
	public static String reverse(String source) {
		String result = ""; 
		for (int index = 0; index < source.length(); index = index + 1) {
			char next = source.charAt(index);
			result = next + result; 
		}
		return result; 
	}
}
