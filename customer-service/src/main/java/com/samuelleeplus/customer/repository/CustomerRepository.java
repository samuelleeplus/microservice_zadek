package com.samuelleeplus.customer.repository;

import com.samuelleeplus.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByCustomerId(Long customerId);

    Customer deleteByCustomerId(Long Id);


}
