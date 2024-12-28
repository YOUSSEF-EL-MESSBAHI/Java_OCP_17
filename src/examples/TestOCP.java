package examples;

public class TestOCP {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Animal anotherAnimal = new Cat();
        myAnimal.sound();
        anotherAnimal.sound();
    }
}
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}



