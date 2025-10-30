public class PuntuacionesDeJuego {
  public static void main(String[] args) {
    int[] puntuaciones = { 1234, 125423, 12356, 981234, 92836, 82345 }; // La puntuación más grande es: 981234
    int total = 0, max = 0;
    float media;
    for (int i = 0; i < puntuaciones.length; i++) {
      total = total + puntuaciones[i];
      if (max < puntuaciones[i]) {
        max = puntuaciones[i];
      }
    }
    media = (float) total / puntuaciones.length;
    System.out.println("Puntuación total: " + total);
    System.out.println("Media: " + media);
    System.out.println("Puntuación máxima: " + max);
  }
}
