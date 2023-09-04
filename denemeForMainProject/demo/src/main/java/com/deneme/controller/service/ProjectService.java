package com.deneme.controller.service;

import com.deneme.controller.model.Project;
import com.deneme.controller.model.Users;
import com.deneme.controller.repository.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectDao projectDao;
    public ResponseEntity<List<Project>> getAllProject(){
        return new ResponseEntity<>(projectDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<Project>> getProjectByName(String projectName) {
        return new ResponseEntity<>( projectDao.getProjectByprojectName(projectName), HttpStatus.OK);
    }

    public ResponseEntity<String>  addUser(Project project) {
        projectDao.save(project);
        return new ResponseEntity<>("new project added", HttpStatus.CREATED);
    }

//    public ResponseEntity<String> updateProjectById(Integer projectId, Project project) {
//        Project pro = projectDao.findById(projectId).get();
//
//        pro.setProjectManager(project.getProjectManager());
//        pro.setProjectName(project.getProjectName());
//
//        projectDao.save(pro);
//
//        return new ResponseEntity<>("project updated", HttpStatus.OK);
//    }

    public ResponseEntity<String> deleteProjectById(Integer projectId) {
        projectDao.deleteById(projectId);
        return new ResponseEntity<>("project deleted", HttpStatus.NO_CONTENT);
    }
}
