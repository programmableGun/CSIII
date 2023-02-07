import mayflower.*;

public class AnimatedActor extends Actor{
    private Timer animationTimer;
    private Animation a;
    public AnimatedActor(){
        
    }
    public void setAnimation(Animation a){
        this.a = a;
        animationTimer = new Timer(a.getFramerate()*1000000);
    }
    public void act()
    {
        if(animationTimer.isDone()){
            animationTimer.reset();
            MayflowerImage fImage = a.getNextFrame();
            setImage(fImage);
            
        }
    }
}
