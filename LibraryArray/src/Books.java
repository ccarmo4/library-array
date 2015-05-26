
public class Books implements Item{
	//creates all the variables needed to check out a book
	private String callNumber;
	String title;
	String author;
	String genre; 
	int price; 
	private long custID;
	private boolean checkedOut;
	
	//each method returns one of the variables above
	public String getTitle() {
		
		
		return title;
	}

	
	public String getAuthor() {
		
		return author;
	}

	
	public String getGenre() {
		
		return null;
	}

	
	public void checkout() {
		
		
	}

	
	public String whoisit() {
		
		return null;
	}


	@Override
	public String Library() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String Customer() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public String Book() {
		
		return null;
	}


	
	public String getCallNumber() {
		
		return callNumber;
	}


	
	public void setCallNumber(String callNum) {
		callNumber = callNum;
		
	}


	
	public boolean checkOut(long customerID) {
		if(checkedOut)
		return false;
		
		setCheckedOut (true);
		setCustomerID (customerID);
		return true;
	}


	
	public void setCheckedOut(boolean checked) {
		checkedOut = checked;
		
		
	}


	
	public void setCustomerID(long customerID) {
		
		
	}


	
	public boolean getCheckedOut() {
	
		return checkedOut;
	}


	
	public long getCustomerID() {
		
		return custID;
	}

}
