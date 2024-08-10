package theory;

public interface Interfaces {

  // Interface acting as a contract for all animals
  interface Animal {
    void eat();

    void sleep();

    double getWeight();

    // Default method to demonstrate common behavior
    default void breathe() {
      System.out.println("Breathing...");
    }

    // Static method to describe the interface
    static void describe() {
      System.out.println("All animals need to eat, sleep, and breathe.");
    }
  }

  // Custom exception for invalid weight
  class InvalidWeightException extends Exception {
    public InvalidWeightException(String message) {
      super(message);
    }
  }

  // Abstract class Mammal providing a common structure for mammals
  abstract class Mammal implements Animal {
    String name;
    int age;
    double weight;

    // Constructor
    public Mammal(String name, int age, double weight) throws InvalidWeightException {
      this.name = name;
      this.age = age;
      setWeight(weight);
    }

    // Method to set weight with validation
    public void setWeight(double weight) throws InvalidWeightException {
      if (weight <= 0) {
        throw new InvalidWeightException("Weight must be positive.");
      }
      this.weight = weight;
    }

    // Abstract method that must be implemented by subclasses
    abstract void makeSound();

    // Common method for all mammals
    public void sleep() {
      System.out.println(name + " is sleeping");
    }

    // Implementation of getWeight from Animal interface
    @Override
    public double getWeight() {
      return weight;
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
  }

  // Dog class extending the Mammal abstract class
  class Dog extends Mammal {
    final String species = "Canis lupus familiaris"; // Constant species name

    // Constructor for Dog
    public Dog(String name, int age, double weight) throws InvalidWeightException {
      super(name, age, weight);
    }

    @Override
    public void eat() {
      System.out.println(name + " is eating");
    }

    @Override
    void makeSound() {
      System.out.println(name + " says: Woof!");
    }
  }

  // Cat class extending the Mammal abstract class
  class Cat extends Mammal {
    final String species = "Felis catus"; // Constant species name

    // Constructor for Cat
    public Cat(String name, int age, double weight) throws InvalidWeightException {
      super(name, age, weight);
    }

    @Override
    public void eat() {
      System.out.println(name + " is eating");
    }

    @Override
    void makeSound() {
      System.out.println(name + " says: Meow!");
    }
  }

  // Turtle class implementing the Animal interface directly
  class Turtle implements Animal {
    String name;
    int age;
    double weight;

    // Constructor for Turtle
    public Turtle(String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
    }

    // Implementing the eat method from Animal interface
    @Override
    public void eat() {
      System.out.println(name + " is eating");
    }

    // Implementing the sleep method from Animal interface
    @Override
    public void sleep() {
      System.out.println(name + " is sleeping");
    }

    // Implementing the getWeight method from Animal interface
    @Override
    public double getWeight() {
      return weight;
    }

    @Override
    public String toString() {
      return "Turtle{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }

    // Turtle specific method
    public void swim() {
      System.out.println(name + " is swimming");
    }
  }

  // Puppy class as a subclass of Dog
  class Puppy extends Dog {
    String favoriteToy;

    // Constructor for Puppy
    public Puppy(String name, int age, double weight, String favoriteToy) throws InvalidWeightException {
      super(name, age, weight); // Call the constructor of Dog
      this.favoriteToy = favoriteToy;
    }

    public void play() {
      System.out.println(name + " is playing with " + favoriteToy);
    }

    @Override
    public String toString() {
      return "Puppy{name='" + name + "', age=" + age + ", weight=" + weight + "', favoriteToy='" + favoriteToy + "'}";
    }
  }

  // Kitten class as a subclass of Cat
  class Kitten extends Cat {
    String favoriteToy;

    // Constructor for Kitten
    public Kitten(String name, int age, double weight, String favoriteToy) throws InvalidWeightException {
      super(name, age, weight); // Call the constructor of Cat
      this.favoriteToy = favoriteToy;
    }

    public void play() {
      System.out.println(name + " is playing with " + favoriteToy);
    }

    @Override
    public String toString() {
      return "Kitten{name='" + name + "', age=" + age + ", weight=" + weight + "', favoriteToy='" + favoriteToy + "'}";
    }
  }

  // Main method to demonstrate the concepts
  public static void main(String[] args) {
    try {
      // Describe the interface using a static method
      Animal.describe();

      // Create instances of Dog, Cat, and Turtle
      Dog dog = new Dog("Rex", 5, 20.5);
      Cat cat = new Cat("Whiskers", 3, 4.8);
      Turtle turtle = new Turtle("Leo", 100, 200.0); // Directly implementing the Animal interface

      // Use polymorphism to handle different animals
      Animal myDog = dog;
      Animal myCat = cat;
      Animal myTurtle = turtle;

      // Call methods on the Dog, Cat, and Turtle instances
      myDog.eat();
      myCat.eat();
      myTurtle.eat();
      myDog.breathe(); // Default method
      myCat.breathe();
      myTurtle.breathe();

      // Demonstrate abstract class feature: making sound
      dog.makeSound();
      cat.makeSound();
      // Turtle doesn't have makeSound because it's not a Mammal

      // Print the details using the overridden toString method
      print(dog);
      print(cat);
      print(turtle);

      // Turtle specific method
      turtle.swim();

      // Create instances of Puppy and Kitten
      Dog puppy = new Puppy("Buddy", 1, 8.3, "rubber bone");
      Kitten kitten = new Kitten("Mittens", 2, 2.3, "ball of yarn");

      // Call methods on Puppy and Kitten
      puppy.eat();
      puppy.sleep();
      print(puppy);
      ((Puppy) puppy).play(); // Downcast to access play() method

      kitten.eat();
      kitten.sleep();
      print(kitten);
      kitten.play();

      // Demonstrate an array of Animal objects
      Animal[] animals = { dog, cat, puppy, kitten, turtle };
      for (Animal animal : animals) {
        print(animal);
        System.out.println("Weight: " + animal.getWeight() + " kg");
      }

      kitten.setWeight(-1); // Throws an exception

    } catch (InvalidWeightException e) {
      System.out.println("A custom error: " + e.getMessage());
    }
  }

  // Overloaded print methods
  public static void print(Dog dog) {
    System.out.println("Printing Dog: " + dog.toString());
  }

  public static void print(Cat cat) {
    System.out.println("Printing Cat: " + cat.toString());
  }

  public static void print(Animal animal) {
    System.out.println("Printing Animal: " + animal.toString());
  }

  public static void print(Turtle turtle) {
    System.out.println("Printing Turtle: " + turtle.toString());
  }

}
