/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

/**
 *
 * @author Nancy Johanna Salinas,Daniel Humberto Baquero y Miller Orlando Sanmiguel
 */
import java.util.Scanner;
public class Ejercicio_01_Grupal {
  public static void main(String[] args) {
  //definición  de variables 
  int valor [] = new int[10];
  int sumatoria = 0;
  float media = 0;
  double var = 0.0;
  double desviacion= 0.0; 
   
  Scanner entrada = new Scanner(System.in);
  System.out .println("Programa que calcula la desviación estándar de diez números");
  System.out .println("Digite el valor de los números"
                                     +" como muestra");
  for (int i = 0; i < 10; i++ ){
   System.out.print("Digite el valor " + (i + 1) + ":");
   valor[i] = entrada.nextInt();
   sumatoria = sumatoria + valor[i];
  }
  entrada.close();
  media = sumatoria / 10; //media aritmetica 
 
  for(int i = 0 ; i < 10; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
   var = var + rango;
  }
  var = var / 10f;
  desviacion = Math.sqrt(var);
  System.out.println("La desviación estándar del grupo de números es: " + desviacion);
 }

}