package com.samuelleeplus.Repository;

import com.samuelleeplus.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Restaurant findByRestaurantId(Long id);

    Long deleteByRestaurantId(Long id);

    List<Restaurant> deleteByName(String restaurantName);

    List<Restaurant> findByName(String name);

}
