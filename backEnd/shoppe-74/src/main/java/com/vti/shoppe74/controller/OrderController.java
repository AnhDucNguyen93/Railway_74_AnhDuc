package com.vti.shoppe74.controller;

import com.vti.shoppe74.modal.dto.OrderCreateDto;
import com.vti.shoppe74.modal.entity.OrderStatus;
import com.vti.shoppe74.modal.entity.Order;
import com.vti.shoppe74.service.IOrderSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
//@CrossOrigin("*")
@Validated
public class OrderController {
    @Autowired
    private IOrderSerivce orderSerivce;

    @PostMapping("/create")
    public Order create(@RequestBody OrderCreateDto createDto){
        return orderSerivce.create(createDto);
    }

    @GetMapping("/get-by-status")
    public List<Order> getListOrder(@RequestParam(required = false) OrderStatus orderStatus, long accountId){
        return orderSerivce.getListOrder(accountId, orderStatus);
    }
}
