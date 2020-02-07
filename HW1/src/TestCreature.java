public class TestCreature
{
	static final int CREATURE_COUNT = 6;
	static final int THING_COUNT = 10;
	
	public static void main(String[]args)
	{
		Thing[] thingArray = new Thing[THING_COUNT];
		Creature[] creatureArray = new Creature[CREATURE_COUNT];
		
		thingArray[0] = new Thing("Apple");
		thingArray[1] = new Thing("Pear");
		thingArray[2] = new Thing("Phone");
		thingArray[3] = new Thing("Clock");
		thingArray[4] = new Thing("House");
		thingArray[5] = new Thing("Flower");
		thingArray[6] = new Thing("Cloud");
		thingArray[7] = new Tiger("Roy");
		thingArray[8] = new Tiger("Rocky");
		thingArray[9] = new Tiger("Tony");
		
		creatureArray[0] = new Ant("Adam");
		creatureArray[1] = new Fly("Felix");
		creatureArray[2] = new Bat("Brian");
		creatureArray[3] = new Tiger("Thomas");
		creatureArray[4] = new Ant("Angel");
		creatureArray[5] = new Bat("Blake");
		
		System.out.println("Things:\n");
		
		for(int x = 0;x<thingArray.length;++x)
		{
			System.out.println(thingArray[x]);
		}
		
		System.out.println("\nCreatures:\n");
		
		for(int y = 0;y<creatureArray.length;++y)
		{
			System.out.println(creatureArray[y]);
			creatureArray[y].move();
			creatureArray[y].eat(thingArray[y]);
			creatureArray[y].whatDidYouEat();
		}
		
		System.out.println();
	}
}