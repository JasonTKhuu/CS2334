import java.util.Arrays;

public class Song{
	private String title;
	private String artist;
	private int[] time; 
	
	public Song(String title, String artist, int[] time) {
		int[] newArray = Arrays.copyOf(time, time.length); 
		
		
		this.title = title;
		this.artist = artist;
		this.time = newArray;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist; 
	}
	
	public int[] getTime() {
		int[] newArray = Arrays.copyOf(time, time.length); 
		return newArray; 
	}

}
