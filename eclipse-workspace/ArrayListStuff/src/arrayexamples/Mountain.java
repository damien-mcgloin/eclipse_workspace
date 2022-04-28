package arrayexamples;

public class Mountain {
	
	private String name;
    private int height;

    public Mountain() {
        
    }
    
    
    public Mountain(String name, int height) {
        this.name = name;
        this.setHeight(height);
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
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        if (height<10000) {
            this.height = height;
        } else {
            System.out.println("Problem with setting height");
        }
    }
    
}
