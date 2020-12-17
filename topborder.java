import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topborder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class topborder extends Actor
{
    /**
     * Act - do whatever the topborder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(0, 1);
        spawn();
    }
    public void spawn()
    {
        /*
         * removes lasers if reaching the top of the world
         */
        if (isTouching(laser.class))
        {
            removeTouching(laser.class);
        }
    }
}
