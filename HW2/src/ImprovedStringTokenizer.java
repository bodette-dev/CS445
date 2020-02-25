import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer
{
	private String str;
	
	public ImprovedStringTokenizer(String str)
	{
		super(str);
		this.str = str;
	}
	
	public ImprovedStringTokenizer(String str,String delim)
	{
		super(str,delim);
		this.str = str;
	}
	
	public ImprovedStringTokenizer(String str,String delim,boolean returnDelims)
	{
		super(str,delim,returnDelims);
		this.str = str;
	}
	
	public String[] toArray()
	{
		String[] words = str.split(" ");
		return words;
	}
}
