package practice;

import java.util.Scanner;

public class ArreglosMatematicos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar la longitud de los arreglos
    System.out.print("Ingrese la longitud de los arreglos: ");
    int longitud = scanner.nextInt();

    // Crear los arreglos
    int[] arr1 = new int[longitud];
    int[] arr2 = new int[longitud];

    // Cargar manualmente los arreglos
    System.out.println("Ingrese los elementos para el primer arreglo:");
    for (int i = 0; i < longitud; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arr1[i] = scanner.nextInt();
    }

    System.out.println("Ingrese los elementos para el segundo arreglo:");
    for (int i = 0; i < longitud; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arr2[i] = scanner.nextInt();
    }

    // Calcular la sumatoria de los elementos en cada arreglo
    int sumaArr1 = 0, sumaArr2 = 0;
    for (int i = 0; i < longitud; i++) {
      sumaArr1 += arr1[i];
      sumaArr2 += arr2[i];
    }

    // Mostrar las sumatorias
    System.out.println("Sumatoria del primer arreglo: " + sumaArr1);
    System.out.println("Sumatoria del segundo arreglo: " + sumaArr2);

    // Encontrar el mayor y menor número entre ambos arreglos
    int mayor = arr1[0], menor = arr1[0];

    for (int i = 0; i < longitud; i++) {
      if (arr1[i] > mayor) {
        mayor = arr1[i];
      }
      if (arr2[i] > mayor) {
        mayor = arr2[i];
      }
      if (arr1[i] < menor) {
        menor = arr1[i];
      }
      if (arr2[i] < menor) {
        menor = arr2[i];
      }
    }

    // Mostrar el mayor y el menor número
    System.out.println("El mayor número entre ambos arreglos es: " + mayor);
    System.out.println("El menor número entre ambos arreglos es: " + menor);

    // Cerrar el escáner
    scanner.close();
  }
}
