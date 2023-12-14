package Lab2;

class Employee {
	protected String name; 
	protected int age; 
	protected String phoneNumber; 
	protected String  address; 
	protected int salary;
	
	
	
	Employee(String name, int age, String phoneNumber, String address, int salary) {

		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		System.out.println("Employee::Employee()->Constructor");
	}
	
	public void printSalary() {
		System.out.println("Employee::printSalary()");
		System.out.println("Salsry = " + salary);
	}
}

class Officer extends Employee {
	
	String specialization;
	
	Officer(String name, int age, String phoneNumber, String address, 
			int salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		System.out.println("Officer::Officer() ->Constructor");
	}

	public void printSpecialization() {
		System.out.println("Employee::printSpecialization()");
		System.out.println("name = " + name);
		System.out.println("specialization = " + specialization);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		// create an officer
		Officer officer1 = new Officer("Alice", 40, "9880975544", 
										"Cochin", 50000, "WLAN");
		
		officer1.printSalary();
		//officer1.printSpecialization();
	}

}
