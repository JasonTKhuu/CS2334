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
				int lengthOfString = 0;
				
				// Since both lat and lon are the same length since they still have the same values together
				lengthOfString = lat.length();
				
				if (lengthOfString == 17) {
					lat = lat.replaceAll(lat.substring(8), ""); 
					lon = lon.replaceAll(lon.substring(0, 8), "");
				}
				else if (lengthOfString == 18) {
					lat = lat.replaceAll(lat.substring(8), ""); 
					lon = lon.replaceAll(lon.substring(0, 8), "");
				}
				else if (lengthOfString == 19) {
					lat = lat.replaceAll(lat.substring(9), ""); 
					lon = lon.replaceAll(lon.substring(0, 9), "");
				}
				else if (lengthOfString == 20) {
					
				}
				
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
				
				
				String output = increment + "," + lat + "," + lon;
				
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
