import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private int moveDirection=1;
    public void act()
    {
        move(5*moveDirection);
        if(isAtEdge()){
            moveDirection*=-1;
        }
    }
}
