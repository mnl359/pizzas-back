package com.pizzas.springboot.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzas.springboot.app.models.entity.Order;

public interface IOrderRepository extends CrudRepository<Order, Long>{

}
