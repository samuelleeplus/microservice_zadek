package com.samuelleeplus.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    //restaurant information
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restaurantId ;
    private String name ;
    private String phoneNumber ;
    private String workingHours ;
    private String streetAddress ;
    private String city ;
    private String country ;
    private Integer zipCode ;
    private Boolean wifi ;
    private Boolean takeOut ;
    private Boolean delivery ;
    private Boolean prePayment ;
    private String website ;
    private Double rating ;
    //restaurant sections -> Reviews,
    private ArrayList<Review> reviews ;

    private ArrayList<questionsAndAnswers> questionsAndAnswers ;

    public ArrayList<com.samuelleeplus.Entity.questionsAndAnswers> getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }

    public void setQuestionsAndAnswers(ArrayList<com.samuelleeplus.Entity.questionsAndAnswers> questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getTakeOut() {
        return takeOut;
    }

    public void setTakeOut(Boolean takeOut) {
        this.takeOut = takeOut;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(Boolean prePayment) {
        this.prePayment = prePayment;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }



}
