import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.event.MouseEvent;


public class Escenario extends World
{
 
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        prepare();
    }


    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click en el mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + " , " + raton.getY());
            int x = raton.getX();
            int y = raton.getY();
            addObject(new Invader(), x,y);
        }
        //Pelota nuevapelota = new Pelota(posx,posy);
        //pelotas.add(nuevaPelota);
    }

 
    private void prepare()
    {
        Invader Invader = new Invader();
        addObject(Invader,163,137);
        Invader Invader2 = new Invader();
        addObject(Invader2,374,116);
        Invader Invader3 = new Invader();
        addObject(Invader3,323,174);
        Invader Invader4 = new Invader();
        addObject(Invader4,251,76);
        Invader Invader5 = new Invader();
        addObject(Invader5,215,186);
        Jugador jugador = new Jugador();
        addObject(jugador,293,359);
        Municion Municion = new Municion();
        addObject(Municion,298,325);
        Municion.setLocation(292,308);
    }
}