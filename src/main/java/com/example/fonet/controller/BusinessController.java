package com.example.fonet.controller;

import com.example.fonet.dto.NewBusinessDTO;
import com.example.fonet.entities.BusinessModel;
import com.example.fonet.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/business")
@CrossOrigin(origins = "*")
public class BusinessController {

    private final BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping
    public ResponseEntity<List<BusinessModel>> getAllBusinesses() {
        List<BusinessModel> businesses = businessService.getAllBusinesses();
        return new ResponseEntity<>(businesses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusinessModel> getBusinessById(@PathVariable("id") Long id) {
        Optional<BusinessModel> business = businessService.getBusinessById(id);
        return business.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<BusinessModel> createBusiness(@RequestBody NewBusinessDTO business) {
        BusinessModel createdBusiness = businessService.createBusiness(business);
        return new ResponseEntity<>(createdBusiness, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BusinessModel> updateBusiness(@PathVariable("id") Long id, @RequestBody BusinessModel business) {
        BusinessModel updatedBusiness = businessService.updateBusiness(id, business);
        return updatedBusiness != null ? ResponseEntity.ok(updatedBusiness) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusiness(@PathVariable("id") Long id) {
        boolean deleted = businessService.deleteBusiness(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
