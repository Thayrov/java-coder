package theory;

public class Arrays {
  public static void main(String[] args) {
    // iterate a number array and print each element in a for each loop
    int[] numbers = { 1, 2, 3, 4, 5 };

    for (int number : numbers) {
      System.out.println(number);
    }

    // print the array
    System.out.println(numbers);

    // create an empty ArrayList
    java.util.List<String> names = new java.util.ArrayList<>();

    // add elements to the ArrayList
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // print the ArrayList
    System.out.println(names);

    // iterate the ArrayList and print each element in a for each loop
    for (String name : names) {
      System.out.println(name);
    }

    // print the size of the ArrayList
    System.out.println(names.size());

    // print the first element of the ArrayList
    System.out.println(names.get(0));

    // delete the first element of the ArrayList and print the size of the ArrayList
    names.remove(0);
    System.out.println(names.size());

    // check if the ArrayList contains an element
    System.out.println(names.contains("Alice"));

    // use set to change the second element of the ArrayList
    names.set(1, "David");
    System.out.println(names);

    // use continsAll to check if the ArrayList contains all elements of another
    // collection
    java.util.List<String> otherNames = new java.util.ArrayList<>();
    otherNames.add("Bob");
    otherNames.add("David");
    System.out.println(names.containsAll(otherNames));

    // create a new ArrayList with the same elements as the first ArrayList using
    // addAll
    java.util.List<String> newNames = new java.util.ArrayList<>();
    newNames.addAll(names);
    System.out.println(newNames);

    // use removeAll to remove all elements of another collection from the ArrayList
    newNames.removeAll(otherNames);
    System.out.println(newNames);

    // use clear to remove all elements from the ArrayList
    otherNames.clear();
    System.out.println(otherNames);

    // use retainAll to remove all elements from the ArrayList that are not in
    // another collection
    java.util.List<String> otherNames2 = new java.util.ArrayList<>();
    otherNames2.add("David");
    otherNames2.add("Eve");

    System.out.println(otherNames2);

    names.retainAll(otherNames2);
    System.out.println(names);

    // print the index of an element in the ArrayList
    System.out.println(names.indexOf("David"));

    // repeat a name and find last index
    names.add("David");
    System.out.println(names.lastIndexOf("David"));

  }
}
