package com.springcourse.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotDto {
    private Long id;
    private Integer number;
    private ParkingFloorDto floor;
    private boolean isFree;
    private ParkingSpotType parkingSpotType;
    private VehicleDto vehicleDto;
}
