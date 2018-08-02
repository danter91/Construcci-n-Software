import java.util.Scanner;
 
public class Ejercicio03 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double sqlow;
  double squp;
  double arist;
  double area;
  double volume;
  double height;
  double ap;
  double sqlowlessup;
  double areasqlow;
  double areasqup;
   
  System.out.println("Programa que calcula el volumen de una figura de tronco de cono.");
  System.out.println("Escriba el radio de la base inferior (en cm): ");
  sqlow = entrada.nextDouble();
 
  boolean correcto = false;

    do{

      System.out.println("Escriba el radio de la base superior (en cm): ");
      squp = entrada.nextDouble();

    if (sqlow>squp) {
        correcto=true;
        System.out.println("Escriba la altura (en cm): ");
        height = entrada.nextDouble();
        volume = ((height*Math.PI)/3)*((Math.pow(sqlow,2)+Math.pow(squp,2))+(sqlow*squp));
        System.out.println("El volumen del tronco de cono es " + volume + " cm^3");
    } else {
        correcto=false;
        System.out.println("El valor de la base superior debe ser menor que el inferior, intente nuevamente.");
    }

    }while(correcto==false);
  


 }
}
