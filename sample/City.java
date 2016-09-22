package sample;

/**
 * http://www.tutorialspoint.com/javaexamples/java_methods.htm
 * 
 * @author Bhaskara Sama
 *
 */
public class City {
	String name;
	Practice p;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected int getStaffCount()
	{
		return 20;
	}
	
	public String getState()
	{
		return "UT";
	}
	
    public int getYear()  // default access
	{
		return 1;
	}
	

}
