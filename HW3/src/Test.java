import button.Button;
import button.PushdownButton;

public class Test 
{
	public static void main(String[]args)
	{
		System.out.println("------------------------");
		System.out.println("Testing Normal TableLamp");
		System.out.println("------------------------");
		TableLamp lamp = new TableLamp();
		lamp.powerOn();
		lamp.powerOff();
		System.out.println("--------------------------");
		System.out.println("Testing Pushdown TableLamp");
		System.out.println("--------------------------");
		PushdownTableLamp pushLamp = new PushdownTableLamp();
		pushLamp.power();
		pushLamp.power();
		pushLamp.power();
		pushLamp.power();
	}
}