package com.practice.demorest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	List<Employee> employee;
	public EmployeeRepository() {
		employee=new ArrayList<Employee>();
		Employee e1= new Employee();
		e1.setName("Brad");
		e1.setId(23);
		Employee e2= new Employee();
		e2.setName("Maxx");
		e2.setId(51);
		employee.add(e1);
		employee.add(e2);
	}
	public List<Employee> getEmployee(){
		
		return employee;
		
	}
	public Employee getEmp(int id) {
		
		for(Employee a: employee) {
			if(a.getId()==id)
				return a;
		}
		return new Employee();
		
	}
	public void add(Employee a1) {
		// TODO Auto-generated method stub
		System.out.println("add new employee");
		employee.add(a1);
	}
}
