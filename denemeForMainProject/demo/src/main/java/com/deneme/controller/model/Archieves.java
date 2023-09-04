package com.deneme.controller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "archieves", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class Archieves {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="archieve_id")
    private Integer archieveId;
    @Column(name="dates")
    private LocalDateTime dates;
    @Column(name="hours")
    private int hours;

//    public Integer getArchieveId() {
//        return archieveId;
//    }
//
//    public LocalDateTime getDates() {
//        return dates;
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public Assignments getAssignments() {
//        return assignments;
//    }
//
//    public void setArchieveId(Integer archieveId) {
//        this.archieveId = archieveId;
//    }
//
//    public void setDates(LocalDateTime dates) {
//        this.dates = dates;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }
//
//    public void setAssignments(Assignments assignments) {
//        this.assignments = assignments;
//    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignment_id")
    private Assignments assignments;

}
