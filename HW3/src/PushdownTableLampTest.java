import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PushdownTableLampTest 
{
	@Test
	void testPower()
	{
		PushdownTableLamp lamp = new PushdownTableLamp();
		assertEquals(lamp.power(),"Lightbulb on");
		assertEquals(lamp.power(),"Lightbulb off");
		assertEquals(lamp.power(),"Lightbulb on");
		assertEquals(lamp.power(),"Lightbulb off");
	}
}
