import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An asteroid class
 * 
 * @Conrad Mo 
 * @November 25th 2020
 */
public class asteroid extends Actor
{
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 5);
    }
    public void spawn()
    {
        if (isAtEdge())
        {
            MyWorld world = (MyWorld) getWorld();
            world.createAsteroid();
        }
    }
}
