
public class testDouble1323 {

	public static void main(String[] args) {
		String number = "123.45";
		
		double dPrimitive = Double.parseDouble(number);
		
		System.out.println(dPrimitive);
		
		// Static version 
		System.out.println("Should be false: " + Double.isInfinite(dPrimitive));
		
		// NonStatic 
		Double dObject = Double.valueOf(number); // Factory -- substitute for constructor 
		System.out.println("Should be false: " + dObject.isInfinite());
		
		if(!dObject.isInfinite() && !dObject.isNaN()) {
			dPrimitive = dObject.doubleValue();
			System.out.println(dPrimitive);
		}
	}

}
