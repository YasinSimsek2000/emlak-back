package com.example.fonet.repository;

import com.example.fonet.entities.HouseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHouseRepository extends JpaRepository<HouseModel, Long> {
}


