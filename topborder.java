import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topborder here.
 * 
 * @Conrad Mo 
 * @January 2021
 */
public class topborder extends Actor
{
    /**
     * Act - do whatever the topborder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Spawns the border at the top
        setLocation(0, 1);
        spawn();
    }
    /**
    * removes lasers if reaching the top of the world
    */
    public void spawn()
    {
        if (isTouching(laser.class))
        {
            removeTouching(laser.class);
        }
    }
}
