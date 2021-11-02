import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Animal an;
    BackGround bG;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        bG = new BackGround("images\\map1.jpg");
        addObject(bG,0,0);
        
        an = new Animal();
        addObject(an,480,270);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("w")){
            an.move();
        }
        an.setLocation(an.getX()+bG.getDX(),an.getY()+bG.getDY());
    }
}
