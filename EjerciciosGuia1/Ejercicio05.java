import java.util.Scanner;
 
public class Ejercicio05 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
   
  double Clase;
  double Pasajeros;
  double ValorC1;
  double ValorC2;
  double ValorC3;
  double Total;

  ValorC1=500000;
  ValorC2=200000;
  ValorC3=125000;
  Total=0;
  System.out.println("Programa que calcula el valor total recolectado por una aerolínea según los pasajeros y la clase.");
  System.out.println("Escriba el número de pasajeros: ");
  Pasajeros = entrada.nextDouble();
 
  boolean correcto = false;

    do{

          System.out.println("Escriba la clase (1,2 o 3): ");
      Clase = entrada.nextDouble();

    if (Clase<4&&Clase>0) {
        correcto=true;
        
        if (Clase == 1){
            Total=ValorC1*Pasajeros;
        }
        else if (Clase == 2){
            Total=ValorC2*Pasajeros;
        }
        else if (Clase == 3){
            Total=ValorC3*Pasajeros;
        }
            System.out.println("El valor total recolectado para la clase "+ Clase + " es $ "+ Total);
    } else {
        correcto=false;
        System.out.println("El valor de la clase debe ser entre 1 y 3, intente nuevamente.");
    }

    }while(correcto==false);
  


 }
}
