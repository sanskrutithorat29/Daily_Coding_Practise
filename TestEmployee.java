package com.dailypractise;

/*Create a superclass Employee with attributes name and salary.
Create subclasses Manager and Worker that inherit from Employee and 
add specific attributes such as department for Manager and hoursWorked for Worker.*/
class Employee{
	public void name(String name){
		System.out.println("name of enployee: "+name);
	}
	public void salary(int sal)
	{
		System.out.println("Salary of employee: "+sal);
	}
}

class Manager extends Employee{
	public void department(String department)
	{
		System.out.println("Department of Employee: "+department);
	}
}

class Worker extends Employee{
	public void hoursWorked(int hoursWorked) {
		System.out.println("Hours of hoursWorked :"+hoursWorked);
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		Worker w=new Worker();
		w.hoursWorked(16);
		w.salary(12000);
		w.name("Shailaa");
		
		Manager m=new Manager();
		m.department("IT Support");
		m.name("Sanskruti");
		m.salary(7000);
		
	}

}
