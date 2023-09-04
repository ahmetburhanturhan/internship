package com.deneme.controller.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDto {

    private String projectName;
    private UsersDto projectManagerDto;
    private List<AssignmentDto> assignmentList;


    public ProjectDto(Builder builder){
        this.projectName = builder.projectName;
        this.projectManagerDto = builder.projectManagerDto;
        this.assignmentList = builder.assignmentList;
    }

    @NoArgsConstructor
    public static class Builder{
        private String projectName;
        private UsersDto projectManagerDto;
        private List<AssignmentDto> assignmentList;

        public Builder projectName(final String projectName){
            this.projectName = projectName;
            return this;
        }
        public Builder projectManagerDto(final UsersDto projectManagerDto){
            this.projectManagerDto = projectManagerDto;
            return this;
        }
        public Builder assignmentList(final List<AssignmentDto> assignmentList){
            this.assignmentList = assignmentList;
            return this;
        }
        public  ProjectDto build(){
            return new ProjectDto(this);
        }
    }




}
