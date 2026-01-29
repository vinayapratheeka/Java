package Usecases;
class Vehicle {
    String brand;
    double price;
    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void display() {
        System.out.println(brand + " " + price);
    }
}
class Car1 extends Vehicle {
    Car1(String brand, double price) {
        super(brand, price);
    }
    void display() {
        super.display();
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    Bike(String brand, double price) {
        super(brand, price);
    }
    void display() {
        super.display();
        System.out.println("This is a Bike");
    }
}
class Truck extends Vehicle {
    Truck(String brand, double price) {
        super(brand, price);
    }
    void display() {
        super.display();
        System.out.println("This is a Truck");
    }
}

public class VehicleInh {
    public static void main(String[] args) {
        Vehicle v1 = new Car1("Honda", 1200000);
        Vehicle v2 = new Bike("Yamaha", 150000);
        Vehicle v3 = new Truck("Tata", 2500000);

        v1.display();
        v2.display();
        v3.display();
    }
}

