import java.util.Scanner;

public class NivelesDePoder {
  public static void main(String[] args) {
    Scanner usrInput = new Scanner(System.in);
    String[] nomSayan = { "Vegeta", "Krilin", "Gohan", "Trunks", "Goku" };
    int[] poderSayan = { 9000, 500, 5000, 7000, 9000 }; // NOTA IMPORTANTE: No sé nada de dragon ball no me mates
    int usrInt, sayanDebil = poderSayan[0], sayanFuerte = 0;
    int indexFuerte = 0, indexDebil = 0;
    boolean finPregunta = false;
    while (!finPregunta) {
      System.out.println("De quien quieres saber su poder");
      for (int i = 0; i < nomSayan.length; i++) {
        System.out.println(i + ": " + nomSayan[i]);
      }
      System.out.println("10: Para salir");
      usrInt = usrInput.nextInt();
      if (usrInt < nomSayan.length && usrInt >= 0) {
        System.out.println("El poder de " + nomSayan[usrInt] + " " + poderSayan[usrInt]);
      } else if (usrInt == 10) {
        finPregunta = true;
      } else {
        System.out.println("No tengo información para ese Sayan");
      }
    }
    for (int i = 0; i < nomSayan.length; i++) {
      if (sayanDebil > poderSayan[i]) {
        sayanDebil = poderSayan[i];
        indexDebil = i;
      }
      if (sayanFuerte < poderSayan[i]) {
        sayanFuerte = poderSayan[i];
        indexFuerte = i;
      }
    }
    System.out
        .println("El sayan más fuerte es: " + nomSayan[indexFuerte] + " con " + poderSayan[indexFuerte] + " de poder");
    System.out
        .println("El sayan más debil es: " + nomSayan[indexDebil] + " con " + poderSayan[indexDebil] + " de poder");
    usrInput.close();
  }
}
