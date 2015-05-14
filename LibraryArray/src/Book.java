

public class Book implements Item{

	private String callNumber;
	private boolean checkedOut;
	private long custID;
	private String title;
	private String author;
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String a)
	{
		author = a;
	}
	
	
	@Override
	public void setCallNumber(String callNum) {
		callNumber = callNum;
		
	}

	@Override
	public String getCallNumber() {
		return callNumber;
	}

	@Override
	public boolean checkOut(long customerID) {
		if (checkedOut)
		return false;
		
		setCheckedOut(true);
		setCustomerID(customerID);
		return true;
	}

	@Override
	public void setCheckedOut(boolean checked) {
		checkedOut = checked;
	}

	@Override
	public boolean getCheckedOut() {
		return checkedOut;
	}

	@Override
	public void setCustomerID(long customerID) {
		
		
	}

	@Override
	public long getCustomerID() {
		// TODO Auto-generated method stub
		return custID;
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

	@Override
	public String Book() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String whoisit() {
		// TODO Auto-generated method stub
		return null;
	}


}
