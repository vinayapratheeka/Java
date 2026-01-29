package vinaya;

public class Strings {

	public static void main(String[] args) {
		String s1="Hello";
		s1.concat("World");
		System.out.println(s1);
		
		StringBuffer sb= new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Hello");
		sb1.append("World");
		System.out.println(sb1);

	}

}
