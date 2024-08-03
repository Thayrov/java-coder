package practice;

public class DataTypes {
  /*
   * Crear un método main que permita mostrar la parte entera y separado la parte
   * decimal de un tipo de dato float y muestre el resultado en consola.
   */

  public static void main(String[] args) {
    float number = 123.456f;
    int integerPart = (int) number;
    float decimalPart = number - integerPart;
    System.out.println("Parte entera: " + integerPart);
    System.out.println("Parte decimal: " + decimalPart);

  }
}
