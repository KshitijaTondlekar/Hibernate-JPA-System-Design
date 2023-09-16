package com.jsp.employee.controller;

import java.util.List;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class GetAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();
		List <Employee>employees=employeeService.getEmployeeAll();
		for(Employee e:employees) {
			System.out.println(e.getName());
			System.out.println("=============");
			
		}
		
	}

}
