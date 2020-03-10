package button;
import bulb.Lightbulb;

public class PushdownButton 
{
	private boolean power = false;
	private Lightbulb bulb = new Lightbulb();
	
	public String pushButton()
	{
		if(power)
		{
			System.out.println("Button switched to OFF");
			power = false;
			return bulb.off();
		}
		else
		{
			System.out.println("Button switched to ON");
			power = true;
			return bulb.on();
		}
	}
}
