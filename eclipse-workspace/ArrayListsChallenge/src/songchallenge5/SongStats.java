package songchallenge5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongStats {

	public static ArrayList<Song> songs = new ArrayList<Song>();

	public static void main(String[] args) {

		readInSongs();

		for (Song song : songs) {
			System.out.println(song.toString());
		}

	}

	public static void readInSongs() {

		File file = new File("songlist.csv");
		FileReader fr;
		BufferedReader br;
		String songInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			songInfo = br.readLine();
			songInfo = br.readLine();

			do {
				Song song = new Song();

				stats = songInfo.split(",");

				song.setTitle(stats[0]);
				song.setArtist(stats[1]);
				song.setHighestPosition(Integer.parseInt(stats[2]));

				songs.add(song);

				songInfo = br.readLine();
			} while (songInfo != null);
			
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
