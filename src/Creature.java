public abstract class Creature extends Thing
{
	private Thing eaten;
	
	public Creature(String name)
	{
		super(name);
	}
	
	public void eat(Thing aThing)
	{
		eaten = aThing;
		System.out.println(this.toString()+" has just eaten a "+eaten);
	}
	
	public abstract void move();
	
	public void whatDidYouEat()
	{
		if(eaten == null)
		{
			System.out.println(this.toString()+" has had nothing to eat!");
		}
		else
		{
			System.out.println(this.toString()+" has eaten a "+eaten.getClass().getSimpleName()+"!");
		}
	}
}