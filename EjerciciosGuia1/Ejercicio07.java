import java.util.Scanner;
 
public class Ejercicio07 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double LadoA;
  double LadoB;
  double LadoC;
  double Semiperimetro;
  double Area;
  double Circumradio;
   
  System.out.println("Programa que calcula​el semiperímetro, el área y el circumradius de un triángulo.");
  System.out.println("Escriba la dimensión del lado A del triángulo (en cm): ");
  LadoA = entrada.nextDouble();
  System.out.println("Escriba la dimensión del lado B del triángulo (en cm): ");
  LadoB = entrada.nextDouble();
  System.out.println("Escriba la dimensión del lado C del triángulo (en cm): ");
  LadoC = entrada.nextDouble();
  Semiperimetro = (LadoA+LadoB+LadoC)/2;
  Area = Math.sqrt(Semiperimetro*(Semiperimetro-LadoA)*(Semiperimetro-LadoB)*(Semiperimetro-LadoC));
  Circumradio = (LadoA*LadoB*LadoC)/((Math.PI+4)*(Area));
  System.out.println("El valor del Semiperímetro es "+ Semiperimetro + " cm, el Área es "+ Area + " cm^2 y el Circumradio es "+ Circumradio + "cm^2.");
    
 }
}
