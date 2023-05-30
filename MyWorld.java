import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World where Elephant does stuff
 * 
 * @author David 
 * @version May 12 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        // making a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 100, 100);
        createPizza();
    }
    //end the game with gameover message
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    //method to keep track of score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }

    //making the apple change position at the top of screen every time program is runned
    public void createPizza()
    {
        Pizza pizza = new Pizza();
        pizza.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pizza, x, y);
    }
}