package Collections;


import java.util.TreeSet;

public class ThirdQues {

	public static void main(String[] args) {

		TreeSet<Employee> tr=new TreeSet<Employee>();

		Employee e1=new Employee(1,"Deepika","CSE",10000);
		Employee e2=new Employee(2,"Satish","MSC",20000);
		Employee e3=new Employee(3,"Naveen","MECH",20000);
		Employee e4=new Employee(4,"Chinnari","B-PharmC",5000);
		Employee e5=new Employee(5,"Sirisha","CSE",1000);
		Employee e6=new Employee(6,"Vidya","MBA",25000);
		Employee e7=new Employee(7,"Chandu","CSE",1000);
		Employee e8=new Employee(8,"Zubedha","CSE",1000);
		Employee e9=new Employee(9,"Bhargavi","EEE",10000);
		Employee e10=new Employee(10,"Pavani","CSE",10000);

		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		tr.add(e5);
		tr.add(e6);
		tr.add(e7);
		tr.add(e8);
		tr.add(e9);
		tr.add(e10);

		for(Employee e:tr)
		{
			System.out.println("id:"+e.id+" Name:"+e.name+" Department:"
				+e.department+" Salary:"+e.salary);
		}
	}
}
		
class Employee implements Comparable<Employee> {

	int id,salary;
	String name, department;

	public Employee(int id,String name,String department, int salary) {
		
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getDepartment() {
		return this.department;
	}
	public int getSalary() {
		return this.salary;
	}

	@Override
	public int compareTo(Employee o) {
	
		return this.getName().compareTo(o.getName());
	} 
}



