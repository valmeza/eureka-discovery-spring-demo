package com.spring.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PaymentController {

    @GetMapping("/payment/{price}")
    public String payNow(@PathVariable int price) {
        return "Payment amount " + price;
    }
}
