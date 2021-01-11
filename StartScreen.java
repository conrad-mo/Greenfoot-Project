import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label spaceship_Game = new Label("Spaceship Game", 75);
        Label instructions = new Label("(click to begin)", 50);
        addObject(spaceship_Game, 300, 150);
        addObject(instructions, 300, 250);
    }
    
    public void act()
    {
        /**
         * Starts the game if "Start" text is fixed
         */
        if(Greenfoot.mouseClicked(null))
        {
            InfoScreen world = new InfoScreen();
            Greenfoot.setWorld(world);
        }
    }
}
