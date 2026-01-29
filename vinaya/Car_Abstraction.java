package vinaya;

abstract class Vehicle{
	abstract void start();
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car starts with key");
	}
}

public class Car_Abstraction {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
	}
}
