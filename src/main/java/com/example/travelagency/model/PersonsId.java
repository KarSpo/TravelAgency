package com.example.travelagency.model;

import lombok.*;
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

public class PersonsId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String personName;

    @Column(name = "surname")
    private String personSurname;

    @Column(name = "Pesel")
    private String personPesel;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "city_of_living")
    private String cityOfLiving;

    @Column(name = "street_and_number")
    private String streetAndNumber;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "telephone_number")
    private Long telephoneNumber;

}
