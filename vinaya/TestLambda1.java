package vinaya;
//interface add{
//	int sum(int a,int b);
//}
interface message{
	void show(String msg);
}
public class TestLambda1 {
	public static void main(String[] args) {
		//add a =(x,y)->x+y;
		//System.out.println(a.sum(10, 20));
		message m =(msg) -> {
			System.out.println("Message is:");
			System.out.println(msg);
		};
		m.show("Welcome to java");
	}
}
