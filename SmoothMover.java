import greenfoot.*;
/**
 * Helps move with decimals
 * 
 * @author (Rachit Jha) 
 * @version (1/4/23)
 */
public class SmoothMover extends Actor 
{
    private double x;
    private double y;
    public void setTheLocation(double x, double y){
        this.x=x;
        this.y=y;
        setLocation((int) x, (int) y);
    }
    public double getXValue(){
        return x;
    }
    public double getYValue(){
        return y;
    }
    public void move(double d){
        x+=d;
        setLocation((int) x, (int) y);
    }
}