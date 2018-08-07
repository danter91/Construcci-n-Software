import java.util.Scanner;
 
public class Ejercicio06 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double Longitud;
  double Apotema;
  double anguloRadianes;
  double Area;
   
  System.out.println("Programa que calcula el área de un hexágono regular.");
  System.out.println("Escriba la dimensión de uno de los lados (en cm): ");
  Longitud = entrada.nextDouble();
  anguloRadianes = Math.toRadians(30);
  Apotema = Longitud/(2*(Math.tan(anguloRadianes)));
  Area = 3*Longitud*Apotema;
  System.out.println("El área del hexágono regular es: "+Area);
 

 }
}
