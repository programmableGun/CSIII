import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	cat = new Cat();
    	addObject(cat, 100, 100);
    }
    
    public void act()
    {
    }
    
}