import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; 

public class Convert {
	
	public static void convertFile(String filename) throws IOException {
		Scanner input = new Scanner(new File(filename)); 
		
		File outputFile = new File("triplog.csv"); 
		
		PrintWriter write = new PrintWriter(new FileWriter(outputFile)); 
		
		String lat = "";
		String lon = "";
		int increment = 0; 
		
		write.print("Time, " + "Latitude, " + "Longitude");
		write.println(); 
		while (input.hasNextLine()) {
			String info = input.nextLine(); 
			
			if (info.contains("<trkpt")) {
				
				lat = info.replaceAll("<trkpt", "");
				lon = info.replaceAll("<trkpt", "");
				lat = lat.replaceAll("lat=", "");
				lon = lon.replaceAll("lon=", ""); 
				lat = lat.replaceAll(" ", ""); 
				lon = lon.replaceAll(" ", ""); 
				lat = lat.replaceAll("\"", ""); 
				lon = lon.replaceAll("\"", ""); 
				lat = lat.replaceAll(">", "");
				lon = lon.replaceAll(">", ""); 
				
				String output = increment + ", " + lat + ", " + lon;
				
				write.print(output); 
				write.println();
				increment += 5; 
			}
		}
		write.close(); 
		input.close(); 
	}
}
