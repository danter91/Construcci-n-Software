import java.util.Scanner;
 
public class Ejercicio02 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double pesoCarga;
  double pesoMaximo;
  double galonesporKilometro;
  double numeroViajes;
  double galonesRequeridos;
  double distanciaTotal;
  double numeroTrayectos;
     
  System.out.println("Programa que calcula el número de viajes y cantidad de gasolina en la ruta Bogotá-Sasaima (Distancia por Trayecto 80 km).");
  System.out.println("Escriba el peso total de la carga a llevar (en kg): ");
  pesoCarga = entrada.nextDouble();
  System.out.println("Escriba el peso máximo que soporta el camión (en kg): ");
  pesoMaximo = entrada.nextDouble();
  System.out.println("Escriba el rendimiento del combustible del camión (Consumo de Galones por Km): ");
  galonesporKilometro = entrada.nextDouble();
 //Cálculos
  numeroViajes = Math.ceil(pesoCarga/pesoMaximo);
  numeroTrayectos = numeroViajes*2;
  distanciaTotal = 160*numeroViajes;
  galonesRequeridos = (160*numeroViajes)*galonesporKilometro;
  System.out.println("El camión para transportar los "+ pesoCarga +" kg requiere:");
  System.out.println(numeroViajes+" viajes que corresponden a "+ numeroTrayectos + " trayectos (ida y vuelta).");
  System.out.println("Se recorrerá una distancia total de " +distanciaTotal+ " km, que implica un consumo de "+galonesRequeridos+" galones.");
 }
}
