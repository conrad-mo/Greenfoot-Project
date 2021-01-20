import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The info screen is the world that provides the player on how to play the game and controls
 * 
 * @Conrad Mo 
 * @January 2021
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
        Label screenInstructionsThree = new Label("The top left is where your score is and the top right is how much energy you have", 20);
        Label screenInstructionsFour = new Label("Energy is capped at 20 and when it gets to 0, you cannot shoot any more lasers", 20);
        Label screenInstructionsFive = new Label("You get energy for hitting asteroids or dodging them", 30);
        addObject(screenInstructionsOne, 300, 50);
        addObject(screenInstructionsTwo, 300, 100);
        addObject(screenInstructionsThree, 300, 150);
        addObject(screenInstructionsFour, 300, 200);
        addObject(screenInstructionsFive, 300, 250);
        addObject(click, 300, 300);
    }
    /**
    * Starts the game if "Start" text is fixed
    */
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
