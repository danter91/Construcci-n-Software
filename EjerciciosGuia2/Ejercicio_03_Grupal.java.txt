
        
package ventasalmacen;

import java.util.Scanner;


public class VentasAlmacen {

 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double valorProducto, total = 0, valorConiva, soloiva, ivaTotal = 0, productoSiniva = 0;
        int  iva;

            
        
        do {
            valorConiva = 0;
            soloiva = 0;
            System.out.println("Ingrese el valor del producto o presione 0 para salir");
            valorProducto = teclado.nextDouble();
            if (valorProducto >= 1) {
                System.out.println("presione 1 si el iva es = 19%");
                System.out.println("presione 2 si el iva es = 5%");
                System.out.println("presione 3 si no lleva iva");
                iva = teclado.nextInt();
            
                if (iva == 1) {
                    valorConiva = valorProducto * 1.19;
                    soloiva = valorProducto * 0.19;
                   
                }  else {
                    if (iva == 2) {
                        valorConiva = valorProducto * 1.05;
                    } else {
                            if (iva == 3){
                            valorConiva = valorProducto;
                            } else { 
                            System.out.println(".....ERROR..... La opción ingresada no es valida, por favor intente de nuevo");
                        }
                    }
                }
            }
            total = total + valorConiva;
            ivaTotal = ivaTotal + soloiva;
            productoSiniva = productoSiniva + valorProducto;
            
        } while (valorProducto != 0);  
        
        System.out.println("Total valor porductos sin iva: " + productoSiniva);
        System.out.println("Iva total de la compra:        " + ivaTotal);
        System.out.println("El total a cancelar es de:     " + total);
       
    }
    
}