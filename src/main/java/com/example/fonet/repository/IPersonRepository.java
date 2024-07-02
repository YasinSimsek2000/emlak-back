package com.example.fonet.repository;

import com.example.fonet.entities.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<PersonModel, Long> {
    PersonModel findByEmail(String email);
}

