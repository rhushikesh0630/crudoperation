package com.spring.crud.CRUD.employeecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.CRUD.entity.employee;
import com.spring.crud.CRUD.service.EmployeeService;

@RestController
public class employeerestcontroller {
	@Autowired
	   private EmployeeService employeeService;

	   @PostMapping("/addemp")
	   public employee createEmployee(@RequestBody employee employee) {
	      return employeeService.createEmployee(employee);
	   }

	   @GetMapping("/getemp")
	   public List<employee> getAllEmployees() {
	      return employeeService.getAllEmployees();
	   }

	   @GetMapping("idemp/{id}")
	   public employee getEmployeeById(@PathVariable int id) {
	      return employeeService.getEmployeeById(id);
	   }

	   @PutMapping("update/{id}")
	   public employee updateEmployee(@PathVariable int id, @RequestBody employee employee) {
	      return employeeService.updateEmployee(id,employee);
	    		  }
}
