package vinaya;
class animal1{
	
}
class Dogs extends animal1{
	
}
public class TestInstanceof {
	public static void main(String[] args) {
		Dogs d = new Dogs();
		System.out.println(d instanceof Dogs);
		System.out.println(d instanceof animal1);
	}
}
