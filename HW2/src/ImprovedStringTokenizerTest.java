import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ImprovedStringTokenizerTest 
{

	@Test
	void testArray()
	{
		ImprovedStringTokenizer tok = new ImprovedStringTokenizer("This class is easy");
		String[] testArray = tok.toArray();
		assertEquals(testArray[0],"This");
		assertEquals(testArray[1],"class");
		assertEquals(testArray[2],"is");
		assertEquals(testArray[3],"easy");
	}
}
