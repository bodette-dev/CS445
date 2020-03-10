package button;
import bulb.Lightbulb;

public class Button 
{
	private Lightbulb bulb = new Lightbulb();
	
	public String switchOn()
	{
		System.out.println("Button switched to ON");
		return bulb.on();
	}
	
	public String switchOff()
	{
		System.out.println("Button switched to OFF");
		return bulb.off();
	}
}
