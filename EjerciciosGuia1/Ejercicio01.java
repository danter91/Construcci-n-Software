import java.util.Scanner;
 
public class Ejercicio01 {
 
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
   
  System.out.println("Programa que calcula el área y el volumen de una figura de tronco de pirámide.");
  System.out.println("Escriba la dimensión del lado del cuadrado inferior (en cm): ");
  sqlow = entrada.nextDouble();
 
  boolean correcto = false;

    do{

      System.out.println("Escriba la dimensión del lado del cuadrado superior (en cm): ");
      squp = entrada.nextDouble();

    if (sqlow>squp) {
        correcto=true;
        System.out.println("Escriba la dimensión de la arista lateral (en cm): ");
        arist = entrada.nextDouble();
        sqlowlessup = Math.pow((sqlow/2)-(squp/2),2);
        areasqlow = Math.pow(sqlow,2);
        areasqup = Math.pow(squp,2);
        ap = Math.sqrt(Math.pow(arist,2)-sqlowlessup);
        height = Math.sqrt(Math.pow(ap,2)-sqlowlessup);
        area = areasqlow+areasqup+(ap*(((sqlow*4)+(squp*4))/2));
        volume = (height/3)*(areasqlow+areasqup+(Math.sqrt(areasqlow*areasqup)));
        System.out.println("El área del tronco de pirámide es " + area + " cm^2 y el volumen es " + volume+" cm^3");
    } else {
        correcto=false;
        System.out.println("El valor de la dimensión del lado del cuadrado superior debe ser menor que el inferior, intente nuevamente.");
    }

    }while(correcto==false);
  


 }
}
