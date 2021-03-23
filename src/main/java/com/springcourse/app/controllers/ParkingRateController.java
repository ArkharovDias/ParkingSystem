package com.springcourse.app.controllers;

import com.springcourse.app.dto.ParkingRateDto;
import com.springcourse.app.services.ParkingRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-rates")
@RequiredArgsConstructor
public class ParkingRateController {
    
    private final ParkingRateService parkingRateService;

    @GetMapping("/{id}")
    public ParkingRateDto findById(@PathVariable("id") Long id){
        return parkingRateService.findById(id);
    }

    @PostMapping("{id}")
    public ParkingRateDto create(@RequestBody ParkingRateDto parkingRateDto){
        return parkingRateService.create(parkingRateDto);
    }

    @PutMapping("{id}")
    public ParkingRateDto updateByPut(@RequestBody ParkingRateDto parkingRateDto, @PathVariable Long id){
        return parkingRateService.updateByPut(parkingRateDto, id);
    }

    @PatchMapping("{id}")
    public ParkingRateDto updateByPatch(@RequestBody ParkingRateDto parkingRateDto, @PathVariable Long id){
        return parkingRateService.updateByPatch(parkingRateDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        parkingRateService.delete(id);
    }
}
