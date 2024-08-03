package theory;

public class Flow {
  public static void main(String[] args) {

    System.out.println("Hello World");

    // switch for calculating leap year
    int year = 2020;
    switch (year % 4) {
      case 0:
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            System.out.println("Leap year");
          } else {
            System.out.println("Not a leap year");
          }
        } else {
          System.out.println("Leap year");
        }
        break;
      default:
        System.out.println("Not a leap year");
    }

    // ternary operator for voting eligibility
    int age = 20;
    String result = (age >= 18) ? "Eligible for voting" : "Not eligible for voting";
    System.out.println(result);

  }

}
