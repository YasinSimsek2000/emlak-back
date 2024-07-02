package com.example.fonet.service;

import com.example.fonet.entities.PlotModel;
import com.example.fonet.repository.IPlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlotService {

    private final IPlotRepository plotRepository;

    @Autowired
    public PlotService(IPlotRepository plotRepository) {
        this.plotRepository = plotRepository;
    }

    public List<PlotModel> getAllPlots() {
        return plotRepository.findAll();
    }

    public Optional<PlotModel> getPlotById(Long id) {
        return plotRepository.findById(id);
    }

    public PlotModel createPlot(PlotModel plot) {
        return plotRepository.save(plot);
    }

    public PlotModel updatePlot(Long id, PlotModel plot) {
        if (plotRepository.existsById(id)) {
            plot.setId(id);
            return plotRepository.save(plot);
        }
        return null;
    }

    public boolean deletePlot(Long id) {
        if (plotRepository.existsById(id)) {
            plotRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
