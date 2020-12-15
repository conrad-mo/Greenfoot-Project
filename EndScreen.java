import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        addObject(gameOver, 300, 200);
        if(Greenfoot.isKeyDown("space"))
        {
            StartScreen EndScreen = new StartScreen();
            Greenfoot.setWorld(EndScreen);
        }
    }
}
