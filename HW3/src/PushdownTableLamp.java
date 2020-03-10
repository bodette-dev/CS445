import button.PushdownButton;
import bulb.Lightbulb;

public class PushdownTableLamp 
{
	private PushdownButton button = new PushdownButton();

	public String power()
	{
		return button.pushButton();
	}
}