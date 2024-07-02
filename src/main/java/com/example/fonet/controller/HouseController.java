package com.example.fonet.controller;

import com.example.fonet.dto.NewHouseDTO;
import com.example.fonet.entities.HouseModel;
import com.example.fonet.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/houses")
@CrossOrigin(origins = "*")
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public ResponseEntity<List<HouseModel>> getAllHouses() {
        List<HouseModel> houses = houseService.getAllHouses();
        return new ResponseEntity<>(houses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HouseModel> getHouseById(@PathVariable("id") Long id) {
        Optional<HouseModel> house = houseService.getHouseById(id);
        return house.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<HouseModel> createHouse(@RequestBody NewHouseDTO house) {
        HouseModel createdHouse = houseService.createHouse(house);
        return new ResponseEntity<>(createdHouse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HouseModel> updateHouse(@PathVariable("id") Long id, @RequestBody HouseModel house) {
        HouseModel updatedHouse = houseService.updateHouse(id, house);
        return updatedHouse != null ? ResponseEntity.ok(updatedHouse) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHouse(@PathVariable("id") Long id) {
        boolean deleted = houseService.deleteHouse(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
