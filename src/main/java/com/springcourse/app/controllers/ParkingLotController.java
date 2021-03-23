package com.springcourse.app.controllers;

import com.springcourse.app.dto.ParkingLotDto;
import com.springcourse.app.services.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-lots")
@RequiredArgsConstructor
public class ParkingLotController {
    
    private final ParkingLotService parkingLotService;

    @GetMapping("/{id}")
    public ParkingLotDto findById(@PathVariable("id") Long id){
        return parkingLotService.findById(id);
    }

    @PostMapping("{id}")
    public ParkingLotDto create(@RequestBody ParkingLotDto parkingLotDto){
        return parkingLotService.create(parkingLotDto);
    }

    @PutMapping("{id}")
    public ParkingLotDto updateByPut(@RequestBody ParkingLotDto parkingLotDto, @PathVariable Long id){
        return parkingLotService.updateByPut(parkingLotDto, id);
    }

    @PatchMapping("{id}")
    public ParkingLotDto updateByPatch(@RequestBody ParkingLotDto parkingLotDto, @PathVariable Long id){
        return parkingLotService.updateByPatch(parkingLotDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        parkingLotService.delete(id);
    }
}
