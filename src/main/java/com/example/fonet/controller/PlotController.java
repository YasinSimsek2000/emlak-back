package com.example.fonet.controller;

import com.example.fonet.entities.PlotModel;
import com.example.fonet.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plots")
@CrossOrigin(origins = "*")
public class PlotController {

    private final PlotService plotService;

    @Autowired
    public PlotController(PlotService plotService) {
        this.plotService = plotService;
    }

    @GetMapping
    public ResponseEntity<List<PlotModel>> getAllPlots() {
        List<PlotModel> plots = plotService.getAllPlots();
        return new ResponseEntity<>(plots, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlotModel> getPlotById(@PathVariable("id") Long id) {
        Optional<PlotModel> plot = plotService.getPlotById(id);
        return plot.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PlotModel> createPlot(@RequestBody PlotModel plot) {
        PlotModel createdPlot = plotService.createPlot(plot);
        return new ResponseEntity<>(createdPlot, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlotModel> updatePlot(@PathVariable("id") Long id, @RequestBody PlotModel plot) {
        PlotModel updatedPlot = plotService.updatePlot(id, plot);
        return updatedPlot != null ? ResponseEntity.ok(updatedPlot) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlot(@PathVariable("id") Long id) {
        boolean deleted = plotService.deletePlot(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
