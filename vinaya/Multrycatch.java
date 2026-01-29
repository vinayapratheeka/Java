package vinaya;

public class Multrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = {10,20,30};
				int res = arr[1]/0;
				System.out.println(res);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}
		catch(Exception e) {
			System.out.println("Generic Exception");
		}

	}

}
