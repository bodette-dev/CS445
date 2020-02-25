
import java.util.Random;
public class ImprovedRandom extends Random {
	
	public ImprovedRandom()
	{
		super();
	}
	
	public ImprovedRandom(long seed)
	{
		super(seed);
	}

	public int nextIntBetween(int x, int y)
	{
		if(y<x)
		{
			int temp = y;
			y = x;
			x = temp;
		}
		
		return nextInt((y-x+1))+x;
	}
}
