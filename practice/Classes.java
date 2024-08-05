package practice;

public class Classes {

  /*
   * Crear una clase con un método main, en el cuerpo de este método imprimir el
   * valor de una variable entera.
   * Dentro de la misma clase crear un segundo método para incrementar allí la
   * variable anterior e invocarlo desde el método main y volver a imprimir el
   * valor.
   * Debe mostrarse el valor incrementado.
   * Importante: el segundo método no recibirá ni retorna valor.
   */

  private static int number;

  public static void main(String[] args) {
    number = 10;
    System.out.println("Initial value: " + number);
    incrementNumber();
    System.out.println("Incremented value: " + number);
  }

  public static void incrementNumber() {
    number++;
  }

}
