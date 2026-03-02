package day6.proj;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static HashSet<Employee> empSet= new HashSet<Employee>();

	static {
				
		empSet.add(new Employee(123,"aa,"90));
		empSet.add(new Employee(124,"swpa",88000));
		
		
		
		
	}

	public static void main(String[] args) {
		empSet.forEach(e->System.out.println(e));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee details");
		Employee emp= new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
		empSet.add(emp);
		System.out.println("Enter Employee id for updation");
		long id=sc.nextLong();
		if(empSet.contains(emp.getEmpid())) {
			
		}
		
		// TODO Auto-generated method stub

	}

}
