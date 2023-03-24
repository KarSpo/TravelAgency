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
public class CityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryModel countryModel;

    @OneToMany(fetch = FetchType.LAZY,cascade =CascadeType.ALL,mappedBy = "cityModel")
    private List<HotelModel> hotels = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "cityModel")
    private List<AirportModel> airports = new ArrayList<>();



}
