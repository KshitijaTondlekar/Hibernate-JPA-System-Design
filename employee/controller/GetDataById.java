package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class GetDataById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.getByIdEmployeeData(20);
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getCno());
		

	}

}
