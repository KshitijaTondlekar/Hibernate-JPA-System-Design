package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("ABC");
		employee.setEmail("abc@mail.com");
		
		
		EmployeeService employeeService = new EmployeeService();
		          Employee e =  employeeService.saveEmployee(employee);
		          System.out.println("Data is successfully saved"+e.getId());
		
	

}
}
