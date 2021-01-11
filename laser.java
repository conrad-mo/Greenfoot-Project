import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    boolean enabled = true;
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 6);
        destroy();
      if(!enabled)
      {
         return;
      }
    }
    public void destroy()
    /**
     * Destroys asteroids if in contact with one
     */
    {
        if (isTouching(asteroid.class))
        {
            removeTouching(asteroid.class);
            MyWorld world = (MyWorld) getWorld();
            world.createAsteroid();
            world.increaseScore();
        }
    }
    /**
    *Toggle enabled or disabled.
    */
    public void toggleEnabled()
    {
        enabled = !enabled;
    }
}
