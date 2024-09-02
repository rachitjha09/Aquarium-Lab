import greenfoot.*;
/**
 * Seahorse walks in a big circle
 * 
 * @author (Rachit Jha) 
 * @version (1/4/23)
 */
public class Seahorse extends Actor 
{
    private int a=0;//angle
    @Override public void act(){
        int temp=30;
        a+=5;
        setRotation(a);
        move(temp);
        a=getRotation();
        setRotation(0);
        if(a==360){
            a=0;
        }
    }
}