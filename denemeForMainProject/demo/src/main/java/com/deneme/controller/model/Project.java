package com.deneme.controller.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.sql.ast.tree.update.Assignment;

import java.util.List;

@Entity
@Data
@Table(name = "project", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private Integer projectId;
    @Column(name="project_name")
    private String projectName;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "manager_id")
    private Users projectManager;
//
//    @OneToMany(mappedBy = "project")
//    private List<Assignments> assignments;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private List<Assignments> assignments;

//    public Integer getProjectId() {
//        return projectId;
//    }
//
//    public String getProjectName() {
//        return projectName;
//    }
//
//    public Users getProjectManager() {
//        return projectManager;
//    }
//
//    public List<Assignments> getAssignments() {
//        return assignments;
//    }
//
//    public void setProjectId(Integer projectId) {
//        this.projectId = projectId;
//    }
//
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }
//
//    public void setProjectManager(Users projectManager) {
//        this.projectManager = projectManager;
//    }
//
//    public void setAssignments(List<Assignments> assignments) {
//        this.assignments = assignments;
//    }




}
