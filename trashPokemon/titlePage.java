import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titlePage extends World
{
    Label titleLabel = new Label("Trash Pokemon", 100);
    /**
     * Constructor for objects of class titlePage.
     * 
     */
    public titlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16*60, 9*60, 1);
        Greenfoot.start();
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    public void act()
    {
        //Start game if space bar is pressed
        if (Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}