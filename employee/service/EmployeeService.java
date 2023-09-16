package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao=new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		Employee e = employeeDao.saveEmployee(employee);
		return e;
		//update employee name
	}
	public boolean updateEmployeeName(int id,String name) {
		return employeeDao.updateEmployeeName(id, name);
		
	}//update employee email
	public boolean updateEmployeeEmail(int id,String Email) {
		return employeeDao.updateEmployeeEmail(id, Email);
		
	}//update contact number
	public boolean updateEmployeeCno(int id,long cno) {
		return employeeDao.updateEmployeeCno(id, cno);
		
	}
    	
	//delete employee data
	public boolean deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
		
		 
	 }
	
	public List <Employee>getEmployeeAll(){
		return employeeDao.getEmployeeAll();
		
		
	}
	public Employee getByIdEmployeeData(int id) {
		return employeeDao.getByIdEmployeeData(id);
		
	}
}
