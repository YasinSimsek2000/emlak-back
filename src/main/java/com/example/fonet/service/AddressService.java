package com.example.fonet.service;

import com.example.fonet.entities.AddressModel;
import com.example.fonet.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final IAddressRepository addressRepository;

    @Autowired
    public AddressService(IAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<AddressModel> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<AddressModel> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public AddressModel createAddress(AddressModel address) {
        return addressRepository.save(address);
    }

    public AddressModel updateAddress(Long id, AddressModel address) {
        if (addressRepository.existsById(id)) {
            address.setId(id);
            return addressRepository.save(address);
        }
        return null;
    }

    public boolean deleteAddress(Long id) {
        if (addressRepository.existsById(id)) {
            addressRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
