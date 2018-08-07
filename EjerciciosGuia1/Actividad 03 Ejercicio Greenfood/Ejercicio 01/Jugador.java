import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Jugador extends Actor
{
    private boolean disparando;
    
    public Jugador()
    {
        disparando=false;
    }
    @Override
    public void act() 
    {
        //si presiona la flecha derecha
        if(Greenfoot.isKeyDown("right")){
            //muevete a la derecha
            this.setLocation(this.getX()+ 10, this.getY());
        }
        
        //si presiona la flecha izquierda
        if(Greenfoot.isKeyDown("left")){
            //muevete a la izquierda
            this.setLocation(this.getX()-10, this.getY());
        }
        
        //si presion la barra espaciadora
        if(Greenfoot.isKeyDown("space") && !disparando){
            //agregar disparo
            Municion disp=new Municion();
            World mundo=this.getWorld();
            mundo.addObject(new Municion(),this.getX(),this.getY()-40);
            disparando=true;
        }
        
        //revisar cuantos disparos hay en le mundo
        World mundo=this.getWorld();
        List lista  = mundo.getObjects(Municion.class);
        if(lista.isEmpty())
        {
            disparando = false;
        }
    }    
}
