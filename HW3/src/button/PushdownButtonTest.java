package button;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PushdownButtonTest 
{
	@Test
	void testPush()
	{
		PushdownButton b1 = new PushdownButton();
		assertEquals(b1.pushButton(),"Lightbulb on");
		assertEquals(b1.pushButton(),"Lightbulb off");
		assertEquals(b1.pushButton(),"Lightbulb on");
		assertEquals(b1.pushButton(),"Lightbulb off");
	}
}