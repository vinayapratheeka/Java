package vinaya;

public class trycatchfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=100/5;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Finally block always executes");
		}

	}

}
