package com.samuelleeplus.customer.controller;

import com.samuelleeplus.customer.VO.ResponseTempCustomerVO;
import com.samuelleeplus.customer.entities.Customer;
import com.samuelleeplus.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    // create user
    // get user
    // delete user
    // update user
    @Autowired
    private CustomerService customerService ;

    //Create user - post method
    @PostMapping("/registerCustomer")
    public Customer registerCustomer(@RequestBody Customer customer){
        log.info("Inside createCustomer method inside CustomerController");
        return customerService.registerCustomer(customer);
    }

    @GetMapping("/findCustomer/{id}")
    public Customer findCustomerById(@PathVariable("id") Long id){
        log.info("Inside findCustomerById method inside CustomerController");
        return customerService.findCustomerById(id);
    }

    //find user by id - get method
    @DeleteMapping("/deleteCustomer")
    public String deleteCustomer(@RequestBody Customer customer){
        log.info("Inside deleteCustomer method inside CustomerController");
        return customerService.deleteCustomer(customer);
    }


    @DeleteMapping("/deleteCustomerById/{id}")
    public String deleteCustomerById(@PathVariable("id") Long id){
        log.info("Inside deleteCustomerById method inside CustomerController");
        return customerService.deleteCustomerById(id);

    }

    //update user
    @PostMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        log.info("Inside updateCustomer method inside CustomerController");
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/reviews/{id}")
    public ResponseTempCustomerVO getAllReviewByUserId(@PathVariable Long id){
        //given customer Id, return all of their past reviews at different restaurants
        log.info("Inside getAllReviewByUserId method inside customer Controller ");
        return customerService.getAllReviewByUserId(id);
    }


}
