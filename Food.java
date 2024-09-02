import greenfoot.*;
/**
 * Not a sea animal, but food for the animals to eat. Disappers when intersected.
 * 
 * @author (Rachit Jha) 
 * @version (1/4/24)
 */
public class Food extends Actor
{
    private int n;
    public Food(){
        n=(int)(Math.random()*6);
        setImage("food" + n + ".png");
    }
    @Override public void act(){
        fall();
        remove();
        spawn();
    }
    private void fall(){
        setLocation(getX(), getY()+1);
    }
    private void remove(){
        if(getWorld().getHeight()-1<=getY()){
            World w=getWorld();
            w.removeObject(this);
            return;
        }
    }
    private void spawn(){
        if(Math.random()>=0.995){
            World w=getWorld();
            w.addObject(new Food(), Greenfoot.getRandomNumber(w.getWidth()), 0);
        }
    }
}