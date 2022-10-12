package Generics;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		
		Employee emp=new Employee();
		
		emp.id=sc.nextInt();
		emp.name=sc.next();
		emp.salary=sc.nextDouble();
		emp.department=sc.next();
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(emp);
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Employee emp1=(Employee) itr.next();
			emp.displayDetails(emp1);
		}
		

	}

}
