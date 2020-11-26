import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world/screen
 * 
 * @Conrad Mo 
 * @November 25th 2020
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
        
        Spaceship player = new Spaceship();
        addObject(player, 300, 350);
        createAsteroid();
    }
    
    public void createAsteroid()
    {
        asteroid asteroids = new asteroid();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(asteroids, x, y);
    }
}
