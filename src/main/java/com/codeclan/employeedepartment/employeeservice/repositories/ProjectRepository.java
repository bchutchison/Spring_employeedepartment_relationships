package com.codeclan.employeedepartment.employeeservice.repositories;

import com.codeclan.employeedepartment.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
