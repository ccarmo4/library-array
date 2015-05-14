
public interface Item {

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


	
