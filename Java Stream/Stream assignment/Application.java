import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();
		student.add(new Student("david", 75));
		student.add(new Student("james", 60));
		student.add(new Student("gemini", 45));
		student.add(new Student("chirs", 26));
		student.add(new Student("tony", 99));
		student.add(new Student("micheal", 79));
		student.add(new Student("bigil", 96));
		student.add(new Student("devdas", 87));
		student.add(new Student("amith", 59));
		student.add(new Student("jackson", 61));

		List<Student> mapList = student.stream().map(e -> new Student("Mr." + e.getName(), e.getMark()))
				.filter(e -> e.getMark() > 60).sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

		System.out.println(mapList);

	}
}
