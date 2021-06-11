package com.samuelleeplus.Controller;

import com.samuelleeplus.Entity.*;
import com.samuelleeplus.RestaurantDto.RestaurantDto;
import com.samuelleeplus.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // create, update, delete, get

    @PostMapping("/createRestaurant")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }

    @PostMapping("/updateRestaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurant(restaurant);

    }

    @GetMapping("/findRestaurant/{id}")
    public Restaurant findRestaurantById(@PathVariable Long id){

        return restaurantService.findRestaurantById(id);
    }

    @GetMapping("/")
    public ArrayList<Restaurant> getAllRestaurants()
    {
        return restaurantService.getAllRestaurants();
    }


    //for below, do the filtering at a UI level or backend level, or maybe both?
    // Because you cannot make http calls every time you need to filter
    //todo 1. get restaurants by region / other filers(wifi, payment methods, delivery, reservation)
    @GetMapping("/findRestaurant/{name}")
    public ArrayList<Restaurant> getRestaurantByName(@PathVariable String name){
        return restaurantService.getRestaurantByName(name);

    }



    @DeleteMapping("/deleteRestaurant/{id}")
    public String deleteRestaurantById(@PathVariable Long id){
        return restaurantService.deleteRestaurantById(id);
    }

    @DeleteMapping("/deleteRestaurant/{name}")
    public ArrayList<Restaurant> deleteRestaurantByName(@PathVariable String restaurantName){
        return restaurantService.deleteRestaurantByName(restaurantName);
    }


    @PostMapping("/writeReview")
    public Review writeNewReview(@RequestBody Review review){
        //to write a review, you need customerId & name
        return restaurantService.writeNewReview(review);
    }

    // post questions
    @PostMapping("/ask")
    public questionsAndAnswers askNewQuestion(@RequestBody Question question){
        //get restaurant id
        return restaurantService.writeNewQuestion(question);
    }
    //post answers
    @PostMapping("/answer")
    public questionsAndAnswers answerQuestion(@RequestBody Answer answer){

        return restaurantService.writeNewAnswer(answer);
    }


    @GetMapping("/getReviewByCustomerId/{id}")
    public ArrayList<Review> getReviewsByCustomerId(@PathVariable Long id){
        return restaurantService.getReviewByCustomerId(id);

    }

    @GetMapping("/getRestaurantDto/{restaurantId}")
    public RestaurantDto getRestaurantDtoById(@PathVariable Long restaurantId){
        RestaurantDto restaurantDto = new RestaurantDto();
        Restaurant res =  restaurantService.findRestaurantById(restaurantId);
        restaurantDto.setRestaurantId(res.getRestaurantId());
        restaurantDto.setStreetAddress(res.getStreetAddress());
        restaurantDto.setRating(res.getRating());
        restaurantDto.setName(res.getName());
        return restaurantDto;

    }

    //todo
    // Today
    // 1. Test the http calls/RestTemplate between services
    // For later
    // 2. We will have separate service for 1. order management 2. reservation management 3. Payment
    // 3.test out VO template in customerservice, getting past reviews, and questions that he/she asked


//    @GetMapping("/getAllReviewOfCustomer")
//    public ArrayList<RestaurantDto> getRestaurantDtoBy(@RequestBody ArrayList<Long> restaurantId){
//        //give restaurant IDs, find that restaurant, and return restaurantDto
//
//        ArrayList<RestaurantDto> dtos = new ArrayList<>();
//
//        for(Long id: restaurantId){
//            RestaurantDto dto = new RestaurantDto();
//            // todo later add try/catch block
//            Restaurant res = restaurantService.findRestaurantById(id);
//            dto.setName(res.getName());
//            dto.setRating(res.getRating());
//            dto.setStreetAddress(res.getStreetAddress());
//            dto.setRestaurantId(res.getRestaurantId());
//            dtos.add(dto);
//        }
//        return dtos;
//    }



}
