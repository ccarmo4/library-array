//sets up the interface, which contains only the method names
public interface Item {

//each method is public so it can be accessed from other classes, and each represents a different aspect of the info needed
	 public String Library ();
	   
	  public String Customer ();
	  
	  public String Book ();
	  
	  public void checkout ();
	  

	  public String whoisit ();

	public String getCallNumber();

	void setCallNumber(String callNum);

	boolean checkOut(long customerID);

	void setCheckedOut(boolean checked);

	void setCustomerID(long customerID);

	boolean getCheckedOut();

	long getCustomerID();

}


	
