import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("james", 80));
		list.add(new Employee("liyano", 95));
		list.add(new Employee("mitchel", 75));
		
		Collections.sort(list, new EmployeeRanlk());
		
		System.out.println(list);
	}
}
