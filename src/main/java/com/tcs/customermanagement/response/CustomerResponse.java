package com.tcs.customermanagement.response;

import com.tcs.customermanagement.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CustomerResponse {
    private Customer customer;
    private String tier;

    // Getters and Setters
}

