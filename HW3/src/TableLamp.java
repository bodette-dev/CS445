import button.Button;
import bulb.Lightbulb;

public class TableLamp 
{
	private Button button = new Button();

	public String powerOn()
	{
		return button.switchOn();
	}
	
	public String powerOff()
	{
		return button.switchOff();
	}
}
