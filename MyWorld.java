import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World where Elephant does stuff
 * 
 * @author David 
 * @version May 12 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 0);
    }
}
