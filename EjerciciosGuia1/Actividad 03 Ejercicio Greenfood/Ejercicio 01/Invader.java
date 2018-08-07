import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Invader extends Actor
{
    private int incx;
    private int incy;
    
    public Invader()
    {
        //consulta las cordenadas del actor
        incx = 10;
        incy = 10;
    }
    
    @Override
    public void act() 
    {
        //consulta las coordenadas actuales heredadas de actor
        int posx = this.getX();
        int posy = this.getY();
        //calculamos las nuevas coordenadas
        int nuevox = posx + incx;
        int nuevoy = posy + incy;
        
        //accedemos al mundo para conocer su tamaño
        World mundo = this.getWorld();
        if(nuevox > mundo.getWidth())//rebota lado derecho
        {
            incx = -incx;
        }
        if(nuevoy > mundo.getHeight())//rebota en la parte de abajo
        {
            incy = -incy;
        }
        
        if(nuevoy < 0)//rebota arriba
        {
            incy = -incy;
        }
        if(nuevox < 0)//rebota izquierda
        {
            incx = -incx;
        }
        //cambiamos de posicion a la pelota
        this.setLocation(nuevox,nuevoy);
        
    }
    
    
}
