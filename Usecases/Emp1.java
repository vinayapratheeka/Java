package Usecases;
class Emp{
	int id;
	String name;
	double salary;
	public Emp(int id,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
class Developer extends Emp{
	public Developer(int id, String name, double salary) {
		super(id, name, salary);
	}
	
	
	void display() {
		super.display();
        System.out.println("I'm a Developer");
    }
}
class Manager extends Emp{
	public Manager (int id, String name, double salary) {
		super(id, name, salary);
	}
	void display() {
		super.display();
        System.out.println("I'm a Manager");
    }
}		
public class Emp1 {
	public static void main(String[] args) {
		
	Emp e1 = new Developer(111,"Vinaya",25000);
		Emp e2 = new Manager(222,"Pratheeka",50000);
		e1.display();
		e2.display();
	}
}
