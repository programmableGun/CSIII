import mayflower.Actor;
import mayflower.World;
public class Yarn2 extends Actor{
    public void act() {
        setImage("Lab2/img/yarn.png");
        if(isTouching(Cat2.class)){
            Object a = getOneIntersectingObject(Cat2.class);
            Cat2 c = (Cat2) a;
            World w = getWorld();
            c.increaseScore(1);

            w.removeObject(this);
        }
    }
}
