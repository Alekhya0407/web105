package SubAbstract;
abstract class Animal {
  abstract void makeSound();

  public void eat() {
    System.out.println("I can eat.");
  }
}

class Dog extends Animal {

  // provide implementation of abstract method
  @Override
  public void makeSound() {
    System.out.println("Bark bark");
  }
}
public class SubAbstract {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
    
}
