package edit;

public class SteamRequirementsFile {
	
	private int appId;
	private String pcRequirements;
	private String macRequirements;
	private String linuxRequirements;
	private String minimum;
	
	public SteamRequirementsFile() {

	}
	
	public SteamRequirementsFile(int appId, String pcRequirements, String macRequirements, String linuxRequirements,
			String minimum) {
		this.appId = appId;
		this.pcRequirements = pcRequirements;
		this.macRequirements = macRequirements;
		this.linuxRequirements = linuxRequirements;
		this.minimum = minimum;
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
	 * @return the pcRequirements
	 */
	public String getPcRequirements() {
		return pcRequirements;
	}
	/**
	 * @param pcRequirements the pcRequirements to set
	 */
	public void setPcRequirements(String pcRequirements) {
		this.pcRequirements = pcRequirements;
	}
	/**
	 * @return the macRequirements
	 */
	public String getMacRequirements() {
		return macRequirements;
	}
	/**
	 * @param macRequirements the macRequirements to set
	 */
	public void setMacRequirements(String macRequirements) {
		this.macRequirements = macRequirements;
	}
	/**
	 * @return the linuxRequirements
	 */
	public String getLinuxRequirements() {
		return linuxRequirements;
	}
	/**
	 * @param linuxRequirements the linuxRequirements to set
	 */
	public void setLinuxRequirements(String linuxRequirements) {
		this.linuxRequirements = linuxRequirements;
	}
	/**
	 * @return the minimum
	 */
	public String getMinimum() {
		return minimum;
	}
	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
	
	public void showAll() {
		System.out.println("App id : "+this.appId);
		System.out.println("Pc requirements : "+this.pcRequirements);
		System.out.println("Mac requirements : "+this.macRequirements);
		System.out.println("Linux requirements : "+this.linuxRequirements);
		System.out.println("Minimum : "+this.minimum);
	}

}
