import greenfoot.*; 

public class StarFish extends Actor
{
    public void act() 
    {
        move(5);
        if(isAtEdge()){
            turn((int)(Math.random()*360));
        }
    }    
}
