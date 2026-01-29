package vinaya;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Program Continues");
	}

}
