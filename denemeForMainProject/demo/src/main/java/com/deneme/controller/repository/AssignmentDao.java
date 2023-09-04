package com.deneme.controller.repository;

import com.deneme.controller.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentDao extends JpaRepository<Assignments, Integer> {
}
