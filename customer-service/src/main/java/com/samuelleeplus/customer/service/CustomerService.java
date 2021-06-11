package com.samuelleeplus.customer.service;

import com.samuelleeplus.customer.VO.ResponseTempCustomerVO;
import com.samuelleeplus.customer.controller.CustomerController;
import com.samuelleeplus.customer.dto.RestaurantDto;
import com.samuelleeplus.customer.entities.Customer;
import com.samuelleeplus.customer.entities.Restaurant;
import com.samuelleeplus.customer.entities.Review;
import com.samuelleeplus.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Slf4j
@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository ;

    @Autowired
    private RestTemplate restTemplate;

    public Customer registerCustomer(Customer customer) {

        log.info("Inside createCustomer method inside CustomerService");
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long CustomerId) {

        log.info("Inside findCustomerById method inside CustomerService");
        return customerRepository.findByCustomerId(CustomerId);
    }

    public String deleteCustomer(Customer customer) {

        log.info("Inside deleteCustomer method inside CustomerService");
        customerRepository.delete(customer);
        return "Sorry to see you go!";
    }

    public String deleteCustomerById(Long id) {

        log.info("Inside deleteCustomerById method inside CustomerService");
        customerRepository.deleteById(id);
        return "Successfully deleted!";
    }


    // in JPA Spring, save() is backed by merge() in plain JPA, meaning that
    // calling save() on an object will not insert a new object, but update
    // corresponding database record ( save() vs create() )
    public Customer updateCustomer (Customer customer) {
        log.info("Inside updateCustomer method inside CustomerService");
        //OR
        //return customerRepository.save(customer);
        return customerRepository.save(customer);
    }



    public ResponseTempCustomerVO getAllReviewByUserId(Long id) {
        log.info("Inside getAllReviewByUserId method inside CustomerService");
        ResponseTempCustomerVO vo = new ResponseTempCustomerVO();
        Customer customer = customerRepository.findByCustomerId(id);
        ArrayList<Review> reviews = customer.getReviewHistory();
        ArrayList<RestaurantDto> restaurantDtos = new ArrayList<>();
        // or just get the last 10 history
        // todo find a way to return a list of of restaurantDtos, instead of calling http calls everytime
        for (Review review :reviews){
            // use "http://localhost:9002/restaurants/getRestaurantDto/" for specific host
            // otherwise -> if you have deployed a particular service - in containers/kubernetes nodes, find the service by NAME
            // e.g.http://OWNER-SERVICE/restaurants/getRestaurantDto/

            RestaurantDto res = restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurants/getRestaurantDto/" + review.getRestaurantId(),
                    RestaurantDto.class);
            restaurantDtos.add(res);
        }
        vo.setRestaurantDto(restaurantDtos);
        vo.setCustomer(customer);
        return vo;

    }
}
