package edit;

public class SteamMediaFile {
	
	private int appId;
	private String headerImage;
	private String screenshots;
	private String background;
		
	public SteamMediaFile() {

	}
	
	public SteamMediaFile(int appId, String headerImage, String screenshots, String background) {
		this.appId = appId;
		this.headerImage = headerImage;
		this.screenshots = screenshots;
		this.background = background;
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
	 * @return the headerImage
	 */
	public String getHeaderImage() {
		return headerImage;
	}
	/**
	 * @param headerImage the headerImage to set
	 */
	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}
	/**
	 * @return the screenshots
	 */
	public String getScreenshots() {
		return screenshots;
	}
	/**
	 * @param screenshots the screenshots to set
	 */
	public void setScreenshots(String screenshots) {
		this.screenshots = screenshots;
	}
	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}
	/**
	 * @param background the background to set
	 */
	public void setBackground(String background) {
		this.background = background;
	}
	
	public void showAll() {
		System.out.println("App id : "+this.appId);
		System.out.println("Header image : "+this.headerImage);
		System.out.println("Screenshots : "+this.screenshots);
		System.out.println("Background : "+this.background);
	}

}
