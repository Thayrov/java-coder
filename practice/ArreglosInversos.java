package practice;

public class ArreglosInversos {
  public static void main(String[] args) {
    // Definir los arreglos a comparar
    int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

    // Variable para controlar si son inversamente iguales
    boolean sonInversamenteIguales = true;

    // Comprobar si ambos arreglos tienen la misma longitud
    if (arr1.length != arr2.length) {
      sonInversamenteIguales = false;
    } else {
      // Iterar sobre los arreglos y comparar los elementos
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[arr2.length - 1 - i]) {
          sonInversamenteIguales = false;
          break;
        }
      }
    }

    // Mostrar el resultado
    if (sonInversamenteIguales) {
      System.out.println("Ambos arreglos son inversamente iguales.");
    } else {
      System.out.println("Los arreglos no son inversamente iguales.");
    }
  }
}
