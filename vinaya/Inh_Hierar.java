package vinaya;

class Vehicle1{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle1{
	void speed() {
		System.out.println("Bike speed is 80");
	}
}
class Car1 extends Vehicle1{
	void start() {
		System.out.println("Car starts with key");
	}
}

public class Inh_Hierar {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		b.speed();
		
		Car1 c = new Car1();
		c.run();
		c.start();
	}
}
