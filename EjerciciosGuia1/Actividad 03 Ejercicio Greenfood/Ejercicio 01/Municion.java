import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Municion extends Actor
{
    
    public void act() 
    {
       this.setLocation(this.getX(),this.getY()-10);
       if(this.getY() == 0)
       {
           World mundo = this.getWorld();
           mundo.removeObject(this);
        }
      else if(this.isTouching(Invader.class))
      {
          this.removeTouching(Invader.class);
          World dis = this.getWorld();
          dis.removeObject(this);
        }
    }    
}
