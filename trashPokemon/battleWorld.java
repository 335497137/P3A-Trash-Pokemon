import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class battleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battleWorld extends World
{
    private boolean typing = false;
    private TextBox box = new TextBox();
    /**
     * Constructor for objects of class battleWorld.
     * 
     */
    public battleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 576, 1);
        setBackground("TestBackground.png");
        
        ArrayList<String> hard = new ArrayList<String>();
        ArrayList<String> easy = new ArrayList<String>();
        try
        {
            TextReader.readInto(hard, easy);
        } 
        catch(Exception e)
        {
            System.out.println("error");
        }
        Label test = new Label(hard.get(3), 25);
        addObject(test, 320, 50);
        
    }
    
    public void act()
    {
        // Testing addition + removal of text box
        if ("space".equals(Greenfoot.getKey()))
        {
            if(typing)
            {
                typing = false;
            }
            else
            {
                typing = true;
            }
        }
        if(typing)
        {
            addObject(box, 480, 465);
        }
        else if (!typing)
        {
            removeObject(box);
        }
    }
}
