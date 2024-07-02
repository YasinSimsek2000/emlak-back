package com.example.fonet.converter;

import com.example.fonet.dto.NewBusinessDTO;
import com.example.fonet.entities.BusinessModel;

public class BusinessConverter {
    public BusinessModel convertDTO (NewBusinessDTO dto) {
        BusinessModel businessModel = new BusinessModel();
        businessModel.setBusinessName(dto.getBusinessName());
        businessModel.setFax(dto.getFax());
        businessModel.setPhone(dto.getPhone());
        businessModel.setUser(null);
        return businessModel;
    }
}
