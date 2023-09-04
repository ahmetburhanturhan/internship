package com.deneme.controller.controller;

import com.deneme.controller.model.Assignments;
import com.deneme.controller.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {
    @Autowired
    AssignmentService assignmentService;

    @GetMapping("/getAllAssignment")
    public List<Assignments> getAllAssignment(){
        return assignmentService.getAllAssignment();
    }

    @PostMapping("add")
    public ResponseEntity<String> addAssignments(@RequestBody Assignments assignments){
        return  assignmentService.addProjectAssignment(assignments);
    }

//    @PutMapping("update")
//    public ResponseEntity<String> updateAssignmentById(@RequestParam Integer assignmentId, @RequestBody Assignments assignments){
//        return assignmentService.updateProjectAssignmentById(assignmentId,assignments);
//    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteAssignmentById(@RequestParam Integer assignmentId){
        return assignmentService.deleteAssignmentById(assignmentId);
    }


}
