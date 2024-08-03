package practice;

public class Iterators {

  public static void main(String[] args) {

    /*
     * Generar un programa que cree una lista, se complete con 10 números aleatorios
     * y la recorra hasta el final o hasta que encuentre un número múltiplo de 3.
     * Se recomienda utilizar los temas vistos en las clases pasadas sobre datos
     * aleatorios y operadores aritméticos.
     */
    java.util.List<Integer> numbers = new java.util.ArrayList<>();
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < 10; i++) {
      numbers.add(random.nextInt(100));
    }
    for (int number : numbers) {
      System.out.println(number);
      if (number % 3 == 0) {
        break;
      }
    }
  }
}
