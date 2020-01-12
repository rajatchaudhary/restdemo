package com.practice.demorest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("employee")
public class EmployeeResource {

	EmployeeRepository empRepo=new EmployeeRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> employee() {
		
		
			return empRepo.getEmployee();
		
	}
	
	@GET
	@Path("get/{id}")
	public Employee getEmployee(@PathParam("id") int id) {
		System.out.println();
		return empRepo.getEmp(id);
		
	}
	@POST
	@Path("add")
	public Employee add(Employee a1) {
		System.out.println(a1);
		empRepo.add(a1);
		return a1;
	}
}
