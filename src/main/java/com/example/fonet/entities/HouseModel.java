package com.example.fonet.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "house")
public class HouseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressModel address;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonModel person;

    @ManyToOne
    @JoinColumn(name = "business_id")
    private BusinessModel business;

    @Column(name = "status")
    private String status;

    @Column(name = "heating_type")
    private String heatingType;

    @Column(name = "price", precision = 15, scale = 2)
    private BigDecimal price;

    @Column(name = "area")
    private int area;

    @Column(name = "living_rooms")
    private int livingRooms;

    @Column(name = "bedrooms")
    private int bedrooms;

    @Column(name = "building_age")
    private int buildingAge;

    @Column(name = "detailed_residential_type")
    private String detailedResidentialType;

    @Column(name = "floor_location")
    private String floorLocation;

    @Column(name = "total_floors")
    private int totalFloors;

    @Column(name = "bathrooms")
    private int bathrooms;

    @Column(name = "balcony")
    private String balcony;

    @Column(name = "elevator")
    private String elevator;

    @Column(name = "parking")
    private String parking;

    @Column(name = "furnished")
    private String furnished;

    @Column(name = "usage_status")
    private String usageStatus;

    @Column(name = "in_site")
    private String inSite;

    @Column(name = "orientation")
    private String orientation;

    @Column(name = "internal_feature")
    private String internalFeatures;

    @Column(name = "external_feature")
    private String externalFeatures;

    @Column(name = "neighborhood_feature")
    private String neighborhoodFeatures;

    @Column(name = "transportation")
    private String transportation;

    @Column(name = "landscape")
    private String landscape;

    @Column(name = "apartment_type")
    private String apartmentType;
}
