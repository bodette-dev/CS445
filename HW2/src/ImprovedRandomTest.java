import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ImprovedRandomTest 
{
	@Test
	void testBetween()
	{
		ImprovedRandom rand = new ImprovedRandom();
		int min = 1;
		int max = 10;
		for(int x = 0;x<100;++x)
		{
			int y = rand.nextIntBetween(min, max);
			assertTrue(y>=1,"Value not between "+min+" and "+max);
			assertTrue(y<=10,"Value not between "+min+" and "+max);
		}
		
		for(int x = 0;x<100;++x)
		{
			int y = rand.nextIntBetween(max, min);
			assertTrue(y>=1,"Value not between "+min+" and "+max);
			assertTrue(y<=10,"Value not between "+min+" and "+max);
		}
	}
}
