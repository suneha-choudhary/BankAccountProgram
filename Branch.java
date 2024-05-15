// 1. Class and Object
class Animal {
    private String name;
    private int age;
  
    public Animal(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public void makeSound() {
      System.out.println("Generic animal sound");
    }
  
    // Getters for encapsulation
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  }
  
  class Dog extends Animal {  // 2. Inheritance
    public Dog(String name, int age){
      super(name, age);  // Call superclass constructor
    }
  
    @Override  // 3. Polymorphism (method overriding)
    public void makeSound() {
      System.out.println("Woof!");
    }
  }

public class Branch {
    public static void main(String[] args) {
        // 4. Encapsulation (using getters)
    Animal animal = new Animal("Pluto", 1);
    System.out.println("Animal name: " + animal.getName() +" "+"Animal age: " + animal.getAge());

    Dog dog = new Dog("Fido", 2);
    System.out.println("Dog name: " + dog.getName() +" "+"Dog age: " + dog.getAge());
    dog.makeSound();  // Polymorphism in action
    }
}
