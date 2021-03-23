package com.springcourse.app.controllers;

import com.springcourse.app.dto.VehicleDto;
import com.springcourse.app.services.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {
    
    private final VehicleService vehicleService;

    @GetMapping("/{id}")
    public VehicleDto findById(@PathVariable("id") Long id){
        return vehicleService.findById(id);
    }

    @PostMapping("{id}")
    public VehicleDto create(@RequestBody VehicleDto vehicleDto){
        return vehicleService.create(vehicleDto);
    }

    @PutMapping("{id}")
    public VehicleDto updateByPut(@RequestBody VehicleDto vehicleDto, @PathVariable Long id){
        return vehicleService.updateByPut(vehicleDto, id);
    }

    @PatchMapping("{id}")
    public VehicleDto updateByPatch(@RequestBody VehicleDto vehicleDto, @PathVariable Long id){
        return vehicleService.updateByPatch(vehicleDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        vehicleService.delete(id);
    }
}
