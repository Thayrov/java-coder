package theory;

public class Random {
  public static void main(String[] args) {
    // random prize generator from an array of prizzes using Math.random()
    String[] prizes = { "TV", "Car", "Bike", "Mobile", "Laptop" };
    int randomIndex = (int) (Math.random() * prizes.length);
    System.out.println("You have won a " + prizes[randomIndex]);

  }
}
