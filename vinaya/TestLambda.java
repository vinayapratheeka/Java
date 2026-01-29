package vinaya;
interface Drawable{
	void draw();
}
public class TestLambda {
	public static void main(String[] args) {
	/*	Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing");
			}
		};
		d.draw();
	}
}*/
		Drawable d =()->{
			System.out.println("Drawing");
		};
		d.draw();
	}
}
		
