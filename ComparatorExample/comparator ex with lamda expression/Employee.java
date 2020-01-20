public class Employee {

	private String name;
	private int mark;

	public Employee(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "name=" + name + ", mark=" + mark;
	}

}
