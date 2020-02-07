public class Thing
{
	private String name; 
	
	public Thing(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String className = getClass().getSimpleName();
		if(className.equals("Thing"))
		{
			return name;
		}
		else
		{
			return name+" "+className;
		}
	}
}