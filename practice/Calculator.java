package practice;

public class Calculator {

  // Method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // Method to add three integers
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Method to add two doubles
  public double add(double a, double b) {
    return a + b;
  }

  // Method to add an integer and a double
  public double add(int a, double b) {
    return a + b;
  }

  // Method to add a double and an integer
  public double add(double a, int b) {
    return a + b;
  }

  // Method to add two doubles and an integer
  public double add(double a, double b, int c) {
    return a + b + c;
  }

  // Method to add an integer and two doubles
  public double add(int a, double b, double c) {
    return a + b + c;
  }

  // Main method to test the calculator
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    // Testing different add methods
    System.out.println("Sum of two integers: " + calc.add(5, 10));
    System.out.println("Sum of three integers: " + calc.add(1, 2, 3));
    System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    System.out.println("Sum of an integer and a double: " + calc.add(5, 10.5));
    System.out.println("Sum of a double and an integer: " + calc.add(5.5, 10));
    System.out.println("Sum of two doubles and an integer: " + calc.add(1.1, 2.2, 3));
    System.out.println("Sum of an integer and two doubles: " + calc.add(1, 2.2, 3.3));
  }
}
