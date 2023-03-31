package com.example.travelagency.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Entity
public class ContinentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "continent_name")
    private String continentName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "continentModel")
    @JsonIgnore
    private Set<CountryModel> countryModelList = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "continentModel")
    @JsonIgnore
    private Set<TravelModel> travelModelList = new HashSet<>();

}
