/*

 */
package Guia02;

/**
 *
 * @author Daniel Baquero Ruiz, Universidad EAN 2018
 */
import java.util.Scanner;
 
public class Ejercicio01 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double valor;
  String unidadmedida;
  double pie;
  double centimetro;
  double legua;
  double yarda;
  double resultado;
     
  System.out.println("Programa que realice la conversión de unidades de medida a pulgadas.");
  System.out.println("Escriba el valor a convertir: (numérico)");
  valor = entrada.nextDouble();
  System.out.println("Escriba la unidad de medida: (‘P’ para pie,‘C’ para centímetro, ‘L’ para legua, o ‘Y’ para yarda) ");
  unidadmedida = entrada.next();
  
  pie = 0.0833;
  centimetro = 2.54;
  legua = 190080.02;
  yarda = 36;
  
  if(unidadmedida.equalsIgnoreCase("P")){
  resultado = valor*pie;
  System.out.println("El valor ingresado ("+valor+" pies, equivale a "+resultado+" pulgadas.");
  }
  else if (unidadmedida.equalsIgnoreCase("C")){
  resultado = valor*centimetro;
  System.out.println("El valor ingresado ("+valor+" centimetros, equivale a "+resultado+" pulgadas.");    
  }
  else if (unidadmedida.equalsIgnoreCase("L")){
  resultado = valor*legua;
  System.out.println("El valor ingresado ("+valor+" leguas, equivale a "+resultado+" pulgadas.");    
  }
  else if (unidadmedida.equalsIgnoreCase("Y")){
  resultado = valor*yarda;
  System.out.println("El valor ingresado ("+valor+" yardas, equivale a "+resultado+" pulgadas.");    
  }
  else {
  System.out.println("El valor ingresado no corresponde a una unidad de medida válida.");    
  }
 }    
}

