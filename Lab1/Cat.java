import javax.lang.model.util.ElementScanner14;

import mayflower.*;

public class Cat extends Actor{
    public int speed = 20;
    int x = getX();
    int y = getY();
    int w = getWidth();
    int h = getHeight();

    public void act(){
        setImage("CSIII/Lab1/img/cat.png");
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
        x -= 200;
    }else if(x <= 800){
        x += 200;
        
    }else if(y <= 0){
        y -= 200;
        System.out.println(y);
    }else if(y >= 800){
        y += 200;
        System.out.println(y);
    }
    setLocation(x, y);
    }    
}
