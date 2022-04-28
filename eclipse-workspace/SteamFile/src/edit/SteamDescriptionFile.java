package edit;

public class SteamDescriptionFile {
	
	private int appId;
	private String shortDescription;
	
	public SteamDescriptionFile() {

	}
	
	public SteamDescriptionFile(int appId, String shortDescription) {
		this.appId = appId;
		this.shortDescription = shortDescription;
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
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}
	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public void showAll() {
		System.out.println("App id : "+this.appId);
		System.out.println("Short Description : "+this.shortDescription);
	}

}
