package com.springcourse.app.services;

import com.springcourse.app.dto.VehicleDto;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Override
    public VehicleDto findById(Long id) {
        return VehicleDto.builder()
                .id(id)
                .build();
    }

    @Override
    public VehicleDto create(VehicleDto entityDto) {
        return entityDto;
    }

    @Override
    public VehicleDto updateByPut(VehicleDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public VehicleDto updateByPatch(VehicleDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
