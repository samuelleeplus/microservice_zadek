package com.samuelleeplus.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId ;
    private String userName ;
    private String firstName ;
    private String lastName;
    private String gender ;
    private String dob ;
    private String email ;
    private String password ;
    private String phoneNumber ;
    private ArrayList<Integer> restaurantIds ;


    //difference between fetchtype eager vs lazy is that eager will allow JPA to load all of the restaurants with the rest of the fields
    // while lazy will only load it on demand (with getters).
    // if you have tons of restaurants, it may not be wise to load all of them / eagerly
//    @OneToMany(targetEntity = Restaurant.class, mappedBy = "owner" , fetch = FetchType.EAGER, orphanRemoval = true , cascade = CascadeType.ALL)
//    private List<Restaurant> restaurants ;




}
