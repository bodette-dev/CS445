public class Bat extends Creature implements Flyer
{
	public Bat(String name)
	{
		super(name);
	}
	
	public void eat(Thing aThing)
	{
		if(!aThing.getClass().getSimpleName().equals("Creature"))
		{
			if(aThing.getClass().getSimpleName().equals("Thing"))
			{
				System.out.println(this.toString()+" won't eat a "+aThing.toString());
			}
		}
		else
		{
			super.eat(aThing);
		}
	}
	
	public void fly()
	{
		System.out.println(this.toString()+" is swooping through the dark.");
	}
	
	public void move()
	{
		fly();
	}
}