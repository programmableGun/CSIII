import mayflower.*;

public class Cat extends Actor
{
    private MayflowerImage[] frames = new MayflowerImage[10];
    private int currentFrame = 0;
    private Timer animationTimer; 
    public Cat()
    {
        //Create a MayflowerImage object from the specified image file
        MayflowerImage p = new MayflowerImage ("Lab3/img/cat/Walk (1).png");
        // fill frames array
        for (int i = 0; i < 10; i++){
            String filePath = "Lab3/img/cat/Walk ("+(i+1)+").png";
            frames[i] = new MayflowerImage(filePath);
            frames[i].scale(100,87);
        }
        //Set this Actor's image to the MayflowerImage object p
        setImage(p);
        animationTimer = new Timer(100000000);
        animationTimer.set(1000);
    }
    
    public void act()
    {
       
        if(animationTimer.isDone()){
            animationTimer.reset();
            if(currentFrame % frames.length == 0){ currentFrame = 0;}
            setImage(frames[currentFrame]);
            currentFrame++;
        }
    }
}
