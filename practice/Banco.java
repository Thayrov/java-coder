package practice;

class Titular {
  private String nombre;
  private String dni;

  public Titular(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Titular: " + nombre + ", DNI: " + dni;
  }
}

abstract class Cuenta {
  protected Titular titular;
  protected double saldo;

  public Cuenta(Titular titular, double saldoInicial) {
    this.titular = titular;
    this.saldo = saldoInicial;
  }

  public abstract boolean puedeExtraer(double monto);

  public void depositar(double monto) {
    saldo += monto;
  }

  public void mostrar() {
    System.out.println(titular);
    System.out.println("Saldo actual: " + saldo);
  }
}

class CajaDeAhorro extends Cuenta {
  private static final int LIMITE_INTENTOS = 3;
  private int intentosDeRetiro;
  private double limiteDiario;

  public CajaDeAhorro(Titular titular, double saldoInicial, double limiteDiario) {
    super(titular, saldoInicial);
    this.limiteDiario = limiteDiario;
    this.intentosDeRetiro = 0;
  }

  @Override
  public boolean puedeExtraer(double monto) {
    if (intentosDeRetiro >= LIMITE_INTENTOS) {
      System.out.println("Has alcanzado el límite de intentos de retiro diarios.");
      return false;
    }
    if (monto > saldo) {
      System.out.println("Saldo insuficiente.");
      return false;
    }
    if (monto > limiteDiario) {
      System.out.println("No puedes retirar más del límite diario.");
      return false;
    }
    saldo -= monto;
    intentosDeRetiro++;
    return true;
  }

  @Override
  public void mostrar() {
    super.mostrar();
    System.out.println("Límite de intentos diarios: " + LIMITE_INTENTOS);
    System.out.println("Límite diario de retiro: " + limiteDiario);
  }
}

class CuentaCorriente extends Cuenta {
  private double limiteDescubierto;

  public CuentaCorriente(Titular titular, double saldoInicial, double limiteDescubierto) {
    super(titular, saldoInicial);
    this.limiteDescubierto = limiteDescubierto;
  }

  @Override
  public boolean puedeExtraer(double monto) {
    if (saldo + limiteDescubierto >= monto) {
      saldo -= monto;
      return true;
    } else {
      System.out.println("No se puede retirar más allá del límite de descubierto.");
      return false;
    }
  }

  @Override
  public void mostrar() {
    super.mostrar();
    System.out.println("Límite de descubierto: " + limiteDescubierto);
  }
}

public class Banco {
  public static void main(String[] args) {
    Titular titular1 = new Titular("Juan Perez", "12345678");
    Titular titular2 = new Titular("Maria Lopez", "87654321");

    CajaDeAhorro cajaAhorro = new CajaDeAhorro(titular1, 1000, 500);
    CuentaCorriente cuentaCorriente = new CuentaCorriente(titular2, 2000, 1000);

    cajaAhorro.mostrar();
    cajaAhorro.puedeExtraer(200);
    cajaAhorro.puedeExtraer(300);
    cajaAhorro.puedeExtraer(100);
    cajaAhorro.puedeExtraer(50);
    cajaAhorro.mostrar();

    cuentaCorriente.mostrar();
    cuentaCorriente.puedeExtraer(2500);
    cuentaCorriente.mostrar();
  }
}
