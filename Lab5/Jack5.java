public class Jack5 extends AnimatedActor
{
    private Animation walkAnimation;
    public Jack5() 
    {
        String[] frames = new String[10]; 
        for (int i = 0; i < 10; i++){
            frames[i] = "Lab4/img/jack/Walk ("+(i+1)+").png";
        }
        
        walkAnimation = new Animation(50, frames);
        setAnimation(walkAnimation);
        walkAnimation.scale(400, 87);
        walkAnimation.setTransparency(20);
    }
   
    public void act() {
        super.act();
    }
}
