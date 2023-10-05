package com.vti.shoppe74.service;

import com.vti.shoppe74.modal.dto.OrderCreateDto;
import com.vti.shoppe74.modal.entity.OrderStatus;
import com.vti.shoppe74.modal.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOrderSerivce {
    Order create(OrderCreateDto createDto);

    List<Order> getListOrder(long accountId, OrderStatus orderStatus);
    }

