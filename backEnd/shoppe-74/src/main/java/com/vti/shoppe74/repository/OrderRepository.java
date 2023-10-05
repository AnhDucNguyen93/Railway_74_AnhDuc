package com.vti.shoppe74.repository;

import com.vti.shoppe74.modal.entity.OrderStatus;
import com.vti.shoppe74.modal.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByOrderStatusAndAccount_Id(OrderStatus orderStatus, long accountId);

    List<Order> findAllByAccount_IdOrderByIdDesc(long accountId);


}
