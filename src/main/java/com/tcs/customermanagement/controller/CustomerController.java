package com.tcs.customermanagement.controller;

import com.tcs.customermanagement.entity.Customer;
import com.tcs.customermanagement.response.CustomerResponse;
import com.tcs.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable UUID id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Customer>> getCustomerByNameOrEmail(@RequestParam(required = false) String name, @RequestParam(required = false) String email) {
        return customerService.getCustomerByNameOrEmail(name, email);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable UUID id, @RequestBody Customer customerDetails) {
        return customerService.updateCustomer(id, customerDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable UUID id) {
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}/tier")
    public ResponseEntity<CustomerResponse> getCustomerWithTier(@PathVariable UUID id) {
        return customerService.getCustomerWithTier(id);
    }
}

