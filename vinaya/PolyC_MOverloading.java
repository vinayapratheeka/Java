package vinaya;

public class PolyC_MOverloading {
	int add(int a, int b) {
		return a+b;
	}
	double add(Double a, double b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		PolyC_MOverloading e = new PolyC_MOverloading();
		System.out.println(e.add(2, 3));
		System.out.println(e.add(2.5, 3.5));
		System.out.println(e.add(2, 3,6));

	}

}
