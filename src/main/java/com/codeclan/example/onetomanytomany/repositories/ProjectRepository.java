package com.codeclan.example.onetomanytomany.repositories;

import com.codeclan.example.onetomanytomany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
