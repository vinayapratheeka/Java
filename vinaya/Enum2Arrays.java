package vinaya;
enum Day
{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enum2Arrays
{
	public static void main(String[] args) 
	{
		Day[] allDays=Day.values();
		System.out.println("All Days of the Week:");
		for(Day d: allDays)
		{
			System.out.println(d);
			//Day[] WorkingDays=new Day[5];
			//WorkingDays[0]= Day.MONDAY;
		}
	}
}
