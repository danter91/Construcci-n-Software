/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

/**
 *
 * @author Daniel Baquero Ruiz, Universidad EAN 2018
 */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
  double radio;
  double areacirculo;
  double areacuadrado;
  double areasombreada;
  System.out.println("Programa que calcula el área sombreada de un circulo dentro de un cuadrado.");
  System.out.println("Escriba el radio del círculo: (numérico)");
  radio = entrada.nextDouble();
  areacirculo = Math.PI*Math.pow(radio,2);
  areacuadrado = (radio*2)*(radio*2);
  areasombreada = areacuadrado - areacirculo;
  System.out.println("El área sombreada de un circulo de radio "+ radio+" dentro de un cuadrado es "+areasombreada+".");
}
}