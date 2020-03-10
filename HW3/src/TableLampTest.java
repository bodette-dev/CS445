import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TableLampTest 
{
	@Test
	void testPowerOn()
	{
		TableLamp lamp = new TableLamp();
		assertEquals(lamp.powerOn(), "Lightbulb on");
	}
	
	@Test
	void testPowerOff()
	{
		TableLamp lamp = new TableLamp();
		assertEquals(lamp.powerOff(), "Lightbulb off");
	}
}
