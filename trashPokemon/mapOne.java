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
        
        NextLevelBox nextLevel = new NextLevelBox(120, 25);
        addObject(nextLevel, 740, 580);
        
        ImpassableBox wall = new ImpassableBox (100,589);
        addObject(wall, 0,0);
        
        Player pc = new Player("Level One");
        addObject(pc, 430, 135);

    }
    public void act()
    {
    }
}
