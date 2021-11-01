import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapThree extends World
{

    /**
     * Constructor for objects of class mapThree.
     * 
     */
    public mapThree()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 397, 1); 
    }
    public void act()
    {
        //Start game if space bar is pressed
        if (Greenfoot.isKeyDown("space")){
            mapOne gameWorld = new mapOne();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
