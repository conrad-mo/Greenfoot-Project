import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The laser is a blue rectangle that destroys asteroids on contact.
 * It consumes energy per shot which can be seen in the top right corner of the game
 * 
 * @Conrad Mo 
 * @November 2020
 */
public class laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 6);
        destroy();
    }
    /**
    * Destroys asteroids if in contact with one
    */
    public void destroy()
    {
        if (isTouching(asteroid.class))
        {
            removeTouching(asteroid.class);
            MyWorld world = (MyWorld) getWorld();
            world.createAsteroid();
            world.increaseScore();
            if(world.scorenumber == 20)
            {
                world.createAsteroid();
            }
        }
    }
}
