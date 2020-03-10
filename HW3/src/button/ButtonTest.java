package button;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ButtonTest 
{
	@Test
	void testOn()
	{
		Button b1 = new Button();
		assertEquals(b1.switchOn(),"Lightbulb on");
	}
	
	@Test
	void testOff()
	{
		Button b1 = new Button();
		assertEquals(b1.switchOff(),"Lightbulb off");
	}
}
