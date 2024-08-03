package practice;

public class Conditions {
  /*
   * ¿Qué número de mes es?
   * 
   * Generar un programa que retorne por consola el número del mes a partir del
   * nombre del mes que se pasa cómo parámetro.
   * El objetivo es que los alumnos puedan desarrollar la solución usando los
   * condicionales if y switch.
   *
   * Ejemplo: Si se pasa enero cómo nombre el programa debe devolver 1
   */
  public static void main(String[] args) {
    String month = "agosto";
    int monthNumber = 0;
    switch (month) {
      case "enero":
        monthNumber = 1;
        break;
      case "febrero":
        monthNumber = 2;
        break;
      case "marzo":
        monthNumber = 3;
        break;
      case "abril":
        monthNumber = 4;
        break;
      case "mayo":
        monthNumber = 5;
        break;
      case "junio":
        monthNumber = 6;
        break;
      case "julio":
        monthNumber = 7;
        break;
      case "agosto":
        monthNumber = 8;
        break;
      case "septiembre":
        monthNumber = 9;
        break;
      case "octubre":
        monthNumber = 10;
        break;
      case "noviembre":
        monthNumber = 11;
        break;
      case "diciembre":
        monthNumber = 12;
        break;
      default:
        System.out.println("Mes no válido");
        break;
    }
    System.out.println(monthNumber);

    month = "marzo";
    if (month == "enero") {
      monthNumber = 1;
    } else if (month == "febrero") {
      monthNumber = 2;
    } else if (month == "marzo") {
      monthNumber = 3;
    } else if (month == "abril") {
      monthNumber = 4;
    } else if (month == "mayo") {
      monthNumber = 5;
    } else if (month == "junio") {
      monthNumber = 6;
    } else if (month == "julio") {
      monthNumber = 7;
    } else if (month == "agosto") {
      monthNumber = 8;
    } else if (month == "septiembre") {
      monthNumber = 9;
    } else if (month == "octubre") {
      monthNumber = 10;
    } else if (month == "noviembre") {
      monthNumber = 11;
    } else if (month == "diciembre") {
      monthNumber = 12;
    } else {
      System.out.println("Mes no válido");
    }
    System.out.println(monthNumber);
  }

}
