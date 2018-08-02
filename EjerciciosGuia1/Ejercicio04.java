import java.util.Scanner;
 
public class Ejercicio04 {
 
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double estudiantesGordos;
  double estudiantesFlacos;
  double sillasporBus;
  double valorPlato;
  double valorHabitacion;
  double personasporHabitacion;
  double valorBus;
  double diasPaseo;
  double busesRequeridos;
  double costoAlquilerBus;
  double valorTotalComida;
  double totalHabitaciones;
  double valordiarioHabitaciones;
  double valortotalHabitaciones;
   
  System.out.println("Programa que organiza el paseo al Melgar del colegio los tres cerditos.");
  System.out.println("Escriba el número de estudiantes gordos:");
  estudiantesGordos = entrada.nextDouble();
  System.out.println("Escriba el número de estudiantes flacos:");
  estudiantesFlacos = entrada.nextDouble();
  System.out.println("Escriba el número de sillas por bus:");
  sillasporBus = entrada.nextDouble();
  System.out.println("Escriba el valor por plato de comida:");
  valorPlato = entrada.nextDouble();
  System.out.println("Escriba el valor por habitación:");
  valorHabitacion = entrada.nextDouble();
  System.out.println("Escriba el número de personas por habitación:");
  personasporHabitacion = entrada.nextDouble();
  System.out.println("Escriba el valor de alquiler por cada bus:");
  valorBus = entrada.nextDouble();
  System.out.println("Escriba la duración del paseo (en días):");
  diasPaseo = entrada.nextDouble();
 
  //Cáculos
  busesRequeridos = Math.ceil(((estudiantesGordos*2)+estudiantesFlacos)/sillasporBus);
  costoAlquilerBus = (busesRequeridos*valorBus)*2;
  valorTotalComida = ((estudiantesGordos*5)+(estudiantesFlacos*3))*diasPaseo*valorPlato;
  totalHabitaciones = Math.ceil((estudiantesGordos+estudiantesFlacos)/personasporHabitacion);
  valordiarioHabitaciones = totalHabitaciones*valorHabitacion;
  valortotalHabitaciones = valordiarioHabitaciones*diasPaseo;
  
    System.out.println("El número de buses requeridos es "+ busesRequeridos);
    System.out.println("El costo por el alquiler de los buses es $ "+ costoAlquilerBus);
    System.out.println("El valor total de la comida es $ "+ valorTotalComida);
    System.out.println("El número de habitaciones requerido es "+ totalHabitaciones);
    System.out.println("El valor al día por el alquiler de las habitaciones es $ "+ valordiarioHabitaciones);
    System.out.println("El valor total por el alquiler de las habitaciones es $ "+ valortotalHabitaciones);

 }
}
