import java.util.Scanner;
import java.util.Random;

public class ArrayAleatorio {
  public static void main(String[] args) {
    int usrInt;
    Scanner usrInput = new Scanner(System.in);
    Random randInt = new Random();
    System.out.println("Escribe el tamaño (el número de números) dentro de un array");
    usrInt = usrInput.nextInt();
    float[] floatArray = new float[usrInt];
    for (int i = 0; i < floatArray.length; i++) {
      floatArray[i] = randInt.nextFloat(10);
    }
    for (int i = 0; i < floatArray.length; i++) {
      System.out.print("Posición " + i + ": ");
      System.out.printf("%.2f", floatArray[i]);
      System.out.println();
    }
    usrInput.close();
  }
}
