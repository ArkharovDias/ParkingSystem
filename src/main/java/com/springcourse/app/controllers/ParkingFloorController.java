package com.springcourse.app.controllers;

import com.springcourse.app.dto.ParkingFloorDto;
import com.springcourse.app.services.ParkingFloorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-floors")
@RequiredArgsConstructor
public class ParkingFloorController {
    
    private final ParkingFloorService parkingFloorService;

    @GetMapping("/{id}")
    public ParkingFloorDto findById(@PathVariable("id") Long id){
        return parkingFloorService.findById(id);
    }

    @PostMapping("{id}")
    public ParkingFloorDto create(@RequestBody ParkingFloorDto parkingFloorDto){
        return parkingFloorService.create(parkingFloorDto);
    }

    @PutMapping("{id}")
    public ParkingFloorDto updateByPut(@RequestBody ParkingFloorDto parkingFloorDto, @PathVariable Long id){
        return parkingFloorService.updateByPut(parkingFloorDto, id);
    }

    @PatchMapping("{id}")
    public ParkingFloorDto updateByPatch(@RequestBody ParkingFloorDto parkingFloorDto, @PathVariable Long id){
        return parkingFloorService.updateByPatch(parkingFloorDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        parkingFloorService.delete(id);
    }
}
