package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("kshitija");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    Employee employee = new Employee();
    //save data
    public Employee saveEmployee(Employee employee) {
    	
    	entityTransaction.begin();
    	entityManager.persist(employee);
    	entityTransaction.commit();
		return employee;
		
        	
    }
    
  //update data
    public boolean updateEmployeeName(int id,String name) {
    	
    	Employee employee = entityManager.find(Employee.class, id);
    	if(employee!=null) {
    		employee.setName(name);
    		entityTransaction.begin();
    		entityManager.merge(employee);
    		entityTransaction.commit();
    		return true;
    	}
		return false;
    }
    public boolean updateEmployeeEmail(int id,String Email) {
    	Employee employee = entityManager.find(Employee.class, id);
    	if(employee!=null) {
    		employee.setEmail(Email);
    		entityTransaction.begin();
    		entityManager.merge(employee);
    		entityTransaction.commit();
    		return true;
    	}
		return false;
    }
    public boolean updateEmployeeCno(int id,long cno) {
    	Employee employee = entityManager.find(Employee.class, id);
    	if(employee!=null) {
    		employee.setCno(cno);
    		entityTransaction.begin();
    		entityManager.merge(employee);
    		entityTransaction.commit();
    		return true;
    	}
		return false;
    }
    
    //delete data
    public boolean deleteEmployee(int id) {
    	Employee e=entityManager.find(Employee.class, id);
    	
    	if(e!=null) {
    		entityTransaction.begin();
    		entityManager.remove(e);
    		entityTransaction.commit();
    		return true;
    	}
		return false;
		
    }
    
    //get all data
    public List<Employee> getEmployeeAll(){
    	
    	String sql = "SELECT e FROM Employee e";
		Query query = entityManager.createQuery(sql);
		List<Employee>employees=query.getResultList();
		return employees;
			
    }
    
    //get data by Id
    
    public Employee getByIdEmployeeData(int id) {
    	Employee e=entityManager.find(Employee.class, id);
		
		return e;
    }

	

}
