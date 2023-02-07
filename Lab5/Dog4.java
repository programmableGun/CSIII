public class Dog4 extends AnimatedActor
{
    private Animation walkAnimation;
    public Dog4() 
    {
        String[] frames = new String[10]; 
        for (int i = 0; i < 10; i++){
            frames[i] = "Lab4/img/dog/Walk ("+(i+1)+").png";
        }
        
        walkAnimation = new Animation(50, frames);
        setAnimation(walkAnimation);
        walkAnimation.scale(150, 87);
        walkAnimation.setTransparency(80);
    }
   
    public void act() {
        super.act();
    }
}
