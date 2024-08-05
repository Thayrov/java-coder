package theory;

class Animal {

  private String name;
  private int age;
  private String color;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String makeSound() {
    return "Some sound";
  }
}

class Dog extends Animal {

  private String breed;

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String makeSound() {
    return "Bark";
  }
}

class Cat extends Animal {
  private boolean isCute;

  public boolean isCute() {
    return isCute;
  }

  public void setCute(boolean isCute) {
    this.isCute = isCute;
  }

  @Override
  public String makeSound() {
    return "Meow";
  }
}

class Cow extends Animal {

  private boolean isMilkable;

  public boolean isMilkable() {
    return isMilkable;
  }

  public void setMilkable(boolean isMilkable) {
    this.isMilkable = isMilkable;
  }

  @Override
  public String makeSound() {
    return "Moo";
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal cow = new Cow();

    System.out.println("Dog sound: " + dog.makeSound());
    System.out.println("Cat sound: " + cat.makeSound());
    System.out.println("Cow sound: " + cow.makeSound());

    Dog dog1 = new Dog();
    dog1.setName("Firulais");
    dog1.setAge(3);
    dog1.setColor("Brown");
    dog1.setBreed("Labrador");

    Dog dog2 = new Dog();
    dog2.setName("Firulais");
    dog2.setAge(3);
    dog2.setColor("Brown");
    dog2.setBreed("Labrador");

    System.out.println("Dog1 equals Dog2: " + dog1.equals(dog2));
    System.out.println("Dog1 hashcode: " + dog1.hashCode());
    System.out.println("Dog2 hashcode: " + dog2.hashCode());
  }

}
