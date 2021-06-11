package com.samuelleeplus.customer.entities;

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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private ArrayList<Review> reviews ;
    //private ArrayList<QuestionsAndAnswers> questionsAndAnswers ;



//    @OneToMany( targetEntity = Review.class , mappedBy = "restaurant" ,fetch = FetchType.EAGER , orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<Review> reviews ;


}
