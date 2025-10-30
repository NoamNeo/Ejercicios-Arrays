import java.util.Scanner;

public class CapturaPokemon {
  public static void main(String[] args) {
    String[] listaPokemon = new String[5];
    Scanner usrInput = new Scanner(System.in);
    for (int i = 0; i < listaPokemon.length; i++) {
      System.out.println("Escribe el nombre de tu pokemon nº " + (i + 1));
      listaPokemon[i] = usrInput.nextLine();
      System.out.println();
    }
    System.out.println("Ahora vamos a imprimir tu lista en orden inverso");
    System.out.println();
    for (int i = listaPokemon.length - 1; i >= 0; i--) {
      System.out.println("Tu pokemon número " + (i + 1) + " " + listaPokemon[i]);
    }
    usrInput.close();
  }
}
