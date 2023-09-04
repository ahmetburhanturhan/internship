package com.deneme.controller.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "users", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="f_name")
    private String fName;
    @Column(name="l_name")
    private String lName;
    @Column(name="sex")
    private String sex;
    @Column(name="birth_date")
    private LocalDate birthDate;

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }

//    @OneToMany(mappedBy = "assignedUser")
//    private List<Assignments> assignments;
//
//    @OneToMany(mappedBy = "projectManager")
//    private List<Project> managedProjects;

}
