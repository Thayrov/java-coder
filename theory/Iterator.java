package theory;

public class Iterator {
  public static void main(String[] args) {

    java.util.List<String> names = new java.util.ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // use a for loop to add a last name to each name of the list
    for (int i = 0; i < names.size(); i++) {
      names.set(i, names.get(i) + " Smith");
    }

    // use an iterator to print each element and remove last element
    java.util.Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      iterator.remove();
    }

    // do a counter and use while loop to increase the counter and print it
    int counter = 0;
    while (counter < 5) {
      System.out.println(counter);
      counter++;
    }

    // do while example of the creation of a console menu waiting for the user to
    // input 0

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int option;
    do {
      System.out.println("1. Option 1");
      System.out.println("2. Option 2");
      System.out.println("0. Exit");
      option = scanner.nextInt();
    } while (option != 0);
    scanner.close();

  }
}
