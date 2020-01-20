import java.util.Comparator;

public class EmployeeRanlk implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getMark() > e2.getMark())
			return +1;
		if (e1.getMark() < e2.getMark())
			return -1;
		return 0;
	}

}
