import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapTwo extends World
{

    /**
     * Constructor for objects of class mapTwo.
     * 
     */
    public mapTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 586, 1); 
    }
    public void act()
    {
        //Start game if space bar is pressed
        if (Greenfoot.isKeyDown("space")){
            mapThree gameWorld = new mapThree();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
