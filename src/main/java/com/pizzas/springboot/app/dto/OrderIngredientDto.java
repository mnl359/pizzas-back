package com.pizzas.springboot.app.dto;

public class OrderIngredientDto {

	private String name;
	private String email;
	private String delivery;
	private String notes;
	private boolean regularClient;
	private Long couponCode;
	private Long coldCuts;
	private Long pepperoni;
	private Long fetaCheese;
	private Long mozzarella;
	private Long swissCheese;
	private Long spices;
	private Long vegetables;

	public OrderIngredientDto() {
	}

	public OrderIngredientDto(String name, String email, String delivery, String notes, Boolean regularClient,
			Long couponCode, Long coldCuts, Long pepperoni, Long fetaCheese, Long mozzarella, Long swissCheese,
			Long spices, Long vegetables) {
		this.name = name;
		this.email = email;
		this.delivery = delivery;
		this.notes = notes;
		this.regularClient = regularClient;
		this.couponCode = couponCode;
		this.coldCuts = coldCuts;
		this.pepperoni = pepperoni;
		this.fetaCheese = fetaCheese;
		this.mozzarella = mozzarella;
		this.swissCheese = swissCheese;
		this.spices = spices;
		this.vegetables = vegetables;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean getRegularClient() {
		return regularClient;
	}

	public void setRegularClient(boolean regularClient) {
		this.regularClient = regularClient;
	}

	public Long getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(Long couponCode) {
		this.couponCode = couponCode;
	}

	public Long getColdCuts() {
		return coldCuts;
	}

	public void setColdCuts(Long coldCuts) {
		this.coldCuts = coldCuts;
	}

	public Long getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Long pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Long getFetaCheese() {
		return fetaCheese;
	}

	public void setFetaCheese(Long fetaCheese) {
		this.fetaCheese = fetaCheese;
	}

	public Long getMozzarella() {
		return mozzarella;
	}

	public void setMozzarella(Long mozzarella) {
		this.mozzarella = mozzarella;
	}

	public Long getSwissCheese() {
		return swissCheese;
	}

	public void setSwissCheese(Long swissCheese) {
		this.swissCheese = swissCheese;
	}

	public Long getSpices() {
		return spices;
	}

	public void setSpices(Long spices) {
		this.spices = spices;
	}

	public Long getVegetables() {
		return vegetables;
	}

	public void setVegetables(Long vegetables) {
		this.vegetables = vegetables;
	}

}
