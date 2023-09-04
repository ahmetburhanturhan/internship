package com.deneme.controller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "assignments", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="assignment_id")
    private Integer assignmentId;
//    @ManyToOne
//    @JoinColumn(name = "project_id")
//    private Project project;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Users users;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users assignedUser;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Project project;

//    @OneToMany(mappedBy = "assignments")
//    private List<Archieves> archieves;


//    public Integer getAssignmentId() {
//        return assignmentId;
//    }
//
//    public Users getAssignedUser() {
//        return assignedUser;
//    }
//
//    public Project getProject() {
//        return project;
//    }
//
//    public List<Archieves> getArchieves() {
//        return archieves;
//    }
//
//    public void setAssignmentId(Integer assignmentId) {
//        this.assignmentId = assignmentId;
//    }
//
//    public void setAssignedUser(Users assignedUser) {
//        this.assignedUser = assignedUser;
//    }
//
//    public void setProject(Project project) {
//        this.project = project;
//    }
//
//    public void setArchieves(List<Archieves> archieves) {
//        this.archieves = archieves;
//    }
}
