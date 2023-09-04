package com.deneme.controller.service;

import com.deneme.controller.model.Assignments;
import com.deneme.controller.repository.AssignmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

    @Autowired
    AssignmentDao assignmentDao;
    public List<Assignments> getAllAssignment() {
        return assignmentDao.findAll();
    }

    public ResponseEntity<String> addProjectAssignment(Assignments assignments) {
        assignmentDao.save(assignments);
        return new ResponseEntity<>("new assignment added", HttpStatus.CREATED);
    }

//    public ResponseEntity<String> updateProjectAssignmentById(Integer assignmentId, Assignments assignments) {
//
//        Assignments proA = assignmentDao.findById(assignmentId).get();
//
//        if(assignments.getAssignedUser() != null){
//            proA.setAssignedUser(assignments.getAssignedUser());
//        }
//        if(assignments.getProject() != null){
//            proA.setProject(assignments.getProject());
//        }
//
//        assignmentDao.save(proA);
//
//        return new ResponseEntity<>("Assignment updated", HttpStatus.OK);
//
//    }

    public ResponseEntity<String> deleteAssignmentById(Integer assignmentId) {

        assignmentDao.deleteById(assignmentId);
        return new ResponseEntity<>("Assignment deleted",HttpStatus.NO_CONTENT );

    }
}
