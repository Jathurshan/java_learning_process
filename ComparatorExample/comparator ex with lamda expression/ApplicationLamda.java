import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationLamda {

	public static void main(String[] args) {

		Comparator<Employee> employeeComparator = (e1,
				e2) -> (e1.getMark() > e2.getMark() ? +1 : (e1.getMark() < e2.getMark() ? -1 : 0));

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("james", 80));
		list.add(new Employee("liyano", 95));
		list.add(new Employee("mitchel", 75));
		
		Collections.sort(list, employeeComparator);
		System.out.println(list);
	}
}
