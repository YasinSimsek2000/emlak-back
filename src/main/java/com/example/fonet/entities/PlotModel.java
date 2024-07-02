package com.example.fonet.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "plot")
public class PlotModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressModel address;

    @ManyToOne
    @JoinColumn(name = "person_id",  referencedColumnName = "id", nullable = false)
    private PersonModel person;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessModel business;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(nullable = false)
    private Long price;

    @Column(name = "zoning_status")
    private String zoningStatus;

    @Column(nullable = false)
    private Integer blockNo;

    @Column(nullable = false)
    private Integer parcelNo;

    @Column(nullable = false)
    private Double coefficient;

    @Column(nullable = false)
    private Double height;

    @Column(name = "deed_status")
    private String deedStatus;

    @Column(name = "floor_equivalent")
    private String floorEquivalent;

    @Column(name = "infrastructure")
    private String infrastructure;

    @Column(name = "location_plot")
    private String locationPlots;

    @Column(name = "general_features")
    private String generalFeatures;

    @Column(name = "landscapes")
    private String landscapes;
}
