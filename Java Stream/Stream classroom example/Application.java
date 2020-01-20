import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {

		List<Students> students = new ArrayList<>();
		students.add(new Students("tony", 99, 26));
		students.add(new Students("james", 85, 27));
		students.add(new Students("micheal", 89, 21));
		students.add(new Students("bigil", 96, 25));
		students.add(new Students("devdas", 87, 30));

		List<Students> results = students.stream().filter(e -> e.getName().contains("i")).collect(Collectors.toList());

		List<Students> result2 = students.stream().map(e -> new Students("Dr." + e.getName(), e.getMark(), e.getAge()))
				.collect(Collectors.toList());

		List<Students> result3 = students.stream().sorted(Comparator.comparing(Students::getName))
				.collect(Collectors.toList());

		List<Students> result4 = students.stream()
				.sorted((e1, e2) -> new Integer(e1.getName().length()).compareTo(e2.getName().length()))
				.collect(Collectors.toList());
		
		System.out.println(results);
		System.out.println();
		System.out.println(result2);
		System.out.println();
		System.out.println(result3);
		System.out.println();
		System.out.println(result4);
	}
}
