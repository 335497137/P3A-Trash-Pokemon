import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends Actor
{
    /**
     * Act - do whatever the BackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    
    int curX = 0;
    int curY = 0;
    
    int lastX = -1;
    int lastY = -1;
    
    int deltaX = 0;
    int deltaY = 0;
    
    public BackGround(String file)
    {
        img = new GreenfootImage(file);
        setImage(img);
        setActorLocation(img.getWidth()/2, img.getHeight()/2);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("up")){
            curY +=10;
        }
        if (Greenfoot.isKeyDown("down")){
            curY -=10;
        }
        if (Greenfoot.isKeyDown("left")){
            curX +=10;
        }
        if (Greenfoot.isKeyDown("right")){
            curX -=10;
        }
        
        // clamp background movement inside bound
        curX = clamp(curX,960-img.getWidth(),0);
        curY = clamp(curY,540-img.getHeight(),0);
        
        // move background only when it needs to be moved, optimization
        if (lastX!=curX || lastY!=curY){
            setActorLocation(curX+img.getWidth()/2, curY+img.getHeight()/2);
        }
        
        // do not update delta X,Y when initailizing ahhh
        if (lastX!=-1 & lastY!=-1){
            updateDeltaXY(curX - lastX, curY - lastY);
        }
        
        
        // update lastX and lastY
        lastX = curX;
        lastY = curY;

    }
    
    public void setActorLocation(int x, int y)
    {
        setLocation(x, y);
    }
    
    private void updateDeltaXY(int x, int y)
    {
        deltaX = x;
        deltaY = y;
    }
    
    public int getDX()
    {
        return deltaX;
    }
    public int getDY()
    {   return deltaY;
    }
    
    //not useful
    public int getWidth()
    {
        return img.getWidth();
    }
    public int getHeight()
    {
        return img.getHeight();
    }
    public int getX()
    {
        return getX();
    }
    public int getY()
    {
        return getY();
    }
    //clamp value between min and max, useful for limiting thing inside a bound
    public int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }
}
