import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Spaceship is player controlled game character
 * 
 * @Conrad Mo
 * @November 25th 2020
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(3);
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        else if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        end();
    }
    public void end()
    {
       if(isTouching(asteroid.class))
       {
           MyWorld world = (MyWorld) getWorld();
           world.gameOver();
       }
    }
}
