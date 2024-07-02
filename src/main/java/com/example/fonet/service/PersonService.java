package com.example.fonet.service;

import com.example.fonet.converter.PersonConverter;
import com.example.fonet.dto.NewPersonDTO;
import com.example.fonet.entities.PersonModel;
import com.example.fonet.repository.IBusinessRepository;
import com.example.fonet.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final IPersonRepository personRepository;


    @Autowired
    public PersonService(IPersonRepository personRepository,
                         RefreshTokenService refreshTokenService,
                         IBusinessRepository businessRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonModel> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<PersonModel> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public PersonModel createPerson(NewPersonDTO person) {
        PersonConverter converter = new PersonConverter();
        PersonModel model = converter.convertDTO(person);
        return personRepository.save(model);
    }

    public PersonModel updatePerson(Long id, PersonModel person) {
        if (personRepository.existsById(id)) {
            person.setId(id);
            return personRepository.save(person);
        }
        return null;
    }

    public boolean deletePerson(Long id) {
        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
