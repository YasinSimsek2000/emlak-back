package com.example.fonet.service;

import com.example.fonet.converter.BusinessConverter;
import com.example.fonet.dto.NewBusinessDTO;
import com.example.fonet.entities.BusinessModel;
import com.example.fonet.entities.User;
import com.example.fonet.repository.IBusinessRepository;
import com.example.fonet.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    private final IBusinessRepository businessRepository;
    private final IUserRepository userRepository;

    @Autowired
    public BusinessService(IBusinessRepository businessRepository, IUserRepository userRepository) {
        this.businessRepository = businessRepository;
        this.userRepository = userRepository;
    }

    public List<BusinessModel> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public Optional<BusinessModel> getBusinessById(Long id) {
        return businessRepository.findById(id);
    }

    public BusinessModel createBusiness(NewBusinessDTO business) {
        User user = userRepository.getReferenceById(business.getUserID());
        BusinessConverter converter = new BusinessConverter();
        BusinessModel businessModel = converter.convertDTO(business);
        businessModel.setUser(user);
        return businessRepository.save(businessModel);
    }

    public BusinessModel updateBusiness(Long id, BusinessModel business) {
        if (businessRepository.existsById(id)) {
            business.setId(id);
            return businessRepository.save(business);
        }
        return null;
    }

    public boolean deleteBusiness(Long id) {
        if (businessRepository.existsById(id)) {
            businessRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
