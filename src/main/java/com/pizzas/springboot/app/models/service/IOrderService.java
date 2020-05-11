package com.pizzas.springboot.app.models.service;

import java.util.List;

import com.pizzas.springboot.app.models.entity.Order;

public interface IOrderService {

	public List<Order> findAll();

	public Order save(Order order);
}
