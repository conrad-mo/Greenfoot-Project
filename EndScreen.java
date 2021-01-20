import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The endscreen of the game stating gameover and a way to restart the game
 * 
 * @Conrad Mo 
 * @November 2020
 */
public class EndScreen extends World
{
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label gameOver = new Label("Game Over", 100);
        Label instructions = new Label("(click to restart)", 50);
        addObject(gameOver, 300, 150);
        addObject(instructions, 300, 250);
    }
    /**
    * Goes back to start screen when clicked
    */
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            StartScreen EndScreen = new StartScreen();
            Greenfoot.setWorld(EndScreen);
        }
    }
}
