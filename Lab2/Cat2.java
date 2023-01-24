import mayflower.*;

public class Cat2 extends Actor{
    private int score = 0;
    private int lives = 3;
    //transform varibles
    public int speed = 50;
    public int reboundOffset = 100;
    int x = getX();
    int y = getY();
    int w = getWidth();
    int h = getHeight();

    public void act(){
        setImage("Lab2/img/cat.png");
        handleMovementInput();
        updateText();
    }    
    private void updateText(){
        World w = getWorld();
        
        w.removeText(10, 30);
        w.showText("Score: " + score + " Lives: " + lives, 10, 30, Color.BLACK);
    }
    public void increaseScore(int value){
        score += value;
        System.out.println("score = "+score);
    }
    public void hurt(){
        lives--; // lives --1
        x = 300;
        y = 200;
        if(lives <= 0){
            updateText();
            die();
        }
    }
    private void die(){
        World w = getWorld();
        w.removeObject(this);
    }
    private void handleMovementInput(){
        if((0 <= x && x <= 800) && (-5 <= y && y <= 600)){
            if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT )) {
                setLocation (x + speed, y);
                x = getX();
            }
            if (Mayflower.isKeyDown( Keyboard.KEY_UP )) {
                setLocation (x, y - speed);
                y = getY();
            }
            if (Mayflower.isKeyDown( Keyboard.KEY_DOWN )) {
                setLocation (x, y + speed);
                y = getY();
            }
            if (Mayflower.isKeyDown( Keyboard.KEY_LEFT )) {
                setLocation (x - speed, y);
                x = getX();
            }
        }else if((0 <= x)){
            x -= reboundOffset;
        }else if(x <= 800){
            x += reboundOffset;
        }
        if(y <= 0){
            y += reboundOffset;
            System.out.println(y);
        }
        if(y >= 600){
            y -= reboundOffset;
            System.out.println(y);
        }
        setLocation(x, y);
    }
}
