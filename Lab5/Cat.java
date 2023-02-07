public class Cat extends AnimatedActor
{
    private Animation walkAnimation;
    public Cat() 
    {
        String[] frames = new String[10]; 
        for (int i = 0; i < 10; i++){
            frames[i] = "Lab4/img/cat/Walk ("+(i+1)+").png";
        }
        
        walkAnimation = new Animation(50, frames);
        setAnimation(walkAnimation);
        walkAnimation.scale(100, 87);
        walkAnimation.setTransparency(50);
    }
   
    public void act() {
        super.act();
    }
}
