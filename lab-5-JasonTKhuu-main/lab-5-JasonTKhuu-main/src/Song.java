import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	private static final String INFO_DELIMITER= "; "; 
	private static final String TIME_DELIMITER = ":";
	private static final int IDX_TITLE = 0;
	private static final int IDX_ARTIST = 1;
	private static final int IDX_TIME = 2; 
	
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}
	
	public Song(String info) {
		int second = 0;;
		int minute = 0;
		int hour = 0; 
		
		String[] information = info.split(INFO_DELIMITER);
		this.title = information[IDX_TITLE];
		this.artist = information[IDX_ARTIST];
		
		String[] timeInfo = information[IDX_TIME].split(TIME_DELIMITER);
		this.time = new int[timeInfo.length];
		
		if (time.length == 1) {
			second = Integer.parseInt(timeInfo[0]);
			this.time[0] = second; 
		}
		else if (time.length == 2){
			minute = Integer.parseInt(timeInfo[0]);
			second = Integer.parseInt(timeInfo[1]); 
	
			this.time[0] = second;
			this.time[1] = minute;
		}
		else {
			hour = Integer.parseInt(timeInfo[0]);
			minute = Integer.parseInt(timeInfo[1]); 
			second = Integer.parseInt(timeInfo[2]); 
			
			this.time[0] = second;
			this.time[1] = minute;
			this.time[2] = hour; 
		}
	
}
	public String toString() {
		if (time[0] < 60) {
			return title + INFO_DELIMITER + artist + INFO_DELIMITER + String.format("%02d", time[0]);  
		}
		else if (time[1] < 60) {
			return title + INFO_DELIMITER + artist + INFO_DELIMITER + String.format("%02d", time[1]) + INFO_DELIMITER + String.format("%02d", time[1]);  
		}
		
		return title + INFO_DELIMITER + artist + INFO_DELIMITER + String.format("%02d", time[1]) + TIME_DELIMITER + String.format("%02d", time[0]);  
	}
}
