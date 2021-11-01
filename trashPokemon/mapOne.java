import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapOne extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public mapOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 589, 1);
    }
    public void act()
    {
        //Start game if space bar is pressed
        if (Greenfoot.isKeyDown("space")){
            mapTwo gameWorld = new mapTwo();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
