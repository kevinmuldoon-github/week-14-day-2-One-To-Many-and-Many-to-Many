package com.codeclan.example.onetomanytomany.repositories;

import com.codeclan.example.onetomanytomany.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
