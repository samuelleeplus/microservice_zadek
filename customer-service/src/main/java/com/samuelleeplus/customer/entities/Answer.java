package com.samuelleeplus.customer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long answerId ;
    private Long questionId ;
    private String answer ;
    private Long restaurantId ;
    //customer Id was person answering, NOT questioning
    private Long customerId ;
    //the owner can also answer ;
    private Long ownerId ;


}
