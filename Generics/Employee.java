package Generics;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {}
	public void displayDetails(Employee emp1) {
		
		System.out.println(emp1.id+" "+emp1.name+" "+emp1.salary+" "+emp1.department);
		
	}

}
