package com.pizzas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderIngredientId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long ordersIdOrders;
	private Long ingredientsIdIngredients;

	public OrderIngredientId() {
	}

	public OrderIngredientId(Long ordersIdOrders, Long ingredientsIdIngredients) {
		this.ordersIdOrders = ordersIdOrders;
		this.ingredientsIdIngredients = ingredientsIdIngredients;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ordersIdOrders, ingredientsIdIngredients);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderIngredientId other = (OrderIngredientId) obj;
		if (ingredientsIdIngredients == null) {
			if (other.ingredientsIdIngredients != null)
				return false;
		} else if (!ingredientsIdIngredients.equals(other.ingredientsIdIngredients))
			return false;
		if (ordersIdOrders == null) {
			if (other.ordersIdOrders != null)
				return false;
		} else if (!ordersIdOrders.equals(other.ordersIdOrders))
			return false;
		return true;
	}

}
