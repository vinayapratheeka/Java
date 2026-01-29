package vinaya;
interface A{
	void show();
}
interface B{
	void display();
}

public class Interface_Demo implements A,B {
	public void show() {
		System.out.println("Show Method");
	}
	public void display() {
		System.out.println("Display Method");
	}

	public static void main(String[] args) {
		Interface_Demo d = new Interface_Demo();
		d.show();
		d.display();
	}

}
