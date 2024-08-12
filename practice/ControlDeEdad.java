package practice;

import java.util.Scanner;

public class ControlDeEdad {
  public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese su edad
    System.out.print("Por favor, ingrese su edad: ");
    int edad = scanner.nextInt();

    // Determinar si es mayor de edad o menor de edad
    if (edad >= 18) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }

    // Cerrar el escáner
    scanner.close();
  }
}
