package com.pizzas.springboot.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pizzas.springboot.app.dto.OrderIngredientDto;
import com.pizzas.springboot.app.models.entity.Order;
import com.pizzas.springboot.app.models.entity.OrderIngredient;
import com.pizzas.springboot.app.models.service.IOrderIngredientService;
import com.pizzas.springboot.app.models.service.IOrderService;

@CrossOrigin(origins = { "*" })
@RestController
public class OrderIngredientController {

	@Autowired
	private IOrderIngredientService orderIngredientService;

	@Autowired
	private IOrderService orderService;

	@GetMapping("/orderingredient")
	@ResponseStatus(code = HttpStatus.OK)
	public List<OrderIngredient> list() {
		return orderIngredientService.findAll();
	}

	@PostMapping("/orderingredient")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void create(@Valid @RequestBody OrderIngredientDto payload) {

		Long orderSaveId;
		Order order = new Order();

		order.setName(payload.getName());
		order.setEmail(payload.getEmail());
		order.setDelivery(payload.getDelivery());
		order.setRegularClient(payload.getRegularClient());
		order.setNotes(payload.getNotes());
		order.setCouponCode(payload.getCouponCode());

		orderSaveId = orderService.save(order).getIdOrders();

		if(payload.getColdCuts() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 1);
			orderIngredient.setQuantity(payload.getColdCuts());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getPepperoni() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 2);
			orderIngredient.setQuantity(payload.getColdCuts());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getFetaCheese() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 3);
			orderIngredient.setQuantity(payload.getFetaCheese());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getMozzarella() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 4);
			orderIngredient.setQuantity(payload.getMozzarella());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getSwissCheese() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 5);
			orderIngredient.setQuantity(payload.getSwissCheese());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getSpices() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 6);
			orderIngredient.setQuantity(payload.getSpices());
			orderIngredientService.save(orderIngredient);
		}
		if(payload.getVegetables() > 0) {
			OrderIngredient orderIngredient = new OrderIngredient();
			orderIngredient.setOrdersIdOrders(orderSaveId);
			orderIngredient.setIngredientsIdIngredients((long) 7);
			orderIngredient.setQuantity(payload.getVegetables());
			orderIngredientService.save(orderIngredient);
		}
		
	}

}
