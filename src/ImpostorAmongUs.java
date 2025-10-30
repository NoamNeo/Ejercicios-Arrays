import java.util.Random;
import java.util.Scanner;

public class ImpostorAmongUs {
  public static void main(String[] args) {
    String[] tripulacion = { "Rojo", "Verde", "Violeta", "Amarillo", "Azul", "Negro" };
    Random rand = new Random();
    Scanner usrInput = new Scanner(System.in);
    int randomCrewMember = rand.nextInt(6), userInt;
    for (int i = 0; i < tripulacion.length; i++) {
      System.out.println("Miembro " + i + ": " + tripulacion[i]);
    }
    System.out.println("Escribe el número del miembro que crees que es un impasta");
    userInt = usrInput.nextInt();
    if (userInt == randomCrewMember) {
      System.out.println("Enhorabuena has econtrado al impastar");
    } else {
      System.out.println("Fallaste!");
      System.out.println("El impostor era " + tripulacion[randomCrewMember] + " el " + randomCrewMember);
    }
    usrInput.close();
  }
}
