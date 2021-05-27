class Animal {

  public void display(){
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {

  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){
    display();
  }
}

class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.printMessage();
  }
}