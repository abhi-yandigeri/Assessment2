package Assessment2;

public class EmployeeException extends Exception
{
	String msg;
	
	public EmployeeException(String msg)
	{
		super (msg);
	}
	
	public class EmployeeExceptionDemo{
		private String firstname;
		private String lastname;
	}
	public EmployeeException(String firstname, String lastname) {
		super();
		firstname = firstname;
		lastname = lastname;
		
	}
	
	void validation(String firstname, String lastname) throws EmployeeException
	{
		if(firstname==null || lastname==null)
		{
			throw new EmployeeException("Entry Missing");
		}
	
		else if(firstname.length()<3|| lastname.length()<3)
	{
		throw new EmployeeException("Should be minimum 3 character");
	}
	}
	public static void main(String args[]) throws EmployeeException
	{
		EmployeeException ed=new EmployeeException("Abhishek","Yandigeri");
		ed.validation("Ab","Ya");
		
	}
}