package com.samuelleeplus.Service;

import com.samuelleeplus.Entity.*;
import com.samuelleeplus.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository ;

    @Autowired
    private RestTemplate restTemplate ;


    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant updateRestaurant(Restaurant restaurant) {

        return restaurantRepository.save(restaurant);
    }

    public Restaurant findRestaurantById(Long id) {
        return restaurantRepository.findByRestaurantId(id);
    }

    public String deleteRestaurantById(Long id) {
        Long deleted = restaurantRepository.deleteByRestaurantId(id);
        if(deleted==1){
            return "Successfully deleted. Sorry to see you go!";
        }
        else
            return "Unsuccessful deletion!";
    }

    public ArrayList<Restaurant> deleteRestaurantByName(String restaurantName) {
        return (ArrayList<Restaurant>) restaurantRepository.deleteByName(restaurantName);
    }

    public Review writeNewReview(Review review) {

        Restaurant restaurant = restaurantRepository.findByRestaurantId(review.getRestaurantId());
        ArrayList<Review> reviews = restaurant.getReviews();
        reviews.add(review);
        restaurant.setReviews(reviews);
        restaurantRepository.save(restaurant);
        return review ;

    }

    public ArrayList<Restaurant> getAllRestaurants() {
        return (ArrayList<Restaurant>) restaurantRepository.findAll();
    }

    public ArrayList<Restaurant> getRestaurantByName(String name) {
        return (ArrayList<Restaurant>) restaurantRepository.findByName(name);
    }

    public questionsAndAnswers writeNewQuestion(Question question) {
        // get restaurant
        // post q&A
        // also get necessary body
        Restaurant res= restaurantRepository.findByRestaurantId(question.getRestaurantId());
        questionsAndAnswers qa = new questionsAndAnswers();
        qa.setQuestion(question);
        res.getQuestionsAndAnswers().add(qa);
        restaurantRepository.save(res);
        return null;
    }

    public questionsAndAnswers writeNewAnswer(Answer answer) {
        Restaurant res = restaurantRepository.findByRestaurantId(answer.getRestaurantId());
        ArrayList<questionsAndAnswers> qa = res.getQuestionsAndAnswers();
        Long questionId = answer.getQuestionId();
        questionsAndAnswers qu = new questionsAndAnswers();
        for(questionsAndAnswers q: qa){
                if(q.getQuestion().getQuestionId()==questionId) {
                    q.getAnswers().add(answer);
                    qu = q;
                }
        }
        res.setQuestionsAndAnswers(qa);
        restaurantRepository.save(res);
        return qu;
    }

    public ArrayList<Review> getReviewByCustomerId(Long id) {
        ArrayList<Review> reviews = new ArrayList<>();
        ArrayList<Restaurant> restaurants = (ArrayList<Restaurant>) restaurantRepository.findAll();

   // todo finish this funcction


        return null;
    }
}
