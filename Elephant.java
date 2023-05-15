import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant is the character
 * 
 * @author David
 * @version May 12 2023
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        eat();
    }    
    //if eats apple, makes new apple 
    public void eat()
    {
        if(isTouching(Pizza.class)){
        removeTouching(Pizza.class);
        MyWorld world = (MyWorld) getWorld();
        world.createPizza();
        world.increaseScore();
    }
    }
}
