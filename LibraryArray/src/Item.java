//sets up the interface, which contains only the method names
public interface Item {

//each method is public so it can be accessed from other classes, and each represents a different aspect of the info needed
	 public String Library ();
	   
	  public String Customer ();
	  
	  public String Book ();
	  
	  public void checkout ();
	  

	  public String whoisit ();

	public String getCallNumber();

	public void setCallNumber(String callNum);

	public boolean checkOut(long customerID);

	public void setCheckedOut(boolean checked);

	public void setCustomerID(long customerID);

	public boolean getCheckedOut();

	public long getCustomerID();

}


	
