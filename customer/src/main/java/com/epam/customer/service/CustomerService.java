package com.epam.customer.service;

import com.epam.customer.entity.Customer;
import com.epam.customer.dto.CustomerRegistrationDto;
import com.epam.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationDto request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);
    }
}
