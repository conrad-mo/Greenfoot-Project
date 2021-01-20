import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The border is used to destroy asteroids once they reach the bottom of the world.
 * This is an invisible actor that is 1px thick
 * 
 * @Conrad Mo 
 * @January 2021
 */
public class border extends Actor
{
    /**
     * Act - do whatever the border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Spawns the border at the bottom
        setLocation(0, 400);
        spawn();
    }
    /**
    * Spawns new asteroids when asteroid reaches the bottom of the world
    */
    public void spawn()
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
