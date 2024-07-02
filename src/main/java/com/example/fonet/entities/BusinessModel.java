package com.example.fonet.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "business")
public class BusinessModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressModel address;

    @OneToMany(mappedBy = "business")
    private List<PersonModel> persons;

    @OneToMany(mappedBy = "business")
    private List<HouseModel> houses;

    @OneToMany(mappedBy = "business")
    private List<PlotModel> plots;

    @Column(name = "business_name", nullable = false)
    private String businessName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "fax")
    private String fax;
}
