package com.springcourse.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingFloorDto{
    private Long id;
    private Integer number;
    private Integer spotsNumberAvailable;
    private Integer spotsMaxSize;
}
