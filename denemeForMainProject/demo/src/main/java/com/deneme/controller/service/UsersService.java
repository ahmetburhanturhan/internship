package com.deneme.controller.service;

import com.deneme.controller.model.Users;
import com.deneme.controller.repository.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService  {
    @Autowired
    UsersDao usersDao;

    public ResponseEntity<List<Users>> getAllUsers(){
        try {
            return new ResponseEntity<>(usersDao.findAll(), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Users>> getUsersByName(String name) {
        try {
            return new ResponseEntity<>(usersDao.getUsersByfName(name), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addUser(Users users) {
        usersDao.save(users);
        return new ResponseEntity<>("new user added", HttpStatus.CREATED);
    }

//    public ResponseEntity<String> updateUserById(Integer userId, Users users) {
//        Users emp = usersDao.findById(userId).get();
//
//        if(users.getfName() != null) {
//            emp.setfName(users.getfName());        }
//        if(users.getlName() != null){
//            emp.setlName(users.getlName());
//        }
//
//        usersDao.save(emp);
//        return new ResponseEntity<>("user updated", HttpStatus.OK);
//    }

    public ResponseEntity<String> deleteUserById(Integer userId) {
        usersDao.deleteById(userId);
        return new ResponseEntity<>("user deleted", HttpStatus.NO_CONTENT) ;
    }



    public String updateUserById(int userId, Users updatedUser) {
        Optional<Users> optionalUser = usersDao.findById(userId);
        if (optionalUser.isPresent()) {

            Users existingUser = optionalUser.get();
            existingUser.setUserId(updatedUser.getUserId());
            existingUser.setFName(updatedUser.getFName());
            existingUser.setLName(updatedUser.getLName());

            usersDao.save(existingUser);
            return "Update was successful";
        }
        else {
            return "User not found";
        }
}}
