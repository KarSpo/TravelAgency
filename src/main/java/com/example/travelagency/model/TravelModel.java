package com.example.travelagency.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class TravelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @Column(name = "start")
    private AirportModel start;

    @OneToOne
    @Column(name = "destination")
    private AirportModel destination;

    @OneToOne
    @Column(name = "hotel")
    private HotelModel hotelModel;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "number_of_days")
    private byte numberOfDays;


    @Column(name = "hotel_type")
    private Type hotelType;


    @Column(name = "adult_price")
    private int adultPrice;

    @Column(name = "child_price")
    private int childPrice;

    //sprawdzić pole poniżej
    @Column(name = "promotion")
    private boolean promotion;

    @Column(name = "adults_number")
    private byte adultsNumber;

    @Column(name = "children_number")
    private byte childrenNumber;


}
