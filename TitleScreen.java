import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen here.
 * 
 * @author David 
 * @version May 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 100);

        prepare();
    }

    /**
     * Game start 
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,319,130);
        elephant.setLocation(449,304);
        elephant.setLocation(503,153);
        elephant.setLocation(274,340);
        Label label = new Label("Press <SPACE> to start", 40);
        addObject(label,267,247);
        label.setLocation(338,264);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,283,183);
        label2.setLocation(308,103);
        label.setLocation(296,253);
        label2.setLocation(275,126);
        label.setLocation(333,264);
        label2.setLocation(253,217);
        label2.setLocation(294,151);
        label.setLocation(282,247);
        label.setLocation(185,248);
        label.setLocation(200,238);
        label.setLocation(258,230);
        label.setLocation(191,228);
        label.setLocation(189,220);
        label.setLocation(230,213);
        label.setLocation(266,197);
        label.setLocation(218,246);
        label.setLocation(146,240);
        label.setLocation(247,260);
    }
}