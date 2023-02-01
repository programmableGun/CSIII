import mayflower.*;
public class Animation {
    private MayflowerImage[] frames = new MayflowerImage[10];
    private int framerate;
    private int currentFrame;

    public Animation(int framerate, String[] frames){
        this.framerate = framerate;
        
        //do somthing with frames
        for (int i = 0; i < frames.length; i++){
            this.frames[i] = new MayflowerImage(frames[i]);
        }
    }
    public int getFramerate(){
        return this.framerate; 
    }
    public void setTransparency(int percent){
        for (int i = 0; i < frames.length; i++){
            this.frames[i].setTransparency(percent);
        }
    }
    public MayflowerImage getNextFrame(){
        //if the frame hits the last frame reset it
        if(currentFrame % (this.frames.length - 1) == 0){this.currentFrame=0;}
        //other wise get next frame
        this.currentFrame++;
        //return image
        return this.frames[currentFrame];
    }
    public void scale(int w, int h){
        for (int i = 0; i < frames.length; i++){
            this.frames[i].scale(w, h);
        }
    }
    public void setAnimation(Animation a){

    }
}
