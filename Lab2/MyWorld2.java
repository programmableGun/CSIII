import mayflower.*;
public class MyWorld2 extends World{
    public MyWorld2(){
        setBackground("Lab2/img/bluebonnets.jpg");
        Cat2 a = new Cat2();
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