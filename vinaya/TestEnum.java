package vinaya;

public class TestEnum {
	public static void main(String[] args) {
		enum Day{
			Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
		}
		Day today = Day.Monday;
		System.out.println(today);

	}
}
