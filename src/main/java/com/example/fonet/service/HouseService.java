package com.example.fonet.service;

import com.example.fonet.converter.HouseConverter;
import com.example.fonet.dto.NewHouseDTO;
import com.example.fonet.entities.HouseModel;
import com.example.fonet.repository.IHouseRepository;
import com.example.fonet.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService {

    private final IHouseRepository houseRepository;
    private final IPersonRepository personRepository;

    @Autowired
    public HouseService(IHouseRepository houseRepository, IPersonRepository personRepository) {
        this.houseRepository = houseRepository;
        this.personRepository = personRepository;
    }

    public List<HouseModel> getAllHouses() {
        return houseRepository.findAll();
    }

    public Optional<HouseModel> getHouseById(Long id) {
        return houseRepository.findById(id);
    }

    public HouseModel createHouse(NewHouseDTO house) {
        HouseConverter converter = new HouseConverter();
        HouseModel houseModel = converter.convertDTO(house);
        houseModel.setPerson(personRepository.findByEmail(house.getPersonMail()));
        return houseRepository.save(houseModel);
    }

    public HouseModel updateHouse(Long id, HouseModel house) {
        if (houseRepository.existsById(id)) {
            house.setId(id);
            return houseRepository.save(house);
        }
        return null;
    }

    public boolean deleteHouse(Long id) {
        if (houseRepository.existsById(id)) {
            houseRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
