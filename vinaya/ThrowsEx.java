package vinaya;

public class ThrowsEx {
		static void validateAge (int age) throws Exception{
			if(age< 18) {
				throw new Exception("Age must be 18 or above");
			}
			System.out.println("Valid age");
		}
public static void main(String[] args) {
	try {
		validateAge(16);
	}
	catch(Exception e) {
		System.out.println();
	}
}
		

}


