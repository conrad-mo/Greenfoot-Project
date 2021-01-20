import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Spaceship is player controlled game character
 * 
 * @Conrad Mo
 * @Novemeber 2020
 * 
 */
public class Spaceship extends Actor
{
    GreenfootSound blastersound = new GreenfootSound("laser.mp3");
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      int lasery = getY() - 110;
      int laserx = getX() - 2;
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
      else if (Greenfoot.isKeyDown("space"))
      {
          MyWorld world = (MyWorld) getWorld();
          if (world.energylevel > 0)
          {
          laser laser = new laser();
          blastersound.play();
          world.addObject(laser, laserx, lasery);
          world.energylevel--;
          world.energy.setValue(world.energylevel);
          }
      }
      end();
    }
    /**Ends the game if spaceship touches the asteroid
     * 
     */
    public void end()
    {
       /*
        * Ends the game if touches an asteroid
        */
       if(isTouching(asteroid.class))
       {
           MyWorld world = (MyWorld) getWorld();
           world.gameOver();
       }
    }
}
