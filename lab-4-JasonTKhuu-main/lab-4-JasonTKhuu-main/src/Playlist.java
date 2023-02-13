import java.util.Arrays;

public class Playlist{
	
	private Song[] songs;
	private int numSongs;
	private int i = 0;
	private static final int MIN_CAPACITY = 3;
	
	public Playlist() {
		this.songs = new Song[MIN_CAPACITY];
	}
	
	public Playlist(int capacity) {
		if (capacity < MIN_CAPACITY) {
			this.songs = new Song[MIN_CAPACITY];
		}
		else 
		{
			this.songs = new Song[capacity]; 
		}
	}
	
	public int getCapacity() {
		return songs.length;
	}
	
	public int getNumSongs() {
		return numSongs;
	}
	
	public Song getSong(int index) {
		int size = getCapacity();
		
		if (index == 0) {
			return songs[index];
		}
		else if (index < 0 || index >= size) {
			return null; 
		}
		
		return songs[index];
	}
	
	public Song[] getSongs() {
		Song[] newSong = Arrays.copyOf(songs, songs.length); 
		
		return newSong;
	}
	
	public boolean addSong(Song song) {
		
		if(addSong(getNumSongs(), song)) {
			return true;
		}
		
		return false;
	}
	
	public boolean addSong(int index, Song song) {
		if (song == null) {
			return false;
		}
		else if (index < 0 || index >= getNumSongs() + 1) {
			return false;
		}
		else if (getNumSongs() == getCapacity()) {
			return false;
		}
		else {
			
	for (int num = 0; num < getNumSongs() - 1; ++num) {
	
		if (num >= index) {
		this.songs[num + 1] = songs[num];
		}
	}
		}
		
		this.songs[index] = song; 
		++numSongs;
		return true;
}
	
	public int addSongs(Playlist playlist) {
		
		if (playlist == null) {
			return 0; 
		}
		
		for (int index = playlist.getSongs().length - 1; index < playlist.getSongs().length; ++index) {
			this.songs[index] = playlist.getSong(index);
			
			if (songs[index] == null) {
				this.numSongs += 0; 
			}
			else {
				this.numSongs++;
			}
			
			if (index == songs.length - 1) {
				this.songs = new Song[numSongs + 1]; 
			}
		}
		
		return numSongs; 
	}
	
	public Song removeSong() {
		
		if (songs == null) {
			return null; 
		}
		
		--numSongs; 
		return songs[songs.length - 1]; 
	}
	
	public Song removeSong(int index) {
		
		if (songs == null) {
			return null;
		}
		else {
		for (int num = 0; num < songs.length; ++num) {
			this.songs[songs.length - 1] = songs[num]; 
		}
		
		if (songs[index] == null) {
			return null;
		}
		}
		
		--numSongs; 
		return songs[index]; 
	}
}