package vinaya;
interface calculator{
	static void add(int a,int b) {
		System.out.println(a+b);
	}
}
public class static_de {
	public static void main(String[] args) {
		calculator.add(10,20);// can be called with interface name without object
	}

}
