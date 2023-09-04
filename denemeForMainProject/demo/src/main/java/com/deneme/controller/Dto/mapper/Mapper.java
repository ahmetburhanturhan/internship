package com.deneme.controller.Dto.mapper;

import com.deneme.controller.Dto.ArchievesDto;
import com.deneme.controller.Dto.AssignmentDto;
import com.deneme.controller.Dto.ProjectDto;
import com.deneme.controller.Dto.UsersDto;
import com.deneme.controller.model.Archieves;
import com.deneme.controller.model.Assignments;
import com.deneme.controller.model.Project;
import com.deneme.controller.model.Users;
import org.hibernate.sql.ast.tree.update.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static AssignmentDto assignmentDtoMapper(Assignments assignments){


        return new AssignmentDto.Builder()
                .userDto(userDtoMapper(assignments.getAssignedUser()))
                .projectDto(projectDtoMapperWithoutAssignmentList(assignments.getProject()))
                .build();
    }


    public static List<AssignmentDto> projectAssignmentDtoListMapper(List<Assignments> projectAssignmentList){
        List<AssignmentDto> pAssignmentDtoList = new ArrayList<>();

        projectAssignmentList.forEach((n) -> pAssignmentDtoList.add(assignmentDtoMapper(n)));

        return pAssignmentDtoList;
    }

    public static UsersDto userDtoMapper(Users users){

        return new UsersDto.Builder()
                .setfName(users.getFName())
                .setlName(users.getLName())
                .build();
    }

    public static ProjectDto projectDtoMapper(Project project){
        return new ProjectDto.Builder()
                .projectName(project.getProjectName())
                .projectManagerDto(userDtoMapper(project.getProjectManager()))
                .assignmentList(projectAssignmentDtoListMapper(project.getAssignments()))
                .build();

    }

    public static ProjectDto projectDtoMapperWithoutAssignmentList(Project project){
        return new ProjectDto.Builder()
                .projectName(project.getProjectName())
                .projectManagerDto(userDtoMapper(project.getProjectManager()))
                .build();
    }

    public static ArchievesDto ArchievesDtoMapper(Archieves archieves){

        return  new ArchievesDto.Builder()
                .setValues(archieves.getArchieveId(),
                        archieves.getDates(),
                        archieves.getHours())
                .build();
    }


}
