package com.pizzas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzas.springboot.app.models.entity.OrderIngredient;
import com.pizzas.springboot.app.models.repository.IOrderIngredientRepository;

@Service
public class OrderIngredientServiceImpl implements IOrderIngredientService{

	@Autowired
	private IOrderIngredientRepository orderIngredientRepository;
	
	@Override
	public List<OrderIngredient> findAll() {
		return (List<OrderIngredient>) orderIngredientRepository.findAll();
	}

	@Override
	public OrderIngredient save(OrderIngredient orderIngredient) {
		return orderIngredientRepository.save(orderIngredient);
	}

}
