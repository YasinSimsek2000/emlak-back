package com.example.fonet.repository;

import com.example.fonet.entities.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<AddressModel, Long> {
}
