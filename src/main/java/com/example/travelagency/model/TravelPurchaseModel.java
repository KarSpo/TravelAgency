package com.example.travelagency.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class TravelPurchaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @Column(name = "travel")
    private TravelModel travelModel;

    @OneToMany
    @Column(name = "participants")
    private List<PersonsId> personsIds;

    // nie wiem co z kwotą wymienioną w ostatnim punkcie



}
