package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
public class Employee {
	int id;
	String name;
	String lastMame;

	public Employee(int i, String string, String string2) {
		System.out.println("Employee.Employee()"+i+string+"-----------");
		this.id=i;
		this.name=string;
		this.lastMame=string2;
	}
	
}
