import mayflower.*;

public class Cat2 extends Actor{
    private int score = 0;
    //transform varibles
    public int speed = 2;
    public int reboundOffset = 100;
    int x = getX();
    int y = getY();
    int w = getWidth();
    int h = getHeight();

    public void act(){
        setImage("Lab2/img/cat.png");
        System.out.println("working");
        handleMovementInput();
    }    
    
    private void handleMovementInput(){
        if((0 <= x && x <= 800) && (-5 <= y && y <= 600)){
            if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT )) {
                setLocation (x + speed, y);
                x = getX();
            }
            else if (Mayflower.isKeyDown( Keyboard.KEY_UP )) {
                setLocation (x, y - speed);
                y = getY();
            }
            else if (Mayflower.isKeyDown( Keyboard.KEY_DOWN )) {
                setLocation (x, y + speed);
                y = getY();
            }
            else if (Mayflower.isKeyDown( Keyboard.KEY_LEFT )) {
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
