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
        setImage("trainer(initial).png");
    }
    public void act()
    {
        int x = 0;
        int y = 0;
        if (Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            setImage("trainer(right).png");
            x = 2;
        }
        else if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            setImage("trainer(down).png");
            y = 2;
        }
        else if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            setImage("trainer(left).png");
            x= -2;
        }
        else if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            setImage("trainer(up).png");
            y= -2;
        }
        setLocation(getX()+x,getY()+y);
        if(isTouching(ImpassableBox.class)){
            setLocation(getX()-x,getY()-y);
        }
        nextWorld(curWorld);
    }
    
    public void nextWorld(String curWorld)
    {
        if (isTouching(NextLevelBox.class)){

            if (curWorld.equals("Level One")){
                mapTwo gameWorld = new mapTwo();
                Greenfoot.setWorld(gameWorld);
            } else if (curWorld.equals("Level Two")){
                mapThree gameWorld = new mapThree();
                Greenfoot.setWorld(gameWorld);
            }
        } 
        if (isTouching(badGuy.class)){
                battleWorld gameWorld = new battleWorld();
                Greenfoot.setWorld(gameWorld);
        }
    }
}

