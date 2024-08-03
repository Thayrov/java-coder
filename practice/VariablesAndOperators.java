package practice;

public class VariablesAndOperators {

  public static void main(String[] args) {
    /*
     * Generar un programa que retorne por consola el monto total que se pagará al
     * banco.
     * El monto total es Capital Solicitado + intereses a pagar.
     * La fórmula para calcular "cuánto interés se pagará" por un préstamo pedido al
     * banco es:
     * Interés a pagar = Capital solicitado x Interés x periodo en meses
     * 
     */
    double capitalSolicitado = 1000;
    double interes = 0.1;
    int periodoEnMeses = 12;
    double interesAPagar = capitalSolicitado * interes * periodoEnMeses;
    double montoTotal = capitalSolicitado + interesAPagar;
    System.out.println(montoTotal);
  }
}
