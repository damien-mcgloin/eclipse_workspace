package exceptions;

public class UserException extends Exception {
    
	private int errorType;
	
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public UserException() {
    	
    }
    
    /**
     * Constructor for the UserException.  Takes a string and 
     * add to the super class message
     * @param message
     */
    public UserException(int errorType) {
    	this.errorType = errorType;
    }
    
	public int getErrorType() {
		return errorType;
	}
	public void setErrorType(int errorType) {
		this.errorType = errorType;
	}
    
    public UserException(String message) {
        super("Aidan exception type : "+message);
        setErrorType(3);
    }
}
