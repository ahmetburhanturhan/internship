package com.deneme.controller.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ArchievesDto {

    public ArchievesDto(Integer archievesId, LocalDateTime dates, Integer hours) {
        this.archievesId = archievesId;
        this.dates = dates;
        this.hours = hours;
    }

    private Integer archievesId;
    private LocalDateTime dates;
    private Integer hours;

    public static class Builder{

        private Integer archievesId;
        private LocalDateTime dates;
        private Integer hours;

        public Builder setValues(Integer archievesId, LocalDateTime dates, Integer hours){
            this.archievesId = archievesId;
            this.dates = dates;
            this.hours = hours;
            return this;
        }

        public ArchievesDto build(){
            return new ArchievesDto(archievesId, dates, hours);
        }


    }

}
