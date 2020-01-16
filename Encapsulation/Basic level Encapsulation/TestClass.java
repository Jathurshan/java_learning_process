public class TestClass{
	public static void main(String [] args){
		Student student = new Student();
		
		student.setName("chin chan");
		student.setStudentId("003");
		student.setAge(10);
		
		System.out.println("Name: " + student.getName());
		System.out.println("StudentId: " + student.getStudentId());
		System.out.println("Age: " + student.getAge());
	}
}