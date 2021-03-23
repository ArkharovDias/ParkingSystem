package com.springcourse.app.controllers;

import com.springcourse.app.dto.ParkingTicketDto;
import com.springcourse.app.services.ParkingTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-tickets")
@RequiredArgsConstructor
public class ParkingTicketController {
    
    private final ParkingTicketService parkingTicketService;

    @GetMapping("/{id}")
    public ParkingTicketDto findById(@PathVariable("id") Long id){
        return parkingTicketService.findById(id);
    }

    @PostMapping("{id}")
    public ParkingTicketDto create(@RequestBody ParkingTicketDto parkingTicketDto){
        return parkingTicketService.create(parkingTicketDto);
    }

    @PutMapping("{id}")
    public ParkingTicketDto updateByPut(@RequestBody ParkingTicketDto parkingTicketDto, @PathVariable Long id){
        return parkingTicketService.updateByPut(parkingTicketDto, id);
    }

    @PatchMapping("{id}")
    public ParkingTicketDto updateByPatch(@RequestBody ParkingTicketDto parkingTicketDto, @PathVariable Long id){
        return parkingTicketService.updateByPatch(parkingTicketDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        parkingTicketService.delete(id);
    }
}
