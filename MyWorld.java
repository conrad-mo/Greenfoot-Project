import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world/screen
 * 
 * @Conrad Mo 
 * @November 25th 2020
 */
public class MyWorld extends World
{
    public int scorenumber = 0;
    Label score;
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
        score = new Label(scorenumber, 30);
        addObject(score, 20, 20);
        createAsteroid();
        border border = new border();
        addObject(border, 1, 400);
    }
    public void createAsteroid()
    {
        asteroid asteroids = new asteroid();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(asteroids, x, y);
    }
    public void increaseScore()
    {
        scorenumber++;
        score.setValue(scorenumber);
    }
    public void gameOver()
    {
        EndScreen EndScreen = new EndScreen();
        Greenfoot.setWorld(EndScreen);
    }
}
