package com.tcs.customermanagement.repository;


import com.tcs.customermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    List<Customer> findByName(String name);
    List<Customer> findByEmail(String email);

}
