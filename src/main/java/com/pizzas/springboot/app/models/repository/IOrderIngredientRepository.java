package com.pizzas.springboot.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzas.springboot.app.models.entity.OrderIngredient;
import com.pizzas.springboot.app.models.entity.OrderIngredientId;

public interface IOrderIngredientRepository extends CrudRepository<OrderIngredient, OrderIngredientId>{

}
