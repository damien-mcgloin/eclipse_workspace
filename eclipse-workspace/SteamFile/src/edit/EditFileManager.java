package edit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EditFileManager {

	public static List<SteamFile> steamFile = new ArrayList<SteamFile>();
	public static List<SteamFile> finalSteamFile = new ArrayList<SteamFile>();
	public static List<SteamDescriptionFile> steamDescriptionFile = new ArrayList<SteamDescriptionFile>();
	public static List<SteamMediaFile> steamMediaFile = new ArrayList<SteamMediaFile>();
	public static List<SteamRequirementsFile> steamRequirementsFile = new ArrayList<SteamRequirementsFile>();

	public static void main(String[] args) {

		readSteamFile();
		// showAllFile(steamFile);
		//readSteamDescriptionFile();
		// showAllFile(steamFile);
		readSteamMediaFile();
		// showAllMediaFile(steamMediaFile);
		readSteamRequirementsFile();
		showAllRequirementsFile(steamRequirementsFile);

		//makeFinalList();
		//showFinalList(finalSteamFile);
		
		//printFinalList(steamFile);
		
		//printFinalDescList(steamDescriptionFile);
		
		//printFinalReqList(steamRequirementsFile);

	}

	public static void readSteamFile() {

		File file = new File("Steam.csv");
		FileReader fr;
		BufferedReader br;

		String fileInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();
			fileInfo = br.readLine();

			do {
				SteamFile stFile = new SteamFile();

				stats = fileInfo.split(",");

				stFile.setAppId(Integer.parseInt(stats[0]));
				stFile.setName(stats[1]);
				stFile.setReleaseDate(stats[2]);
				stFile.setEnglish(stats[3]);
				stFile.setDeveloper(stats[4]);
				stFile.setPublisher(stats[5]);
				stFile.setPlatforms(stats[6]);
				stFile.setReqAge(stats[7]);
				stFile.setCategories(stats[8]);
				stFile.setGenres(stats[9]);
				stFile.setSpyTags(stats[10]);
				stFile.setAchievements(stats[11]);
				stFile.setPosRatings(stats[12]);
				stFile.setNegRatings(stats[13]);
				stFile.setAveragePlaytime(stats[14]);
				stFile.setMedianPlaytime(stats[15]);
				stFile.setOwners(stats[16]);
				stFile.setPrice(stats[17]);

				steamFile.add(stFile);

				fileInfo = br.readLine();

			} while (fileInfo != null);

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readSteamDescriptionFile() {

		File file = new File("steam_description_data.csv");
		FileReader fr;
		BufferedReader br;

		String fileInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();
			fileInfo = br.readLine();

			do {
				SteamDescriptionFile steamFile = new SteamDescriptionFile();

				stats = fileInfo.split(",");

				steamFile.setAppId(Integer.parseInt(stats[0]));
				steamFile.setShortDescription(stats[3].trim());

				steamDescriptionFile.add(steamFile);

				fileInfo = br.readLine();

			} while (fileInfo != null);

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readSteamMediaFile() {

		File file = new File("steam_media_data.csv");
		FileReader fr;
		BufferedReader br;

		String fileInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();
			fileInfo = br.readLine();

			do {
				SteamMediaFile steamFile = new SteamMediaFile();

				stats = fileInfo.split(",");

				steamFile.setAppId(Integer.parseInt(stats[0]));
				steamFile.setHeaderImage(stats[1]);
				steamFile.setScreenshots(stats[2]);
				steamFile.setBackground(stats[3]);

				steamMediaFile.add(steamFile);

				fileInfo = br.readLine();

			} while (fileInfo != null);

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readSteamRequirementsFile() {

		File file = new File("steam_requirements_data.csv");
		FileReader fr;
		BufferedReader br;

		String fileInfo;
		String[] stats;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			br.readLine();
			fileInfo = br.readLine();

			do {

				SteamRequirementsFile steamFile = new SteamRequirementsFile();

				stats = fileInfo.split(",");

				steamFile.setAppId(Integer.parseInt(stats[0]));
				steamFile.setPcRequirements(stats[1]);
				steamFile.setMacRequirements(stats[2]);
				steamFile.setLinuxRequirements(stats[3]);
				steamFile.setMinimum(stats[4]);

				steamRequirementsFile.add(steamFile);

				fileInfo = br.readLine();

			} while (fileInfo != null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void showAllFile(List<SteamFile> fileToRead) {

		for (SteamFile steamFile : fileToRead) {
			steamFile.showAll();
			System.out.println();
		}

	}

	public static void showAllDescriptionFile(List<SteamDescriptionFile> fileToRead) {

		for (SteamDescriptionFile steamFile : fileToRead) {
			steamFile.showAll();
			System.out.println();
		}

	}

	public static void showAllMediaFile(List<SteamMediaFile> fileToRead) {

		for (SteamMediaFile steamFile : fileToRead) {
			steamFile.showAll();
			System.out.println();
		}

	}

	public static void showAllRequirementsFile(List<SteamRequirementsFile> fileToRead) {

		for (SteamRequirementsFile steamFile : fileToRead) {
			steamFile.showAll();
			System.out.println();
		}

	}

	public static void makeFinalList() {

		for (SteamMediaFile steamMFile : steamMediaFile) {
			for (SteamFile sfile : steamFile) {
				if (sfile.getAppId() == steamMFile.getAppId()) {
					finalSteamFile.add(sfile);
				}
			}
		}

	}
	
	public static void showFinalList(List<SteamFile> fileToRead) {
		
		for(SteamFile steamFile : fileToRead) {
			steamFile.showAll();
		}
		
	}
	
	public static void printFinalList(List<SteamFile> fileToRead) {
		try {

			File file = new File("steam_updated.csv");

			// validation to check if a file already exists
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw;
			BufferedWriter bw;

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// adds header line
			bw.write("App Id" + ", Name" + ",Release Date"+ ", English"+", Developer"+", Publisher"+", Platforms"+", Required Age"+", Categories"+", Genres"+", Spy Tags"+", Achievements"+", Positive Ratings"+", Negative Ratings"+", Average Playtime"+", Median Playtime"+", Owners"+", Price"+"\n");

			// loops through player list and prints capitalized last name, first name and country code
			for (SteamFile steamFile : fileToRead) {
				if(steamFile.getAppId() < 501860) {
				bw.write(steamFile.getAppId() + "," + steamFile.getName() + "," + steamFile.getReleaseDate()+ "," +steamFile.getEnglish() + "," + steamFile.getDeveloper() + "," + steamFile.getPublisher() + "," + steamFile.getPlatforms() + "," + steamFile.getReqAge() + "," + steamFile.getCategories() + "," + steamFile.getGenres() + "," + steamFile.getSpyTags() + "," + steamFile.getAchievements() + "," + steamFile.getPosRatings() + "," + steamFile.getNegRatings() + "," + steamFile.getAveragePlaytime() + "," + steamFile.getMedianPlaytime() + "," + steamFile.getOwners() + "," + steamFile.getPrice() + "\n");
				}
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printFinalDescList(List<SteamDescriptionFile> fileToRead) {
		try {

			File file = new File("steam_desc_updated.csv");

			// validation to check if a file already exists
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw;
			BufferedWriter bw;

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// adds header line
			bw.write("App Id" + ", Short Description"+"\n");

			// loops through player list and prints capitalized last name, first name and country code
			for (SteamDescriptionFile steamFile : fileToRead) {
				if(steamFile.getAppId() < 501860) {
				bw.write(steamFile.getAppId() + "," + steamFile.getShortDescription() + "\n");
				}
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printFinalReqList(List<SteamRequirementsFile> fileToRead) {
		try {

			File file = new File("steam_req_updated.csv");

			// validation to check if a file already exists
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw;
			BufferedWriter bw;

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// adds header line
			bw.write("App Id" + ", PC Requirements"+ ", Mac Requirements" + ", Linux Requirements" + ", Minimum" +"\n");

			// loops through player list and prints capitalized last name, first name and country code
			for (SteamRequirementsFile steamFile : fileToRead) {
				if(steamFile.getAppId() < 501860) {
				bw.write(steamFile.getAppId() + "," + steamFile.getPcRequirements() + steamFile.getMacRequirements() + steamFile.getLinuxRequirements() + steamFile.getMinimum() + "\n");
				}
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
