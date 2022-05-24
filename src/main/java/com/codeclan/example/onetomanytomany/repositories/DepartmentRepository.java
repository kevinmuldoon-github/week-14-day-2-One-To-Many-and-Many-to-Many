package com.codeclan.example.onetomanytomany.repositories;

import com.codeclan.example.onetomanytomany.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
