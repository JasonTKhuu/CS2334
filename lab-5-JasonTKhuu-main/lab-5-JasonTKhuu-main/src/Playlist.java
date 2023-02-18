import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 

public class Playlist {
	
	private ArrayList<Song> songs;
	
	public Playlist() {
		this.songs = new ArrayList<Song>(); 
	}
	
	public Playlist(String filename) throws FileNotFoundException {
		this.songs = new ArrayList<Song>(); 
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
		if (song == null) {
			return false;
		}
		else if (index < 0 || index >= getNumSongs() + 1) {
			return false;
		}
		else {
			this.songs.set(index, song); 
			return true;
		}
	}
	
	public int addSongs(String filename) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File(filename)); 
		Playlist playlist = new Playlist(); 
		int numSongsAdded = 0; 
		
		while (input.hasNextLine()) {
			String song = input.nextLine(); 
			playlist.addSongs(song); 
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
	
	public void saveSongs(String filename) throws FileNotFoundException {

	}
	
	public int[] getTotalTime() {
		
		return null; // Stub
	}
	
	public String toString() {
		
		return ""; // Stub 
	}
}
