import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food 
 * 
 * @author David
 * @version May 12 2023
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 1);
        
        //remove apple when apple makes it to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >=world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }    
}
