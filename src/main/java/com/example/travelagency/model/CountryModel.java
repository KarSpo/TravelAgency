package com.example.travelagency.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class CountryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private ContinentModel continentModel;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "countryModel")
    private List<CityModel> cities = new ArrayList<>();



}
