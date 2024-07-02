package com.example.fonet.repository;

import com.example.fonet.entities.BusinessModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBusinessRepository extends JpaRepository<BusinessModel, Long> {
}

