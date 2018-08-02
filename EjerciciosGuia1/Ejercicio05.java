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
  System.out.println("Programa que calcula el valor total recolectado por una aerolínea según los pasajeros y la clase.");
  System.out.println("Escriba el número de pasajeros: ");
  Pasajeros = entrada.nextDouble();
 
  boolean correcto = false;

    do{

      System.out.println("Escriba la clase (1,2 o 3): ");
      Clase = entrada.nextDouble();

    if (Clase<4) {
        correcto=false;
    Total="ValorC"+Clase*Pasajeros;
        System.out.println("El valor total recolectado para la clase "+ Clase + " es "+ Total);
  
    } else {
        correcto=true;
        System.out.println("El valor de la dimensión del lado del cuadrado superior debe ser menor que el inferior, intente nuevamente.");
    }

    }while(correcto==false);
  


 }
}
