import greenfoot.*;

public class ClownFish extends Actor
{
    public void act() 
    {
        move( 5 );
        if(getX()>getWorld().getWidth()-10){
            setLocation(10, getY());
        }
    }    
}

