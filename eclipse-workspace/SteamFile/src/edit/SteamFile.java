package edit;

public class SteamFile {
	
	private int appId;
	private String name;
	private String releaseDate;
	private String english;
	private String developer;
	private String publisher;
	private String platforms;
	private String reqAge;
	private String categories;
	private String genres;
	private String spyTags;
	private String achievements;
	private String posRatings;
	private String negRatings;
	private String averagePlaytime;
	private String medianPlaytime;
	private String owners;
	private String price;
	
	public SteamFile() {
		
	}
	
	public SteamFile(int appId, String name, String releaseDate, String english, String developer, String publisher,
			String platforms, String reqAge, String categories, String genres, String spyTags, String achievements,
			String posRatings, String negRatings, String averagePlaytime, String medianPlaytime, String owners, String price) {
		this.appId = appId;
		this.name = name;
		this.releaseDate = releaseDate;
		this.english = english;
		this.developer = developer;
		this.publisher = publisher;
		this.platforms = platforms;
		this.reqAge = reqAge;
		this.categories = categories;
		this.genres = genres;
		this.spyTags = spyTags;
		this.achievements = achievements;
		this.posRatings = posRatings;
		this.negRatings = negRatings;
		this.averagePlaytime = averagePlaytime;
		this.medianPlaytime = medianPlaytime;
		this.owners = owners;
		this.price = price;
	}

	/**
	 * @return the appId
	 */
	public int getAppId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setAppId(int appId) {
		this.appId = appId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the english
	 */
	public String getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(String english) {
		this.english = english;
	}
	/**
	 * @return the developer
	 */
	public String getDeveloper() {
		return developer;
	}
	/**
	 * @param developer the developer to set
	 */
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the platforms
	 */
	public String getPlatforms() {
		return platforms;
	}
	/**
	 * @param platforms the platforms to set
	 */
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	/**
	 * @return the reqAge
	 */
	public String getReqAge() {
		return reqAge;
	}
	/**
	 * @param reqAge the reqAge to set
	 */
	public void setReqAge(String reqAge) {
		this.reqAge = reqAge;
	}
	/**
	 * @return the categories
	 */
	public String getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String categories) {
		this.categories = categories;
	}
	/**
	 * @return the genres
	 */
	public String getGenres() {
		return genres;
	}
	/**
	 * @param genres the genres to set
	 */
	public void setGenres(String genres) {
		this.genres = genres;
	}
	/**
	 * @return the spyTags
	 */
	public String getSpyTags() {
		return spyTags;
	}
	/**
	 * @param spyTags the spyTags to set
	 */
	public void setSpyTags(String spyTags) {
		this.spyTags = spyTags;
	}
	/**
	 * @return the achievements
	 */
	public String getAchievements() {
		return achievements;
	}
	/**
	 * @param achievements the achievements to set
	 */
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	/**
	 * @return the posRatings
	 */
	public String getPosRatings() {
		return posRatings;
	}
	/**
	 * @param posRatings the posRatings to set
	 */
	public void setPosRatings(String posRatings) {
		this.posRatings = posRatings;
	}
	/**
	 * @return the negRatings
	 */
	public String getNegRatings() {
		return negRatings;
	}
	/**
	 * @param negRatings the negRatings to set
	 */
	public void setNegRatings(String negRatings) {
		this.negRatings = negRatings;
	}
	/**
	 * @return the averagePlaytime
	 */
	public String getAveragePlaytime() {
		return averagePlaytime;
	}
	/**
	 * @param averagePlaytime the averagePlaytime to set
	 */
	public void setAveragePlaytime(String averagePlaytime) {
		this.averagePlaytime = averagePlaytime;
	}
	/**
	 * @return the medianPlaytime
	 */
	public String getMedianPlaytime() {
		return medianPlaytime;
	}
	/**
	 * @param medianPlaytime the medianPlaytime to set
	 */
	public void setMedianPlaytime(String medianPlaytime) {
		this.medianPlaytime = medianPlaytime;
	}
	/**
	 * @return the owners
	 */
	public String getOwners() {
		return owners;
	}
	/**
	 * @param owners the owners to set
	 */
	public void setOwners(String owners) {
		this.owners = owners;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void showAll() {
		System.out.println("App Id : "+this.appId);
		System.out.println("Name : "+this.name);
		System.out.println("Release Date : "+this.releaseDate);
		System.out.println("English : "+this.english);
		System.out.println("Developer : "+this.developer);
		System.out.println("Publisher : "+this.publisher);
		System.out.println("Platforms : "+this.platforms);
		System.out.println("Required Age : "+this.reqAge);
		System.out.println("Categories : "+this.categories);
		System.out.println("Genres : "+this.genres);
		System.out.println("Spy Tags : "+this.spyTags);
		System.out.println("Achievements : "+this.achievements);
		System.out.println("Positive Ratings : "+this.posRatings);
		System.out.println("Negative Ratings : "+this.negRatings);
		System.out.println("Average playtime : "+this.averagePlaytime);
		System.out.println("Median playtime : "+this.medianPlaytime);
		System.out.println("Owners : "+this.owners);
		System.out.println("Price : "+this.price);
	}
	
}
