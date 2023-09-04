package com.deneme.controller.repository;

import com.deneme.controller.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {

    List<Users> getUsersByfName(String name);

}

