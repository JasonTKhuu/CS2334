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
				
				
				lat = afterRemoving(info); 
				lon = afterRemoving(info); 
				
				// Since the longitude will always be with a negative sign, it will split the numbers
				// in two leading to the assingment of the correct numbers to latitude and longitude
				String[] values = lat.split("-"); 
				lat = values[0];
				lon = values[1]; 
				
				// Code before creating a method that does the removal of unwanted strings 
//				// Latitude
//				lat = info.replaceAll("<trkpt", "");
//				lat = lat.replaceAll("lat=", "");
//				lat = lat.replaceAll("lon=", "");
//				lat = lat.replaceAll("\\s", ""); 
//				lat = lat.replaceAll("\"", ""); 
//				lat = lat.replaceAll(">", "");
//				
//				// Longitude
//				lon = info.replaceAll("<trkpt", "");
//				lon = lon.replaceAll("lon=", ""); 
//				lon = lat.replaceAll("lat=", "");
//				lon = lon.replaceAll("\\s", ""); 
//				lon = lon.replaceAll("\"", ""); 
//				lon = lon.replaceAll(">", ""); 
				
				
				String output = increment + "," + lat + ",-" + lon;
				
				write.print(output); 
				write.println();
				increment += 5; 
			}
		}
		write.close(); 
		input.close(); 
	}
	
	public static String afterRemoving(String info) {
		
		info = info.replaceAll("<trkpt", "");
		info = info.replaceAll("lat=", "");
		info = info.replaceAll("lon=", "");
		info = info.replaceAll("\\s", ""); 
		info = info.replaceAll("\"", ""); 
		info = info.replaceAll(">", "");
		
		for (int index = 0; index < info.length(); ++index) {
			if (info.charAt(index) == '?') {
				String remove = Character.toString(info.charAt(index));
				
				info.replace(remove, "");
			}
		}
		
		return info; 
	}
}
