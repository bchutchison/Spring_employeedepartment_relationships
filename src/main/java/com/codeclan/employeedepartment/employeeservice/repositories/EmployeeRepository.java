package com.codeclan.employeedepartment.employeeservice.repositories;

import com.codeclan.employeedepartment.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
