package com.samuelleeplus.customer.VO;

import com.samuelleeplus.customer.dto.RestaurantDto;
import com.samuelleeplus.customer.entities.Customer;
import com.samuelleeplus.customer.entities.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempCustomerVO {
    // need customer and restaurant that I have reviewed at
    Customer customer ;
    ArrayList<RestaurantDto> restaurantDto ;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<RestaurantDto> getRestaurantDto() {
        return restaurantDto;
    }

    public void setRestaurantDto(ArrayList<RestaurantDto> restaurantDto) {
        this.restaurantDto = restaurantDto;
    }
}
