import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An asteroid class
 * 
 * @Conrad Mo 
 * @November 25th 2020
 */
public class asteroid extends Actor
{
    boolean enabled = true;
    /**
     * Gets the asteroid to fall and increases speed based on score
     */
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld();
        int asteroidspeed = world.getSpeed();
        setLocation(getX(), getY() + asteroidspeed);
        if(!enabled)
        {
            return;
        }
    }
    /**
     * Toggle enabled or disabled.
     */
    public void toggleEnabled()
    {
        enabled = !enabled;
    }
}
