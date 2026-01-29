package vinaya;

public class Emp_encap {
	private int salary;
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Emp_encap e=new Emp_encap();
		e.setSalary(50000);
		System.out.println(e.getSalary());
	}
}
