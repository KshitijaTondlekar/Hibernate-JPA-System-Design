package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();
		employeeService.deleteEmployee(10);
	}

}
