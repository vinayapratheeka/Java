package vinaya;
class Parent{
	Parent(){
		System.out.println("Parent Class Constructor");
	}
}
public class Child extends Parent {
	Child(){
		super();
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		Child c = new Child();
	}
}
