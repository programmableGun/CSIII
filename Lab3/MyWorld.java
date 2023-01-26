import mayflower.*;

public class MyWorld extends World
{
    // Constructor
    public MyWorld()
    {
        setBackground("Lab3/img/BG/BG.png");

        Cat cat = new Cat();
        addObject(cat, 100, 100);
        Dog dog = new Dog();
        addObject(dog, 100, 150);
    }

    public void act()
    {
    }
}
