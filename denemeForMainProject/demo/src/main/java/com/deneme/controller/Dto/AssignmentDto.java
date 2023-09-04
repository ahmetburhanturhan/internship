package com.deneme.controller.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentDto {
    private ProjectDto projectDto;
    private UsersDto usersDto;

    public AssignmentDto(Builder builder){
        this.projectDto = builder.projectDto;
        this.usersDto = builder.usersDto;
    }

    @NoArgsConstructor
    public static class Builder{

        private ProjectDto projectDto;
        private UsersDto usersDto;

        public Builder projectDto(final ProjectDto projectDto){
            this.projectDto = projectDto;
            return this;
        }

        public Builder userDto(final UsersDto usersDto){
            this.usersDto = usersDto;
            return this;
        }

        public AssignmentDto build(){
            return new AssignmentDto(this);
        }

    }


}
