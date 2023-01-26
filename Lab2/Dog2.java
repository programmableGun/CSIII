

import mayflower.*;
public class Dog2 extends Actor{
    public void act() {
        setImage("Lab2/img/dog.png");
        if(isTouching(Cat2.class)){
            Object a = getOneIntersectingObject(Cat2.class);
            Cat2 c = (Cat2) a;
            c.hurt();
            setLocation(Math.random()*100, Math.random()*100);
            
        } 
    }    
}
