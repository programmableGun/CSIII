import mayflower.*;
public class MyWorld extends World{
    public MyWorld(){
        setBackground("Lab1/img/bluebonnets.jpg");
        Cat a = new Cat();
        addObject(a, 400, 300);

        Dog2 b = new Dog2();
        addObject(b, 200, 150);

        Yarn2 yarn1 = new Yarn2();
        addObject(yarn1, 600, 150);
        
        Yarn2 yarn2 = new Yarn2();
        addObject(yarn2, 200, 450);
        
        Yarn2 yarn3 = new Yarn2();
        addObject(yarn3, 600, 450);

        
    }
    public void act(){
        
    }
}