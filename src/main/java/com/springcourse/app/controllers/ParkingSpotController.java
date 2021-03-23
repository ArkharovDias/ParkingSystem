package com.springcourse.app.controllers;

import com.springcourse.app.dto.ParkingSpotDto;
import com.springcourse.app.services.ParkingSpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-spots")
@RequiredArgsConstructor
public class ParkingSpotController {
    
    private final ParkingSpotService parkingSpotService;

    @GetMapping("/{id}")
    public ParkingSpotDto findById(@PathVariable("id") Long id){
        return parkingSpotService.findById(id);
    }

    @PostMapping("{id}")
    public ParkingSpotDto create(@RequestBody ParkingSpotDto parkingSpotDto){
        return parkingSpotService.create(parkingSpotDto);
    }

    @PutMapping("{id}")
    public ParkingSpotDto updateByPut(@RequestBody ParkingSpotDto parkingSpotDto, @PathVariable Long id){
        return parkingSpotService.updateByPut(parkingSpotDto, id);
    }

    @PatchMapping("{id}")
    public ParkingSpotDto updateByPatch(@RequestBody ParkingSpotDto parkingSpotDto, @PathVariable Long id){
        return parkingSpotService.updateByPatch(parkingSpotDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        parkingSpotService.delete(id);
    }
}
