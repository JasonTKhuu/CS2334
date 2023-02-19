import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner; 

public class Playlist {
	
	private ArrayList<Song> songs;
	
	public Playlist() {
		this.songs = new ArrayList<Song>(); 
	}
	
	public Playlist(String filename) throws FileNotFoundException {
		this();
		addSongs(filename); 
	}
	
	public int getNumSongs() {
		return songs.size();
	}
	
	public Song getSong(int index) {
		if (index < 0 || index >= getNumSongs()) {
			return null;
		}
		return songs.get(index);
	}
	
	public Song[] getSongs() {
		return songs.toArray(new Song[0]);
	}
	
	public boolean addSong(Song song) {
		return addSong(getNumSongs(), song);
	}
	
	public boolean addSong(int index, Song song) {
		// TODO: Update the Lab 3 method.
		if (song == null || index < 0 || index > getNumSongs() + 1) {
			return false;
		}
		else {
			songs.add(null); 
			this.songs.set(index, song); 
			return true;
		}
		
	}
	
	public int addSongs(String filename) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File(filename)); 
		
		int numSongsAdded = 0; 
		
		while (input.hasNextLine()) {
			
			int seconds = 0;
			int minutes = 0;
			int hour = 0;
			
			String song = input.nextLine(); 
		    String[] songInfo = song.split("; "); 
		    
		    String[] timeInfo = songInfo[2].split(":"); 
		    int[] time = new int[timeInfo.length]; 
		    
		    if (time.length == 1) {
		    	seconds = Integer.parseInt(timeInfo[0]);
		    	time[0] = seconds;
		    }
		    else if (time.length == 2) {
		    	minutes = Integer.parseInt(timeInfo[0]);
		    	seconds = Integer.parseInt(timeInfo[1]); 
		    	
		    	time[0] = seconds;
		    	time[1] = minutes; 
		    }
		    else {
		    	minutes = Integer.parseInt(timeInfo[0]);
		    	seconds = Integer.parseInt(timeInfo[1]); 
		    	hour = Integer.parseInt(timeInfo[2]); 
		    	
		    	time[0] = seconds;
		    	time[1] = minutes; 
		    	time[2] = hour; 
		    }
		    
		    Song newSong = new Song(songInfo[0], songInfo[1], time); 
		    songs.add(newSong);
		    
			numSongsAdded = 0; 
		}
		
		return numSongsAdded;
	}
	
	public int addSongs(Playlist playlist) {
		
		int numOfSongs = 0;
		
		if (playlist == null) {
			return 0; 
		}
		
		for (int index = 0; index < getNumSongs(); ++index) {
			if (addSong(index, getSong(index)) == false) {
				playlist.addSong(songs.get(index));
				++numOfSongs; 
			}
		}
		return numOfSongs; 
	}
	
	public Song removeSong() {
		return removeSong(getNumSongs() - 1);
	}
	
	public Song removeSong(int index) {
		// TODO: Update the Lab 3 method.
		if (index < 0 || index >= getNumSongs() + 1) {
			return null;
		}
		
		return songs.remove(index); 
	}
	
	public void saveSongs(String filename) throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(filename, false)); 
		
		writer.print(this.toString());
		
		writer.close();
	}
	
	public int[] getTotalTime() {
		
		int[] keepValue; 
		
		int totalTime = 0; 
		
		if (getNumSongs() == 0) {
			keepValue = new int[1]; 
			keepValue[0] = 0;
			
			return keepValue;
		}
		
		Song song = songs.get(getNumSongs() - 1); 
		
		int[] newSong = song.getTime(); 
		
		for (int index = 0; index < newSong.length; ++index) {
			totalTime += newSong[index]; 
		}
		
		if (newSong.length == 1) {
			keepValue = new int[newSong.length];
			keepValue[0] = totalTime; 
		}
		else if (newSong.length == 2) {
			keepValue = new int[newSong.length]; 
			keepValue[0] = totalTime / 60;
			keepValue[1] = totalTime % 60;
		}
		else {
			keepValue = new int[newSong.length]; 
			keepValue[0] = totalTime / 60;
			keepValue[1] = totalTime % 60;
		}
		
		
		return keepValue; // Stub
	}
	
	public String toString() {

		return songs.get(getNumSongs()) + System.lineSeparator(); // Stub 
	}
}
