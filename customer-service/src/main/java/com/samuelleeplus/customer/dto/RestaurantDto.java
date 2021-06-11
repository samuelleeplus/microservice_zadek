package com.samuelleeplus.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {

    private Long restaurantId ;
    private String name ;
    private Double rating ;
    private String streetAddress ;

}
