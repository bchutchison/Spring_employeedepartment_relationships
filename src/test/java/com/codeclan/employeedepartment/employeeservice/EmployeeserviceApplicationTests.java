package com.codeclan.employeedepartment.employeeservice;

import com.codeclan.employeedepartment.employeeservice.models.Department;
import com.codeclan.employeedepartment.employeeservice.models.Employee;
import com.codeclan.employeedepartment.employeeservice.models.Project;
import com.codeclan.employeedepartment.employeeservice.repositories.DepartmentRepository;
import com.codeclan.employeedepartment.employeeservice.repositories.EmployeeRepository;
import com.codeclan.employeedepartment.employeeservice.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Ben", "Hutchison", 1, department);
		employeeRepository.save(employee1);

		department.addEmployee(employee1);
		departmentRepository.save(department);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Ben", "Hutchison", 1, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Project", 7);
		projectRepository.save(project1);

		Project project2 = new Project("Project2", 8);
		projectRepository.save(project2);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

		project2.addEmployee(employee1);
		projectRepository.save(project2);
	}



}
