import mayflower.*;

public class MyMayflower2 extends Mayflower
{
    //Constructor
    public MyMayflower2()
    {
        //Create a window with 800x600 resolution
        super("Lab 2", 800, 600);
    }

    public void init()
    {
        //Change this to true to run this program in fullscreen mode
        Mayflower.setFullScreen(false);
        World w =  new MyWorld2();
        Mayflower.setWorld(w);
    }
}
