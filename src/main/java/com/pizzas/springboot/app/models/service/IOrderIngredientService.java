package com.pizzas.springboot.app.models.service;

import java.util.List;

import com.pizzas.springboot.app.models.entity.OrderIngredient;

public interface IOrderIngredientService {

	public List<OrderIngredient> findAll();

	public OrderIngredient save(OrderIngredient orderIngredient);
}
