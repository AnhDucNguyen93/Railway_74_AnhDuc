package com.vti.shoppe74.service.impl;

import com.vti.shoppe74.config.exception.CustomException;
import com.vti.shoppe74.config.exception.ErrorResponseEnum;
import com.vti.shoppe74.modal.dto.OrderCreateDto;
import com.vti.shoppe74.modal.entity.Account;
import com.vti.shoppe74.modal.entity.Order;
import com.vti.shoppe74.modal.entity.OrderStatus;
import com.vti.shoppe74.modal.entity.Product;
import com.vti.shoppe74.repository.AccountRepository;
import com.vti.shoppe74.repository.OrderRepository;
import com.vti.shoppe74.repository.ProductRepository;
import com.vti.shoppe74.service.IOrderSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderSerivce implements IOrderSerivce {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Order create(OrderCreateDto createDto) {
        // Lấy ra đối tượng Product trong DB từ productId
        Optional<Product> productOptional = productRepository.findById(createDto.getProductId());
        if(productOptional.isEmpty()){
            throw new CustomException(ErrorResponseEnum.NOT_FOUND_PRODUCT);
        }

        // Lấy ra đối tượng Account trong DB từ accountId
        Optional<Account> accountOptional = accountRepository.findById(createDto.getAccountId());
        if(productOptional.isEmpty()){
            throw new CustomException(ErrorResponseEnum.NOT_FOUND_ACCOUNT);
        }

        Order order = new Order();
        order.setProduct(productOptional.get());
        order.setAccount(accountOptional.get());
        order.setQuantity(createDto.getQuantity());
        order.setOrderStatus(OrderStatus.PENDING);
        return  orderRepository.save(order);
    }

    @Override
    public List<Order> getListOrder(long accountId, OrderStatus orderStatus) {
        if (orderStatus == null){
            return orderRepository.findAllByAccount_IdOrderByIdDesc(accountId);
        }
        return orderRepository.findAllByOrderStatusAndAccount_Id(orderStatus,accountId);
    }

}
