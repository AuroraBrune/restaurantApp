package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.Order;
import com.bruneRestaurantApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

}
