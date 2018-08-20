/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio04 {
    public static void main(String[] args) {
Scanner entrada = new Scanner (System.in); 
  double preciobruto;
  String tipovehiculo;
  double impuesto;
  double precioneto;
  System.out.println("Programa que calcula el impuesto a pagar y el precio neto de un vehiculo según categoría.");
  System.out.println("Escriba el precio bruto del vehículo:");
  preciobruto = entrada.nextDouble();
  System.out.println("Escriba el tipo de vehículo: (‘C’ para camioneta o ‘A’ para automóvil,");
  tipovehiculo = entrada.next();
  
  
  if(tipovehiculo.equalsIgnoreCase("C")){
  if(preciobruto<80){
  System.out.println("El impuesto a pagar por la camioneta es $0 y el precio neto es $"+preciobruto+".");
  }
  else{
  impuesto = preciobruto/2;
  precioneto = impuesto+preciobruto;
  System.out.println("El impuesto a pagar por la camioneta es $"+impuesto+" y el precio neto es $"+precioneto+".");
  }
  }
  else if (tipovehiculo.equalsIgnoreCase("A")){
  if(preciobruto<=20){
  impuesto = 5;
  precioneto = impuesto+preciobruto;
  System.out.println("El impuesto a pagar por el automóvil es $"+impuesto+" y el precio neto es $"+precioneto+".");
  }
  else if(preciobruto>20&&preciobruto<=40){
  impuesto = preciobruto/5;
  precioneto = impuesto+preciobruto;
  System.out.println("El impuesto a pagar por el automóvil es $"+impuesto+" y el precio neto es $"+precioneto+".");
  }
  else if(preciobruto>40){
  impuesto = 9;
  precioneto = impuesto+preciobruto;
  System.out.println("El impuesto a pagar por el automóvil es $"+impuesto+" y el precio neto es $"+precioneto+".");
  } 
  }
  else {
  System.out.println("El valor ingresado no corresponde a un tipo de vehículo válido.");    
  }
}
}
