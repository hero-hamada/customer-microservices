package com.epam.customer.controller;

import com.epam.customer.dto.CustomerRegistrationDto;
import com.epam.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationDto customerRegistrationDto) {
        log.info("new customer registration {}", customerRegistrationDto);
        customerService.registerCustomer(customerRegistrationDto);
    }
}
