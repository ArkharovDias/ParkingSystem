package com.springcourse.app.services;

import com.springcourse.app.dto.ParkingTicketDto;
import org.springframework.stereotype.Service;

@Service
public class ParkingTicketServiceImpl implements ParkingTicketService {

    @Override
    public ParkingTicketDto findById(Long id) {
        return ParkingTicketDto.builder()
                .id(id)
                .build();
    }

    @Override
    public ParkingTicketDto create(ParkingTicketDto entityDto) {
        return entityDto;
    }

    @Override
    public ParkingTicketDto updateByPut(ParkingTicketDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public ParkingTicketDto updateByPatch(ParkingTicketDto entityDto, Long id) {
        return entityDto;
    }

    @Override
    public void delete(Long id) {

    }
}
