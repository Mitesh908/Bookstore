
public class InvalidException extends RuntimeException {
	 String message;
	    public InvalidException() {}
	    public InvalidException(String message)
	    {
	    	this.message = message;
	    }
	    public String  getmessage()
	    {
	    	return message;
	    }
	    public String toString()
	    {
	    	return "no books can be addded:" + message;
	    }
	    
}
