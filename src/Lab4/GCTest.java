package Lab4;

class Student {
	private int id;
	private String name;
	private String course;
	
	Student () {
		
	}
	Student(int id, String name, String course){
		this.id = id;
		this.name = name;
		this.course = course;
		System.out.println("Student Constructor()");
	}
	
	protected void finalize() {
		System.out.println("Delete Student class");
	}
}

public class GCTest {
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Alice", "CS");
		System.out.println(student1.getClass().getSuperclass());
		student1 = null;
		System.gc();		
	}

}
