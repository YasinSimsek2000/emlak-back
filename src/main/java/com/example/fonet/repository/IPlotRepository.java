package com.example.fonet.repository;

import com.example.fonet.entities.PlotModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlotRepository extends JpaRepository<PlotModel, Long> {
}
