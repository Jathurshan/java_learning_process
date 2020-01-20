public class Students {
	private String name;
	private int mark;
	private int age;

	public Students(String name, int mark, int age) {
		this.name = name;
		this.mark = mark;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}
	
	

}
