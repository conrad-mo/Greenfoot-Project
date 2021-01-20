import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An asteroid class. This actor is randomly generated specifically to target the spaceship
 * 
 * @Conrad Mo 
 * @November 2020
 */
public class asteroid extends Actor
{
    /**
     * Gets the asteroid to fall and increases speed based on score
     */
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld();
        int asteroidspeed = world.getSpeed();
        setLocation(getX(), getY() + asteroidspeed);
    }
}
