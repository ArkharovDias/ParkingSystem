package com.springcourse.app.services;

import com.springcourse.app.dto.ParkingLotDto;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Override
    public ParkingLotDto findById(Long id) {
        return ParkingLotDto.builder()
                .id(id)
                .build();
    }

    @Override
    public ParkingLotDto create(ParkingLotDto entityDto) {
        return entityDto;
    }

    @Override
    public ParkingLotDto updateByPut(ParkingLotDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public ParkingLotDto updateByPatch(ParkingLotDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
