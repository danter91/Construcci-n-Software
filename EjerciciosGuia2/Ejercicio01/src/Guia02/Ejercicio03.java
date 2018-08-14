/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia02;

import java.util.Scanner;

/**
 *
 * @author Daniel Baquero Ruiz, Universidad EAN 2018
 */
public class Ejercicio03 {
 public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
  double capacidad;
  double turistas;
  double viajes;
  double valortotalpasajes;
  double valorcomision;
  System.out.println("Programa que calcula la productividad de un colectivo según número de viajes y de pasajeros.");
  System.out.println("Escriba la capacidad máxima del bus (número de personas)");
  capacidad = entrada.nextDouble();
  System.out.println("Escriba el número de turistas que van al hotel:");
  turistas = entrada.nextDouble();
  viajes = Math.ceil(turistas/capacidad);
  valortotalpasajes = turistas*10000;
  valorcomision = turistas*2000;
  System.out.println("El bus debe realizar "+viajes+" viajes, el valor total que deben pagar todos los turistas al conductor es "+valortotalpasajes+" y la comisión que debe pagar el conductor a la empresa propietaria es "+valorcomision+".");
  
}
}
