public class Fly extends Creature implements Flyer
{
	public Fly(String name)
	{
		super(name);
	}
	
	public void eat(Thing aThing)
	{
		if(!aThing.getClass().getSimpleName().equals("Thing"))
		{
			System.out.println(this.toString()+" won't eat a "+aThing.toString());
		}
		else
		{
			super.eat(aThing);
		}
	}
	
	public void fly()
	{
		System.out.println(this.toString()+" is buzzing around in flight.");
	}
	
	public void move()
	{
		fly();
	}
}