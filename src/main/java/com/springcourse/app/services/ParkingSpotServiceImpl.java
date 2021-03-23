package com.springcourse.app.services;

import com.springcourse.app.dto.ParkingSpotDto;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

    @Override
    public ParkingSpotDto findById(Long id) {
        return ParkingSpotDto.builder()
                .id(id)
                .build();
    }

    @Override
    public ParkingSpotDto create(ParkingSpotDto entityDto) {
        return entityDto;
    }

    @Override
    public ParkingSpotDto updateByPut(ParkingSpotDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public ParkingSpotDto updateByPatch(ParkingSpotDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
