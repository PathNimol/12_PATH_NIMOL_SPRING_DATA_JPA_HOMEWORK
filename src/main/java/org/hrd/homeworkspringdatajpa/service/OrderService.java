package org.hrd.homeworkspringdatajpa.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.hrd.homeworkspringdatajpa.model.dto.requst.OrderRequest;
import org.hrd.homeworkspringdatajpa.model.dto.response.OrderResponse;
import org.hrd.homeworkspringdatajpa.model.enums.OrderStatus;

import java.util.List;

public interface OrderService {

    List<OrderResponse> createOrdersForCustomer(Long customerId, List<OrderRequest> orderRequest);

    OrderResponse getOrderDetails(@Positive Long orderId);

    OrderResponse updateOrderStatus(@Positive Long orderId, OrderStatus status);

    void deleteOrderById(@Positive Long orderId);
}
