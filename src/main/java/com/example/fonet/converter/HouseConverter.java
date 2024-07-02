package com.example.fonet.converter;

import com.example.fonet.dto.NewHouseDTO;
import com.example.fonet.entities.HouseModel;

public class HouseConverter {
    public HouseModel convertDTO (NewHouseDTO house) {
        HouseModel model = new HouseModel();
        model.setStatus(house.getStatus());
        model.setHeatingType(house.getHeatingType());
        model.setPrice(house.getPrice());
        model.setArea(house.getArea());
        model.setLivingRooms(house.getLivingRooms());
        model.setBedrooms(house.getBedrooms());
        model.setBuildingAge(house.getBuildingAge());
        model.setDetailedResidentialType(house.getDetailedResidentialType());
        model.setFloorLocation(house.getFloorLocation());
        model.setTotalFloors(house.getTotalFloors());
        model.setBathrooms(house.getBathrooms());
        model.setBalcony(house.getBalcony());
        model.setElevator(house.getElevator());
        model.setParking(house.getParking());
        model.setFurnished(house.getFurnished());
        model.setUsageStatus(house.getUsageStatus());
        model.setInSite(house.getInSite());
        model.setOrientation(house.getOrientation());
        model.setInternalFeatures(house.getInternalFeatures());
        model.setExternalFeatures(house.getExternalFeatures());
        model.setNeighborhoodFeatures(house.getNeighborhoodFeatures());
        model.setTransportation(house.getTransportation());
        model.setLandscape(house.getLandscape());
        model.setApartmentType(house.getApartmentType());
        return model;
    }
}
