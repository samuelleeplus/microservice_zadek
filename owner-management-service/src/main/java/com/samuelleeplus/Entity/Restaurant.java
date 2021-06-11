package com.samuelleeplus.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Long restaurantId ;
    private String name ;
    private String phoneNumber ;
    private String workingHours ;
    private String streetAddress ;
    private String city ;
    private String country ;

    private Boolean wifi ;
    private Boolean takeOut ;
    private Boolean delivery ;
    private Boolean prePayment ;
    private String website ;
    private Double rating ;

    private String ownerId ;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "owner_ownerId")
//    private Owner owner ;

//    @OneToMany( targetEntity = Review.class , mappedBy = "restaurant" ,fetch = FetchType.EAGER , orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<Review> reviews ;

    //TODO restaurant also has Q&A, where questions are asked by users, and answers can only be answered by owners/managers

}
