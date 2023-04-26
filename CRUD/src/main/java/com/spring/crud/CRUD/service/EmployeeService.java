package com.spring.crud.CRUD.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.CRUD.entity.employee;
import com.spring.crud.CRUD.reposerory.employeerepository;

@Service
public class EmployeeService {
	 @Autowired
	   private employeerepository employeeRepository;

	   public employee createEmployee(employee employee) {
	      return employeeRepository.save(employee);
	   }

	   public List<employee> getAllEmployees() {
	      return employeeRepository.findAll();
	   }

	   public employee getEmployeeById(int id) {
	      return employeeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Employee not found with id " + id));
	   }

	   public employee updateEmployee(int id, employee employee) {
	      employee existingEmployee = getEmployeeById(id);
	      existingEmployee.setFirstName(employee.getFirstName());
	      existingEmployee.setLastName(employee.getLastName());
	      return employeeRepository.save(existingEmployee);
	   }

	   public void deleteEmployee(int id) {
	      employee employee = getEmployeeById(id);
	      employeeRepository.delete(employee);
	   }
	

}
