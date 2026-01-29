package Collections;
import java.util.HashMap;
import java.util.Map;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> Employee = new HashMap<>();
		//HashMap<Integer, String> Employee1 = new HashMap();
		
		Employee.put(101,"Vinaya");
		Employee.put(102,"Pratheeka");
		Employee.put(103,"Surya");
		Employee.put(103,"Santhu");
		System.out.println(Employee);
		//Employee.clear();
		//System.out.println(Employee);
		//System.out.println(Employee.compute(null, null));
		//System.out.println(Employee.computeIfAbsent(null, null));
		//System.out.println(Employee.computeIfPresent(null, null));
		System.out.println(Employee.containsKey(101));
		System.out.println(Employee.containsValue("Surya"));
		System.out.println(Employee.containsValue("Sita"));
		System.out.println(Employee.equals(Employee));
		System.out.println(Employee.get(103));
		System.out.println(Employee.getOrDefault(101,null));
		System.out.println(Employee.hashCode());
		System.out.println(Employee.isEmpty());
		//System.out.println(Employee.merge(null, null, null));
		//System.out.println(Employee.);
	}

}
