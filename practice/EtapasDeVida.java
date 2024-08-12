package practice;

import java.util.Scanner;

public class EtapasDeVida {
  public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese su edad
    System.out.print("Por favor, ingrese su edad: ");
    int edad = scanner.nextInt();

    // Verificar si la edad es válida (no negativa)
    if (edad < 0) {
      System.out.println("La edad no puede ser negativa.");
    } else {
      // Determinar en qué etapa se encuentra la persona
      if (edad <= 2) {
        System.out.println("Etapa: Bebé");
      } else if (edad > 2 && edad <= 8) {
        System.out.println("Etapa: Niño");
      } else if (edad > 8 && edad <= 13) {
        System.out.println("Etapa: Preadolescente");
      } else if (edad > 13 && edad < 18) {
        System.out.println("Etapa: Adolescente");
      } else if (edad >= 18 && edad < 60) {
        System.out.println("Etapa: Adulto");
      } else if (edad >= 60) {
        System.out.println("Etapa: Adulto Mayor");
      }
    }

    // Cerrar el escáner
    scanner.close();
  }
}
