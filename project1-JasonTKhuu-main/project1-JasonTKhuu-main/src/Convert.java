import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; 

public class Convert {
	
	public static void convertFile(String filename) throws IOException {
		Scanner input = new Scanner(new File(filename)); 
		PrintWriter write = new PrintWriter(new FileWriter(filename)); 
		
		String lat = "";
		String lon = "";
		int increment = 0; 
		
		while (input.hasNextLine()) {
			String info = input.nextLine(); 
			if (info.contains("<trkpt")) {
				lat = info.replaceAll("<trkpt lat=\"\" >", "").trim();
				lon = info.replaceAll("<trkpt lon=\"\" >", "").trim();
				
				write.print(increment + ", " + lat + ", " + lon); 
				increment += 5; 
			}
		}
		write.close(); 
	}
}
