package com.deneme.controller.repository;

import com.deneme.controller.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {
    List<Project> getProjectByprojectName(String projectName);

}
