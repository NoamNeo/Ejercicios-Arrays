public class ObjetosMinecraft {
  public void main(String[] args) {
    String[] inventario = { "Bloques de piedra", "Espada", "Pico", "Hacha", "Manzana Dorada" };
    for (int i = 0; i < inventario.length; i++) {
      System.out.println("Tienes en tu inventario: " + inventario[i]);
    }
    System.out.println("Tienes en total " + inventario.length + " objetos");
  }
}
