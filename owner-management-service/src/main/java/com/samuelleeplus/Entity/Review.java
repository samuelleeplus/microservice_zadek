package com.samuelleeplus.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    private Long reviewId ;
    private String review ;
    private String userName ;
    private Double rating ;
    private String restaurantId ;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "restaurant_restaurantId")
//    private Restaurant restaurant ;

}
