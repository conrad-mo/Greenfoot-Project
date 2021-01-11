import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoScreen extends World
{
    /**
     * Constructor for objects of class InfoScreen.
     * 
     */
    public InfoScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label screenInstructionsOne = new Label("The objective is to dodge asteroids", 35);
        Label screenInstructionsTwo = new Label("Use WASD to move and spacebar to shoot lasers", 30);
        Label click = new Label("(click to begin)", 40);
        addObject(screenInstructionsOne, 300, 50);
        addObject(screenInstructionsTwo, 300, 100);
        addObject(click, 300, 250);
    }
    public void act()
    {
        /**
         * Starts the game if "Start" text is fixed
         */
        if(Greenfoot.mouseClicked(null))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
