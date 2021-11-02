import greenfoot.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor  
{
    private String curWorld;
    
    //Might need a constructor later to store the trash Pokemon the player owns
    public Player(String curWorld)
    {
        this.curWorld = curWorld;
        setImage("player(initial).png");
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            setImage("trainer(right).png");
            move(3);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            setImage("trainer(down).png");
            move(3);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            setImage("trainer(left).png");
            move(3);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            setImage("trainer(up).png");
            move(3);
        }
        nextWorld(curWorld);
    }
    
    public void nextWorld(String curWorld)
    {
        if (isTouching(NextLevelBox.class))
        {

            if (curWorld.equals("Level One"))
            {
                mapTwo gameWorld = new mapTwo();
                Greenfoot.setWorld(gameWorld);
            }
            else if (curWorld.equals("Level Two"))
            {
                mapThree gameWorld = new mapThree();
                Greenfoot.setWorld(gameWorld);
            }
        }
    }
    
}
