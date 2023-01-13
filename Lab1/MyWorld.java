import mayflower.*;
public class MyWorld extends World{
    public MyWorld(){
        setBackground("Lab1/img/bluebonnets.jpg");
        Cat a = new Cat();
        addObject(a, 400, 300);

        dog b = new dog();
        addObject(b, 200, 150);

        Yarn yarn1 = new Yarn();
        addObject(yarn1, 600, 150);
        
        Yarn yarn2 = new Yarn();
        addObject(yarn2, 200, 450);
        
        Yarn yarn3 = new Yarn();
        addObject(yarn3, 600, 450);

        
    }
    public void act(){
        
    }
}