package com.example.fonet.converter;

import com.example.fonet.dto.NewPersonDTO;
import com.example.fonet.entities.PersonModel;

public class PersonConverter {
    public PersonModel convertDTO (NewPersonDTO dto) {
        PersonModel personModel = new PersonModel();
        personModel.setFirstName(dto.getFirstname());
        personModel.setLastName(dto.getLastname());
        personModel.setFax(dto.getFax());
        personModel.setPhone(dto.getPhone());
        personModel.setEmail(dto.getEmail());
        personModel.setBusiness(null);
        return personModel;
    }
}
