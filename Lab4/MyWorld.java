import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	private Dog4 dog;
    private Jack4 jack;
    public MyWorld() 
    {
    	setBackground("Lab4/img/BG/BG.png");
    	
    	cat = new Cat();
    	addObject(cat, 100, 100);
        dog = new Dog4();
    	addObject(dog, 100, 150);
        jack = new Jack4();
    	addObject(jack, 100, 200);
    }
    
    public void act()
    {
    }
    
}