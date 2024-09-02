import greenfoot.*;
/**
 * Hardest class of Aquarium Lab
 * 
 * @author (Rachit Jha) 
 * @version (1/4/23)
 */
public class Turtle extends SmoothMover
{
    private double v;
    public Turtle(){
        v=0.0;
        setImage("turtleRight.png");
    }
    @Override public void act(){
        input();
        friction();
        forward();
        image();
        food();
    }
    private void input(){
        if(Greenfoot.isKeyDown("up")){
            setTheLocation(getX(), getYValue()-2);
        } else if(Greenfoot.isKeyDown("down")){
            setTheLocation(getX(), getYValue()+2);
        }
        if(Greenfoot.isKeyDown("right")){
            v+=0.5;
        }
        if(Greenfoot.isKeyDown("left")){
            v-=0.5;
        }
    }
    private void friction(){
        v*=0.95;
    }
    private void forward(){
        move(v);
    }
    private void image(){
        if(v>0){
            setImage("turtleRight.png");
        } else{
            setImage("turtleLeft.png");
        }
    }
    private void food(){
        Actor f=getOneIntersectingObject(Food.class);
        if(f!=null){
            World w=getWorld();
            w.removeObject(f);
            Greenfoot.playSound("blop.mp3");
        }
    }
}