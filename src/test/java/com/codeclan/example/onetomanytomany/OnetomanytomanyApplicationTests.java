package com.codeclan.example.onetomanytomany;

import com.codeclan.example.onetomanytomany.models.Department;
import com.codeclan.example.onetomanytomany.models.Employee;
import com.codeclan.example.onetomanytomany.models.Project;
import com.codeclan.example.onetomanytomany.repositories.DepartmentRepository;
import com.codeclan.example.onetomanytomany.repositories.EmployeeRepository;
import com.codeclan.example.onetomanytomany.repositories.ProjectRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnetomanytomanyApplicationTests {

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
	public void createEmployeeDepartmentProject(){
		Department department = new Department("Passing Tests");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Bob", "Smith", 23838383, department);
		employeeRepository.save(employee1);

		Project project1 = new Project ("Project Chaos", 5);
		projectRepository.save(project1);
	}

	@Test
	public void addEmployeesProjects(){
		Department department = new Department("Passing Tests");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Bob", "Smith", 23838383, department);
		employeeRepository.save(employee1);

		Project project1 = new Project ("Project Chaos", 5);
		projectRepository.save(project1);

		employee1.addProject(project1);
		employeeRepository.save(employee1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}

}
