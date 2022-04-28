package challenge;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class SongStats {

	public static ArrayList<Song> songs = new ArrayList<Song>();
	
	public static void main(String[] args) {
		
		readInSongs();
		
		for(Song song : songs) {
			System.out.println(song.toString());
		}
		
		System.out.println("\nUndertones...");
		for (Song song : songs) {
			if (song.getArtist().equalsIgnoreCase("Undertones")) {
				System.out.println(song.getTitle());
			}
		}

	}
	
	public static void readInSongs() {
		
		File file = new File("songlist.csv");
		
		FileReader fileReader;
		BufferedReader bufferedReader;
		String songInfo;
		String[] stats;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			songInfo = bufferedReader.readLine();
			
			songInfo = bufferedReader.readLine();
			
			do {
				Song song = new Song();
				stats = songInfo.split(",");
				
				song.setTitle(stats[0]);
				song.setArtist(stats[1]);
				song.setHighestPosition(Integer.parseInt(stats[2]));
				
				songs.add(song);
				
				songInfo = bufferedReader.readLine();	
			} while (songInfo != null);
			
			fileReader.close();
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
