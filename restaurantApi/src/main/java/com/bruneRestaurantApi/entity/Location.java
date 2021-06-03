package com.bruneRestaurantApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// when using lombok in new project... intelliJ you need to have the Lombok plugin installed

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="LOCATION_TBL")
public class Location {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String locationName;
    @Column
    private String street1;
    @Column(nullable = true)
    private String street2;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private String phone;
    @Column(nullable = true)
    private String textPhone;
    @Column(nullable = true)
    private String email;
}

