package com.pizzas.springboot.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "orders_has_ingredients")
@IdClass(OrderIngredientId.class)
public class OrderIngredient {

	@Id
	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "orders_idorders")
	private Long ordersIdOrders;

	@Id
	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "ingredients_idingredients")
	private Long ingredientsIdIngredients;

	private Long quantity;

	public OrderIngredient() {
	}

	public OrderIngredient(Long ordersIdOrders, Long ingredientsIdIngredients, Long quantity) {
		this.ordersIdOrders = ordersIdOrders;
		this.ingredientsIdIngredients = ingredientsIdIngredients;
		this.quantity = quantity;
	}

	public Long getOrdersIdOrders() {
		return ordersIdOrders;
	}

	public void setOrdersIdOrders(Long ordersIdOrders) {
		this.ordersIdOrders = ordersIdOrders;
	}

	public Long getIngredientsIdIngredients() {
		return ingredientsIdIngredients;
	}

	public void setIngredientsIdIngredients(Long ingredientsIdIngredients) {
		this.ingredientsIdIngredients = ingredientsIdIngredients;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
