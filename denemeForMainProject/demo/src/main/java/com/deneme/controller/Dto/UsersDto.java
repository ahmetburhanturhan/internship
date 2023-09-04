package com.deneme.controller.Dto;

import lombok.*;
import org.apache.catalina.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private String fName;
    private String lName;

    public UsersDto(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
    }

    public static class Builder{
        private String lName;
        private String fName;
        public Builder setfName(final String fName){
            this.fName = fName;
            return this;
        }
        public Builder setlName(final String lName){
            this.lName = lName;
            return this;
        }
        //new UsersDto(this) bunu dediğimiz zaman UsersDto'nun constructor'ını çağırmış oluruz.
        public UsersDto build(){
            return new UsersDto(this);
        }
    }
}
