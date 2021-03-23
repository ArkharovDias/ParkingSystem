package com.springcourse.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotDto {
    private Long id;
    private String name;
    private Integer spotMaxSize;
    private AddressDto addressDto;
    private ParkingRateDto parkingRateDto;

}
