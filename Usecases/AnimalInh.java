package Usecases;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Animal Name: " + name);
    }
}
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }
    void display() {
        super.display();
        System.out.println("It is a Bird");
    }
}
class Mammal extends Animal {
    Mammal(String name) {
        super(name);
    }
    void display() {
        super.display();
        System.out.println("It is a Mammal");
    }
}

class Reptile extends Animal {
    Reptile(String name) {
        super(name);
    }
    void display() {
        super.display();
        System.out.println("It is a Reptile");
    }
}

public class AnimalInh {
    public static void main(String[] args) {
        Animal a1 = new Bird("Parrot");
        Animal a2 = new Mammal("Dog");
        Animal a3 = new Reptile("Snake");

        a1.display();
        a2.display();
        a3.display();
    }
}

