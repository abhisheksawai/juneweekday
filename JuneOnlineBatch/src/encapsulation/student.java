package encapsulation;

public class student {
	
	private String studname; // privagte data member
	
	public String getNameofStud()  // getter method
	{
		return studname;
	}

	public void setNameofStud(String studname) // setter method
	{
		this.studname= studname;
	}
}
