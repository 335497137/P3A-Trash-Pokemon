import greenfoot.*;
/**
 * Write a description of class CollisionBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelBox extends Actor 
{
    private GreenfootImage boundingBoxDimensions;
    
    public NextLevelBox(int width, int height)
    {
        GreenfootImage boundingBox = new GreenfootImage(width, height);
        setImage(boundingBox);
        boundingBox.setColor(new Color(255,0,0));
    }
}
