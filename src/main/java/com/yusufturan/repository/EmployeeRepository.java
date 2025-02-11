package com.yusufturan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yusufturan.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
