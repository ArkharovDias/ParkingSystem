package com.springcourse.app.services;

import com.springcourse.app.dto.ParkingFloorDto;
import org.springframework.stereotype.Service;

@Service
public class ParkingFloorServiceImpl implements ParkingFloorService {

    @Override
    public ParkingFloorDto findById(Long id) {
        return ParkingFloorDto.builder()
                .id(id)
                .build();
    }

    @Override
    public ParkingFloorDto create(ParkingFloorDto entityDto) {
        return entityDto;
    }

    @Override
    public ParkingFloorDto updateByPut(ParkingFloorDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public ParkingFloorDto updateByPatch(ParkingFloorDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
