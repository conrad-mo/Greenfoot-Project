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
    public int asteroidspeed = 5;
    public int energylevel = 20;
    public int spaceshipX;
    public int spaceshipY;
    Label score;
    Label energy;
    laser laser;
    asteroid asteroid;
    Spaceship spaceship;
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
        energy = new Label(energylevel, 30);
        addObject(score, 20, 20);
        addObject(energy, 580, 20);
        createAsteroid();
        border border = new border();
        topborder topBorder = new topborder();
        addObject(topBorder, 1, 1);
        addObject(border, 1, 400);
    }
    /**
    * Creates new asteroid when touching world border
    */
    public void createAsteroid()
    {
        asteroid asteroids = new asteroid();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(asteroids, x, y);
    }
    /**
    Increases score and refills energy level as well as increases
    asteroid speed
    */
    public void increaseScore()
    {
        scorenumber++;
        if (asteroidspeed < 11)
        {
            asteroidspeed++;
        }
        if (energylevel < 10)
        {
            energylevel = energylevel + 10;
        }
        if (energylevel > 9)
        {
            energylevel = 20;
        }
        energy.setValue(energylevel);
        score.setValue(scorenumber);
    }
    /**
    * Switches world from myWorld to EndScreen
    */
    public void gameOver()
    {
        EndScreen EndScreen = new EndScreen();
        Greenfoot.setWorld(EndScreen);
    }
    /**
    * Returns asteroidspeed value
    */
    public int getSpeed()
    {
        return asteroidspeed;
    }
    /**
    * Allows shooting lasers from the spaceship
    */
    public void shoot()
    {

        laser laser = new laser();
        int laserx = spaceshipX;
        int lasery = spaceshipY;
        addObject(laser, laserx, lasery);
    }
    /**
    * sets "x" variable from spaceship coordinates
    */
    public void setShipX(int x)
    {
        spaceshipX = x;
    }
    /**
    * sets "y" variable from spaceship coordinates
    */
    public void setShipY(int y)
    {
        spaceshipY = y;
    }
    public void togglePauseGame()
    {
        laser.toggleEnabled();
        asteroid.toggleEnabled();
        spaceship.toggleEnabled();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            togglePauseGame();
        }
    }
}
