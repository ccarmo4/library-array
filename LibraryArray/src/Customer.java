public class Customer implements Person {

	private long iD;
	private String fName;
	private String lName;


	public String getFname()
	{
		return fName;
	}
	
	public void setFname(String f)
	{
		fName = f;
	}
	
	public String getLname()
	{
		return lName;
	}
	
	public void setAuthor(String l)
	{
		lName = l;
	}
	

	public long getID() {
		// Will return the ID
		return iD;
	}
	
	@Override
	public void setID(long id) {
		
		iD = id;
	}
	
	@Override
	public void setFName(String fname) {
		
		fName = fname;
	}
	
	@Override
	public String getFName() {
		// TODO Auto-generated method stub
		return fName;
	}
	
	@Override
	public void setLName(String lname) {
		// TODO Auto-generated method stub
		lName = lname;
	}
	
	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		return lName;
	}

	
	


}
