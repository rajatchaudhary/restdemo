package com.practice.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
