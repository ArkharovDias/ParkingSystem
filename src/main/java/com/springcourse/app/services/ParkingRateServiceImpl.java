package com.springcourse.app.services;

import com.springcourse.app.dto.ParkingRateDto;
import org.springframework.stereotype.Service;

@Service
public class ParkingRateServiceImpl implements ParkingRateService {

    @Override
    public ParkingRateDto findById(Long id) {
        return ParkingRateDto.builder()
                .id(id)
                .build();
    }

    @Override
    public ParkingRateDto create(ParkingRateDto entityDto) {
        return entityDto;
    }

    @Override
    public ParkingRateDto updateByPut(ParkingRateDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public ParkingRateDto updateByPatch(ParkingRateDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
