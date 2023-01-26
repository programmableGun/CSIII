import mayflower.*;

public class Cat extends Actor
{
    private MayflowerImage[] frames;
    public Cat()
    {
        //Create a MayflowerImage object from the specified image file
        MayflowerImage p = new MayflowerImage ("Lab3/img/cat/Walk (1).png");
        // fill frames array
        // for (int i = 1; i <= 10; i++){
        //     String filePath = "img/cat/Walk ("+i+")";
        //     frames[i-1] = new MayflowerImage(filePath);
        //     System.out.println(frames[i-1]);
        // }
        // Scale this image to 30% of the origianl size
        p.scale(0.3);
        //Set this Actor's image to the MayflowerImage object p
        setImage(p);
    }
    
    public void act()
    {
        
    }
}
