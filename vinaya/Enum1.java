package vinaya;
enum Status
{
	SUCCESS(200),
	ERROR(500);
	private final int code;
	Status(int code)
	{
		this.code=code;
	}
	public int getCode() //why not set bcoz already set in enum constant values
	{
		return code;
	}
}

public class Enum1 {
	public static void main(String[] args) {
		Status status = Status.SUCCESS;
		System.out.println(status);
		System.out.println(status.getCode());
	}
}
