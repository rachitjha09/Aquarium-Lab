import greenfoot.*;
/**
 * Write a description of class Octopus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Octopus extends SmoothMover 
{
    private double v;
    public Octopus(){
        v=0.0;
    }
    @Override public void act(){
        if(getWorld().getHeight()-(getImage().getHeight()/2)<=getYValue()){
            v=-5.0;
        } else{
            if(Greenfoot.isKeyDown("space") && v>3.0){
                v=-6.0;
                Greenfoot.playSound("blop.mp3");
            } else{
                v+=0.1;
            }
        }
        setTheLocation(getX(), getYValue() + v);
    }
    
}