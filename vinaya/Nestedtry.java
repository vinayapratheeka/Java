package vinaya;

public class Nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a=10/0;
				System.out.println(a);
			}
			catch(ArithmeticException e){
				System.out.println("Inner catch : Division by zero Error");
			}
			int[] arr = {10,20,30};
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
				
			}

	}

}
