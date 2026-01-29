package vinaya;
class student{
	int rollNo;
	String name;
	static String college="IIT Delhi";
	student(int r,String n){
		rollNo=r;
		name=n;
	}
	void display() {
		System.out.println(rollNo+ " "+name+" "+college);
	}
}
public class TestStatic {

	public static void main(String[] args) {
		student s1=new student(1,"Vinaya");
		student s2=new student(1,"Vinaya");
		s1.display();
		s2.display();
	}
}
