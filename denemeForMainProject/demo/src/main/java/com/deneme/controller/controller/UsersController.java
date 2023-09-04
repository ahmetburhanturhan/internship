package com.deneme.controller.controller;


import com.deneme.controller.model.Users;
import com.deneme.controller.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        return usersService.getAllUsers();
    }
    @GetMapping("name/{name}")
    public ResponseEntity<List<Users>> getUsersByName(@PathVariable String name){
        return usersService.getUsersByName(name);
    }

    @PostMapping("add")
    public ResponseEntity<String> addUser(@RequestBody Users users){
        return usersService.addUser(users);
    }

//    @PutMapping("update")
//    public ResponseEntity<String>  updateUserById(@RequestParam Integer userId, @RequestBody Users users){
//        return  usersService.updateUserById(userId, users) ;
//    }

    @PutMapping("update/{userId}")
    public String  updateUserById(@PathVariable int userId,@RequestBody Users updatedUser){
        return usersService.updateUserById(userId, updatedUser);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteUserById(@RequestParam Integer userId){
        return usersService.deleteUserById(userId);
    }

}
