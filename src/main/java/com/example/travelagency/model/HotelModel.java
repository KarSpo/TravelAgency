package com.example.travelagency.model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Entity
public class HotelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "stars_number")
    private Byte starsNumber;

    @Column(name = "hotel_description")
    private String hotelDescription;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private CityModel cityModel;



}
