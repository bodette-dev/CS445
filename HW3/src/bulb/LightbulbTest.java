package bulb;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LightbulbTest {

	@Test
	void testOn()
	{
		Lightbulb bulb = new Lightbulb();
		assertEquals(bulb.on(),"Lightbulb on");
	}
	
	@Test
	void testOff()
	{
		Lightbulb bulb = new Lightbulb();
		assertEquals(bulb.off(),"Lightbulb off");
	}
}
