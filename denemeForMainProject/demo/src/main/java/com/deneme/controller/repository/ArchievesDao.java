package com.deneme.controller.repository;

import com.deneme.controller.model.Archieves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchievesDao extends JpaRepository<Archieves, Integer> {
}
