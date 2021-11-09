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
        setBackground("map2.png");
        NextLevelBox nextLevel = new NextLevelBox(400, 50);
        addObject(nextLevel, 700, 586);

        ImpassableBox leftWall = new ImpassableBox (70,586);
        addObject(leftWall, 35, getHeight()/2);
        
        ImpassableBox leftTrees = new ImpassableBox (100, 100);
        addObject(leftTrees, getWidth()/5, getHeight()/2);
        
        ImpassableBox topTrees = new ImpassableBox (325,100);
        addObject(topTrees, getWidth()/2,getHeight()/5-20);
        
        ImpassableBox leftLedge = new ImpassableBox (250,1);
        addObject(leftLedge, getWidth()/5,getHeight()/5+20);
        
        ImpassableBox rightTrees = new ImpassableBox (200,586);
        addObject(rightTrees, getWidth(), getHeight()/2);
        
        ImpassableBox topRightTrees = new ImpassableBox (50,350);
        addObject(topRightTrees, getWidth()/8*7, getHeight()/4);
        
        ImpassableBox middleLedge = new ImpassableBox (500,1);
        addObject(middleLedge, getWidth()/5*2+50, getHeight()/2-40);
        
        ImpassableBox rightLedge = new ImpassableBox (50,1);
        addObject(rightLedge, getWidth()/10*8+30, getHeight()/2-40);
        
        Player pc = new Player("Level Two");
        addObject(pc, 750, 40);
    }
    public void act()
    {
        //Start game if space bar is pressed
    }
}
