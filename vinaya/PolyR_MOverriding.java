package vinaya;
class Animal1{
	void sound() {
		System.out.println("animal makes sound");
	}
}
class Dog11 extends Animal1{
	void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal1{
	void sound() {
		System.out.println("Cat meows");
	}
}

public class PolyR_MOverriding {
	public static void main(String[] args) {
		Animal1 an=new Dog11();
		an.sound();
	}
}
