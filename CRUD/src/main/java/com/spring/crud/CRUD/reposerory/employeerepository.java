package com.spring.crud.CRUD.reposerory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.CRUD.entity.employee;

@Repository
public interface employeerepository  extends JpaRepository<employee, Integer>{

}
