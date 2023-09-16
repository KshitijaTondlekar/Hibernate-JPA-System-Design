package com.jsp.employee.controller;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;


import com.jsp.employee.service.EmployeeService;

public class UpdateEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.updateEmployeeName(20, "DEF");
		employeeService.updateEmployeeEmail(9, "asf@gmail.com");
		employeeService.updateEmployeeCno(20, 7658943567L);
	}

}
