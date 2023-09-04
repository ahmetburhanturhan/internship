package com.deneme.controller.controller;

import com.deneme.controller.model.Project;
import com.deneme.controller.model.Users;
import com.deneme.controller.service.ProjectService;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/allProject")
    public ResponseEntity<List<Project>> getAllProject(){
        return projectService.getAllProject();
    }

    @GetMapping("name/{projectName}")
    public ResponseEntity<List<Project>> getProjectByName(@PathVariable String projectName){
       return projectService.getProjectByName(projectName);
    }

    @PostMapping("add")
    public ResponseEntity<String> addUser(@RequestBody Project project){
        return projectService.addUser(project);
    }

//    @PutMapping("update")
//    public ResponseEntity<String> updateProjectById(@RequestParam Integer projectId, @RequestBody Project project){
//        return  projectService.updateProjectById(projectId, project);
//    }

    @DeleteMapping("delete")
    public ResponseEntity<String>  deleteProjectById(@RequestParam Integer projectId){
        return projectService.deleteProjectById(projectId);
    }


}
