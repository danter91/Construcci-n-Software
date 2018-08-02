import java.util.Scanner;

public class Ejercicio02
{
   public static void main(String[] args) {
    
  Scanner sn= new Scanner(System.in);

    boolean correcto = false;

    do{

    System.out.println("Escribe un número");
    String num= sn.nextLine();

    if (num.matches("[0-9]")) {
        correcto=true;
        int numero = Integer.parseInt(num);
        System.out.println("El número introducido es " + numero);
    } else {
        correcto=false;
        System.out.println("Repite de nuevo");
    }

    }while(correcto==false);
}
}
